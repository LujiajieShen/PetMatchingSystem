package org.joda.time.format;

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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 'a', chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        int int5 = property3.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property3.getMaximumShortTextLength(locale6);
        org.joda.time.DateTime dateTime8 = property3.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology0);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property3.getAsShortText(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property3.setCopy((int) (byte) 100);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2024" + "'", str5, "2024");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.hourMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("-00:00:00.001", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"-00:00:00.001\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology0);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusWeeks((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = localDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.eras();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField15 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType6, durationField14);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.monthOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology19 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology19.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology19);
        java.util.Date date22 = localDateTime21.toDate();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusYears(960);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeField18.getAsText((org.joda.time.ReadablePartial) localDateTime21, 0, locale26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime21.plusWeeks(9);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime21.minusMillis(0);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology33, locale34, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone42 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long45 = fixedDateTimeZone42.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone50 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int52 = fixedDateTimeZone50.getStandardOffset(0L);
        long long54 = fixedDateTimeZone42.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone50, (long) (short) 10);
        dateTimeParserBucket37.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone42);
        org.joda.time.DateTime dateTime56 = localDateTime21.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone42);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = unsupportedDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekOfWeekyear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField15);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(gregorianChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Apr 09 19:17:52 PDT 2024");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 53L + "'", long45 == 53L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertNotNull(dateTime56);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology3);
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusYears(960);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime5, 0, locale10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusWeeks(9);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.minusMillis(0);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology17, locale18, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long29 = fixedDateTimeZone26.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone34 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int36 = fixedDateTimeZone34.getStandardOffset(0L);
        long long38 = fixedDateTimeZone26.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone34, (long) (short) 10);
        dateTimeParserBucket21.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone26);
        org.joda.time.DateTime dateTime40 = localDateTime5.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone26);
        boolean boolean41 = fixedDateTimeZone26.isFixed();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 19:17:53 PDT 2024");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 53L + "'", long29 == 53L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeParser();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = dateTimeFormatter0.parseMillis("GJChronology[hi!,cutover=1970-01-01T00:00:00.010Z,mdfw=1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GJChronology[hi!,cutover=1970-01...\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate45 = localDate8.withWeekOfWeekyear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology1, locale2, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long13 = fixedDateTimeZone10.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int20 = fixedDateTimeZone18.getStandardOffset(0L);
        long long22 = fixedDateTimeZone10.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, (long) (short) 10);
        dateTimeParserBucket5.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone10);
        java.lang.String str25 = fixedDateTimeZone10.getNameKey(0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField4 = org.joda.time.field.MillisDurationField.INSTANCE;
        int int5 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField3, durationField4);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 960, 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93120L + "'", long2 == 93120L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.millisOfDay();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField3 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField2);
        org.joda.time.DurationField durationField4 = delegatedDateTimeField3.getDurationField();
        org.joda.time.DateTimeField dateTimeField5 = delegatedDateTimeField3.getWrappedField();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicTTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("1969-12-31T00:00:00.000/1970-01-01T00:00:00.000", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969-12-31T00:00:00.000/1970-01-...\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("org.joda.time.IllegalFieldValueException: Value \"Wednesday, December 31, 1969 4:00:00 PM -08:00\" for dayOfWeek is not supported");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"org.joda.time.IllegalFieldValueE...\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("1969-12-31T00:00:00.000/1970-01-01T00:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969-12-31T00:00:00.000/1970-01-...\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        java.lang.String str4 = dateTimeField2.getAsText((long) (byte) 100);
        org.joda.time.DurationField durationField5 = dateTimeField2.getRangeDurationField();
        org.joda.time.format.DateTimeParserBucket.SavedField savedField7 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField2, (int) '4');
        int int8 = savedField7.iValue;
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfDay();
        java.lang.String str13 = dateTimeField11.getAsText((long) (byte) 100);
        org.joda.time.DurationField durationField14 = dateTimeField11.getRangeDurationField();
        org.joda.time.format.DateTimeParserBucket.SavedField savedField16 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField11, (int) '4');
        int int17 = savedField16.iValue;
        int int18 = savedField7.compareTo(savedField16);
        java.lang.String str19 = savedField7.iText;
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "16" + "'", str4, "16");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16" + "'", str13, "16");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 'a', chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime5 = dateTime2.minusYears(0);
        int int6 = dateTime5.getYearOfEra();
        long long7 = dateTime5.getMillis();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1969 + "'", int6 == 1969);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        int int3 = gregorianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField4 = gregorianChronology0.halfdays();
        org.joda.time.DurationField durationField5 = gregorianChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber14 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType11, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder7.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology17.monthOfYear();
        int int20 = gregorianChronology17.getMinimumDaysInFirstWeek();
        boolean boolean21 = dateTimeFieldType16.isSupported((org.joda.time.Chronology) gregorianChronology17);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder15.appendText(dateTimeFieldType16);
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction25 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType16, (int) (short) 100, (int) (byte) -1);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField(dateTimeField6, dateTimeFieldType16, (int) 'a');
        org.joda.time.DurationField durationField28 = dividedDateTimeField27.getRangeDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology29.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology29);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.weekyear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusWeeks((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.minusHours(24);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withSecondOfMinute(0);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withMinuteOfHour((int) '#');
        int int41 = localDateTime40.getYearOfEra();
        java.util.Locale locale43 = null;
        java.lang.String str44 = localDateTime40.toString("16", locale43);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dividedDateTimeField27.getAsText((org.joda.time.ReadablePartial) localDateTime40, locale45);
        java.lang.Object obj47 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology49 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField50 = gregorianChronology49.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField51 = gregorianChronology49.monthOfYear();
        int int52 = gregorianChronology49.getMinimumDaysInFirstWeek();
        boolean boolean53 = dateTimeFieldType48.isSupported((org.joda.time.Chronology) gregorianChronology49);
        org.joda.time.DateTimeField dateTimeField54 = gregorianChronology49.minuteOfDay();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(obj47, (org.joda.time.Chronology) gregorianChronology49);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone60 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology61 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone60);
        org.joda.time.DurationField durationField62 = gJChronology61.eras();
        org.joda.time.DateTimeField dateTimeField63 = gJChronology61.era();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology65, locale66, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone74 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long77 = fixedDateTimeZone74.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone82 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int84 = fixedDateTimeZone82.getStandardOffset(0L);
        long long86 = fixedDateTimeZone74.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone82, (long) (short) 10);
        dateTimeParserBucket69.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone74);
        boolean boolean88 = gJChronology61.equals((java.lang.Object) fixedDateTimeZone74);
        org.joda.time.Interval interval89 = localDate55.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone74);
        org.joda.time.LocalDate.Property property90 = localDate55.dayOfWeek();
        org.joda.time.LocalDate localDate91 = property90.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int92 = localDateTime40.compareTo((org.joda.time.ReadablePartial) localDate91);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2024 + "'", int41 == 2024);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "16" + "'", str44, "16");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "8" + "'", str46, "8");
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(gregorianChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(gJChronology61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 53L + "'", long77 == 53L);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 10L + "'", long86 == 10L);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(interval89);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(localDate91);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 'a', chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusSeconds(0);
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTime.Property property6 = dateTime4.yearOfCentury();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime4.withChronology(chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int12 = dateTime4.get(dateTimeFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.monthOfYear();
        int int17 = gregorianChronology14.getMinimumDaysInFirstWeek();
        boolean boolean18 = dateTimeFieldType13.isSupported((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology14.minuteOfDay();
        org.joda.time.DurationField durationField20 = gregorianChronology14.months();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType11, durationField20);
        java.lang.Object obj22 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology24.monthOfYear();
        int int27 = gregorianChronology24.getMinimumDaysInFirstWeek();
        boolean boolean28 = dateTimeFieldType23.isSupported((org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology24.minuteOfDay();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(obj22, (org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone35);
        org.joda.time.DurationField durationField37 = gJChronology36.eras();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology36.era();
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology40, locale41, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone49 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long52 = fixedDateTimeZone49.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone57 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int59 = fixedDateTimeZone57.getStandardOffset(0L);
        long long61 = fixedDateTimeZone49.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone57, (long) (short) 10);
        dateTimeParserBucket44.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone49);
        boolean boolean63 = gJChronology36.equals((java.lang.Object) fixedDateTimeZone49);
        org.joda.time.Interval interval64 = localDate30.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone49);
        int int65 = localDate30.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int66 = unsupportedDateTimeField21.getMaximumValue((org.joda.time.ReadablePartial) localDate30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hourOfHalfday field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(gregorianChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(gJChronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 53L + "'", long52 == 53L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        int int44 = localDate8.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray45 = localDate8.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray45);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber7 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType4, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.monthOfYear();
        int int13 = gregorianChronology10.getMinimumDaysInFirstWeek();
        boolean boolean14 = dateTimeFieldType9.isSupported((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder8.appendText(dateTimeFieldType9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendYearOfCentury(10, 2024);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber26 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType23, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder19.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder28.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber35 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType32, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder28.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = new org.joda.time.format.DateTimeFormatter((org.joda.time.format.DateTimePrinter) fixedNumber26, (org.joda.time.format.DateTimeParser) fixedNumber35);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber41 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType38, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder18.append((org.joda.time.format.DateTimePrinter) fixedNumber26, (org.joda.time.format.DateTimeParser) fixedNumber41);
        java.lang.StringBuffer stringBuffer43 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology45.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology45);
        org.joda.time.DateTimeField dateTimeField48 = gregorianChronology45.secondOfDay();
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology45.millisOfSecond();
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology52, locale53, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone61 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long64 = fixedDateTimeZone61.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone69 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int71 = fixedDateTimeZone69.getStandardOffset(0L);
        long long73 = fixedDateTimeZone61.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone69, (long) (short) 10);
        dateTimeParserBucket56.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone61);
        java.lang.String str76 = fixedDateTimeZone61.getNameKey((long) 19);
        java.util.Locale locale77 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber41.printTo(stringBuffer43, (long) 4, (org.joda.time.Chronology) gregorianChronology45, 0, (org.joda.time.DateTimeZone) fixedDateTimeZone61, locale77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(gregorianChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 53L + "'", long64 == 53L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 10L + "'", long73 == 10L);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 'a', chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfWeek();
        org.joda.time.DateTime dateTime6 = dateTime3.minusYears(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime((org.joda.time.Chronology) gregorianChronology7);
        int int12 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime9, "org.joda.time.IllegalFieldValueException: Value \"Wednesday, December 31, 1969 4:00:00 PM -08:00\" for dayOfWeek is not supported", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = dateTimeFormatter0.parseLocalDate("2024");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2024\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-33) + "'", int12 == (-33));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate44 = property43.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate46 = localDate44.withDayOfYear((-33));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -33 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 97, false, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        int int8 = gregorianChronology5.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.yearOfCentury();
        org.joda.time.DurationField durationField10 = gregorianChronology5.weekyears();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField11 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDateTimeField11.addWrapField(53L, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: halfdayOfDay field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField3 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology5, locale6, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long17 = fixedDateTimeZone14.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int24 = fixedDateTimeZone22.getStandardOffset(0L);
        long long26 = fixedDateTimeZone14.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (long) (short) 10);
        dateTimeParserBucket9.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone14);
        java.lang.Object obj28 = null;
        boolean boolean29 = dateTimeParserBucket9.restoreState(obj28);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeParserBucket9.getZone();
        int int33 = textField3.parseInto(dateTimeParserBucket9, "", (int) (short) 1);
        int int34 = textField3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer35 = null;
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale37 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField3.printTo(stringBuffer35, readablePartial36, locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 53L + "'", long17 == 53L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate44 = property43.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 'a', chronology44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusSeconds(0);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.DateTime dateTime49 = dateTime45.minus(readablePeriod48);
        boolean boolean50 = interval42.contains((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("Invalid format: \"-00:00:00.001\" is too short");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Invalid format: \"-00:00:00.001\" ...\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber7 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType4, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber16 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType13, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder9.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter((org.joda.time.format.DateTimePrinter) fixedNumber7, (org.joda.time.format.DateTimeParser) fixedNumber16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 'a', chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException25 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType23, "weekOfWeekyear");
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber28 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType23, 2024, false);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology30, locale31, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone39 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long42 = fixedDateTimeZone39.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone47 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int49 = fixedDateTimeZone47.getStandardOffset(0L);
        long long51 = fixedDateTimeZone39.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone47, (long) (short) 10);
        dateTimeParserBucket34.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone39);
        java.lang.Object obj53 = null;
        boolean boolean54 = dateTimeParserBucket34.restoreState(obj53);
        int int57 = unpaddedNumber28.parseInto(dateTimeParserBucket34, "hi!", 12);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTimeParserBucket34.getZone();
        // The following exception was thrown during execution in test generation
        try {
            int int61 = fixedNumber7.parseInto(dateTimeParserBucket34, "2024-04-09", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 53L + "'", long42 == 53L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-13) + "'", int57 == (-13));
        org.junit.Assert.assertNotNull(dateTimeZone58);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int8 = fixedDateTimeZone6.getStandardOffset(0L);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone6, (long) (byte) 10, 1);
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology12.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology12);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekyear();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property15.getAsShortText(locale16);
        org.joda.time.LocalDateTime localDateTime18 = property15.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = property15.setCopy((int) (byte) 100);
        boolean boolean21 = fixedDateTimeZone6.isLocalDateTimeGap(localDateTime20);
        java.lang.String str22 = dateTimeFormatter1.print((org.joda.time.ReadablePartial) localDateTime20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant23 = org.joda.time.Instant.parse("GJChronology[hi!]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GJChronology[hi!]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2024" + "'", str17, "2024");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0100-103T19:18:11.276" + "'", str22, "0100-103T19:18:11.276");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 'a', chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        org.joda.time.Interval interval48 = property46.toInterval();
        org.joda.time.DateTime dateTime49 = interval48.getStart();
        java.lang.String str50 = interval48.toString();
        long long51 = interval48.toDurationMillis();
        org.joda.time.Interval interval52 = interval48.toInterval();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = interval52.toPeriod(periodType53);
        org.joda.time.LocalDate localDate55 = localDate8.plus((org.joda.time.ReadablePeriod) period54);
        int int57 = localDate8.getValue(0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000" + "'", str50, "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 86400000L + "'", long51 == 86400000L);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2024 + "'", int57 == 2024);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = dateTimeFormatter1.parseLocalDate("org.joda.time.IllegalFieldValueException: Value \"Wednesday, December 31, 1969 4:00:00 PM -08:00\" for dayOfWeek is not supported");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"org.joda.time.IllegalFieldValueE...\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology3);
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusYears(960);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime5, 0, locale10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusWeeks(9);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.minusMillis(0);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology17, locale18, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long29 = fixedDateTimeZone26.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone34 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int36 = fixedDateTimeZone34.getStandardOffset(0L);
        long long38 = fixedDateTimeZone26.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone34, (long) (short) 10);
        dateTimeParserBucket21.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone26);
        org.joda.time.DateTime dateTime40 = localDateTime5.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone26);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime5.withSecondOfMinute(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 09 19:18:13 PDT 2024");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 53L + "'", long29 == 53L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology0);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusWeeks((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = localDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.eras();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField15 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType6, durationField14);
        java.lang.String str16 = unsupportedDateTimeField15.getName();
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = unsupportedDateTimeField15.getMaximumShortTextLength(locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekOfWeekyear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "weekOfWeekyear" + "'", str16, "weekOfWeekyear");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(93120L);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        int int43 = localDate8.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate45 = localDate8.withEra((-33));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -33 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withZoneUTC();
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate44 = property43.roundCeilingCopy();
        org.joda.time.LocalTime localTime45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime46 = localDate44.toLocalDateTime(localTime45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 'a', chronology44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusSeconds(0);
        int int48 = dateTime45.getCenturyOfEra();
        boolean boolean49 = interval42.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.MutableInterval mutableInterval50 = interval42.toMutableInterval();
        org.joda.time.Chronology chronology51 = interval42.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 19 + "'", int48 == 19);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(mutableInterval50);
        org.junit.Assert.assertNotNull(chronology51);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.monthOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.monthOfYear();
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField10 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) gJChronology5, dateTimeField9);
        java.util.Locale locale11 = null;
        int int12 = skipUndoDateTimeField10.getMaximumTextLength(locale11);
        java.lang.String str13 = skipUndoDateTimeField10.getName();
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "monthOfYear" + "'", str13, "monthOfYear");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate44 = property43.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(69);
        org.joda.time.DateTime dateTime47 = localDate44.toDateTimeAtMidnight(dateTimeZone46);
        int int48 = localDate44.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 21 + "'", int48 == 21);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 'a', chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime5 = dateTime2.minusYears(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime5.toMutableDateTime((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 'a', chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusSeconds(0);
        int int14 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = dateTime11.minusYears((int) '#');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 'a', chronology18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusSeconds(0);
        int int22 = dateTime19.getSecondOfMinute();
        org.joda.time.DateTime dateTime24 = dateTime19.minusYears((int) '#');
        boolean boolean25 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime19);
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long34 = fixedDateTimeZone31.convertLocalToUTC((long) '4', false);
        long long36 = fixedDateTimeZone31.nextTransition((long) (-1));
        mutableDateTime8.setZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone31);
        java.lang.Object obj38 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology40 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology40.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology40.monthOfYear();
        int int43 = gregorianChronology40.getMinimumDaysInFirstWeek();
        boolean boolean44 = dateTimeFieldType39.isSupported((org.joda.time.Chronology) gregorianChronology40);
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology40.minuteOfDay();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(obj38, (org.joda.time.Chronology) gregorianChronology40);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone51 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone51);
        org.joda.time.DurationField durationField53 = gJChronology52.eras();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology52.era();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology56, locale57, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone65 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long68 = fixedDateTimeZone65.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone73 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int75 = fixedDateTimeZone73.getStandardOffset(0L);
        long long77 = fixedDateTimeZone65.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone73, (long) (short) 10);
        dateTimeParserBucket60.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone65);
        boolean boolean79 = gJChronology52.equals((java.lang.Object) fixedDateTimeZone65);
        org.joda.time.Interval interval80 = localDate46.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone65);
        org.joda.time.DateTime dateTime81 = mutableDateTime8.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone65);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        mutableDateTime8.add(readablePeriod82, 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone89 = new org.joda.time.tz.FixedDateTimeZone("1969-12-31T16:00:00.097-08:00", "1969-12-31T16:00:00.097-08:00", (int) (byte) -1, 19);
        mutableDateTime8.setZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone89);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 53L + "'", long34 == 53L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(gregorianChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(gJChronology52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 53L + "'", long68 == 53L);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10L + "'", long77 == 10L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(interval80);
        org.junit.Assert.assertNotNull(dateTime81);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight44 = localDate8.toDateMidnight();
        int int45 = localDate8.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2024 + "'", int45 == 2024);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate44 = property43.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate46 = localDate44.withEra(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.secondOfDay();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) (byte) 0, (org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusWeeks((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minusHours(24);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withSecondOfMinute(0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMinuteOfHour((int) '#');
        int int18 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.dayOfYear();
        boolean boolean20 = localDateTime5.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime.Property property21 = localDateTime17.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.DateTimeFormat.fullDate();
        java.lang.String str23 = localDateTime17.toString(dateTimeFormatter22);
        java.lang.Appendable appendable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter22.printTo(appendable24, (long) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2024 + "'", int18 == 2024);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Monday, April 8, 2024" + "'", str23, "Monday, April 8, 2024");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 'a', chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusSeconds(0);
        int int5 = dateTime2.getSecondOfMinute();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekOfWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime2.withChronology(chronology7);
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.monthOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology13);
        java.util.Date date16 = localDateTime15.toDate();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusYears(960);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeField12.getAsText((org.joda.time.ReadablePartial) localDateTime15, 0, locale20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime15.plusWeeks(9);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime15.minusMillis(0);
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology27, locale28, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long39 = fixedDateTimeZone36.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone44 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int46 = fixedDateTimeZone44.getStandardOffset(0L);
        long long48 = fixedDateTimeZone36.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone44, (long) (short) 10);
        dateTimeParserBucket31.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone36);
        org.joda.time.DateTime dateTime50 = localDateTime15.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone36);
        org.joda.time.Chronology chronology51 = chronology7.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Apr 09 19:18:22 PDT 2024");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 53L + "'", long39 == 53L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(chronology51);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber7 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType4, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber16 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType13, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder9.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter((org.joda.time.format.DateTimePrinter) fixedNumber7, (org.joda.time.format.DateTimeParser) fixedNumber16);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology20, locale21, (java.lang.Integer) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = fixedNumber16.parseInto(dateTimeParserBucket24, "halfdayOfDay", (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.weekyear();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property4.getAsShortText(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property4.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = property4.setCopy((int) (byte) 100);
        long long11 = gJChronology0.set((org.joda.time.ReadablePartial) localDateTime9, (long) 24);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology13, locale14, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long25 = fixedDateTimeZone22.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int32 = fixedDateTimeZone30.getStandardOffset(0L);
        long long34 = fixedDateTimeZone22.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone30, (long) (short) 10);
        dateTimeParserBucket17.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) localDateTime9, (org.joda.time.DateTimeZone) fixedDateTimeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2024" + "'", str6, "2024");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-59002663296683L) + "'", long11 == (-59002663296683L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 53L + "'", long25 == 53L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.joda.time.format.DateTimeFormat.StyleFormatter styleFormatter3 = new org.joda.time.format.DateTimeFormat.StyleFormatter(0, 57600032, 7);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology5, locale6, (java.lang.Integer) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = styleFormatter3.parseInto(dateTimeParserBucket9, "", (-22436));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No datetime pattern for locale: en_US");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = dateTimeFormatter0.parseDateTime("19");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"19\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("4");
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate1.withFieldAdded(durationFieldType2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getStandardOffset(0L);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4, (long) (byte) 10, 1);
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology11, locale12, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long23 = fixedDateTimeZone20.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int30 = fixedDateTimeZone28.getStandardOffset(0L);
        long long32 = fixedDateTimeZone20.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone28, (long) (short) 10);
        dateTimeParserBucket15.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone20);
        java.lang.Object obj34 = null;
        boolean boolean35 = dateTimeParserBucket15.restoreState(obj34);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeParserBucket15.getZone();
        long long38 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone36, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology41 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, (long) 19, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 53L + "'", long23 == 53L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.secondOfMinute();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 24524946, (org.joda.time.Chronology) gregorianChronology1, locale7, (java.lang.Integer) 69482107, 69);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology0);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusWeeks((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = localDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.eras();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField15 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType6, durationField14);
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction18 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType6, 0, 10);
        fraction18.iMaxDigits = (byte) 10;
        int int21 = fraction18.estimateParsedLength();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 'a', chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException28 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType26, "weekOfWeekyear");
        org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber unpaddedNumber31 = new org.joda.time.format.DateTimeFormatterBuilder.UnpaddedNumber(dateTimeFieldType26, 2024, false);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology33, locale34, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone42 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long45 = fixedDateTimeZone42.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone50 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int52 = fixedDateTimeZone50.getStandardOffset(0L);
        long long54 = fixedDateTimeZone42.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone50, (long) (short) 10);
        dateTimeParserBucket37.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone42);
        java.lang.Object obj56 = null;
        boolean boolean57 = dateTimeParserBucket37.restoreState(obj56);
        int int60 = unpaddedNumber31.parseInto(dateTimeParserBucket37, "hi!", 12);
        int int63 = fraction18.parseInto(dateTimeParserBucket37, "", (int) ' ');
        java.io.Writer writer64 = null;
        org.joda.time.ReadableInterval readableInterval66 = null;
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval66);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.millisOfDay();
        org.joda.time.DurationField durationField69 = chronology67.eras();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        java.util.Locale locale72 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction18.printTo(writer64, 0L, chronology67, 57602000, dateTimeZone71, locale72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 53L + "'", long45 == 53L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-13) + "'", int60 == (-13));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-33) + "'", int63 == (-33));
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.monthOfYear();
        int int6 = gregorianChronology3.getMinimumDaysInFirstWeek();
        boolean boolean7 = dateTimeFieldType2.isSupported((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology3.minuteOfDay();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(obj1, (org.joda.time.Chronology) gregorianChronology3);
        int int10 = localDate9.getYearOfEra();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 'a', chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.DateTime dateTime16 = dateTime13.minusYears(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology17.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime16.toMutableDateTime((org.joda.time.Chronology) gregorianChronology17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 'a', chronology21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusSeconds(0);
        int int25 = dateTime22.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = dateTime22.minusYears((int) '#');
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 'a', chronology29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusSeconds(0);
        int int33 = dateTime30.getSecondOfMinute();
        org.joda.time.DateTime dateTime35 = dateTime30.minusYears((int) '#');
        boolean boolean36 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime30);
        mutableDateTime19.setMillis((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone42 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long45 = fixedDateTimeZone42.convertLocalToUTC((long) '4', false);
        long long47 = fixedDateTimeZone42.nextTransition((long) (-1));
        mutableDateTime19.setZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone42);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone42);
        org.joda.time.Interval interval50 = localDate9.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone42);
        org.joda.time.Chronology chronology51 = julianChronology0.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone42);
        java.lang.String str52 = julianChronology0.toString();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2024 + "'", int10 == 2024);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 53L + "'", long45 == 53L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "JulianChronology[UTC]" + "'", str52, "JulianChronology[UTC]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2000", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2000\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.chrono.GregorianChronology gregorianChronology44 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology44.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology44);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.weekyear();
        java.util.Locale locale48 = null;
        java.lang.String str49 = property47.getAsShortText(locale48);
        org.joda.time.LocalDateTime localDateTime50 = property47.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime52 = property47.setCopy((int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField54 = localDateTime52.getField((int) (short) 1);
        org.joda.time.chrono.GregorianChronology gregorianChronology55 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField56 = gregorianChronology55.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology55);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.weekyear();
        org.joda.time.LocalDateTime localDateTime59 = property58.getLocalDateTime();
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withDurationAdded(readableDuration60, 0);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime59.withMinuteOfHour(4);
        org.joda.time.LocalDateTime.Property property65 = localDateTime59.weekOfWeekyear();
        org.joda.time.chrono.GregorianChronology gregorianChronology66 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField67 = gregorianChronology66.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology66);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.weekyear();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.minusWeeks((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime68.minusHours(24);
        int int74 = localDateTime59.compareTo((org.joda.time.ReadablePartial) localDateTime73);
        boolean boolean75 = localDateTime52.equals((java.lang.Object) localDateTime73);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = localDate8.isAfter((org.joda.time.ReadablePartial) localDateTime73);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(gregorianChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2024" + "'", str49, "2024");
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(gregorianChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(gregorianChronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        java.lang.String str44 = fixedDateTimeZone27.getNameKey(0L);
        java.util.TimeZone timeZone45 = fixedDateTimeZone27.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate44 = property43.roundCeilingCopy();
        org.joda.time.LocalDate localDate46 = property43.addToCopy(201);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(localDate46);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 'a', chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusSeconds(0);
        org.joda.time.DateTime dateTime6 = dateTime4.minusYears((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks((int) (byte) 0);
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        boolean boolean10 = dateTime8.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime8.withMillis(432000053L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeUtils.getZone((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getName((long) 2000, locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeUtils.getZone((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 53L + "'", long7 == 53L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withZoneUTC();
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.parse("2024-04-08T19:18:00.845", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2024-04-08T19:18:00.845\" is malformed at \"-08T19:18:00.845\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber7 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType4, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber7);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber16 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType13, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder9.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter((org.joda.time.format.DateTimePrinter) fixedNumber7, (org.joda.time.format.DateTimeParser) fixedNumber16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = dateTimeFormatter18.parseLocalDateTime("3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.yearMonthDay();
        java.lang.Appendable appendable1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.weekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusWeeks((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusHours(24);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withSecondOfMinute(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMinuteOfHour((int) '#');
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 'a', chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.DateTime dateTime20 = dateTime17.minusYears(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime((org.joda.time.Chronology) gregorianChronology21);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long31 = fixedDateTimeZone28.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int38 = fixedDateTimeZone36.getStandardOffset(0L);
        long long40 = fixedDateTimeZone28.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone36, (long) (short) 10);
        mutableDateTime23.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone28);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 'a', chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        org.joda.time.Interval interval47 = property45.toInterval();
        org.joda.time.DateTime dateTime48 = interval47.getStart();
        java.lang.String str49 = interval47.toString();
        long long50 = interval47.toDurationMillis();
        org.joda.time.Interval interval51 = interval47.toInterval();
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = interval51.toPeriod(periodType52);
        mutableDateTime23.add((org.joda.time.ReadablePeriod) period53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime13.withPeriodAdded((org.joda.time.ReadablePeriod) period53, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2024 + "'", int14 == 2024);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 53L + "'", long31 == 53L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000" + "'", str49, "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 86400000L + "'", long50 == 86400000L);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(localDateTime56);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology1, locale2, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long13 = fixedDateTimeZone10.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int20 = fixedDateTimeZone18.getStandardOffset(0L);
        long long22 = fixedDateTimeZone10.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, (long) (short) 10);
        dateTimeParserBucket5.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone10);
        java.lang.Object obj24 = null;
        boolean boolean25 = dateTimeParserBucket5.restoreState(obj24);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket5.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology29 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone27, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology0);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusWeeks((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean7 = localDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone12);
        org.joda.time.DurationField durationField14 = gJChronology13.eras();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField15 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType6, durationField14);
        java.lang.String str16 = unsupportedDateTimeField15.getName();
        boolean boolean17 = unsupportedDateTimeField15.isSupported();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = unsupportedDateTimeField15.getType();
        org.joda.time.chrono.GregorianChronology gregorianChronology19 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology19.monthOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology22.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology22);
        java.util.Date date25 = localDateTime24.toDate();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusYears(960);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDateTime24, 0, locale29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime24.plusWeeks(9);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime24.minusMillis(0);
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology36, locale37, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone45 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long48 = fixedDateTimeZone45.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone53 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int55 = fixedDateTimeZone53.getStandardOffset(0L);
        long long57 = fixedDateTimeZone45.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone53, (long) (short) 10);
        dateTimeParserBucket40.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone45);
        org.joda.time.DateTime dateTime59 = localDateTime24.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone45);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime24.withSecondOfMinute(10);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = unsupportedDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekOfWeekyear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "weekOfWeekyear" + "'", str16, "weekOfWeekyear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(gregorianChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(gregorianChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Apr 09 19:18:31 PDT 2024");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 53L + "'", long48 == 53L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L + "'", long57 == 10L);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate44 = property43.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(69);
        org.joda.time.DateTime dateTime47 = localDate44.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.LocalDate.Property property48 = localDate44.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int7 = fixedDateTimeZone5.getStandardOffset(0L);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone5, (long) (byte) 10, 1);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology11.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology11);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.weekyear();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property14.getAsShortText(locale15);
        org.joda.time.LocalDateTime localDateTime17 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime19 = property14.setCopy((int) (byte) 100);
        boolean boolean20 = fixedDateTimeZone5.isLocalDateTimeGap(localDateTime19);
        java.lang.String str21 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.plusHours(0);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2024" + "'", str16, "2024");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0100-103T19:18:32.202" + "'", str21, "0100-103T19:18:32.202");
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeParser();
        int int1 = dateTimeFormatter0.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2000 + "'", int1 == 2000);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology1, locale2, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long13 = fixedDateTimeZone10.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int20 = fixedDateTimeZone18.getStandardOffset(0L);
        long long22 = fixedDateTimeZone10.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, (long) (short) 10);
        dateTimeParserBucket5.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone10);
        long long24 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5L + "'", long24 == 5L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.year();
        int int44 = localDate8.size();
        int int45 = localDate8.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 'a', chronology44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusSeconds(0);
        int int48 = dateTime45.getCenturyOfEra();
        boolean boolean49 = interval42.isAfter((org.joda.time.ReadableInstant) dateTime45);
        long long50 = interval42.getStartMillis();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 19 + "'", int48 == 19);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1712620800001L + "'", long50 == 1712620800001L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate44 = property43.roundCeilingCopy();
        org.joda.time.LocalDate localDate46 = property43.addToCopy(20);
        org.joda.time.Interval interval47 = localDate46.toInterval();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(interval47);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.dayOfYear();
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 362, (org.joda.time.Chronology) gregorianChronology1, locale4);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        int int43 = localDate8.getMonthOfYear();
        org.joda.time.LocalDate localDate45 = localDate8.plusDays(97);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType46.getRangeDurationType();
        boolean boolean48 = localDate8.equals((java.lang.Object) dateTimeFieldType46);
        org.joda.time.LocalDate.Property property49 = localDate8.yearOfCentury();
        java.util.Locale locale51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate52 = property49.setCopy("GJChronology[hi!]", locale51);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"GJChronology[hi!]\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber7 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType4, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology10, locale11, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long22 = fixedDateTimeZone19.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int29 = fixedDateTimeZone27.getStandardOffset(0L);
        long long31 = fixedDateTimeZone19.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone27, (long) (short) 10);
        dateTimeParserBucket14.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone19);
        java.lang.Object obj33 = null;
        boolean boolean34 = dateTimeParserBucket14.restoreState(obj33);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket14.getZone();
        long long38 = dateTimeParserBucket14.computeMillis(false, "");
        long long40 = dateTimeParserBucket14.computeMillis(true);
        java.lang.Object obj41 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology43 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology43.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology43.monthOfYear();
        int int46 = gregorianChronology43.getMinimumDaysInFirstWeek();
        boolean boolean47 = dateTimeFieldType42.isSupported((org.joda.time.Chronology) gregorianChronology43);
        org.joda.time.DateTimeField dateTimeField48 = gregorianChronology43.minuteOfDay();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(obj41, (org.joda.time.Chronology) gregorianChronology43);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone54 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone54);
        org.joda.time.DurationField durationField56 = gJChronology55.eras();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology55.era();
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology59, locale60, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone68 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long71 = fixedDateTimeZone68.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone76 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int78 = fixedDateTimeZone76.getStandardOffset(0L);
        long long80 = fixedDateTimeZone68.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone76, (long) (short) 10);
        dateTimeParserBucket63.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone68);
        boolean boolean82 = gJChronology55.equals((java.lang.Object) fixedDateTimeZone68);
        org.joda.time.Interval interval83 = localDate49.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeUtils.getZone((org.joda.time.DateTimeZone) fixedDateTimeZone68);
        dateTimeParserBucket14.setZone(dateTimeZone84);
        int int88 = fixedNumber7.parseInto(dateTimeParserBucket14, "halfdayOfDay", 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 53L + "'", long22 == 53L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5L + "'", long38 == 5L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 5L + "'", long40 == 5L);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(gregorianChronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(gJChronology55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 53L + "'", long71 == 53L);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 10L + "'", long80 == 10L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(interval83);
        org.junit.Assert.assertNotNull(dateTimeZone84);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-25) + "'", int88 == (-25));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        int int43 = localDate8.getMonthOfYear();
        org.joda.time.LocalDate localDate45 = localDate8.plusDays(97);
        org.joda.time.LocalDate.Property property46 = localDate45.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(property46);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 'a', chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusSeconds(0);
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.DateTime.Property property6 = dateTime4.yearOfCentury();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime4.withChronology(chronology8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 'a', chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds(0);
        int int16 = dateTime13.getSecondOfMinute();
        org.joda.time.DateTime dateTime18 = dateTime13.minusYears((int) '#');
        java.util.Date date19 = dateTime13.toDate();
        org.joda.time.DateTime dateTime21 = dateTime13.withMillis((long) (byte) 10);
        boolean boolean22 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 'a', chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfWeek();
        org.joda.time.DateTime dateTime28 = dateTime25.minusYears(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology29.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime28.toMutableDateTime((org.joda.time.Chronology) gregorianChronology29);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long39 = fixedDateTimeZone36.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone44 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int46 = fixedDateTimeZone44.getStandardOffset(0L);
        long long48 = fixedDateTimeZone36.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone44, (long) (short) 10);
        mutableDateTime31.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone36);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 'a', chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property53.getFieldType();
        org.joda.time.Interval interval55 = property53.toInterval();
        org.joda.time.DateTime dateTime56 = interval55.getStart();
        java.lang.String str57 = interval55.toString();
        long long58 = interval55.toDurationMillis();
        org.joda.time.Interval interval59 = interval55.toInterval();
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = interval59.toPeriod(periodType60);
        mutableDateTime31.add((org.joda.time.ReadablePeriod) period61);
        org.joda.time.Chronology chronology64 = null;
        java.util.Locale locale65 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology64, locale65, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone73 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long76 = fixedDateTimeZone73.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone81 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int83 = fixedDateTimeZone81.getStandardOffset(0L);
        long long85 = fixedDateTimeZone73.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone81, (long) (short) 10);
        dateTimeParserBucket68.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone73);
        mutableDateTime31.setZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone73);
        org.joda.time.DateTime dateTime88 = dateTime21.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone73);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 16:00:00 PST 1969");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 53L + "'", long39 == 53L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000" + "'", str57, "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 86400000L + "'", long58 == 86400000L);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 53L + "'", long76 == 53L);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 10 + "'", int83 == 10);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 10L + "'", long85 == 10L);
        org.junit.Assert.assertNotNull(dateTime88);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.yearMonthDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 24524946);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = dateTimeFormatter2.parseLocalTime("2024-100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2024-100\" is malformed at \"0\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate44 = property43.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(69);
        org.joda.time.DateTime dateTime47 = localDate44.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.withMinuteOfHour(0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology1, locale2, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long13 = fixedDateTimeZone10.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int20 = fixedDateTimeZone18.getStandardOffset(0L);
        long long22 = fixedDateTimeZone10.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, (long) (short) 10);
        dateTimeParserBucket5.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone10);
        java.lang.Class<?> wildcardClass24 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 'a', chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        org.joda.time.Interval interval48 = property46.toInterval();
        org.joda.time.DateTime dateTime49 = interval48.getStart();
        java.lang.String str50 = interval48.toString();
        long long51 = interval48.toDurationMillis();
        org.joda.time.Interval interval52 = interval48.toInterval();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = interval52.toPeriod(periodType53);
        org.joda.time.LocalDate localDate55 = localDate8.plus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.DateMidnight dateMidnight56 = localDate55.toDateMidnight();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone62 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long65 = fixedDateTimeZone62.convertLocalToUTC(9003L, true);
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate(10L, (org.joda.time.DateTimeZone) fixedDateTimeZone62);
        long long68 = fixedDateTimeZone62.nextTransition((long) (short) 10);
        org.joda.time.DateTime dateTime69 = localDate55.toDateTimeAtMidnight((org.joda.time.DateTimeZone) fixedDateTimeZone62);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000" + "'", str50, "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 86400000L + "'", long51 == 86400000L);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 9004L + "'", long65 == 9004L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L + "'", long68 == 10L);
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("Property[yearOfEra]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[yearOfEra]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        java.lang.String str4 = dateTimeField2.getAsText((long) (byte) 100);
        org.joda.time.DurationField durationField5 = dateTimeField2.getRangeDurationField();
        org.joda.time.format.DateTimeParserBucket.SavedField savedField7 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField2, (int) '4');
        int int8 = savedField7.iValue;
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfDay();
        java.lang.String str13 = dateTimeField11.getAsText((long) (byte) 100);
        org.joda.time.DurationField durationField14 = dateTimeField11.getRangeDurationField();
        org.joda.time.format.DateTimeParserBucket.SavedField savedField16 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField11, (int) '4');
        int int17 = savedField16.iValue;
        int int18 = savedField7.compareTo(savedField16);
        org.joda.time.DateTimeField dateTimeField19 = savedField7.iField;
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "16" + "'", str4, "16");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16" + "'", str13, "16");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        int int3 = gregorianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.weekyear();
        boolean boolean6 = dateTimeField5.isLenient();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.io.Writer writer1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 'a', chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusSeconds(0);
        org.joda.time.DateTime dateTime8 = dateTime4.minusMillis(0);
        org.joda.time.DateTime.Property property9 = dateTime4.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadableInstant) dateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("9");
        int int2 = localDate1.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        java.lang.String str44 = fixedDateTimeZone27.getNameKey(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology46 = org.joda.time.chrono.JulianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone27, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("8");
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 'a', chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        int int4 = dateTime2.getEra();
        boolean boolean5 = dateTime2.isEqualNow();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 'a', chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfWeek();
        org.joda.time.DateTime dateTime11 = dateTime8.minusYears(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology12.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime11.toMutableDateTime((org.joda.time.Chronology) gregorianChronology12);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long22 = fixedDateTimeZone19.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int29 = fixedDateTimeZone27.getStandardOffset(0L);
        long long31 = fixedDateTimeZone19.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone27, (long) (short) 10);
        mutableDateTime14.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone19);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 'a', chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        org.joda.time.Interval interval38 = property36.toInterval();
        org.joda.time.DateTime dateTime39 = interval38.getStart();
        java.lang.String str40 = interval38.toString();
        long long41 = interval38.toDurationMillis();
        org.joda.time.Interval interval42 = interval38.toInterval();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = interval42.toPeriod(periodType43);
        mutableDateTime14.add((org.joda.time.ReadablePeriod) period44);
        org.joda.time.DateTime dateTime46 = dateTime2.minus((org.joda.time.ReadablePeriod) period44);
        int int47 = dateTime2.getSecondOfMinute();
        java.util.Locale locale49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = dateTime2.toString("hours", locale49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 53L + "'", long22 == 53L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000" + "'", str40, "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 86400000L + "'", long41 == 86400000L);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.dayOfWeek();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 'a', chronology45);
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        org.joda.time.Interval interval49 = property47.toInterval();
        org.joda.time.DateTime dateTime50 = interval49.getStart();
        java.lang.String str51 = interval49.toString();
        long long52 = interval49.toDurationMillis();
        org.joda.time.Interval interval53 = interval49.toInterval();
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = interval53.toPeriod(periodType54);
        org.joda.time.LocalDate localDate56 = localDate8.plus((org.joda.time.ReadablePeriod) period55);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000" + "'", str51, "1969-12-31T00:00:00.000/1970-01-01T00:00:00.000");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 86400000L + "'", long52 == 86400000L);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(localDate56);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology2, locale3, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long14 = fixedDateTimeZone11.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int21 = fixedDateTimeZone19.getStandardOffset(0L);
        long long23 = fixedDateTimeZone11.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone19, (long) (short) 10);
        dateTimeParserBucket6.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone11);
        java.util.Locale locale26 = null;
        java.lang.String str27 = fixedDateTimeZone11.getName(100L, locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj0, (org.joda.time.DateTimeZone) fixedDateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 53L + "'", long14 == 53L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-00:00:00.001" + "'", str27, "-00:00:00.001");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology0);
        org.joda.time.DurationField durationField3 = gregorianChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.hourOfDay();
        org.joda.time.DurationField durationField5 = gregorianChronology0.halfdays();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.field.DecoratedDurationField decoratedDurationField7 = new org.joda.time.field.DecoratedDurationField(durationField5, durationFieldType6);
        long long9 = decoratedDurationField7.getMillis(0L);
        boolean boolean10 = decoratedDurationField7.isPrecise();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 'a', chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        org.joda.time.Interval interval48 = property46.toInterval();
        org.joda.time.DateTime dateTime49 = interval48.getStart();
        java.lang.String str50 = interval48.toString();
        long long51 = interval48.toDurationMillis();
        org.joda.time.Interval interval52 = interval48.toInterval();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = interval52.toPeriod(periodType53);
        org.joda.time.LocalDate localDate55 = localDate8.plus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.DateMidnight dateMidnight56 = localDate55.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = localDate55.isSupported(dateTimeFieldType57);
        org.joda.time.Interval interval59 = localDate55.toInterval();
        java.lang.String str60 = interval59.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01T00:00:00.000/1970-01-02T00:00:00.000" + "'", str50, "1970-01-01T00:00:00.000/1970-01-02T00:00:00.000");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 86400000L + "'", long51 == 86400000L);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval59);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2024-04-11T00:00:00.000/2024-04-12T00:00:00.000" + "'", str60, "2024-04-11T00:00:00.000/2024-04-12T00:00:00.000");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        java.lang.String str4 = dateTimeField2.getAsText((long) (byte) 100);
        org.joda.time.DurationField durationField5 = dateTimeField2.getRangeDurationField();
        org.joda.time.format.DateTimeParserBucket.SavedField savedField7 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField2, (int) '4');
        org.joda.time.DateTimeField dateTimeField8 = savedField7.iField;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket.SavedField savedField11 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField8, "1969-12-31T16:00:00.097-08:00", locale10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval12);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.clockhourOfDay();
        java.lang.String str16 = dateTimeField14.getAsText((long) (byte) 100);
        org.joda.time.DurationField durationField17 = dateTimeField14.getRangeDurationField();
        org.joda.time.format.DateTimeParserBucket.SavedField savedField19 = new org.joda.time.format.DateTimeParserBucket.SavedField(dateTimeField14, (int) '4');
        int int20 = savedField19.iValue;
        java.util.Locale locale21 = savedField19.iLocale;
        int int22 = savedField11.compareTo(savedField19);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = savedField11.set((long) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T16:00:00.097-08:00\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "24" + "'", str4, "24");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "24" + "'", str16, "24");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 'a', chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        org.joda.time.Interval interval5 = property3.toInterval();
        org.joda.time.DateTime dateTime6 = interval5.getStart();
        java.lang.String str7 = interval5.toString();
        long long8 = interval5.toDurationMillis();
        org.joda.time.Interval interval9 = interval5.toInterval();
        org.joda.time.Duration duration10 = interval9.toDuration();
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.monthOfYear();
        int int16 = gregorianChronology13.getMinimumDaysInFirstWeek();
        boolean boolean17 = dateTimeFieldType12.isSupported((org.joda.time.Chronology) gregorianChronology13);
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology13.minuteOfDay();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(obj11, (org.joda.time.Chronology) gregorianChronology13);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        org.joda.time.DurationField durationField26 = gJChronology25.eras();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.era();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology29, locale30, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone38 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long41 = fixedDateTimeZone38.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone46 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int48 = fixedDateTimeZone46.getStandardOffset(0L);
        long long50 = fixedDateTimeZone38.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone46, (long) (short) 10);
        dateTimeParserBucket33.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone38);
        boolean boolean52 = gJChronology25.equals((java.lang.Object) fixedDateTimeZone38);
        org.joda.time.Interval interval53 = localDate19.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone38);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) 'a', chronology55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusSeconds(0);
        int int59 = dateTime56.getCenturyOfEra();
        boolean boolean60 = interval53.isAfter((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.MutableInterval mutableInterval61 = interval53.toMutableInterval();
        boolean boolean62 = interval9.contains((org.joda.time.ReadableInterval) interval53);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.PeriodType periodType64 = org.joda.time.DateTimeUtils.getPeriodType(periodType63);
        org.joda.time.PeriodType periodType65 = org.joda.time.DateTimeUtils.getPeriodType(periodType64);
        org.joda.time.Period period66 = interval53.toPeriod(periodType65);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.000/1970-01-02T00:00:00.000" + "'", str7, "1970-01-01T00:00:00.000/1970-01-02T00:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 86400000L + "'", long8 == 86400000L);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 53L + "'", long41 == 53L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 19 + "'", int59 == 19);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(mutableInterval61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(period66);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField3 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology5, locale6, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long17 = fixedDateTimeZone14.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int24 = fixedDateTimeZone22.getStandardOffset(0L);
        long long26 = fixedDateTimeZone14.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (long) (short) 10);
        dateTimeParserBucket9.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone14);
        java.lang.Object obj28 = null;
        boolean boolean29 = dateTimeParserBucket9.restoreState(obj28);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeParserBucket9.getZone();
        int int33 = textField3.parseInto(dateTimeParserBucket9, "", (int) (short) 1);
        int int34 = textField3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer35 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology37.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology37);
        org.joda.time.DurationField durationField40 = gregorianChronology37.years();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology37.hourOfDay();
        org.joda.time.DurationField durationField42 = gregorianChronology37.halfdays();
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology37.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType45.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder.TextField textField48 = new org.joda.time.format.DateTimeFormatterBuilder.TextField(dateTimeFieldType45, false);
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale51 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology50, locale51, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone59 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long62 = fixedDateTimeZone59.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone67 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int69 = fixedDateTimeZone67.getStandardOffset(0L);
        long long71 = fixedDateTimeZone59.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone67, (long) (short) 10);
        dateTimeParserBucket54.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone59);
        java.lang.Object obj73 = null;
        boolean boolean74 = dateTimeParserBucket54.restoreState(obj73);
        org.joda.time.DateTimeZone dateTimeZone75 = dateTimeParserBucket54.getZone();
        int int78 = textField48.parseInto(dateTimeParserBucket54, "", (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone79 = dateTimeParserBucket54.getZone();
        java.util.Locale locale80 = null;
        // The following exception was thrown during execution in test generation
        try {
            textField3.printTo(stringBuffer35, (long) (byte) 1, (org.joda.time.Chronology) gregorianChronology37, (int) '#', dateTimeZone79, locale80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 53L + "'", long17 == 53L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
        org.junit.Assert.assertNotNull(gregorianChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 53L + "'", long62 == 53L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L + "'", long71 == 10L);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-2) + "'", int78 == (-2));
        org.junit.Assert.assertNotNull(dateTimeZone79);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology1, locale2, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long13 = fixedDateTimeZone10.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int20 = fixedDateTimeZone18.getStandardOffset(0L);
        long long22 = fixedDateTimeZone10.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, (long) (short) 10);
        dateTimeParserBucket5.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone10);
        java.lang.Object obj24 = null;
        boolean boolean25 = dateTimeParserBucket5.restoreState(obj24);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket5.getZone();
        long long29 = dateTimeParserBucket5.computeMillis(false, "");
        long long30 = dateTimeParserBucket5.computeMillis();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 'a', chronology32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusSeconds(0);
        int int36 = dateTime35.getSecondOfMinute();
        org.joda.time.DateTime.Property property37 = dateTime35.yearOfCentury();
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval38);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.dayOfYear();
        org.joda.time.DateTime dateTime41 = dateTime35.withChronology(chronology39);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int43 = dateTime35.get(dateTimeFieldType42);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.monthOfYear();
        int int48 = gregorianChronology45.getMinimumDaysInFirstWeek();
        boolean boolean49 = dateTimeFieldType44.isSupported((org.joda.time.Chronology) gregorianChronology45);
        org.joda.time.DateTimeField dateTimeField50 = gregorianChronology45.minuteOfDay();
        org.joda.time.DurationField durationField51 = gregorianChronology45.months();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField52 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType42, durationField51);
        java.util.Locale locale54 = null;
        dateTimeParserBucket5.saveField(dateTimeFieldType42, "1582-10-14T16:07:02", locale54);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5L + "'", long29 == 5L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5L + "'", long30 == 5L);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(gregorianChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField52);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology3);
        java.util.Date date6 = localDateTime5.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusYears(960);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime5, 0, locale10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.plusWeeks(9);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.minusMillis(0);
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology17, locale18, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long29 = fixedDateTimeZone26.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone34 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int36 = fixedDateTimeZone34.getStandardOffset(0L);
        long long38 = fixedDateTimeZone26.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone34, (long) (short) 10);
        dateTimeParserBucket21.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone26);
        org.joda.time.DateTime dateTime40 = localDateTime5.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone26);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime5.withSecondOfMinute(10);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusSeconds((int) 'a');
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Wed Apr 10 02:18:43 PDT 2024");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 53L + "'", long29 == 53L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.monthOfYear();
        int int4 = gregorianChronology1.getMinimumDaysInFirstWeek();
        boolean boolean5 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField6 = gregorianChronology1.eras();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getStandardOffset(0L);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4, (long) (byte) 10, 1);
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology11, locale12, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long23 = fixedDateTimeZone20.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int30 = fixedDateTimeZone28.getStandardOffset(0L);
        long long32 = fixedDateTimeZone20.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone28, (long) (short) 10);
        dateTimeParserBucket15.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone20);
        java.lang.Object obj34 = null;
        boolean boolean35 = dateTimeParserBucket15.restoreState(obj34);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeParserBucket15.getZone();
        long long38 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone36, (long) (short) 1);
        int int40 = fixedDateTimeZone4.getOffsetFromLocal((long) 20);
        java.lang.String str42 = fixedDateTimeZone4.getNameKey(1934L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 53L + "'", long23 == 53L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.LocalDate.Property property43 = localDate8.year();
        org.joda.time.LocalDate localDate44 = property43.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 'a', chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        org.joda.time.Interval interval48 = property46.toInterval();
        org.joda.time.DateTime dateTime49 = interval48.getStart();
        java.lang.String str50 = interval48.toString();
        long long51 = interval48.toDurationMillis();
        org.joda.time.Interval interval52 = interval48.toInterval();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = interval52.toPeriod(periodType53);
        org.joda.time.LocalDate localDate55 = localDate8.plus((org.joda.time.ReadablePeriod) period54);
        org.joda.time.DateMidnight dateMidnight56 = localDate55.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = localDate55.isSupported(dateTimeFieldType57);
        org.joda.time.Interval interval59 = localDate55.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType61 = localDate55.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01T00:00:00.000/1970-01-02T00:00:00.000" + "'", str50, "1970-01-01T00:00:00.000/1970-01-02T00:00:00.000");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 86400000L + "'", long51 == 86400000L);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(interval59);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Apr 9, 2024 7:18:18 PM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Apr 9, 2024 7:18:18 PM\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.joda.time.DurationField durationField15 = gJChronology14.eras();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.era();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology18, locale19, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long30 = fixedDateTimeZone27.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int37 = fixedDateTimeZone35.getStandardOffset(0L);
        long long39 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) (short) 10);
        dateTimeParserBucket22.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        boolean boolean41 = gJChronology14.equals((java.lang.Object) fixedDateTimeZone27);
        org.joda.time.Interval interval42 = localDate8.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone27);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 'a', chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        org.joda.time.Interval interval48 = property46.toInterval();
        org.joda.time.DateTime dateTime49 = interval48.getStart();
        java.lang.String str50 = interval48.toString();
        long long51 = interval48.toDurationMillis();
        org.joda.time.Interval interval52 = interval48.toInterval();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = interval52.toPeriod(periodType53);
        org.joda.time.LocalDate localDate55 = localDate8.plus((org.joda.time.ReadablePeriod) period54);
        int int56 = localDate55.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 53L + "'", long30 == 53L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01T00:00:00.000/1970-01-02T00:00:00.000" + "'", str50, "1970-01-01T00:00:00.000/1970-01-02T00:00:00.000");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 86400000L + "'", long51 == 86400000L);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(localDate55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 11 + "'", int56 == 11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.monthOfYear();
        int int5 = gregorianChronology2.getMinimumDaysInFirstWeek();
        boolean boolean6 = dateTimeFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(obj0, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths(52);
        int int11 = localDate8.getMonthOfYear();
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.monthOfYear();
        int int17 = gregorianChronology14.getMinimumDaysInFirstWeek();
        boolean boolean18 = dateTimeFieldType13.isSupported((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology14.minuteOfDay();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(obj12, (org.joda.time.Chronology) gregorianChronology14);
        int int21 = localDate8.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate23 = localDate20.withDayOfYear(8);
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology26, locale27, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long38 = fixedDateTimeZone35.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone43 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int45 = fixedDateTimeZone43.getStandardOffset(0L);
        long long47 = fixedDateTimeZone35.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone43, (long) (short) 10);
        dateTimeParserBucket30.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone35);
        java.lang.Object obj49 = null;
        boolean boolean50 = dateTimeParserBucket30.restoreState(obj49);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTimeParserBucket30.getZone();
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeParserBucket30.getZone();
        dateTimeParserBucket30.setPivotYear((java.lang.Integer) 69);
        java.util.Locale locale55 = dateTimeParserBucket30.getLocale();
        java.lang.String str56 = localDate23.toString("4", locale55);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 53L + "'", long38 == 53L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "4" + "'", str56, "4");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = gJChronology5.hourOfDay();
        org.joda.time.Chronology chronology7 = gJChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.dayOfYear();
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter1.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter1.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.parse("97", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"97\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNull(dateTimeZone3);
    }
}

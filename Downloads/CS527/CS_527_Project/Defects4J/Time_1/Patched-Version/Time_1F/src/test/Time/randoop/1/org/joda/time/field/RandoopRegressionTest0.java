package org.joda.time.field;

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
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.OffsetDateTimeField offsetDateTimeField5 = new org.joda.time.field.OffsetDateTimeField(dateTimeField0, dateTimeFieldType1, 0, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDateTimeField6.roundCeiling(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) 1, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28800001L + "'", long3 == 28800001L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.joda.time.ReadablePartial readablePartial0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial1 = new org.joda.time.Partial(readablePartial0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        org.joda.time.ReadablePartial readablePartial54 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = partial36.isEqual(readablePartial54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong(1712713998215L, (-210861660779418L));
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology12.millis();
        org.joda.time.DurationField durationField15 = chronology12.centuries();
        org.joda.time.Chronology chronology16 = chronology12.withUTC();
        org.joda.time.DurationField durationField17 = chronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField21 = new org.joda.time.field.DividedDateTimeField(dateTimeField18, dateTimeFieldType19, 10);
        long long24 = dividedDateTimeField21.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField31 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType25, durationField30);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField32 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField21, dateTimeFieldType25);
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale35 = null;
        java.lang.String str36 = dividedDateTimeField21.getAsShortText(readablePartial33, 29227899, locale35);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField38 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField21, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str40 = dateTimeFieldType39.getName();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.Partial partial46 = new org.joda.time.Partial(dateTimeFieldType39, (int) (short) 0, chronology44);
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.ReadableInterval readableInterval48 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval47);
        org.joda.time.Chronology chronology49 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval47);
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfCentury();
        org.joda.time.DurationField durationField51 = chronology49.millis();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial54 = null;
        int[] intArray61 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int62 = dateTimeField53.getMaximumValue(readablePartial54, intArray61);
        int int63 = dividedDateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) partial46, intArray61);
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.ReadableInterval readableInterval72 = null;
        boolean boolean73 = readableInterval71.contains(readableInterval72);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = readableInterval71.toPeriod(periodType74);
        int[] intArray77 = chronology67.get((org.joda.time.ReadablePeriod) period75, (-210866846400000L));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray79 = unsupportedDateTimeField6.set((org.joda.time.ReadablePartial) partial46, 28545173, intArray77, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 212574374777633L + "'", long9 == 212574374777633L);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-30610224000000L) + "'", long24 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "29227899" + "'", str36, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hourOfDay" + "'", str40, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(readableInterval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 24 + "'", int62 == 24);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        long long14 = unsupportedDateTimeField6.getDifferenceAsLong(10L, 0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str16 = dateTimeFieldType15.getName();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.ReadableInterval readableInterval19 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval18);
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval18);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        org.joda.time.Partial partial22 = new org.joda.time.Partial(dateTimeFieldType15, (int) (short) 0, chronology20);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval24);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.millis();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval30);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.ReadableInterval readableInterval36 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval35);
        org.joda.time.ReadableInterval readableInterval37 = null;
        boolean boolean38 = readableInterval36.contains(readableInterval37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = readableInterval36.toPeriod(periodType39);
        int[] intArray42 = chronology32.get((org.joda.time.ReadablePeriod) period40, (-210866846400000L));
        int[] intArray45 = chronology26.get((org.joda.time.ReadablePeriod) period40, 2173795348453L, (long) 1439);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = unsupportedDateTimeField6.set((org.joda.time.ReadablePartial) partial22, (int) ' ', intArray45, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hourOfDay" + "'", str16, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(readableInterval36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-68, -10, -2, -4, -16, -2, -27, -14]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType0 };
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.millis();
        org.joda.time.DurationField durationField7 = chronology4.centuries();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.ReadableInterval readableInterval21 = null;
        boolean boolean22 = readableInterval20.contains(readableInterval21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = readableInterval20.toPeriod(periodType23);
        int[] intArray26 = chronology16.get((org.joda.time.ReadablePeriod) period24, (-210866846400000L));
        int[] intArray29 = chronology10.get((org.joda.time.ReadablePeriod) period24, 2173795348453L, (long) 1439);
        int[] intArray32 = chronology4.get((org.joda.time.ReadablePeriod) period24, (-210861660779418L), 1712713996806L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial33 = new org.joda.time.Partial(dateTimeFieldTypeArray1, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[6736, 2, 2, 4, 14, 19, 14, 224]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        long long24 = remainderDateTimeField22.roundHalfFloor((long) 100);
        boolean boolean25 = remainderDateTimeField22.isSupported();
        int int27 = remainderDateTimeField22.get(0L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        java.util.Locale locale55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = partial36.toString("", locale55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField7 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType1, durationField6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = partial0.get(dateTimeFieldType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        int int13 = unsupportedDateTimeField6.getDifference((long) (byte) 10, 10L);
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DurationField durationField21 = chronology18.centuries();
        org.joda.time.Chronology chronology22 = chronology18.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField(dateTimeField24, dateTimeFieldType25, 10);
        long long30 = dividedDateTimeField27.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField37 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType31, durationField36);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField38 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField27, dateTimeFieldType31);
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale41 = null;
        java.lang.String str42 = dividedDateTimeField27.getAsShortText(readablePartial39, 29227899, locale41);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField44 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField27, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str46 = dateTimeFieldType45.getName();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.Partial partial52 = new org.joda.time.Partial(dateTimeFieldType45, (int) (short) 0, chronology50);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial60 = null;
        int[] intArray67 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int68 = dateTimeField59.getMaximumValue(readablePartial60, intArray67);
        int int69 = dividedDateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) partial52, intArray67);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray71 = unsupportedDateTimeField6.add((org.joda.time.ReadablePartial) partial14, 53460006, intArray67, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-30610224000000L) + "'", long30 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "29227899" + "'", str42, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hourOfDay" + "'", str46, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 24 + "'", int68 == 24);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType57 = partial36.getFieldType(53460006);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53460006");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        java.lang.Object obj56 = null;
        boolean boolean57 = partial36.equals(obj56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField59 = partial36.getField((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        boolean boolean15 = durationFieldType10.isSupported(chronology13);
        org.joda.time.field.ScaledDurationField scaledDurationField17 = new org.joda.time.field.ScaledDurationField(durationField5, durationFieldType10, (int) 'a');
        org.joda.time.DurationField durationField18 = scaledDurationField17.getWrappedField();
        long long21 = scaledDurationField17.add((-210866846400000L), (long) 53460006);
        int int24 = scaledDurationField17.getValue((long) 1, 1L);
        boolean boolean25 = scaledDurationField17.isPrecise();
        int int28 = scaledDurationField17.getValue(9700L, 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-210861660779418L) + "'", long21 == (-210861660779418L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology6.add(readablePeriod7, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfHalfday();
        long long14 = dateTimeField11.addWrapField(0L, 1);
        org.joda.time.Partial partial15 = new org.joda.time.Partial();
        int[] intArray22 = new int[] { (byte) 10, 11, 1439, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = dateTimeField11.add((org.joda.time.ReadablePartial) partial15, (int) (byte) 10, intArray22, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600000L + "'", long14 == 3600000L);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 11, 1439, 1, 10]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        boolean boolean57 = partial36.equals((java.lang.Object) 1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int59 = partial36.get(dateTimeFieldType58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Duration duration2 = readableInterval1.toDuration();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        org.joda.time.ReadablePartial readablePartial54 = null;
        java.util.Locale locale55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = dividedDateTimeField11.getAsText(readablePartial54, locale55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = partial7.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.centuries();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField15 = new org.joda.time.field.DividedDateTimeField(dateTimeField12, dateTimeFieldType13, 10);
        long long18 = dividedDateTimeField15.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval20);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField25 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType19, durationField24);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField26 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField15, dateTimeFieldType19);
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = null;
        java.lang.String str30 = dividedDateTimeField15.getAsShortText(readablePartial27, 29227899, locale29);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField32 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField15, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str34 = dateTimeFieldType33.getName();
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.ReadableInterval readableInterval37 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval36);
        org.joda.time.Chronology chronology38 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval36);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.yearOfCentury();
        org.joda.time.Partial partial40 = new org.joda.time.Partial(dateTimeFieldType33, (int) (short) 0, chronology38);
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.ReadableInterval readableInterval42 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval41);
        org.joda.time.Chronology chronology43 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval41);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.DurationField durationField45 = chronology43.millis();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial48 = null;
        int[] intArray55 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int56 = dateTimeField47.getMaximumValue(readablePartial48, intArray55);
        int int57 = dividedDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) partial40, intArray55);
        boolean boolean59 = partial40.equals((java.lang.Object) "29227899");
        java.lang.Object obj60 = null;
        boolean boolean61 = partial40.equals(obj60);
        org.joda.time.Chronology chronology62 = partial40.getChronology();
        int[] intArray64 = null;
        java.util.Locale locale66 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray67 = dateTimeField3.set((org.joda.time.ReadablePartial) partial40, (int) (short) 100, intArray64, "hourOfDay", locale66);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hourOfDay\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-30610224000000L) + "'", long18 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(readableInterval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "29227899" + "'", str30, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hourOfDay" + "'", str34, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(readableInterval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 24 + "'", int56 == 24);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(chronology62);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        long long55 = dividedDateTimeField11.roundHalfEven((-990L));
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add((long) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        java.lang.String str7 = chronology3.toString();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfHour();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str7, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField2 = iSOChronology0.weeks();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong(1712713998215L, (-210861660779418L));
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str12 = dateTimeFieldType11.getName();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.Partial partial18 = new org.joda.time.Partial(dateTimeFieldType11, (int) (short) 0, chronology16);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval20);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.DurationField durationField25 = chronology22.centuries();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.ReadableInterval readableInterval39 = null;
        boolean boolean40 = readableInterval38.contains(readableInterval39);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = readableInterval38.toPeriod(periodType41);
        int[] intArray44 = chronology34.get((org.joda.time.ReadablePeriod) period42, (-210866846400000L));
        int[] intArray47 = chronology28.get((org.joda.time.ReadablePeriod) period42, 2173795348453L, (long) 1439);
        int[] intArray50 = chronology22.get((org.joda.time.ReadablePeriod) period42, (-210861660779418L), 1712713996806L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray52 = unsupportedDateTimeField6.add((org.joda.time.ReadablePartial) partial18, (int) (byte) 1, intArray50, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 212574374777633L + "'", long9 == 212574374777633L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hourOfDay" + "'", str12, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(readableInterval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[6736, 2, 2, 4, 14, 19, 14, 224]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        long long2 = readableInterval1.getStartMillis();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        long long5 = readableInterval4.getEndMillis();
        boolean boolean6 = readableInterval1.overlaps(readableInterval4);
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField8 = iSOChronology7.minutes();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.era();
        boolean boolean14 = readableInterval4.equals((java.lang.Object) dateTimeField13);
        org.junit.Assert.assertNotNull(readableInterval1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1712714006728L + "'", long2 == 1712714006728L);
        org.junit.Assert.assertNotNull(readableInterval4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1712714006728L + "'", long5 == 1712714006728L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        java.util.Locale locale12 = null;
        int int13 = dividedDateTimeField11.getMaximumTextLength(locale12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = partial7.getValue(29227899);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29227899");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add(1712714001036L, 2768887602L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.DurationField durationField23 = remainderDateTimeField22.iDurationField;
        boolean boolean24 = remainderDateTimeField22.isLenient();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 100, true);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(gregorianChronology4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DurationField durationField29 = offsetDateTimeField28.getLeapDurationField();
        long long31 = offsetDateTimeField28.roundFloor(970L);
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.DurationField durationField37 = chronology34.centuries();
        org.joda.time.Chronology chronology38 = chronology34.withUTC();
        org.joda.time.DurationField durationField39 = chronology38.halfdays();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField43 = new org.joda.time.field.DividedDateTimeField(dateTimeField40, dateTimeFieldType41, 10);
        long long46 = dividedDateTimeField43.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology50.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField53 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType47, durationField52);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField54 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField43, dateTimeFieldType47);
        org.joda.time.ReadablePartial readablePartial55 = null;
        java.util.Locale locale57 = null;
        java.lang.String str58 = dividedDateTimeField43.getAsShortText(readablePartial55, 29227899, locale57);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField60 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField43, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str62 = dateTimeFieldType61.getName();
        org.joda.time.ReadableInterval readableInterval64 = null;
        org.joda.time.ReadableInterval readableInterval65 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval64);
        org.joda.time.Chronology chronology66 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval64);
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfCentury();
        org.joda.time.Partial partial68 = new org.joda.time.Partial(dateTimeFieldType61, (int) (short) 0, chronology66);
        org.joda.time.ReadableInterval readableInterval69 = null;
        org.joda.time.ReadableInterval readableInterval70 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval69);
        org.joda.time.Chronology chronology71 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval69);
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfCentury();
        org.joda.time.DurationField durationField73 = chronology71.millis();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField75 = chronology71.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial76 = null;
        int[] intArray83 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int84 = dateTimeField75.getMaximumValue(readablePartial76, intArray83);
        int int85 = dividedDateTimeField43.getMinimumValue((org.joda.time.ReadablePartial) partial68, intArray83);
        boolean boolean87 = partial68.equals((java.lang.Object) "29227899");
        boolean boolean89 = partial68.equals((java.lang.Object) 1L);
        org.joda.time.Chronology chronology90 = partial68.getChronology();
        java.util.Locale locale92 = null;
        java.lang.String str93 = offsetDateTimeField28.getAsShortText((org.joda.time.ReadablePartial) partial68, (int) (short) 1, locale92);
        org.joda.time.DateTimeFieldType dateTimeFieldType94 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean95 = partial68.isSupported(dateTimeFieldType94);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNull(durationField29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-30610224000000L) + "'", long46 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "29227899" + "'", str58, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hourOfDay" + "'", str62, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(readableInterval70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 24 + "'", int84 == 24);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(chronology90);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "1" + "'", str93, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        long long25 = remainderDateTimeField22.getDifferenceAsLong((long) 3, (long) 0);
        int int27 = remainderDateTimeField22.getLeapAmount(1L);
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.ReadableInterval readableInterval29 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval28);
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval28);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfCentury();
        org.joda.time.DurationField durationField32 = chronology30.millis();
        org.joda.time.DurationField durationField33 = chronology30.centuries();
        org.joda.time.Chronology chronology34 = chronology30.withUTC();
        org.joda.time.DurationField durationField35 = chronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField39 = new org.joda.time.field.DividedDateTimeField(dateTimeField36, dateTimeFieldType37, 10);
        long long42 = dividedDateTimeField39.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval44);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DurationField durationField48 = chronology46.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField49 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType43, durationField48);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField50 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField39, dateTimeFieldType43);
        org.joda.time.ReadablePartial readablePartial51 = null;
        java.util.Locale locale53 = null;
        java.lang.String str54 = dividedDateTimeField39.getAsShortText(readablePartial51, 29227899, locale53);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField56 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField39, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str58 = dateTimeFieldType57.getName();
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.ReadableInterval readableInterval61 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval60);
        org.joda.time.Chronology chronology62 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval60);
        org.joda.time.DateTimeField dateTimeField63 = chronology62.yearOfCentury();
        org.joda.time.Partial partial64 = new org.joda.time.Partial(dateTimeFieldType57, (int) (short) 0, chronology62);
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DurationField durationField69 = chronology67.millis();
        org.joda.time.DateTimeField dateTimeField70 = chronology67.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField71 = chronology67.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial72 = null;
        int[] intArray79 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int80 = dateTimeField71.getMaximumValue(readablePartial72, intArray79);
        int int81 = dividedDateTimeField39.getMinimumValue((org.joda.time.ReadablePartial) partial64, intArray79);
        boolean boolean83 = partial64.equals((java.lang.Object) "29227899");
        int[] intArray84 = partial64.getValues();
        java.util.Locale locale86 = null;
        java.lang.String str87 = remainderDateTimeField22.getAsShortText((org.joda.time.ReadablePartial) partial64, (int) (short) 1, locale86);
        // The following exception was thrown during execution in test generation
        try {
            int int89 = partial64.getValue(29227899);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29227899");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(readableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-30610224000000L) + "'", long42 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "29227899" + "'", str54, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hourOfDay" + "'", str58, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 24 + "'", int80 == 24);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[0]");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "1" + "'", str87, "1");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField17 = chronology15.millis();
        org.joda.time.DurationField durationField18 = chronology15.centuries();
        org.joda.time.Chronology chronology19 = chronology15.withUTC();
        org.joda.time.DurationField durationField20 = chronology19.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField24 = new org.joda.time.field.DividedDateTimeField(dateTimeField21, dateTimeFieldType22, 10);
        long long27 = dividedDateTimeField24.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval29);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        org.joda.time.DurationField durationField33 = chronology31.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField34 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType28, durationField33);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField35 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField24, dateTimeFieldType28);
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale38 = null;
        java.lang.String str39 = dividedDateTimeField24.getAsShortText(readablePartial36, 29227899, locale38);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField41 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField24, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str43 = dateTimeFieldType42.getName();
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval45);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.Partial partial49 = new org.joda.time.Partial(dateTimeFieldType42, (int) (short) 0, chronology47);
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.ReadableInterval readableInterval51 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval50);
        org.joda.time.Chronology chronology52 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval50);
        org.joda.time.DateTimeField dateTimeField53 = chronology52.yearOfCentury();
        org.joda.time.DurationField durationField54 = chronology52.millis();
        org.joda.time.DateTimeField dateTimeField55 = chronology52.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField56 = chronology52.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial57 = null;
        int[] intArray64 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int65 = dateTimeField56.getMaximumValue(readablePartial57, intArray64);
        int int66 = dividedDateTimeField24.getMinimumValue((org.joda.time.ReadablePartial) partial49, intArray64);
        boolean boolean68 = partial49.equals((java.lang.Object) "29227899");
        // The following exception was thrown during execution in test generation
        try {
            int int69 = unsupportedDateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) partial49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-30610224000000L) + "'", long27 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "29227899" + "'", str39, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hourOfDay" + "'", str43, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(readableInterval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 24 + "'", int65 == 24);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField17 = chronology15.millis();
        org.joda.time.DurationField durationField18 = chronology15.centuries();
        org.joda.time.Chronology chronology19 = chronology15.withUTC();
        org.joda.time.DurationField durationField20 = chronology19.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField24 = new org.joda.time.field.DividedDateTimeField(dateTimeField21, dateTimeFieldType22, 10);
        long long27 = dividedDateTimeField24.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval29);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        org.joda.time.DurationField durationField33 = chronology31.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField34 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType28, durationField33);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField35 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField24, dateTimeFieldType28);
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale38 = null;
        java.lang.String str39 = dividedDateTimeField24.getAsShortText(readablePartial36, 29227899, locale38);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField41 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField24, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str43 = dateTimeFieldType42.getName();
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval45);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.Partial partial49 = new org.joda.time.Partial(dateTimeFieldType42, (int) (short) 0, chronology47);
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.ReadableInterval readableInterval51 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval50);
        org.joda.time.Chronology chronology52 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval50);
        org.joda.time.DateTimeField dateTimeField53 = chronology52.yearOfCentury();
        org.joda.time.DurationField durationField54 = chronology52.millis();
        org.joda.time.DateTimeField dateTimeField55 = chronology52.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField56 = chronology52.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial57 = null;
        int[] intArray64 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int65 = dateTimeField56.getMaximumValue(readablePartial57, intArray64);
        int int66 = dividedDateTimeField24.getMinimumValue((org.joda.time.ReadablePartial) partial49, intArray64);
        java.util.Locale locale67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = unsupportedDateTimeField6.getAsShortText((org.joda.time.ReadablePartial) partial49, locale67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-30610224000000L) + "'", long27 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "29227899" + "'", str39, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hourOfDay" + "'", str43, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(readableInterval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 24 + "'", int65 == 24);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField5 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, (int) (short) 100);
        boolean boolean7 = offsetDateTimeField5.isLeap(2768887602L);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = iSOChronology8.getZone();
        org.joda.time.DurationField durationField11 = iSOChronology8.hours();
        org.joda.time.Partial partial12 = new org.joda.time.Partial();
        int[] intArray14 = iSOChronology8.get((org.joda.time.ReadablePartial) partial12, (-1L));
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial23 = null;
        int[] intArray30 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int31 = dateTimeField22.getMaximumValue(readablePartial23, intArray30);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = offsetDateTimeField5.addWrapPartial((org.joda.time.ReadablePartial) partial12, 0, intArray30, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 87 for centuryOfEra must be in the range [100,2922889]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[87, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 24 + "'", int31 == 24);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        int int13 = unsupportedDateTimeField6.getDifference((long) (byte) 10, 10L);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology16.millis();
        org.joda.time.DurationField durationField19 = chronology16.centuries();
        org.joda.time.Chronology chronology20 = chronology16.withUTC();
        org.joda.time.DurationField durationField21 = chronology20.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField25 = new org.joda.time.field.DividedDateTimeField(dateTimeField22, dateTimeFieldType23, 10);
        long long28 = dividedDateTimeField25.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval30);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.DurationField durationField34 = chronology32.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField35 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType29, durationField34);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField36 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField25, dateTimeFieldType29);
        org.joda.time.ReadablePartial readablePartial37 = null;
        java.util.Locale locale39 = null;
        java.lang.String str40 = dividedDateTimeField25.getAsShortText(readablePartial37, 29227899, locale39);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField42 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField25, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str44 = dateTimeFieldType43.getName();
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        org.joda.time.Chronology chronology48 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval46);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.Partial partial50 = new org.joda.time.Partial(dateTimeFieldType43, (int) (short) 0, chronology48);
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.ReadableInterval readableInterval52 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval51);
        org.joda.time.Chronology chronology53 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval51);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.yearOfCentury();
        org.joda.time.DurationField durationField55 = chronology53.millis();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField57 = chronology53.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial58 = null;
        int[] intArray65 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int66 = dateTimeField57.getMaximumValue(readablePartial58, intArray65);
        int int67 = dividedDateTimeField25.getMinimumValue((org.joda.time.ReadablePartial) partial50, intArray65);
        boolean boolean69 = partial50.equals((java.lang.Object) "29227899");
        java.util.Locale locale70 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = unsupportedDateTimeField6.getAsText((org.joda.time.ReadablePartial) partial50, locale70);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-30610224000000L) + "'", long28 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "29227899" + "'", str40, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hourOfDay" + "'", str44, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(readableInterval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 24 + "'", int66 == 24);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getValueAsLong((long) 28545173, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.dayOfWeek();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfMonth();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        boolean boolean8 = unsupportedDateTimeField6.isLenient();
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.centuryOfEra();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = chronology13.millis();
        org.joda.time.DurationField durationField16 = chronology13.centuries();
        org.joda.time.Chronology chronology17 = chronology13.withUTC();
        org.joda.time.DurationField durationField18 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField22 = new org.joda.time.field.DividedDateTimeField(dateTimeField19, dateTimeFieldType20, 10);
        long long25 = dividedDateTimeField22.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.ReadableInterval readableInterval28 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval27);
        org.joda.time.Chronology chronology29 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval27);
        org.joda.time.DateTimeField dateTimeField30 = chronology29.yearOfCentury();
        org.joda.time.DurationField durationField31 = chronology29.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField32 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType26, durationField31);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField33 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField22, dateTimeFieldType26);
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale36 = null;
        java.lang.String str37 = dividedDateTimeField22.getAsShortText(readablePartial34, 29227899, locale36);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField39 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField22, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str41 = dateTimeFieldType40.getName();
        org.joda.time.ReadableInterval readableInterval43 = null;
        org.joda.time.ReadableInterval readableInterval44 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval43);
        org.joda.time.Chronology chronology45 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval43);
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfCentury();
        org.joda.time.Partial partial47 = new org.joda.time.Partial(dateTimeFieldType40, (int) (short) 0, chronology45);
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology50.millis();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField54 = chronology50.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial55 = null;
        int[] intArray62 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int63 = dateTimeField54.getMaximumValue(readablePartial55, intArray62);
        int int64 = dividedDateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) partial47, intArray62);
        java.lang.String str65 = partial47.toString();
        org.joda.time.chrono.ISOChronology iSOChronology67 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField68 = iSOChronology67.minutes();
        org.joda.time.DateTimeField dateTimeField69 = iSOChronology67.millisOfDay();
        org.joda.time.DateTimeField dateTimeField70 = iSOChronology67.halfdayOfDay();
        org.joda.time.DurationField durationField71 = iSOChronology67.seconds();
        org.joda.time.DateTimeField dateTimeField72 = iSOChronology67.secondOfDay();
        org.joda.time.DateTimeField dateTimeField73 = iSOChronology67.era();
        org.joda.time.ReadableInterval readableInterval74 = null;
        org.joda.time.ReadableInterval readableInterval75 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval74);
        org.joda.time.Chronology chronology76 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval74);
        org.joda.time.DateTimeField dateTimeField77 = chronology76.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField78 = chronology76.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval79 = null;
        org.joda.time.ReadableInterval readableInterval80 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval79);
        org.joda.time.ReadableInterval readableInterval81 = null;
        boolean boolean82 = readableInterval80.contains(readableInterval81);
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.Period period84 = readableInterval80.toPeriod(periodType83);
        int[] intArray86 = chronology76.get((org.joda.time.ReadablePeriod) period84, (-210866846400000L));
        int[] intArray89 = iSOChronology67.get((org.joda.time.ReadablePeriod) period84, 0L, 2440588L);
        int[] intArray91 = dateTimeField10.add((org.joda.time.ReadablePartial) partial47, (int) (byte) 0, intArray89, 24);
        java.util.Locale locale93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str94 = unsupportedDateTimeField6.getAsShortText((org.joda.time.ReadablePartial) partial47, (-97), locale93);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-30610224000000L) + "'", long25 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(readableInterval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "29227899" + "'", str37, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hourOfDay" + "'", str41, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 24 + "'", int63 == 24);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "00" + "'", str65, "00");
        org.junit.Assert.assertNotNull(iSOChronology67);
        org.junit.Assert.assertNotNull(durationField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(readableInterval75);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(readableInterval80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[24, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[24, 0, 0, 0, 0, 40, 40, 588]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeField2.getAsShortText((long) (byte) 0, locale4);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "57600000" + "'", str5, "57600000");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis(29227899, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong(1712713998215L, (-210861660779418L));
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str11 = dateTimeFieldType10.getName();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.Partial partial17 = new org.joda.time.Partial(dateTimeFieldType10, (int) (short) 0, chronology15);
        org.joda.time.Chronology chronology18 = partial17.getChronology();
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = unsupportedDateTimeField6.getAsText((org.joda.time.ReadablePartial) partial17, (int) (short) 1, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 212574374777633L + "'", long9 == 212574374777633L);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hourOfDay" + "'", str11, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        boolean boolean15 = readableInterval13.contains(readableInterval14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = readableInterval13.toPeriod(periodType16);
        int[] intArray19 = chronology9.get((org.joda.time.ReadablePeriod) period17, (-210866846400000L));
        int[] intArray22 = iSOChronology0.get((org.joda.time.ReadablePeriod) period17, 0L, 2440588L);
        long long26 = iSOChronology0.add(3902L, 60035L, 0);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField28 = iSOChronology0.hours();
        org.joda.time.DurationField durationField29 = iSOChronology0.minutes();
        org.joda.time.Chronology chronology30 = iSOChronology0.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3902L + "'", long26 == 3902L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DurationField durationField29 = offsetDateTimeField28.getLeapDurationField();
        long long31 = offsetDateTimeField28.roundFloor(970L);
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.DurationField durationField37 = chronology34.centuries();
        org.joda.time.Chronology chronology38 = chronology34.withUTC();
        org.joda.time.DurationField durationField39 = chronology38.halfdays();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField43 = new org.joda.time.field.DividedDateTimeField(dateTimeField40, dateTimeFieldType41, 10);
        long long46 = dividedDateTimeField43.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology50.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField53 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType47, durationField52);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField54 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField43, dateTimeFieldType47);
        org.joda.time.ReadablePartial readablePartial55 = null;
        java.util.Locale locale57 = null;
        java.lang.String str58 = dividedDateTimeField43.getAsShortText(readablePartial55, 29227899, locale57);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField60 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField43, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str62 = dateTimeFieldType61.getName();
        org.joda.time.ReadableInterval readableInterval64 = null;
        org.joda.time.ReadableInterval readableInterval65 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval64);
        org.joda.time.Chronology chronology66 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval64);
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfCentury();
        org.joda.time.Partial partial68 = new org.joda.time.Partial(dateTimeFieldType61, (int) (short) 0, chronology66);
        org.joda.time.ReadableInterval readableInterval69 = null;
        org.joda.time.ReadableInterval readableInterval70 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval69);
        org.joda.time.Chronology chronology71 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval69);
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfCentury();
        org.joda.time.DurationField durationField73 = chronology71.millis();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField75 = chronology71.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial76 = null;
        int[] intArray83 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int84 = dateTimeField75.getMaximumValue(readablePartial76, intArray83);
        int int85 = dividedDateTimeField43.getMinimumValue((org.joda.time.ReadablePartial) partial68, intArray83);
        boolean boolean87 = partial68.equals((java.lang.Object) "29227899");
        boolean boolean89 = partial68.equals((java.lang.Object) 1L);
        org.joda.time.Chronology chronology90 = partial68.getChronology();
        java.util.Locale locale92 = null;
        java.lang.String str93 = offsetDateTimeField28.getAsShortText((org.joda.time.ReadablePartial) partial68, (int) (short) 1, locale92);
        org.joda.time.DateTimeField[] dateTimeFieldArray94 = partial68.getFields();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNull(durationField29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-30610224000000L) + "'", long46 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "29227899" + "'", str58, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hourOfDay" + "'", str62, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(readableInterval70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 24 + "'", int84 == 24);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(chronology90);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "1" + "'", str93, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldArray94);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        int int5 = dateTimeZone3.getStandardOffset((long) 1);
        org.joda.time.Chronology chronology6 = iSOChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        long long9 = dateTimeField7.roundCeiling((-53459996L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-14400000L) + "'", long9 == (-14400000L));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType55 = partial36.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.Partial partial13 = new org.joda.time.Partial();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unsupportedDateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) partial13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField8 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType2, durationField7);
        long long11 = durationField7.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        boolean boolean17 = durationFieldType12.isSupported(chronology15);
        org.joda.time.field.ScaledDurationField scaledDurationField19 = new org.joda.time.field.ScaledDurationField(durationField7, durationFieldType12, (int) 'a');
        int int21 = scaledDurationField19.getValue((long) (short) -1);
        long long24 = scaledDurationField19.add((long) (-1), 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str26 = dateTimeFieldType25.getName();
        boolean boolean27 = scaledDurationField19.equals((java.lang.Object) str26);
        long long30 = scaledDurationField19.getMillis(100, 166133257543130L);
        int int31 = unsupportedDurationField1.compareTo((org.joda.time.DurationField) scaledDurationField19);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = unsupportedDurationField1.add(1712713998477L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-210866846400000L) + "'", long11 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 969L + "'", long24 == 969L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hourOfDay" + "'", str26, "hourOfDay");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9700L + "'", long30 == 9700L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        int int17 = dividedDateTimeField11.getDifference(1712713996788L, 1712713998215L);
        int int18 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.DurationField durationField19 = dividedDateTimeField11.getDurationField();
        int int20 = dividedDateTimeField11.getDivisor();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.Chronology chronology23 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval21);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology23.millis();
        org.joda.time.DurationField durationField26 = chronology23.centuries();
        org.joda.time.Chronology chronology27 = chronology23.withUTC();
        org.joda.time.DurationField durationField28 = chronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField32 = new org.joda.time.field.DividedDateTimeField(dateTimeField29, dateTimeFieldType30, 10);
        long long35 = dividedDateTimeField32.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField42 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType36, durationField41);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField43 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField32, dateTimeFieldType36);
        org.joda.time.ReadablePartial readablePartial44 = null;
        java.util.Locale locale46 = null;
        java.lang.String str47 = dividedDateTimeField32.getAsShortText(readablePartial44, 29227899, locale46);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField49 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField32, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str51 = dateTimeFieldType50.getName();
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.Partial partial57 = new org.joda.time.Partial(dateTimeFieldType50, (int) (short) 0, chronology55);
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.ReadableInterval readableInterval59 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval58);
        org.joda.time.Chronology chronology60 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval58);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfCentury();
        org.joda.time.DurationField durationField62 = chronology60.millis();
        org.joda.time.DateTimeField dateTimeField63 = chronology60.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField64 = chronology60.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial65 = null;
        int[] intArray72 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int73 = dateTimeField64.getMaximumValue(readablePartial65, intArray72);
        int int74 = dividedDateTimeField32.getMinimumValue((org.joda.time.ReadablePartial) partial57, intArray72);
        boolean boolean76 = partial57.equals((java.lang.Object) "29227899");
        java.lang.Object obj77 = null;
        boolean boolean78 = partial57.equals(obj77);
        java.util.Locale locale79 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str80 = dividedDateTimeField11.getAsText((org.joda.time.ReadablePartial) partial57, locale79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(readableInterval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-30610224000000L) + "'", long35 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "29227899" + "'", str47, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hourOfDay" + "'", str51, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(readableInterval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 24 + "'", int73 == 24);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DurationField durationField29 = offsetDateTimeField28.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str31 = dateTimeFieldType30.getName();
        org.joda.time.ReadableInterval readableInterval33 = null;
        org.joda.time.ReadableInterval readableInterval34 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval33);
        org.joda.time.Chronology chronology35 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval33);
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfCentury();
        org.joda.time.Partial partial37 = new org.joda.time.Partial(dateTimeFieldType30, (int) (short) 0, chronology35);
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.ReadableInterval readableInterval39 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval38);
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval38);
        org.joda.time.DateTimeField dateTimeField41 = chronology40.yearOfCentury();
        org.joda.time.DurationField durationField42 = chronology40.millis();
        org.joda.time.DurationField durationField43 = chronology40.centuries();
        org.joda.time.Chronology chronology44 = chronology40.withUTC();
        org.joda.time.DurationField durationField45 = chronology44.halfdays();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField49 = new org.joda.time.field.DividedDateTimeField(dateTimeField46, dateTimeFieldType47, 10);
        long long52 = dividedDateTimeField49.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.ReadableInterval readableInterval55 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval54);
        org.joda.time.Chronology chronology56 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval54);
        org.joda.time.DateTimeField dateTimeField57 = chronology56.yearOfCentury();
        org.joda.time.DurationField durationField58 = chronology56.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField59 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType53, durationField58);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField60 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField49, dateTimeFieldType53);
        org.joda.time.ReadablePartial readablePartial61 = null;
        java.util.Locale locale63 = null;
        java.lang.String str64 = dividedDateTimeField49.getAsShortText(readablePartial61, 29227899, locale63);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField66 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField49, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str68 = dateTimeFieldType67.getName();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.Chronology chronology72 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval70);
        org.joda.time.DateTimeField dateTimeField73 = chronology72.yearOfCentury();
        org.joda.time.Partial partial74 = new org.joda.time.Partial(dateTimeFieldType67, (int) (short) 0, chronology72);
        org.joda.time.ReadableInterval readableInterval75 = null;
        org.joda.time.ReadableInterval readableInterval76 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval75);
        org.joda.time.Chronology chronology77 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval75);
        org.joda.time.DateTimeField dateTimeField78 = chronology77.yearOfCentury();
        org.joda.time.DurationField durationField79 = chronology77.millis();
        org.joda.time.DateTimeField dateTimeField80 = chronology77.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField81 = chronology77.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial82 = null;
        int[] intArray89 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int90 = dateTimeField81.getMaximumValue(readablePartial82, intArray89);
        int int91 = dividedDateTimeField49.getMinimumValue((org.joda.time.ReadablePartial) partial74, intArray89);
        boolean boolean93 = partial74.equals((java.lang.Object) "29227899");
        int[] intArray94 = partial74.getValues();
        int int95 = offsetDateTimeField28.getMinimumValue((org.joda.time.ReadablePartial) partial37, intArray94);
        long long97 = offsetDateTimeField28.remainder(134790807718L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hourOfDay" + "'", str31, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-30610224000000L) + "'", long52 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(readableInterval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField59);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "29227899" + "'", str64, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hourOfDay" + "'", str68, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(readableInterval76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 24 + "'", int90 == 24);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[0]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 29227899 + "'", int95 == 29227899);
        org.junit.Assert.assertTrue("'" + long97 + "' != '" + 134790807718L + "'", long97 == 134790807718L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        long long2 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        boolean boolean57 = partial36.equals((java.lang.Object) 1L);
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.ReadableInterval readableInterval59 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval58);
        org.joda.time.ReadableInterval readableInterval60 = null;
        boolean boolean61 = readableInterval59.contains(readableInterval60);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = readableInterval59.toPeriod(periodType62);
        org.joda.time.Partial partial64 = partial36.minus((org.joda.time.ReadablePeriod) period63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType66 = partial64.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(readableInterval59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(partial64);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField8 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType2, durationField7);
        long long11 = durationField7.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        boolean boolean17 = durationFieldType12.isSupported(chronology15);
        org.joda.time.field.ScaledDurationField scaledDurationField19 = new org.joda.time.field.ScaledDurationField(durationField7, durationFieldType12, (int) 'a');
        int int21 = scaledDurationField19.getValue((long) (short) -1);
        long long24 = scaledDurationField19.add((long) (-1), 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str26 = dateTimeFieldType25.getName();
        boolean boolean27 = scaledDurationField19.equals((java.lang.Object) str26);
        long long30 = scaledDurationField19.getMillis(100, 166133257543130L);
        int int31 = unsupportedDurationField1.compareTo((org.joda.time.DurationField) scaledDurationField19);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = unsupportedDurationField1.getMillis(28545173);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-210866846400000L) + "'", long11 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 969L + "'", long24 == 969L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hourOfDay" + "'", str26, "hourOfDay");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9700L + "'", long30 == 9700L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField17 = chronology15.millis();
        org.joda.time.DurationField durationField18 = chronology15.centuries();
        org.joda.time.Chronology chronology19 = chronology15.withUTC();
        org.joda.time.DurationField durationField20 = chronology19.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField24 = new org.joda.time.field.DividedDateTimeField(dateTimeField21, dateTimeFieldType22, 10);
        long long27 = dividedDateTimeField24.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval29);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        org.joda.time.DurationField durationField33 = chronology31.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField34 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType28, durationField33);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField35 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField24, dateTimeFieldType28);
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale38 = null;
        java.lang.String str39 = dividedDateTimeField24.getAsShortText(readablePartial36, 29227899, locale38);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField41 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField24, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str43 = dateTimeFieldType42.getName();
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval45);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.Partial partial49 = new org.joda.time.Partial(dateTimeFieldType42, (int) (short) 0, chronology47);
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.ReadableInterval readableInterval51 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval50);
        org.joda.time.Chronology chronology52 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval50);
        org.joda.time.DateTimeField dateTimeField53 = chronology52.yearOfCentury();
        org.joda.time.DurationField durationField54 = chronology52.millis();
        org.joda.time.DateTimeField dateTimeField55 = chronology52.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField56 = chronology52.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial57 = null;
        int[] intArray64 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int65 = dateTimeField56.getMaximumValue(readablePartial57, intArray64);
        int int66 = dividedDateTimeField24.getMinimumValue((org.joda.time.ReadablePartial) partial49, intArray64);
        boolean boolean68 = partial49.equals((java.lang.Object) "29227899");
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean70 = partial49.equals((java.lang.Object) dateTimeFieldType69);
        java.lang.Object obj71 = null;
        boolean boolean72 = partial49.equals(obj71);
        org.joda.time.chrono.ISOChronology iSOChronology74 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField75 = iSOChronology74.minutes();
        org.joda.time.DateTimeField dateTimeField76 = iSOChronology74.millisOfDay();
        org.joda.time.DateTimeField dateTimeField77 = iSOChronology74.halfdayOfDay();
        org.joda.time.DurationField durationField78 = iSOChronology74.seconds();
        org.joda.time.DateTimeField dateTimeField79 = iSOChronology74.secondOfDay();
        org.joda.time.DateTimeField dateTimeField80 = iSOChronology74.era();
        org.joda.time.ReadableInterval readableInterval81 = null;
        org.joda.time.ReadableInterval readableInterval82 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval81);
        org.joda.time.Chronology chronology83 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval81);
        org.joda.time.DateTimeField dateTimeField84 = chronology83.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField85 = chronology83.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval86 = null;
        org.joda.time.ReadableInterval readableInterval87 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval86);
        org.joda.time.ReadableInterval readableInterval88 = null;
        boolean boolean89 = readableInterval87.contains(readableInterval88);
        org.joda.time.PeriodType periodType90 = null;
        org.joda.time.Period period91 = readableInterval87.toPeriod(periodType90);
        int[] intArray93 = chronology83.get((org.joda.time.ReadablePeriod) period91, (-210866846400000L));
        int[] intArray96 = iSOChronology74.get((org.joda.time.ReadablePeriod) period91, 0L, 2440588L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray98 = unsupportedDateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) partial49, (-1), intArray96, 28545173);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-30610224000000L) + "'", long27 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "29227899" + "'", str39, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hourOfDay" + "'", str43, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(readableInterval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 24 + "'", int65 == 24);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(iSOChronology74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(durationField78);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(readableInterval82);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(readableInterval87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[0, 0, 0, 0, 0, 40, 40, 588]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.millis();
        org.joda.time.DurationField durationField7 = chronology4.centuries();
        org.joda.time.Chronology chronology8 = chronology4.withUTC();
        org.joda.time.DurationField durationField9 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField13 = new org.joda.time.field.DividedDateTimeField(dateTimeField10, dateTimeFieldType11, 10);
        long long16 = dividedDateTimeField13.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.ReadableInterval readableInterval19 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval18);
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval18);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        org.joda.time.DurationField durationField22 = chronology20.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField23 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType17, durationField22);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField24 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField13, dateTimeFieldType17);
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale27 = null;
        java.lang.String str28 = dividedDateTimeField13.getAsShortText(readablePartial25, 29227899, locale27);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField30 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField13, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str32 = dateTimeFieldType31.getName();
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.ReadableInterval readableInterval35 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval34);
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval34);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.yearOfCentury();
        org.joda.time.Partial partial38 = new org.joda.time.Partial(dateTimeFieldType31, (int) (short) 0, chronology36);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval39);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.DurationField durationField43 = chronology41.millis();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField45 = chronology41.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial46 = null;
        int[] intArray53 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int54 = dateTimeField45.getMaximumValue(readablePartial46, intArray53);
        int int55 = dividedDateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) partial38, intArray53);
        java.lang.String str56 = partial38.toString();
        org.joda.time.chrono.ISOChronology iSOChronology58 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField59 = iSOChronology58.minutes();
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology58.millisOfDay();
        org.joda.time.DateTimeField dateTimeField61 = iSOChronology58.halfdayOfDay();
        org.joda.time.DurationField durationField62 = iSOChronology58.seconds();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology58.secondOfDay();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology58.era();
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.ReadableInterval readableInterval72 = null;
        boolean boolean73 = readableInterval71.contains(readableInterval72);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = readableInterval71.toPeriod(periodType74);
        int[] intArray77 = chronology67.get((org.joda.time.ReadablePeriod) period75, (-210866846400000L));
        int[] intArray80 = iSOChronology58.get((org.joda.time.ReadablePeriod) period75, 0L, 2440588L);
        int[] intArray82 = dateTimeField1.add((org.joda.time.ReadablePartial) partial38, (int) (byte) 0, intArray80, 24);
        int int83 = partial38.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Partial partial86 = partial38.with(dateTimeFieldType84, 100);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-30610224000000L) + "'", long16 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(readableInterval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "29227899" + "'", str28, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hourOfDay" + "'", str32, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 24 + "'", int54 == 24);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "00" + "'", str56, "00");
        org.junit.Assert.assertNotNull(iSOChronology58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[24, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[24, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertNotNull(partial86);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        long long2 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue(30610253227899L, (-315619199989L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        int int14 = dividedDateTimeField11.getMaximumValue();
        int int15 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.DurationField durationField16 = dividedDateTimeField11.getDurationField();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29227899 + "'", int14 == 29227899);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong(1712713998215L, (-210861660779418L));
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = chronology13.millis();
        org.joda.time.DurationField durationField16 = chronology13.centuries();
        org.joda.time.Chronology chronology17 = chronology13.withUTC();
        org.joda.time.DurationField durationField18 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField22 = new org.joda.time.field.DividedDateTimeField(dateTimeField19, dateTimeFieldType20, 10);
        long long25 = dividedDateTimeField22.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.ReadableInterval readableInterval28 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval27);
        org.joda.time.Chronology chronology29 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval27);
        org.joda.time.DateTimeField dateTimeField30 = chronology29.yearOfCentury();
        org.joda.time.DurationField durationField31 = chronology29.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField32 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType26, durationField31);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField33 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField22, dateTimeFieldType26);
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale36 = null;
        java.lang.String str37 = dividedDateTimeField22.getAsShortText(readablePartial34, 29227899, locale36);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField39 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField22, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str41 = dateTimeFieldType40.getName();
        org.joda.time.ReadableInterval readableInterval43 = null;
        org.joda.time.ReadableInterval readableInterval44 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval43);
        org.joda.time.Chronology chronology45 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval43);
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfCentury();
        org.joda.time.Partial partial47 = new org.joda.time.Partial(dateTimeFieldType40, (int) (short) 0, chronology45);
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology50.millis();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField54 = chronology50.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial55 = null;
        int[] intArray62 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int63 = dateTimeField54.getMaximumValue(readablePartial55, intArray62);
        int int64 = dividedDateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) partial47, intArray62);
        boolean boolean66 = partial47.equals((java.lang.Object) "29227899");
        int[] intArray67 = partial47.getValues();
        java.lang.String str69 = partial47.toString("13");
        java.util.Locale locale71 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = unsupportedDateTimeField6.getAsText((org.joda.time.ReadablePartial) partial47, (-1), locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 212574374777633L + "'", long9 == 212574374777633L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-30610224000000L) + "'", long25 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(readableInterval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "29227899" + "'", str37, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hourOfDay" + "'", str41, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 24 + "'", int63 == 24);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[0]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "13" + "'", str69, "13");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        boolean boolean57 = partial36.equals((java.lang.Object) 1L);
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.ReadableInterval readableInterval59 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval58);
        org.joda.time.ReadableInterval readableInterval60 = null;
        boolean boolean61 = readableInterval59.contains(readableInterval60);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Period period63 = readableInterval59.toPeriod(periodType62);
        org.joda.time.Partial partial64 = partial36.minus((org.joda.time.ReadablePeriod) period63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField66 = partial64.getField((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(readableInterval59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(partial64);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unsupportedDurationField1.getDifference(0L, 113605027228545233L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField8 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType2, durationField7);
        long long11 = durationField7.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        boolean boolean17 = durationFieldType12.isSupported(chronology15);
        org.joda.time.field.ScaledDurationField scaledDurationField19 = new org.joda.time.field.ScaledDurationField(durationField7, durationFieldType12, (int) 'a');
        int int21 = scaledDurationField19.getValue((long) (short) -1);
        long long24 = scaledDurationField19.add((long) (-1), 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str26 = dateTimeFieldType25.getName();
        boolean boolean27 = scaledDurationField19.equals((java.lang.Object) str26);
        long long30 = scaledDurationField19.getMillis(100, 166133257543130L);
        int int31 = unsupportedDurationField1.compareTo((org.joda.time.DurationField) scaledDurationField19);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = unsupportedDurationField1.getValueAsLong((-53459996L), (-31L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-210866846400000L) + "'", long11 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 969L + "'", long24 == 969L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hourOfDay" + "'", str26, "hourOfDay");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9700L + "'", long30 == 9700L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        int int13 = unsupportedDateTimeField6.getDifference((long) (byte) 10, 10L);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology16.millis();
        org.joda.time.DurationField durationField19 = chronology16.centuries();
        org.joda.time.Chronology chronology20 = chronology16.withUTC();
        org.joda.time.DurationField durationField21 = chronology20.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField25 = new org.joda.time.field.DividedDateTimeField(dateTimeField22, dateTimeFieldType23, 10);
        long long28 = dividedDateTimeField25.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval30);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.DurationField durationField34 = chronology32.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField35 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType29, durationField34);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField36 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField25, dateTimeFieldType29);
        org.joda.time.ReadablePartial readablePartial37 = null;
        java.util.Locale locale39 = null;
        java.lang.String str40 = dividedDateTimeField25.getAsShortText(readablePartial37, 29227899, locale39);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField42 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField25, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str44 = dateTimeFieldType43.getName();
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        org.joda.time.Chronology chronology48 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval46);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.Partial partial50 = new org.joda.time.Partial(dateTimeFieldType43, (int) (short) 0, chronology48);
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.ReadableInterval readableInterval52 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval51);
        org.joda.time.Chronology chronology53 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval51);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.yearOfCentury();
        org.joda.time.DurationField durationField55 = chronology53.millis();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField57 = chronology53.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial58 = null;
        int[] intArray65 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int66 = dateTimeField57.getMaximumValue(readablePartial58, intArray65);
        int int67 = dividedDateTimeField25.getMinimumValue((org.joda.time.ReadablePartial) partial50, intArray65);
        boolean boolean69 = partial50.equals((java.lang.Object) "29227899");
        boolean boolean71 = partial50.equals((java.lang.Object) 1L);
        org.joda.time.ReadableInterval readableInterval72 = null;
        org.joda.time.ReadableInterval readableInterval73 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        boolean boolean75 = readableInterval73.contains(readableInterval74);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = readableInterval73.toPeriod(periodType76);
        org.joda.time.Partial partial78 = partial50.minus((org.joda.time.ReadablePeriod) period77);
        int[] intArray80 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray82 = unsupportedDateTimeField6.set((org.joda.time.ReadablePartial) partial78, 24, intArray80, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-30610224000000L) + "'", long28 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "29227899" + "'", str40, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hourOfDay" + "'", str44, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(readableInterval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 24 + "'", int66 == 24);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(readableInterval73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(partial78);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str2 = dateTimeFieldType1.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType3, durationField8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException13 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType10, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType10.getDurationType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException17 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType10, (java.lang.Number) 291L, "hours");
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.ReadableInterval readableInterval19 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval18);
        org.joda.time.ReadableInterval readableInterval20 = null;
        boolean boolean21 = readableInterval19.contains(readableInterval20);
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval20);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType10.getField(chronology22);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType0, dateTimeFieldType1, dateTimeFieldType3, dateTimeFieldType10 };
        int[] intArray26 = null;
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField28 = iSOChronology27.minutes();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology27.millisOfDay();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology27.halfdayOfDay();
        org.joda.time.DurationField durationField31 = iSOChronology27.seconds();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.DurationField durationField37 = chronology34.centuries();
        org.joda.time.Chronology chronology38 = chronology34.withUTC();
        org.joda.time.DurationField durationField39 = chronology38.halfdays();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField43 = new org.joda.time.field.DividedDateTimeField(dateTimeField40, dateTimeFieldType41, 10);
        long long46 = dividedDateTimeField43.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology50.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField53 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType47, durationField52);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField54 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField43, dateTimeFieldType47);
        org.joda.time.ReadablePartial readablePartial55 = null;
        java.util.Locale locale57 = null;
        java.lang.String str58 = dividedDateTimeField43.getAsShortText(readablePartial55, 29227899, locale57);
        boolean boolean59 = iSOChronology27.equals((java.lang.Object) str58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial60 = new org.joda.time.Partial(dateTimeFieldTypeArray25, intArray26, (org.joda.time.Chronology) iSOChronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dayOfMonth" + "'", str2, "dayOfMonth");
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(readableInterval19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
        org.junit.Assert.assertNotNull(iSOChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-30610224000000L) + "'", long46 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "29227899" + "'", str58, "29227899");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong(1712713998215L, (-210861660779418L));
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = chronology13.millis();
        org.joda.time.DurationField durationField16 = chronology13.centuries();
        org.joda.time.Chronology chronology17 = chronology13.withUTC();
        org.joda.time.DurationField durationField18 = chronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField22 = new org.joda.time.field.DividedDateTimeField(dateTimeField19, dateTimeFieldType20, 10);
        long long25 = dividedDateTimeField22.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.ReadableInterval readableInterval28 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval27);
        org.joda.time.Chronology chronology29 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval27);
        org.joda.time.DateTimeField dateTimeField30 = chronology29.yearOfCentury();
        org.joda.time.DurationField durationField31 = chronology29.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField32 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType26, durationField31);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField33 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField22, dateTimeFieldType26);
        org.joda.time.ReadablePartial readablePartial34 = null;
        java.util.Locale locale36 = null;
        java.lang.String str37 = dividedDateTimeField22.getAsShortText(readablePartial34, 29227899, locale36);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField39 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField22, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str41 = dateTimeFieldType40.getName();
        org.joda.time.ReadableInterval readableInterval43 = null;
        org.joda.time.ReadableInterval readableInterval44 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval43);
        org.joda.time.Chronology chronology45 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval43);
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfCentury();
        org.joda.time.Partial partial47 = new org.joda.time.Partial(dateTimeFieldType40, (int) (short) 0, chronology45);
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology50.millis();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField54 = chronology50.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial55 = null;
        int[] intArray62 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int63 = dateTimeField54.getMaximumValue(readablePartial55, intArray62);
        int int64 = dividedDateTimeField22.getMinimumValue((org.joda.time.ReadablePartial) partial47, intArray62);
        boolean boolean66 = partial47.equals((java.lang.Object) "29227899");
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean68 = partial47.equals((java.lang.Object) dateTimeFieldType67);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = unsupportedDateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) partial47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 212574374777633L + "'", long9 == 212574374777633L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-30610224000000L) + "'", long25 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(readableInterval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "29227899" + "'", str37, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hourOfDay" + "'", str41, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 24 + "'", int63 == 24);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DurationField durationField29 = offsetDateTimeField28.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str31 = dateTimeFieldType30.getName();
        org.joda.time.ReadableInterval readableInterval33 = null;
        org.joda.time.ReadableInterval readableInterval34 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval33);
        org.joda.time.Chronology chronology35 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval33);
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfCentury();
        org.joda.time.Partial partial37 = new org.joda.time.Partial(dateTimeFieldType30, (int) (short) 0, chronology35);
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.ReadableInterval readableInterval39 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval38);
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval38);
        org.joda.time.DateTimeField dateTimeField41 = chronology40.yearOfCentury();
        org.joda.time.DurationField durationField42 = chronology40.millis();
        org.joda.time.DurationField durationField43 = chronology40.centuries();
        org.joda.time.Chronology chronology44 = chronology40.withUTC();
        org.joda.time.DurationField durationField45 = chronology44.halfdays();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField49 = new org.joda.time.field.DividedDateTimeField(dateTimeField46, dateTimeFieldType47, 10);
        long long52 = dividedDateTimeField49.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.ReadableInterval readableInterval55 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval54);
        org.joda.time.Chronology chronology56 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval54);
        org.joda.time.DateTimeField dateTimeField57 = chronology56.yearOfCentury();
        org.joda.time.DurationField durationField58 = chronology56.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField59 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType53, durationField58);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField60 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField49, dateTimeFieldType53);
        org.joda.time.ReadablePartial readablePartial61 = null;
        java.util.Locale locale63 = null;
        java.lang.String str64 = dividedDateTimeField49.getAsShortText(readablePartial61, 29227899, locale63);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField66 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField49, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str68 = dateTimeFieldType67.getName();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.Chronology chronology72 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval70);
        org.joda.time.DateTimeField dateTimeField73 = chronology72.yearOfCentury();
        org.joda.time.Partial partial74 = new org.joda.time.Partial(dateTimeFieldType67, (int) (short) 0, chronology72);
        org.joda.time.ReadableInterval readableInterval75 = null;
        org.joda.time.ReadableInterval readableInterval76 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval75);
        org.joda.time.Chronology chronology77 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval75);
        org.joda.time.DateTimeField dateTimeField78 = chronology77.yearOfCentury();
        org.joda.time.DurationField durationField79 = chronology77.millis();
        org.joda.time.DateTimeField dateTimeField80 = chronology77.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField81 = chronology77.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial82 = null;
        int[] intArray89 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int90 = dateTimeField81.getMaximumValue(readablePartial82, intArray89);
        int int91 = dividedDateTimeField49.getMinimumValue((org.joda.time.ReadablePartial) partial74, intArray89);
        boolean boolean93 = partial74.equals((java.lang.Object) "29227899");
        int[] intArray94 = partial74.getValues();
        int int95 = offsetDateTimeField28.getMinimumValue((org.joda.time.ReadablePartial) partial37, intArray94);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = partial37.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hourOfDay" + "'", str31, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-30610224000000L) + "'", long52 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(readableInterval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField59);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "29227899" + "'", str64, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hourOfDay" + "'", str68, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(readableInterval76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 24 + "'", int90 == 24);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[0]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 29227899 + "'", int95 == 29227899);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        boolean boolean57 = partial36.equals((java.lang.Object) 1L);
        org.joda.time.Chronology chronology58 = partial36.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType60 = partial36.getFieldType((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(chronology58);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        boolean boolean15 = durationFieldType10.isSupported(chronology13);
        org.joda.time.field.ScaledDurationField scaledDurationField17 = new org.joda.time.field.ScaledDurationField(durationField5, durationFieldType10, (int) 'a');
        org.joda.time.DurationField durationField18 = scaledDurationField17.getWrappedField();
        long long21 = scaledDurationField17.add(2440588L, 1439);
        long long23 = scaledDurationField17.getMillis(0L);
        long long26 = scaledDurationField17.subtract((long) 1, 0);
        int int29 = scaledDurationField17.getValue(291L, 1712713999826L);
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField31 = iSOChronology30.minutes();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology30.centuryOfEra();
        org.joda.time.DurationField durationField34 = iSOChronology30.hours();
        org.joda.time.Partial partial35 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology30);
        boolean boolean36 = scaledDurationField17.equals((java.lang.Object) iSOChronology30);
        long long39 = scaledDurationField17.getDifferenceAsLong(1712714001036L, (-30578688000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2580171L + "'", long21 == 2580171L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 332901051557L + "'", long39 == 332901051557L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet1 = provider0.getAvailableIDs();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.ReadableInterval readableInterval16 = null;
        boolean boolean17 = readableInterval15.contains(readableInterval16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = readableInterval15.toPeriod(periodType18);
        int[] intArray21 = chronology11.get((org.joda.time.ReadablePeriod) period19, (-210866846400000L));
        int[] intArray24 = chronology5.get((org.joda.time.ReadablePeriod) period19, 2173795348453L, (long) 1439);
        int[] intArray26 = iSOChronology0.get((org.joda.time.ReadablePeriod) period19, 0L);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology0.weekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.Partial partial5 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int int11 = dateTimeField9.getMinimumValue(readablePartial10);
        org.joda.time.DurationField durationField12 = dateTimeField9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField17 = new org.joda.time.field.OffsetDateTimeField(dateTimeField9, dateTimeFieldType13, 24, 0, 1439);
        boolean boolean18 = partial5.isSupported(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType20 = partial5.getFieldType(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("2024-04-09T18:53:20.254-07:00/2024-04-09T18:53:20.254-07:00", (java.lang.Number) 1712713995290L, (java.lang.Number) 1712714003101L, (java.lang.Number) 134790807718L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology2.era();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.ReadableInterval readableInterval16 = null;
        boolean boolean17 = readableInterval15.contains(readableInterval16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = readableInterval15.toPeriod(periodType18);
        int[] intArray21 = chronology11.get((org.joda.time.ReadablePeriod) period19, (-210866846400000L));
        int[] intArray24 = iSOChronology2.get((org.joda.time.ReadablePeriod) period19, 0L, 2440588L);
        long long28 = iSOChronology2.add(3902L, 60035L, 0);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology2.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial31 = new org.joda.time.Partial(dateTimeFieldType0, (-97), (org.joda.time.Chronology) iSOChronology2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -97 for dayOfWeek must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3902L + "'", long28 == 3902L);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.hours();
        org.joda.time.Partial partial4 = new org.joda.time.Partial();
        int[] intArray6 = iSOChronology0.get((org.joda.time.ReadablePartial) partial4, (-1L));
        int int7 = partial4.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField9 = partial4.getField((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        org.joda.time.DurationField durationField11 = zeroIsMaxDateTimeField10.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str13 = dateTimeFieldType12.getName();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.Partial partial19 = new org.joda.time.Partial(dateTimeFieldType12, (int) (short) 0, chronology17);
        org.joda.time.Chronology chronology20 = partial19.getChronology();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        boolean boolean24 = readableInterval22.contains(readableInterval23);
        org.joda.time.Duration duration25 = readableInterval22.toDuration();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.ReadableInterval readableInterval28 = null;
        boolean boolean29 = readableInterval27.contains(readableInterval28);
        org.joda.time.Duration duration30 = readableInterval27.toDuration();
        org.joda.time.DateTime dateTime31 = readableInterval27.getEnd();
        boolean boolean32 = readableInterval22.isBefore((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime33 = partial19.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField36 = iSOChronology35.minutes();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology35.millisOfDay();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology35.halfdayOfDay();
        org.joda.time.DurationField durationField39 = iSOChronology35.seconds();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology35.era();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.ReadableInterval readableInterval48 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval47);
        org.joda.time.ReadableInterval readableInterval49 = null;
        boolean boolean50 = readableInterval48.contains(readableInterval49);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = readableInterval48.toPeriod(periodType51);
        int[] intArray54 = chronology44.get((org.joda.time.ReadablePeriod) period52, (-210866846400000L));
        int[] intArray57 = iSOChronology35.get((org.joda.time.ReadablePeriod) period52, 0L, 2440588L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray59 = zeroIsMaxDateTimeField10.addWrapField((org.joda.time.ReadablePartial) partial19, 31, intArray57, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hourOfDay" + "'", str13, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(readableInterval22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(iSOChronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(readableInterval48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 0, 0, 0, 40, 40, 588]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.hours();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        java.lang.String str5 = durationField4.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DurationField[centuries]" + "'", str5, "DurationField[centuries]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField8 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType2, durationField7);
        long long11 = durationField7.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        boolean boolean17 = durationFieldType12.isSupported(chronology15);
        org.joda.time.field.ScaledDurationField scaledDurationField19 = new org.joda.time.field.ScaledDurationField(durationField7, durationFieldType12, (int) 'a');
        int int21 = scaledDurationField19.getValue((long) (short) -1);
        long long24 = scaledDurationField19.add((long) (-1), 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str26 = dateTimeFieldType25.getName();
        boolean boolean27 = scaledDurationField19.equals((java.lang.Object) str26);
        long long30 = scaledDurationField19.getMillis(100, 166133257543130L);
        int int31 = unsupportedDurationField1.compareTo((org.joda.time.DurationField) scaledDurationField19);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = unsupportedDurationField1.getMillis((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-210866846400000L) + "'", long11 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 969L + "'", long24 == 969L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hourOfDay" + "'", str26, "hourOfDay");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9700L + "'", long30 == 9700L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        int int11 = zeroIsMaxDateTimeField10.getMinimumValue();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval12);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField16 = chronology14.millis();
        org.joda.time.DurationField durationField17 = chronology14.centuries();
        org.joda.time.Chronology chronology18 = chronology14.withUTC();
        org.joda.time.DurationField durationField19 = chronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField23 = new org.joda.time.field.DividedDateTimeField(dateTimeField20, dateTimeFieldType21, 10);
        org.joda.time.ReadablePartial readablePartial24 = null;
        int int25 = dividedDateTimeField23.getMaximumValue(readablePartial24);
        long long27 = dividedDateTimeField23.roundCeiling((long) (byte) 1);
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.ReadableInterval readableInterval29 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval28);
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval28);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfCentury();
        org.joda.time.DurationField durationField32 = chronology30.millis();
        org.joda.time.DurationField durationField33 = chronology30.centuries();
        org.joda.time.Chronology chronology34 = chronology30.withUTC();
        org.joda.time.DurationField durationField35 = chronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField39 = new org.joda.time.field.DividedDateTimeField(dateTimeField36, dateTimeFieldType37, 10);
        long long42 = dividedDateTimeField39.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval44);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DurationField durationField48 = chronology46.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField49 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType43, durationField48);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField50 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField39, dateTimeFieldType43);
        org.joda.time.ReadablePartial readablePartial51 = null;
        java.util.Locale locale53 = null;
        java.lang.String str54 = dividedDateTimeField39.getAsShortText(readablePartial51, 29227899, locale53);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField56 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField39, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str58 = dateTimeFieldType57.getName();
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.ReadableInterval readableInterval61 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval60);
        org.joda.time.Chronology chronology62 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval60);
        org.joda.time.DateTimeField dateTimeField63 = chronology62.yearOfCentury();
        org.joda.time.Partial partial64 = new org.joda.time.Partial(dateTimeFieldType57, (int) (short) 0, chronology62);
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DurationField durationField69 = chronology67.millis();
        org.joda.time.DateTimeField dateTimeField70 = chronology67.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField71 = chronology67.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial72 = null;
        int[] intArray79 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int80 = dateTimeField71.getMaximumValue(readablePartial72, intArray79);
        int int81 = dividedDateTimeField39.getMinimumValue((org.joda.time.ReadablePartial) partial64, intArray79);
        int int82 = dividedDateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) partial64);
        int[] intArray86 = new int[] { 97, ' ', 97 };
        int int87 = zeroIsMaxDateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) partial64, intArray86);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 29227899 + "'", int25 == 29227899);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 315532800000L + "'", long27 == 315532800000L);
        org.junit.Assert.assertNotNull(readableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-30610224000000L) + "'", long42 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "29227899" + "'", str54, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hourOfDay" + "'", str58, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 24 + "'", int80 == 24);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 29227899 + "'", int82 == 29227899);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[97, 32, 97]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean57 = partial36.equals((java.lang.Object) dateTimeFieldType56);
        java.lang.Object obj58 = null;
        boolean boolean59 = partial36.equals(obj58);
        java.lang.String str60 = partial36.toStringList();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[hourOfDay=0]" + "'", str60, "[hourOfDay=0]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationField durationField2 = null;
        int int3 = unsupportedDurationField1.compareTo(durationField2);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.add(166133257543130L, (long) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DurationField durationField13 = chronology10.centuries();
        org.joda.time.Chronology chronology14 = chronology10.withUTC();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField19 = new org.joda.time.field.DividedDateTimeField(dateTimeField16, dateTimeFieldType17, 10);
        long long22 = dividedDateTimeField19.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval24);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField29 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType23, durationField28);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField30 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField19, dateTimeFieldType23);
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = null;
        java.lang.String str34 = dividedDateTimeField19.getAsShortText(readablePartial31, 29227899, locale33);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField36 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField19, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str38 = dateTimeFieldType37.getName();
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.Chronology chronology42 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.Partial partial44 = new org.joda.time.Partial(dateTimeFieldType37, (int) (short) 0, chronology42);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval45);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField49 = chronology47.millis();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = chronology47.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial52 = null;
        int[] intArray59 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int60 = dateTimeField51.getMaximumValue(readablePartial52, intArray59);
        int int61 = dividedDateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) partial44, intArray59);
        boolean boolean63 = partial44.equals((java.lang.Object) "29227899");
        java.lang.Object obj64 = null;
        boolean boolean65 = partial44.equals(obj64);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = unsupportedDateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) partial44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-30610224000000L) + "'", long22 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "29227899" + "'", str34, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hourOfDay" + "'", str38, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 24 + "'", int60 == 24);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationField durationField2 = null;
        int int3 = unsupportedDurationField1.compareTo(durationField2);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getValueAsLong(94680000000L, (-3155695200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        int int55 = dividedDateTimeField11.getMinimumValue(0L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        boolean boolean8 = unsupportedDateTimeField6.isLenient();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.DurationField durationField14 = chronology11.centuries();
        org.joda.time.Chronology chronology15 = chronology11.withUTC();
        org.joda.time.DurationField durationField16 = chronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField20 = new org.joda.time.field.DividedDateTimeField(dateTimeField17, dateTimeFieldType18, 10);
        long long23 = dividedDateTimeField20.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField30 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType24, durationField29);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField31 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField20, dateTimeFieldType24);
        org.joda.time.ReadablePartial readablePartial32 = null;
        java.util.Locale locale34 = null;
        java.lang.String str35 = dividedDateTimeField20.getAsShortText(readablePartial32, 29227899, locale34);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField37 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField20, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str39 = dateTimeFieldType38.getName();
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.ReadableInterval readableInterval42 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval41);
        org.joda.time.Chronology chronology43 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval41);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.Partial partial45 = new org.joda.time.Partial(dateTimeFieldType38, (int) (short) 0, chronology43);
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        org.joda.time.Chronology chronology48 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval46);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.DurationField durationField50 = chronology48.millis();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial53 = null;
        int[] intArray60 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int61 = dateTimeField52.getMaximumValue(readablePartial53, intArray60);
        int int62 = dividedDateTimeField20.getMinimumValue((org.joda.time.ReadablePartial) partial45, intArray60);
        boolean boolean64 = partial45.equals((java.lang.Object) "29227899");
        java.lang.Object obj65 = null;
        boolean boolean66 = partial45.equals(obj65);
        java.util.Locale locale68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = unsupportedDateTimeField6.getAsText((org.joda.time.ReadablePartial) partial45, 186, locale68);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-30610224000000L) + "'", long23 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "29227899" + "'", str35, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hourOfDay" + "'", str39, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 24 + "'", int61 == 24);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        int int14 = dividedDateTimeField11.getMaximumValue();
        int int15 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.minutes();
        long long23 = durationField20.getDifferenceAsLong(1712713995290L, (long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField25 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, durationField20, dateTimeFieldType24);
        org.joda.time.DurationField durationField26 = remainderDateTimeField25.getLeapDurationField();
        java.util.Locale locale27 = null;
        int int28 = remainderDateTimeField25.getMaximumTextLength(locale27);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29227899 + "'", int14 == 29227899);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 28545233L + "'", long23 == 28545233L);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNull(durationField26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationField durationField2 = null;
        int int3 = unsupportedDurationField1.compareTo(durationField2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue((-124392110400000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        boolean boolean15 = readableInterval13.contains(readableInterval14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = readableInterval13.toPeriod(periodType16);
        int[] intArray19 = chronology9.get((org.joda.time.ReadablePeriod) period17, (-210866846400000L));
        int[] intArray22 = iSOChronology0.get((org.joda.time.ReadablePeriod) period17, 0L, 2440588L);
        long long26 = iSOChronology0.add(3902L, 60035L, 0);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField28 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology0.weekyear();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval30);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.DurationField durationField34 = chronology32.millis();
        org.joda.time.DurationField durationField35 = chronology32.centuries();
        org.joda.time.Chronology chronology36 = chronology32.withUTC();
        org.joda.time.DurationField durationField37 = chronology36.halfdays();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField41 = new org.joda.time.field.DividedDateTimeField(dateTimeField38, dateTimeFieldType39, 10);
        long long44 = dividedDateTimeField41.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        org.joda.time.Chronology chronology48 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval46);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.DurationField durationField50 = chronology48.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField51 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType45, durationField50);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField52 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField41, dateTimeFieldType45);
        org.joda.time.ReadablePartial readablePartial53 = null;
        java.util.Locale locale55 = null;
        java.lang.String str56 = dividedDateTimeField41.getAsShortText(readablePartial53, 29227899, locale55);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField58 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField41, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str60 = dateTimeFieldType59.getName();
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval62);
        org.joda.time.Chronology chronology64 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval62);
        org.joda.time.DateTimeField dateTimeField65 = chronology64.yearOfCentury();
        org.joda.time.Partial partial66 = new org.joda.time.Partial(dateTimeFieldType59, (int) (short) 0, chronology64);
        org.joda.time.ReadableInterval readableInterval67 = null;
        org.joda.time.ReadableInterval readableInterval68 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval67);
        org.joda.time.Chronology chronology69 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval67);
        org.joda.time.DateTimeField dateTimeField70 = chronology69.yearOfCentury();
        org.joda.time.DurationField durationField71 = chronology69.millis();
        org.joda.time.DateTimeField dateTimeField72 = chronology69.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField73 = chronology69.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial74 = null;
        int[] intArray81 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int82 = dateTimeField73.getMaximumValue(readablePartial74, intArray81);
        int int83 = dividedDateTimeField41.getMinimumValue((org.joda.time.ReadablePartial) partial66, intArray81);
        boolean boolean85 = partial66.equals((java.lang.Object) "29227899");
        boolean boolean87 = partial66.equals((java.lang.Object) 1L);
        int[] intArray89 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray91 = dateTimeField29.addWrapField((org.joda.time.ReadablePartial) partial66, 8, intArray89, 53460006);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3902L + "'", long26 == 3902L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-30610224000000L) + "'", long44 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField51);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "29227899" + "'", str56, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hourOfDay" + "'", str60, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(readableInterval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 24 + "'", int82 == 24);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong(1712713998215L, (-210861660779418L));
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology12.millis();
        org.joda.time.DurationField durationField15 = chronology12.centuries();
        org.joda.time.Chronology chronology16 = chronology12.withUTC();
        org.joda.time.DurationField durationField17 = chronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField21 = new org.joda.time.field.DividedDateTimeField(dateTimeField18, dateTimeFieldType19, 10);
        long long24 = dividedDateTimeField21.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField31 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType25, durationField30);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField32 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField21, dateTimeFieldType25);
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale35 = null;
        java.lang.String str36 = dividedDateTimeField21.getAsShortText(readablePartial33, 29227899, locale35);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField38 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField21, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str40 = dateTimeFieldType39.getName();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.Partial partial46 = new org.joda.time.Partial(dateTimeFieldType39, (int) (short) 0, chronology44);
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.ReadableInterval readableInterval48 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval47);
        org.joda.time.Chronology chronology49 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval47);
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfCentury();
        org.joda.time.DurationField durationField51 = chronology49.millis();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial54 = null;
        int[] intArray61 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int62 = dateTimeField53.getMaximumValue(readablePartial54, intArray61);
        int int63 = dividedDateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) partial46, intArray61);
        boolean boolean65 = partial46.equals((java.lang.Object) "29227899");
        java.util.Locale locale67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = unsupportedDateTimeField6.getAsShortText((org.joda.time.ReadablePartial) partial46, 3, locale67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 212574374777633L + "'", long9 == 212574374777633L);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-30610224000000L) + "'", long24 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "29227899" + "'", str36, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hourOfDay" + "'", str40, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(readableInterval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 24 + "'", int62 == 24);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str55 = dateTimeFieldType54.getName();
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.ReadableInterval readableInterval58 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval57);
        org.joda.time.Chronology chronology59 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval57);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.Partial partial61 = new org.joda.time.Partial(dateTimeFieldType54, (int) (short) 0, chronology59);
        org.joda.time.Chronology chronology62 = partial61.getChronology();
        org.joda.time.ReadableInterval readableInterval63 = null;
        org.joda.time.ReadableInterval readableInterval64 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval63);
        org.joda.time.ReadableInterval readableInterval65 = null;
        boolean boolean66 = readableInterval64.contains(readableInterval65);
        org.joda.time.Duration duration67 = readableInterval64.toDuration();
        org.joda.time.ReadableInterval readableInterval68 = null;
        org.joda.time.ReadableInterval readableInterval69 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval68);
        org.joda.time.ReadableInterval readableInterval70 = null;
        boolean boolean71 = readableInterval69.contains(readableInterval70);
        org.joda.time.Duration duration72 = readableInterval69.toDuration();
        org.joda.time.DateTime dateTime73 = readableInterval69.getEnd();
        boolean boolean74 = readableInterval64.isBefore((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = partial61.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime76 = partial36.toDateTime((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DurationFieldType durationFieldType77 = org.joda.time.DurationFieldType.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial79 = partial36.withFieldAdded(durationFieldType77, 202);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdays' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hourOfDay" + "'", str55, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(readableInterval64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(readableInterval69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(durationFieldType77);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add((long) (-1), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.Partial partial8 = new org.joda.time.Partial();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unsupportedDateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) partial8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        boolean boolean15 = readableInterval13.contains(readableInterval14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = readableInterval13.toPeriod(periodType16);
        int[] intArray19 = chronology9.get((org.joda.time.ReadablePeriod) period17, (-210866846400000L));
        int[] intArray22 = iSOChronology0.get((org.joda.time.ReadablePeriod) period17, 0L, 2440588L);
        long long26 = iSOChronology0.add(3902L, 60035L, 0);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField28 = iSOChronology0.hours();
        org.joda.time.DurationField durationField29 = iSOChronology0.minutes();
        org.joda.time.Chronology chronology30 = iSOChronology0.withUTC();
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField32 = iSOChronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone33 = iSOChronology31.getZone();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        int int36 = dateTimeZone34.getStandardOffset((long) 1);
        org.joda.time.Chronology chronology37 = iSOChronology31.withZone(dateTimeZone34);
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.ReadableInterval readableInterval39 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval38);
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval38);
        org.joda.time.DateTimeField dateTimeField41 = chronology40.yearOfCentury();
        org.joda.time.DurationField durationField42 = chronology40.millis();
        org.joda.time.DurationField durationField43 = chronology40.centuries();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval44);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DurationField durationField48 = chronology46.millis();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.ReadableInterval readableInterval51 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval50);
        org.joda.time.Chronology chronology52 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval50);
        org.joda.time.DateTimeField dateTimeField53 = chronology52.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField54 = chronology52.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.ReadableInterval readableInterval56 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval55);
        org.joda.time.ReadableInterval readableInterval57 = null;
        boolean boolean58 = readableInterval56.contains(readableInterval57);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = readableInterval56.toPeriod(periodType59);
        int[] intArray62 = chronology52.get((org.joda.time.ReadablePeriod) period60, (-210866846400000L));
        int[] intArray65 = chronology46.get((org.joda.time.ReadablePeriod) period60, 2173795348453L, (long) 1439);
        int[] intArray68 = chronology40.get((org.joda.time.ReadablePeriod) period60, (-210861660779418L), 1712713996806L);
        int[] intArray70 = iSOChronology31.get((org.joda.time.ReadablePeriod) period60, 1712713995290L);
        int[] intArray73 = iSOChronology0.get((org.joda.time.ReadablePeriod) period60, (-20444576083200000L), (-1L));
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str75 = dateTimeZone74.toString();
        java.lang.String str77 = dateTimeZone74.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeUtils.getZone(dateTimeZone74);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone79 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone78);
        long long81 = cachedDateTimeZone79.nextTransition(1233151473600032L);
        org.joda.time.chrono.GregorianChronology gregorianChronology83 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone79, 3);
        org.joda.time.Chronology chronology84 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone79);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3902L + "'", long26 == 3902L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(readableInterval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(readableInterval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(readableInterval56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[6736, 2, 2, 4, 14, 19, 14, 224]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 0, 0, 475753, 53, 15, 290]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[647862, 9, 3, 4, 23, 52, 57, 999]");
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "UTC" + "'", str75, "UTC");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "+00:00" + "'", str77, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone78);
        org.junit.Assert.assertNotNull(cachedDateTimeZone79);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1233151473600032L + "'", long81 == 1233151473600032L);
        org.junit.Assert.assertNotNull(gregorianChronology83);
        org.junit.Assert.assertNotNull(chronology84);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.Partial partial5 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.year();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        long long7 = cachedDateTimeZone5.nextTransition(1233151473600032L);
        org.joda.time.DateTimeZone dateTimeZone8 = cachedDateTimeZone5.getUncachedZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1233151473600032L + "'", long7 == 1233151473600032L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str55 = dateTimeFieldType54.getName();
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.ReadableInterval readableInterval58 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval57);
        org.joda.time.Chronology chronology59 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval57);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.Partial partial61 = new org.joda.time.Partial(dateTimeFieldType54, (int) (short) 0, chronology59);
        org.joda.time.Chronology chronology62 = partial61.getChronology();
        org.joda.time.ReadableInterval readableInterval63 = null;
        org.joda.time.ReadableInterval readableInterval64 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval63);
        org.joda.time.ReadableInterval readableInterval65 = null;
        boolean boolean66 = readableInterval64.contains(readableInterval65);
        org.joda.time.Duration duration67 = readableInterval64.toDuration();
        org.joda.time.ReadableInterval readableInterval68 = null;
        org.joda.time.ReadableInterval readableInterval69 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval68);
        org.joda.time.ReadableInterval readableInterval70 = null;
        boolean boolean71 = readableInterval69.contains(readableInterval70);
        org.joda.time.Duration duration72 = readableInterval69.toDuration();
        org.joda.time.DateTime dateTime73 = readableInterval69.getEnd();
        boolean boolean74 = readableInterval64.isBefore((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = partial61.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime76 = partial36.toDateTime((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray77 = partial36.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType79 = dateTimeFieldType78.getDurationType();
        boolean boolean80 = partial36.isSupported(dateTimeFieldType78);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hourOfDay" + "'", str55, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(readableInterval64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(readableInterval69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray77);
        org.junit.Assert.assertNotNull(dateTimeFieldType78);
        org.junit.Assert.assertNotNull(durationFieldType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.DurationField durationField23 = remainderDateTimeField22.iDurationField;
        boolean boolean24 = remainderDateTimeField22.isLenient();
        int int26 = remainderDateTimeField22.getLeapAmount((long) '#');
        int int28 = remainderDateTimeField22.get(1712714017806L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.Partial partial5 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int int11 = dateTimeField9.getMinimumValue(readablePartial10);
        org.joda.time.DurationField durationField12 = dateTimeField9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField17 = new org.joda.time.field.OffsetDateTimeField(dateTimeField9, dateTimeFieldType13, 24, 0, 1439);
        boolean boolean18 = partial5.isSupported(dateTimeFieldType13);
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField20 = iSOChronology19.minutes();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology19.centuryOfEra();
        org.joda.time.DurationField durationField23 = iSOChronology19.hours();
        org.joda.time.Partial partial24 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology19);
        int int25 = partial5.compareTo((org.joda.time.ReadablePartial) partial24);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iSOChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str2 = dateTimeFieldType1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial4 = partial0.withField(dateTimeFieldType1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dayOfMonth" + "'", str2, "dayOfMonth");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        long long12 = unsupportedDateTimeField6.getDifferenceAsLong((long) (-1), 970L);
        long long15 = unsupportedDateTimeField6.add((-990L), (long) 0);
        java.lang.String str16 = unsupportedDateTimeField6.toString();
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.ReadableInterval readableInterval18 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval17);
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval17);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DurationField durationField21 = chronology19.millis();
        org.joda.time.DurationField durationField22 = chronology19.centuries();
        org.joda.time.Chronology chronology23 = chronology19.withUTC();
        org.joda.time.DurationField durationField24 = chronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField28 = new org.joda.time.field.DividedDateTimeField(dateTimeField25, dateTimeFieldType26, 10);
        long long31 = dividedDateTimeField28.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval33 = null;
        org.joda.time.ReadableInterval readableInterval34 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval33);
        org.joda.time.Chronology chronology35 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval33);
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfCentury();
        org.joda.time.DurationField durationField37 = chronology35.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField38 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType32, durationField37);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField39 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField28, dateTimeFieldType32);
        org.joda.time.ReadablePartial readablePartial40 = null;
        java.util.Locale locale42 = null;
        java.lang.String str43 = dividedDateTimeField28.getAsShortText(readablePartial40, 29227899, locale42);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField45 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField28, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str47 = dateTimeFieldType46.getName();
        org.joda.time.ReadableInterval readableInterval49 = null;
        org.joda.time.ReadableInterval readableInterval50 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval49);
        org.joda.time.Chronology chronology51 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval49);
        org.joda.time.DateTimeField dateTimeField52 = chronology51.yearOfCentury();
        org.joda.time.Partial partial53 = new org.joda.time.Partial(dateTimeFieldType46, (int) (short) 0, chronology51);
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.ReadableInterval readableInterval55 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval54);
        org.joda.time.Chronology chronology56 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval54);
        org.joda.time.DateTimeField dateTimeField57 = chronology56.yearOfCentury();
        org.joda.time.DurationField durationField58 = chronology56.millis();
        org.joda.time.DateTimeField dateTimeField59 = chronology56.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField60 = chronology56.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial61 = null;
        int[] intArray68 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int69 = dateTimeField60.getMaximumValue(readablePartial61, intArray68);
        int int70 = dividedDateTimeField28.getMinimumValue((org.joda.time.ReadablePartial) partial53, intArray68);
        java.util.Locale locale71 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = unsupportedDateTimeField6.getAsText((org.joda.time.ReadablePartial) partial53, locale71);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-971L) + "'", long12 == (-971L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-990L) + "'", long15 == (-990L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnsupportedDateTimeField" + "'", str16, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(readableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-30610224000000L) + "'", long31 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(readableInterval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "29227899" + "'", str43, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hourOfDay" + "'", str47, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(readableInterval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 24 + "'", int69 == 24);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = partial7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weeks();
        org.joda.time.DurationField durationField10 = chronology8.months();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        long long2 = readableInterval1.getStartMillis();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.ReadableInterval readableInterval5 = null;
        boolean boolean6 = readableInterval4.contains(readableInterval5);
        org.joda.time.Duration duration7 = readableInterval4.toDuration();
        org.joda.time.DateTime dateTime8 = readableInterval4.getEnd();
        boolean boolean9 = readableInterval1.contains((org.joda.time.ReadableInstant) dateTime8);
        long long10 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime8);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology11.getDateTimeMillis(1439, 197, 4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 197 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1712714031427L + "'", long2 == 1712714031427L);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1712714031427L + "'", long10 == 1712714031427L);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.DurationField durationField8 = chronology5.centuries();
        org.joda.time.DurationField durationField9 = chronology5.weeks();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (long) 3);
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        long long14 = unsupportedDateTimeField6.getDifferenceAsLong(10L, 0L);
        boolean boolean15 = unsupportedDateTimeField6.isSupported();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField17 = iSOChronology16.minutes();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.halfdayOfDay();
        org.joda.time.Partial partial20 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology21 = partial20.getChronology();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) partial20, 1, locale23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.DurationField durationField30 = chronology27.centuries();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval31);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology33.millis();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.ReadableInterval readableInterval44 = null;
        boolean boolean45 = readableInterval43.contains(readableInterval44);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = readableInterval43.toPeriod(periodType46);
        int[] intArray49 = chronology39.get((org.joda.time.ReadablePeriod) period47, (-210866846400000L));
        int[] intArray52 = chronology33.get((org.joda.time.ReadablePeriod) period47, 2173795348453L, (long) 1439);
        int[] intArray55 = chronology27.get((org.joda.time.ReadablePeriod) period47, (-210861660779418L), 1712713996806L);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = unsupportedDateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) partial20, intArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PM" + "'", str24, "PM");
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[6736, 2, 2, 4, 14, 19, 14, 224]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        long long2 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unsupportedDurationField1.getValue((long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        long long12 = unsupportedDateTimeField6.getDifferenceAsLong((long) (-1), 970L);
        long long15 = unsupportedDateTimeField6.add((-990L), (long) 0);
        org.joda.time.DurationField durationField16 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField18 = iSOChronology17.minutes();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology17.halfdayOfDay();
        org.joda.time.Partial partial21 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology22 = partial21.getChronology();
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeField20.getAsShortText((org.joda.time.ReadablePartial) partial21, 1, locale24);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField28 = iSOChronology27.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology27.getZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        int int32 = dateTimeZone30.getStandardOffset((long) 1);
        org.joda.time.Chronology chronology33 = iSOChronology27.withZone(dateTimeZone30);
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.ReadableInterval readableInterval35 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval34);
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval34);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.yearOfCentury();
        org.joda.time.DurationField durationField38 = chronology36.millis();
        org.joda.time.DurationField durationField39 = chronology36.centuries();
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.Chronology chronology42 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.DurationField durationField44 = chronology42.millis();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        org.joda.time.Chronology chronology48 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval46);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.ReadableInterval readableInterval52 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval51);
        org.joda.time.ReadableInterval readableInterval53 = null;
        boolean boolean54 = readableInterval52.contains(readableInterval53);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = readableInterval52.toPeriod(periodType55);
        int[] intArray58 = chronology48.get((org.joda.time.ReadablePeriod) period56, (-210866846400000L));
        int[] intArray61 = chronology42.get((org.joda.time.ReadablePeriod) period56, 2173795348453L, (long) 1439);
        int[] intArray64 = chronology36.get((org.joda.time.ReadablePeriod) period56, (-210861660779418L), 1712713996806L);
        int[] intArray66 = iSOChronology27.get((org.joda.time.ReadablePeriod) period56, 1712713995290L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray68 = unsupportedDateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) partial21, 1440, intArray66, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-971L) + "'", long12 == (-971L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-990L) + "'", long15 == (-990L));
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PM" + "'", str25, "PM");
        org.junit.Assert.assertNotNull(iSOChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(readableInterval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(readableInterval52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[6736, 2, 2, 4, 14, 19, 14, 224]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, 0, 0, 475753, 53, 15, 290]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.Partial partial4 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology5 = partial4.getChronology();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText((org.joda.time.ReadablePartial) partial4, 1, locale7);
        org.joda.time.Chronology chronology9 = partial4.getChronology();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PM" + "'", str8, "PM");
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.Partial partial5 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField6 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        java.lang.String str54 = partial36.toString();
        int[] intArray55 = partial36.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int57 = partial36.get(dateTimeFieldType56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "00" + "'", str54, "00");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unsupportedDurationField1.getValue(3784233599999L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((-210742430400000L));
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-210742430400000L) + "'", long8 == (-210742430400000L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        int int11 = zeroIsMaxDateTimeField10.getMinimumValue();
        long long14 = zeroIsMaxDateTimeField10.set(1712713998477L, 8);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.minuteOfDay();
        int int20 = dateTimeField19.getMinimumValue();
        long long23 = dateTimeField19.add(0L, (long) (byte) 1);
        int int26 = dateTimeField19.getDifference(1712713995290L, 3600000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException30 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType27, (java.lang.Number) 60035L, "");
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField32 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, dateTimeFieldType27, (int) (short) 1);
        long long34 = offsetDateTimeField32.remainder((long) 24);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str36 = dateTimeFieldType35.getName();
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.ReadableInterval readableInterval39 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval38);
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval38);
        org.joda.time.DateTimeField dateTimeField41 = chronology40.yearOfCentury();
        org.joda.time.Partial partial42 = new org.joda.time.Partial(dateTimeFieldType35, (int) (short) 0, chronology40);
        int int43 = offsetDateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) partial42);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval45);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField49 = chronology47.millis();
        org.joda.time.DurationField durationField50 = chronology47.centuries();
        org.joda.time.Chronology chronology51 = chronology47.withUTC();
        org.joda.time.DurationField durationField52 = chronology51.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField56 = new org.joda.time.field.DividedDateTimeField(dateTimeField53, dateTimeFieldType54, 10);
        long long59 = dividedDateTimeField56.set(0L, 100);
        org.joda.time.ReadablePartial readablePartial60 = null;
        int[] intArray64 = new int[] { (byte) 1, (byte) 1, 40 };
        int int65 = dividedDateTimeField56.getMaximumValue(readablePartial60, intArray64);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray67 = zeroIsMaxDateTimeField10.addWrapField((org.joda.time.ReadablePartial) partial42, (int) 'a', intArray64, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1207792398477L + "'", long14 == 1207792398477L);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60000L + "'", long23 == 60000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 28545173 + "'", int26 == 28545173);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 24L + "'", long34 == 24L);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hourOfDay" + "'", str36, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1440 + "'", int43 == 1440);
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-30610224000000L) + "'", long59 == (-30610224000000L));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[1, 1, 40]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 29227899 + "'", int65 == 29227899);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean57 = partial36.equals((java.lang.Object) dateTimeFieldType56);
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.ReadableInterval readableInterval59 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval58);
        long long60 = readableInterval59.getStartMillis();
        org.joda.time.ReadableInterval readableInterval61 = null;
        org.joda.time.ReadableInterval readableInterval62 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval61);
        org.joda.time.ReadableInterval readableInterval63 = null;
        boolean boolean64 = readableInterval62.contains(readableInterval63);
        org.joda.time.Duration duration65 = readableInterval62.toDuration();
        org.joda.time.DateTime dateTime66 = readableInterval62.getEnd();
        boolean boolean67 = readableInterval59.contains((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.ReadableInterval readableInterval68 = null;
        org.joda.time.ReadableInterval readableInterval69 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval68);
        long long70 = readableInterval69.getStartMillis();
        org.joda.time.ReadableInterval readableInterval71 = null;
        org.joda.time.ReadableInterval readableInterval72 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval71);
        org.joda.time.ReadableInterval readableInterval73 = null;
        boolean boolean74 = readableInterval72.contains(readableInterval73);
        org.joda.time.Duration duration75 = readableInterval72.toDuration();
        org.joda.time.DateTime dateTime76 = readableInterval72.getEnd();
        boolean boolean77 = readableInterval69.contains((org.joda.time.ReadableInstant) dateTime76);
        long long78 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Chronology chronology79 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.DateTime dateTime80 = partial36.toDateTime((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray81 = partial36.getFieldTypes();
        int[] intArray82 = partial36.getValues();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(readableInterval59);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1712714032627L + "'", long60 == 1712714032627L);
        org.junit.Assert.assertNotNull(readableInterval62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(readableInterval69);
// flaky:         org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1712714032628L + "'", long70 == 1712714032628L);
        org.junit.Assert.assertNotNull(readableInterval72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1712714032628L + "'", long78 == 1712714032628L);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray81);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[0]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        int int7 = cachedDateTimeZone5.getOffset((long) 10);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.Chronology chronology11 = iSOChronology8.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.hourOfDay();
        boolean boolean13 = cachedDateTimeZone5.equals((java.lang.Object) dateTimeField12);
        org.joda.time.ReadablePartial readablePartial14 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField17 = iSOChronology16.minutes();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField20 = iSOChronology16.seconds();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology16.era();
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.ReadableInterval readableInterval24 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval23);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval23);
        org.joda.time.DateTimeField dateTimeField26 = chronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.ReadableInterval readableInterval29 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval28);
        org.joda.time.ReadableInterval readableInterval30 = null;
        boolean boolean31 = readableInterval29.contains(readableInterval30);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = readableInterval29.toPeriod(periodType32);
        int[] intArray35 = chronology25.get((org.joda.time.ReadablePeriod) period33, (-210866846400000L));
        int[] intArray38 = iSOChronology16.get((org.joda.time.ReadablePeriod) period33, 0L, 2440588L);
        long long42 = iSOChronology16.add(3902L, 60035L, 0);
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology16.secondOfMinute();
        org.joda.time.DurationField durationField44 = iSOChronology16.hours();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology16.weekyear();
        org.joda.time.Partial partial46 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology47 = partial46.getChronology();
        int[] intArray49 = iSOChronology16.get((org.joda.time.ReadablePartial) partial46, (-210742430400000L));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray51 = dateTimeField12.set(readablePartial14, (int) '#', intArray49, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(readableInterval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(readableInterval29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3902L + "'", long42 == 3902L);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        long long25 = remainderDateTimeField22.getDifferenceAsLong((long) 3, (long) 0);
        int int26 = remainderDateTimeField22.getMaximumValue();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        boolean boolean15 = durationFieldType10.isSupported(chronology13);
        org.joda.time.field.ScaledDurationField scaledDurationField17 = new org.joda.time.field.ScaledDurationField(durationField5, durationFieldType10, (int) 'a');
        org.joda.time.DurationField durationField18 = scaledDurationField17.getWrappedField();
        long long21 = scaledDurationField17.add((-210866846400000L), (long) 53460006);
        int int24 = scaledDurationField17.getValue((long) 1, 1L);
        long long26 = scaledDurationField17.getMillis(31);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-210861660779418L) + "'", long21 == (-210861660779418L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3007L + "'", long26 == 3007L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationField durationField2 = null;
        int int3 = unsupportedDurationField1.compareTo(durationField2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue((long) (byte) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        boolean boolean15 = readableInterval13.contains(readableInterval14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = readableInterval13.toPeriod(periodType16);
        int[] intArray19 = chronology9.get((org.joda.time.ReadablePeriod) period17, (-210866846400000L));
        int[] intArray22 = iSOChronology0.get((org.joda.time.ReadablePeriod) period17, 0L, 2440588L);
        long long26 = iSOChronology0.add(3902L, 60035L, 0);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField28 = iSOChronology0.hours();
        org.joda.time.DurationField durationField29 = iSOChronology0.days();
        boolean boolean30 = durationField29.isSupported();
        long long33 = durationField29.getDifferenceAsLong((long) 7, 28800001L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3902L + "'", long26 == 3902L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        int int14 = dividedDateTimeField11.getMaximumValue();
        int int15 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.minutes();
        long long23 = durationField20.getDifferenceAsLong(1712713995290L, (long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField25 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, durationField20, dateTimeFieldType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str27 = dateTimeFieldType26.getName();
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval29);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        org.joda.time.Partial partial33 = new org.joda.time.Partial(dateTimeFieldType26, (int) (short) 0, chronology31);
        boolean boolean34 = dateTimeFieldType24.isSupported(chronology31);
        org.joda.time.DurationField durationField35 = chronology31.weeks();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29227899 + "'", int14 == 29227899);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 28545233L + "'", long23 == 28545233L);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hourOfDay" + "'", str27, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(durationField35);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField5 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, (int) (short) 100);
        long long7 = offsetDateTimeField5.remainder((-62135568421900L));
        int int8 = offsetDateTimeField5.getMaximumValue();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-2177452799900L) + "'", long7 == (-2177452799900L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2922889 + "'", int8 == 2922889);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str12 = dateTimeFieldType11.getName();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.Partial partial18 = new org.joda.time.Partial(dateTimeFieldType11, (int) (short) 0, chronology16);
        org.joda.time.Chronology chronology19 = partial18.getChronology();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.ReadableInterval readableInterval22 = null;
        boolean boolean23 = readableInterval21.contains(readableInterval22);
        org.joda.time.Duration duration24 = readableInterval21.toDuration();
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.ReadableInterval readableInterval27 = null;
        boolean boolean28 = readableInterval26.contains(readableInterval27);
        org.joda.time.Duration duration29 = readableInterval26.toDuration();
        org.joda.time.DateTime dateTime30 = readableInterval26.getEnd();
        boolean boolean31 = readableInterval21.isBefore((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime32 = partial18.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = unsupportedDateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) partial18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hourOfDay" + "'", str12, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(readableInterval21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("13", (java.lang.Number) 240237L, (java.lang.Number) 10, (java.lang.Number) (-3L));
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = illegalFieldValueException4.getDateTimeFieldType();
        org.junit.Assert.assertNull(dateTimeFieldType5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.DurationField durationField23 = remainderDateTimeField22.iDurationField;
        boolean boolean24 = remainderDateTimeField22.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField26 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField22, dateTimeFieldType25);
        org.joda.time.ReadablePartial readablePartial27 = null;
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.ReadableInterval readableInterval29 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval28);
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval28);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfCentury();
        org.joda.time.DurationField durationField32 = chronology30.millis();
        org.joda.time.DurationField durationField33 = chronology30.centuries();
        org.joda.time.Chronology chronology34 = chronology30.withUTC();
        org.joda.time.DurationField durationField35 = chronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField39 = new org.joda.time.field.DividedDateTimeField(dateTimeField36, dateTimeFieldType37, 10);
        long long42 = dividedDateTimeField39.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval44);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DurationField durationField48 = chronology46.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField49 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType43, durationField48);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField50 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField39, dateTimeFieldType43);
        org.joda.time.ReadablePartial readablePartial51 = null;
        java.util.Locale locale53 = null;
        java.lang.String str54 = dividedDateTimeField39.getAsShortText(readablePartial51, 29227899, locale53);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField56 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField39, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str58 = dateTimeFieldType57.getName();
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.ReadableInterval readableInterval61 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval60);
        org.joda.time.Chronology chronology62 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval60);
        org.joda.time.DateTimeField dateTimeField63 = chronology62.yearOfCentury();
        org.joda.time.Partial partial64 = new org.joda.time.Partial(dateTimeFieldType57, (int) (short) 0, chronology62);
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DurationField durationField69 = chronology67.millis();
        org.joda.time.DateTimeField dateTimeField70 = chronology67.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField71 = chronology67.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial72 = null;
        int[] intArray79 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int80 = dateTimeField71.getMaximumValue(readablePartial72, intArray79);
        int int81 = dividedDateTimeField39.getMinimumValue((org.joda.time.ReadablePartial) partial64, intArray79);
        int int82 = remainderDateTimeField22.getMinimumValue(readablePartial27, intArray79);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(readableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-30610224000000L) + "'", long42 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "29227899" + "'", str54, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hourOfDay" + "'", str58, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 24 + "'", int80 == 24);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DurationField durationField6 = iSOChronology0.hours();
        org.joda.time.DurationField durationField7 = iSOChronology0.weeks();
        java.lang.String str8 = durationField7.getName();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "weeks" + "'", str8, "weeks");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.centuries();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField15 = new org.joda.time.field.DividedDateTimeField(dateTimeField12, dateTimeFieldType13, 10);
        long long18 = dividedDateTimeField15.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval20);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField25 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType19, durationField24);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField26 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField15, dateTimeFieldType19);
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = null;
        java.lang.String str30 = dividedDateTimeField15.getAsShortText(readablePartial27, 29227899, locale29);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField32 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField15, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str34 = dateTimeFieldType33.getName();
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.ReadableInterval readableInterval37 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval36);
        org.joda.time.Chronology chronology38 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval36);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.yearOfCentury();
        org.joda.time.Partial partial40 = new org.joda.time.Partial(dateTimeFieldType33, (int) (short) 0, chronology38);
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.ReadableInterval readableInterval42 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval41);
        org.joda.time.Chronology chronology43 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval41);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.DurationField durationField45 = chronology43.millis();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial48 = null;
        int[] intArray55 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int56 = dateTimeField47.getMaximumValue(readablePartial48, intArray55);
        int int57 = dividedDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) partial40, intArray55);
        boolean boolean59 = partial40.equals((java.lang.Object) "29227899");
        boolean boolean61 = partial40.equals((java.lang.Object) 1L);
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval62);
        org.joda.time.ReadableInterval readableInterval64 = null;
        boolean boolean65 = readableInterval63.contains(readableInterval64);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = readableInterval63.toPeriod(periodType66);
        org.joda.time.Partial partial68 = partial40.minus((org.joda.time.ReadablePeriod) period67);
        long long71 = iSOChronology0.add((org.joda.time.ReadablePeriod) period67, 1716322553270L, (-1));
        org.joda.time.DateTimeField dateTimeField72 = iSOChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-30610224000000L) + "'", long18 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(readableInterval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "29227899" + "'", str30, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hourOfDay" + "'", str34, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(readableInterval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 24 + "'", int56 == 24);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(readableInterval63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(partial68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1716322553270L + "'", long71 == 1716322553270L);
        org.junit.Assert.assertNotNull(dateTimeField72);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        int int7 = cachedDateTimeZone5.getStandardOffset(1712714000244L);
        boolean boolean8 = cachedDateTimeZone5.isFixed();
        int int10 = cachedDateTimeZone5.getStandardOffset((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        long long7 = cachedDateTimeZone5.nextTransition(1233151473600032L);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone5, 3);
        java.lang.String str10 = gregorianChronology9.toString();
        org.joda.time.DurationField durationField11 = gregorianChronology9.eras();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1233151473600032L + "'", long7 == 1233151473600032L);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GregorianChronology[UTC,mdfw=3]" + "'", str10, "GregorianChronology[UTC,mdfw=3]");
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        long long15 = dividedDateTimeField11.roundFloor(1712713998476L);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DurationField durationField21 = chronology18.centuries();
        org.joda.time.Chronology chronology22 = chronology18.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField(dateTimeField24, dateTimeFieldType25, 10);
        long long30 = dividedDateTimeField27.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField37 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType31, durationField36);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField38 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField27, dateTimeFieldType31);
        long long41 = remainderDateTimeField38.getDifferenceAsLong((long) 3, (long) 0);
        int int43 = remainderDateTimeField38.getLeapAmount(1L);
        java.util.Locale locale44 = null;
        int int45 = remainderDateTimeField38.getMaximumShortTextLength(locale44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException49 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType46, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType46.getDurationType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException53 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType46, (java.lang.Number) 291L, "hours");
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.ReadableInterval readableInterval55 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval54);
        org.joda.time.ReadableInterval readableInterval56 = null;
        boolean boolean57 = readableInterval55.contains(readableInterval56);
        org.joda.time.Chronology chronology58 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval56);
        org.joda.time.DateTimeField dateTimeField59 = chronology58.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType46.getField(chronology58);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField61 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField38, dateTimeFieldType46);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField62 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType46);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1577836800000L + "'", long15 == 1577836800000L);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-30610224000000L) + "'", long30 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(readableInterval55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.centuryOfEra();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.centuries();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField15 = new org.joda.time.field.DividedDateTimeField(dateTimeField12, dateTimeFieldType13, 10);
        long long18 = dividedDateTimeField15.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval20);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField25 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType19, durationField24);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField26 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField15, dateTimeFieldType19);
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = null;
        java.lang.String str30 = dividedDateTimeField15.getAsShortText(readablePartial27, 29227899, locale29);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField32 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField15, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str34 = dateTimeFieldType33.getName();
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.ReadableInterval readableInterval37 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval36);
        org.joda.time.Chronology chronology38 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval36);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.yearOfCentury();
        org.joda.time.Partial partial40 = new org.joda.time.Partial(dateTimeFieldType33, (int) (short) 0, chronology38);
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.ReadableInterval readableInterval42 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval41);
        org.joda.time.Chronology chronology43 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval41);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.DurationField durationField45 = chronology43.millis();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial48 = null;
        int[] intArray55 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int56 = dateTimeField47.getMaximumValue(readablePartial48, intArray55);
        int int57 = dividedDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) partial40, intArray55);
        java.lang.String str58 = partial40.toString();
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField61 = iSOChronology60.minutes();
        org.joda.time.DateTimeField dateTimeField62 = iSOChronology60.millisOfDay();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology60.halfdayOfDay();
        org.joda.time.DurationField durationField64 = iSOChronology60.seconds();
        org.joda.time.DateTimeField dateTimeField65 = iSOChronology60.secondOfDay();
        org.joda.time.DateTimeField dateTimeField66 = iSOChronology60.era();
        org.joda.time.ReadableInterval readableInterval67 = null;
        org.joda.time.ReadableInterval readableInterval68 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval67);
        org.joda.time.Chronology chronology69 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval67);
        org.joda.time.DateTimeField dateTimeField70 = chronology69.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField71 = chronology69.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval72 = null;
        org.joda.time.ReadableInterval readableInterval73 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        boolean boolean75 = readableInterval73.contains(readableInterval74);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = readableInterval73.toPeriod(periodType76);
        int[] intArray79 = chronology69.get((org.joda.time.ReadablePeriod) period77, (-210866846400000L));
        int[] intArray82 = iSOChronology60.get((org.joda.time.ReadablePeriod) period77, 0L, 2440588L);
        int[] intArray84 = dateTimeField3.add((org.joda.time.ReadablePartial) partial40, (int) (byte) 0, intArray82, 24);
        org.joda.time.ReadableInterval readableInterval85 = null;
        org.joda.time.ReadableInterval readableInterval86 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval85);
        org.joda.time.Chronology chronology87 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval85);
        org.joda.time.DateTimeField dateTimeField88 = chronology87.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField89 = chronology87.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval90 = null;
        org.joda.time.ReadableInterval readableInterval91 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval90);
        org.joda.time.ReadableInterval readableInterval92 = null;
        boolean boolean93 = readableInterval91.contains(readableInterval92);
        org.joda.time.PeriodType periodType94 = null;
        org.joda.time.Period period95 = readableInterval91.toPeriod(periodType94);
        int[] intArray97 = chronology87.get((org.joda.time.ReadablePeriod) period95, (-210866846400000L));
        iSOChronology0.validate((org.joda.time.ReadablePartial) partial40, intArray97);
        org.joda.time.DateTimeZone dateTimeZone99 = iSOChronology0.getZone();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-30610224000000L) + "'", long18 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(readableInterval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "29227899" + "'", str30, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hourOfDay" + "'", str34, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(readableInterval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 24 + "'", int56 == 24);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "00" + "'", str58, "00");
        org.junit.Assert.assertNotNull(iSOChronology60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(readableInterval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(readableInterval73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[24, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[24, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertNotNull(readableInterval86);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(dateTimeField88);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertNotNull(readableInterval91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(dateTimeZone99);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider1 = new org.joda.time.tz.ZoneInfoProvider("DateTimeField[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"DateTimeField[yearOfCentury]/ZoneInfoMap\" ClassLoader: sun.misc.Launcher$AppClassLoader@18b4aac2");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationField durationField2 = null;
        int int3 = unsupportedDurationField1.compareTo(durationField2);
        java.lang.String str4 = unsupportedDurationField1.toString();
        boolean boolean5 = unsupportedDurationField1.isPrecise();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[minutes]" + "'", str4, "UnsupportedDurationField[minutes]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        long long14 = unsupportedDateTimeField6.getDifferenceAsLong(10L, 0L);
        boolean boolean15 = unsupportedDateTimeField6.isSupported();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DurationField durationField21 = chronology18.centuries();
        org.joda.time.Chronology chronology22 = chronology18.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField(dateTimeField24, dateTimeFieldType25, 10);
        long long30 = dividedDateTimeField27.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField37 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType31, durationField36);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField38 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField27, dateTimeFieldType31);
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale41 = null;
        java.lang.String str42 = dividedDateTimeField27.getAsShortText(readablePartial39, 29227899, locale41);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField44 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField27, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str46 = dateTimeFieldType45.getName();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.Partial partial52 = new org.joda.time.Partial(dateTimeFieldType45, (int) (short) 0, chronology50);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial60 = null;
        int[] intArray67 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int68 = dateTimeField59.getMaximumValue(readablePartial60, intArray67);
        int int69 = dividedDateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) partial52, intArray67);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str71 = dateTimeFieldType70.getName();
        org.joda.time.ReadableInterval readableInterval73 = null;
        org.joda.time.ReadableInterval readableInterval74 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval73);
        org.joda.time.Chronology chronology75 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval73);
        org.joda.time.DateTimeField dateTimeField76 = chronology75.yearOfCentury();
        org.joda.time.Partial partial77 = new org.joda.time.Partial(dateTimeFieldType70, (int) (short) 0, chronology75);
        org.joda.time.Chronology chronology78 = partial77.getChronology();
        org.joda.time.ReadableInterval readableInterval79 = null;
        org.joda.time.ReadableInterval readableInterval80 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval79);
        org.joda.time.ReadableInterval readableInterval81 = null;
        boolean boolean82 = readableInterval80.contains(readableInterval81);
        org.joda.time.Duration duration83 = readableInterval80.toDuration();
        org.joda.time.ReadableInterval readableInterval84 = null;
        org.joda.time.ReadableInterval readableInterval85 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval84);
        org.joda.time.ReadableInterval readableInterval86 = null;
        boolean boolean87 = readableInterval85.contains(readableInterval86);
        org.joda.time.Duration duration88 = readableInterval85.toDuration();
        org.joda.time.DateTime dateTime89 = readableInterval85.getEnd();
        boolean boolean90 = readableInterval80.isBefore((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.DateTime dateTime91 = partial77.toDateTime((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.DateTime dateTime92 = partial52.toDateTime((org.joda.time.ReadableInstant) dateTime91);
        java.util.Locale locale93 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str94 = unsupportedDateTimeField6.getAsShortText((org.joda.time.ReadablePartial) partial52, locale93);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-30610224000000L) + "'", long30 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "29227899" + "'", str42, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hourOfDay" + "'", str46, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 24 + "'", int68 == 24);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hourOfDay" + "'", str71, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(readableInterval80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(duration83);
        org.junit.Assert.assertNotNull(readableInterval85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(duration88);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime92);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        int[] intArray56 = partial36.getValues();
        org.joda.time.chrono.ISOChronology iSOChronology57 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField58 = iSOChronology57.minutes();
        org.joda.time.DateTimeField dateTimeField59 = iSOChronology57.millisOfDay();
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.ReadableInterval readableInterval61 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval60);
        org.joda.time.Chronology chronology62 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval60);
        org.joda.time.DateTimeField dateTimeField63 = chronology62.yearOfCentury();
        org.joda.time.DurationField durationField64 = chronology62.millis();
        org.joda.time.DateTimeField dateTimeField65 = chronology62.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval66 = null;
        org.joda.time.ReadableInterval readableInterval67 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval66);
        org.joda.time.Chronology chronology68 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval66);
        org.joda.time.DateTimeField dateTimeField69 = chronology68.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField70 = chronology68.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval71 = null;
        org.joda.time.ReadableInterval readableInterval72 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval71);
        org.joda.time.ReadableInterval readableInterval73 = null;
        boolean boolean74 = readableInterval72.contains(readableInterval73);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Period period76 = readableInterval72.toPeriod(periodType75);
        int[] intArray78 = chronology68.get((org.joda.time.ReadablePeriod) period76, (-210866846400000L));
        int[] intArray81 = chronology62.get((org.joda.time.ReadablePeriod) period76, 2173795348453L, (long) 1439);
        int[] intArray83 = iSOChronology57.get((org.joda.time.ReadablePeriod) period76, 0L);
        org.joda.time.Partial partial84 = partial36.minus((org.joda.time.ReadablePeriod) period76);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0]");
        org.junit.Assert.assertNotNull(iSOChronology57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(readableInterval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(readableInterval67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(readableInterval72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(partial84);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        boolean boolean12 = zeroIsMaxDateTimeField10.isLeap((long) (byte) -1);
        long long14 = zeroIsMaxDateTimeField10.roundHalfEven(0L);
        long long17 = zeroIsMaxDateTimeField10.set(12060014400000L, 24);
        long long19 = zeroIsMaxDateTimeField10.roundCeiling((long) 'a');
        long long21 = zeroIsMaxDateTimeField10.remainder((long) 1439);
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField23 = iSOChronology22.minutes();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.halfdayOfDay();
        org.joda.time.Partial partial26 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology27 = partial26.getChronology();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) partial26, 1, locale29);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval31);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology33.millis();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.ReadableInterval readableInterval44 = null;
        boolean boolean45 = readableInterval43.contains(readableInterval44);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = readableInterval43.toPeriod(periodType46);
        int[] intArray49 = chronology39.get((org.joda.time.ReadablePeriod) period47, (-210866846400000L));
        int[] intArray52 = chronology33.get((org.joda.time.ReadablePeriod) period47, 2173795348453L, (long) 1439);
        int int53 = zeroIsMaxDateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) partial26, intArray52);
        long long55 = zeroIsMaxDateTimeField10.roundCeiling((long) 2922889);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28800000L + "'", long14 == 28800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 11176401600000L + "'", long17 == 11176401600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 28800000L + "'", long19 == 28800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 31507201439L + "'", long21 == 31507201439L);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PM" + "'", str30, "PM");
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 28800000L + "'", long55 == 28800000L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 10L, "hourOfDay");
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.millis();
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology7.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial12 = new org.joda.time.Partial(dateTimeFieldType0, 53460006, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53460006 for dayOfYear must not be larger than 366");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.DurationField durationField23 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField25 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, durationField23, dateTimeFieldType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str27 = dateTimeFieldType26.toString();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType24, dateTimeFieldType26 };
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval29);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.ReadableInterval readableInterval35 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval34);
        org.joda.time.ReadableInterval readableInterval36 = null;
        boolean boolean37 = readableInterval35.contains(readableInterval36);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = readableInterval35.toPeriod(periodType38);
        int[] intArray41 = chronology31.get((org.joda.time.ReadablePeriod) period39, (-210866846400000L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial42 = new org.joda.time.Partial(dateTimeFieldTypeArray28, intArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "dayOfMonth" + "'", str27, "dayOfMonth");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(readableInterval35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Duration duration2 = readableInterval1.toDuration();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        long long5 = readableInterval4.getStartMillis();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        long long8 = readableInterval7.getEndMillis();
        boolean boolean9 = readableInterval4.overlaps(readableInterval7);
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField11 = iSOChronology10.minutes();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology10.halfdayOfDay();
        org.joda.time.DurationField durationField14 = iSOChronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology10.era();
        boolean boolean17 = readableInterval7.equals((java.lang.Object) dateTimeField16);
        boolean boolean18 = readableInterval1.isBefore(readableInterval7);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.ReadableInterval readableInterval21 = null;
        boolean boolean22 = readableInterval20.contains(readableInterval21);
        org.joda.time.Duration duration23 = readableInterval20.toDuration();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        org.joda.time.ReadableInterval readableInterval26 = null;
        boolean boolean27 = readableInterval25.contains(readableInterval26);
        org.joda.time.Duration duration28 = readableInterval25.toDuration();
        org.joda.time.DateTime dateTime29 = readableInterval25.getEnd();
        boolean boolean30 = readableInterval20.isBefore((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean31 = readableInterval1.contains(readableInterval20);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(readableInterval4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1712714038785L + "'", long5 == 1712714038785L);
        org.junit.Assert.assertNotNull(readableInterval7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1712714038785L + "'", long8 == 1712714038785L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iSOChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DurationField durationField29 = offsetDateTimeField28.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str31 = dateTimeFieldType30.getName();
        org.joda.time.ReadableInterval readableInterval33 = null;
        org.joda.time.ReadableInterval readableInterval34 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval33);
        org.joda.time.Chronology chronology35 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval33);
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfCentury();
        org.joda.time.Partial partial37 = new org.joda.time.Partial(dateTimeFieldType30, (int) (short) 0, chronology35);
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.ReadableInterval readableInterval39 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval38);
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval38);
        org.joda.time.DateTimeField dateTimeField41 = chronology40.yearOfCentury();
        org.joda.time.DurationField durationField42 = chronology40.millis();
        org.joda.time.DurationField durationField43 = chronology40.centuries();
        org.joda.time.Chronology chronology44 = chronology40.withUTC();
        org.joda.time.DurationField durationField45 = chronology44.halfdays();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField49 = new org.joda.time.field.DividedDateTimeField(dateTimeField46, dateTimeFieldType47, 10);
        long long52 = dividedDateTimeField49.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.ReadableInterval readableInterval55 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval54);
        org.joda.time.Chronology chronology56 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval54);
        org.joda.time.DateTimeField dateTimeField57 = chronology56.yearOfCentury();
        org.joda.time.DurationField durationField58 = chronology56.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField59 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType53, durationField58);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField60 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField49, dateTimeFieldType53);
        org.joda.time.ReadablePartial readablePartial61 = null;
        java.util.Locale locale63 = null;
        java.lang.String str64 = dividedDateTimeField49.getAsShortText(readablePartial61, 29227899, locale63);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField66 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField49, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str68 = dateTimeFieldType67.getName();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.Chronology chronology72 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval70);
        org.joda.time.DateTimeField dateTimeField73 = chronology72.yearOfCentury();
        org.joda.time.Partial partial74 = new org.joda.time.Partial(dateTimeFieldType67, (int) (short) 0, chronology72);
        org.joda.time.ReadableInterval readableInterval75 = null;
        org.joda.time.ReadableInterval readableInterval76 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval75);
        org.joda.time.Chronology chronology77 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval75);
        org.joda.time.DateTimeField dateTimeField78 = chronology77.yearOfCentury();
        org.joda.time.DurationField durationField79 = chronology77.millis();
        org.joda.time.DateTimeField dateTimeField80 = chronology77.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField81 = chronology77.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial82 = null;
        int[] intArray89 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int90 = dateTimeField81.getMaximumValue(readablePartial82, intArray89);
        int int91 = dividedDateTimeField49.getMinimumValue((org.joda.time.ReadablePartial) partial74, intArray89);
        boolean boolean93 = partial74.equals((java.lang.Object) "29227899");
        int[] intArray94 = partial74.getValues();
        int int95 = offsetDateTimeField28.getMinimumValue((org.joda.time.ReadablePartial) partial37, intArray94);
        org.joda.time.DurationField durationField96 = offsetDateTimeField28.getLeapDurationField();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hourOfDay" + "'", str31, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-30610224000000L) + "'", long52 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(readableInterval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField59);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "29227899" + "'", str64, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hourOfDay" + "'", str68, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertNotNull(chronology72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(readableInterval76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 24 + "'", int90 == 24);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[0]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 29227899 + "'", int95 == 29227899);
        org.junit.Assert.assertNull(durationField96);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        long long13 = zeroIsMaxDateTimeField10.getDifferenceAsLong(1L, (long) (short) 10);
        int int15 = zeroIsMaxDateTimeField10.getMaximumValue(240237L);
        int int16 = zeroIsMaxDateTimeField10.getMinimumValue();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = unsupportedDurationField1.getValueAsLong((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        int int11 = zeroIsMaxDateTimeField10.getMinimumValue();
        long long14 = zeroIsMaxDateTimeField10.set(1712713998477L, 8);
        long long17 = zeroIsMaxDateTimeField10.add((long) 1439, 0);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1207792398477L + "'", long14 == 1207792398477L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1439L + "'", long17 == 1439L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        boolean boolean15 = durationFieldType10.isSupported(chronology13);
        org.joda.time.field.ScaledDurationField scaledDurationField17 = new org.joda.time.field.ScaledDurationField(durationField5, durationFieldType10, (int) 'a');
        org.joda.time.DurationField durationField18 = scaledDurationField17.getWrappedField();
        long long21 = scaledDurationField17.add(2440588L, 1439);
        long long23 = scaledDurationField17.getMillis(0L);
        long long26 = scaledDurationField17.subtract((long) 1, 0);
        int int29 = scaledDurationField17.getValue(291L, 1712713999826L);
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField31 = iSOChronology30.minutes();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology30.centuryOfEra();
        org.joda.time.DurationField durationField34 = iSOChronology30.hours();
        org.joda.time.Partial partial35 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology30);
        boolean boolean36 = scaledDurationField17.equals((java.lang.Object) iSOChronology30);
        long long38 = scaledDurationField17.getValueAsLong(0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2580171L + "'", long21 == 2580171L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology1 = partial0.getChronology();
        java.lang.String str2 = partial0.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = partial0.getFields();
        java.lang.String str4 = partial0.toString();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis(31, 113605027200000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.ReadableInterval readableInterval16 = null;
        boolean boolean17 = readableInterval15.contains(readableInterval16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = readableInterval15.toPeriod(periodType18);
        int[] intArray21 = chronology11.get((org.joda.time.ReadablePeriod) period19, (-210866846400000L));
        int[] intArray24 = chronology5.get((org.joda.time.ReadablePeriod) period19, 2173795348453L, (long) 1439);
        int[] intArray26 = iSOChronology0.get((org.joda.time.ReadablePeriod) period19, 0L);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationFieldType durationFieldType2 = unsupportedDurationField1.getType();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.getValueAsLong(454104489600000L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[minutes]" + "'", str3, "UnsupportedDurationField[minutes]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis(202, 315532800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        int int4 = dateTimeZone2.getStandardOffset((long) 1);
        org.joda.time.chrono.ZonedChronology zonedChronology5 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = zonedChronology5.getDateTimeMillis(11176401600000L, (int) 'a', 0, 24, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zonedChronology5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        boolean boolean12 = zeroIsMaxDateTimeField10.isLeap((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField10.add((-30610224000000L), (int) (short) 1);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology17 = partial16.getChronology();
        int int18 = zeroIsMaxDateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) partial16);
        java.util.Locale locale20 = null;
        java.lang.String str21 = partial16.toString("202", locale20);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-30578688000000L) + "'", long15 == (-30578688000000L));
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "202" + "'", str21, "202");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        int int2 = dateTimeZone0.getStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        long long5 = dateTimeZone0.getMillisKeepLocal(dateTimeZone3, 291L);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology6.weekyearOfCentury();
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField10 = iSOChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology9.era();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        boolean boolean24 = readableInterval22.contains(readableInterval23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = readableInterval22.toPeriod(periodType25);
        int[] intArray28 = chronology18.get((org.joda.time.ReadablePeriod) period26, (-210866846400000L));
        int[] intArray31 = iSOChronology9.get((org.joda.time.ReadablePeriod) period26, 0L, 2440588L);
        int[] intArray34 = gregorianChronology6.get((org.joda.time.ReadablePeriod) period26, 12060014400000L, 3902L);
        org.joda.time.DurationField durationField35 = gregorianChronology6.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology6.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField38 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.Chronology chronology42 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.DurationField durationField44 = chronology42.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField45 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType39, durationField44);
        long long48 = durationField44.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.ReadableInterval readableInterval51 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval50);
        org.joda.time.Chronology chronology52 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval50);
        org.joda.time.DateTimeField dateTimeField53 = chronology52.yearOfCentury();
        boolean boolean54 = durationFieldType49.isSupported(chronology52);
        org.joda.time.field.ScaledDurationField scaledDurationField56 = new org.joda.time.field.ScaledDurationField(durationField44, durationFieldType49, (int) 'a');
        int int58 = scaledDurationField56.getValue((long) (short) -1);
        long long61 = scaledDurationField56.add((long) (-1), 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str63 = dateTimeFieldType62.getName();
        boolean boolean64 = scaledDurationField56.equals((java.lang.Object) str63);
        long long67 = scaledDurationField56.getMillis(100, 166133257543130L);
        int int68 = unsupportedDurationField38.compareTo((org.joda.time.DurationField) scaledDurationField56);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException72 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType69, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType73 = dateTimeFieldType69.getDurationType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException76 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType69, (java.lang.Number) 291L, "hours");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.DividedDateTimeField dividedDateTimeField78 = new org.joda.time.field.DividedDateTimeField(dateTimeField36, (org.joda.time.DurationField) unsupportedDurationField38, dateTimeFieldType69, (-97));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The divisor must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28800291L + "'", long5 == 28800291L);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(readableInterval22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-382, -2, 0, -1, -11, -59, -56, -98]");
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(unsupportedDurationField38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-210866846400000L) + "'", long48 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(readableInterval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 969L + "'", long61 == 969L);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hourOfDay" + "'", str63, "hourOfDay");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 9700L + "'", long67 == 9700L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(durationFieldType73);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = partial7.getChronology();
        org.joda.time.Chronology chronology9 = partial7.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DurationField durationField6 = iSOChronology0.hours();
        org.joda.time.DurationField durationField7 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial13 = null;
        int int14 = dateTimeField12.getMinimumValue(readablePartial13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeField12.getAsShortText(0L, locale16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField19 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField12, dateTimeFieldType18);
        boolean boolean21 = zeroIsMaxDateTimeField19.isLeap((long) (byte) -1);
        long long23 = zeroIsMaxDateTimeField19.roundHalfEven(0L);
        long long26 = zeroIsMaxDateTimeField19.set(12060014400000L, 24);
        long long28 = zeroIsMaxDateTimeField19.roundCeiling((long) 'a');
        long long30 = zeroIsMaxDateTimeField19.remainder((long) 1439);
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField32 = iSOChronology31.minutes();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology31.millisOfDay();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology31.halfdayOfDay();
        org.joda.time.Partial partial35 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology36 = partial35.getChronology();
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeField34.getAsShortText((org.joda.time.ReadablePartial) partial35, 1, locale38);
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.Chronology chronology42 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.DurationField durationField44 = chronology42.millis();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        org.joda.time.Chronology chronology48 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval46);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.ReadableInterval readableInterval52 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval51);
        org.joda.time.ReadableInterval readableInterval53 = null;
        boolean boolean54 = readableInterval52.contains(readableInterval53);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = readableInterval52.toPeriod(periodType55);
        int[] intArray58 = chronology48.get((org.joda.time.ReadablePeriod) period56, (-210866846400000L));
        int[] intArray61 = chronology42.get((org.joda.time.ReadablePeriod) period56, 2173795348453L, (long) 1439);
        int int62 = zeroIsMaxDateTimeField19.getMaximumValue((org.joda.time.ReadablePartial) partial35, intArray61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval64 = null;
        org.joda.time.ReadableInterval readableInterval65 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval64);
        org.joda.time.Chronology chronology66 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval64);
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfCentury();
        org.joda.time.DurationField durationField68 = chronology66.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField69 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType63, durationField68);
        long long72 = unsupportedDateTimeField69.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = unsupportedDateTimeField69.getType();
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType73.getRangeDurationType();
        java.lang.String str75 = dateTimeFieldType73.toString();
        int int76 = partial35.indexOf(dateTimeFieldType73);
        int[] intArray77 = null;
        iSOChronology0.validate((org.joda.time.ReadablePartial) partial35, intArray77);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "69" + "'", str17, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 28800000L + "'", long23 == 28800000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11176401600000L + "'", long26 == 11176401600000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 28800000L + "'", long28 == 28800000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 31507201439L + "'", long30 == 31507201439L);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "PM" + "'", str39, "PM");
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(readableInterval52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertNotNull(readableInterval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(durationField68);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField69);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 4L + "'", long72 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "dayOfYear" + "'", str75, "dayOfYear");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationField durationField2 = null;
        int int3 = unsupportedDurationField1.compareTo(durationField2);
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationField durationField5 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long8 = durationField5.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long10 = durationField5.getValueAsLong((long) 10);
        int int12 = durationField5.getValue((long) (byte) 10);
        boolean boolean13 = durationField5.isPrecise();
        boolean boolean14 = unsupportedDurationField1.equals((java.lang.Object) boolean13);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = unsupportedDurationField1.getDifference((-166133255102542L), (-10L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[minutes]" + "'", str4, "UnsupportedDurationField[minutes]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        boolean boolean12 = zeroIsMaxDateTimeField10.isLeap((long) (byte) -1);
        long long14 = zeroIsMaxDateTimeField10.roundHalfEven(0L);
        long long17 = zeroIsMaxDateTimeField10.set(12060014400000L, 24);
        long long19 = zeroIsMaxDateTimeField10.roundCeiling((long) 'a');
        long long21 = zeroIsMaxDateTimeField10.remainder((long) 1439);
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField23 = iSOChronology22.minutes();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.halfdayOfDay();
        org.joda.time.Partial partial26 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology27 = partial26.getChronology();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) partial26, 1, locale29);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval31);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology33.millis();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.ReadableInterval readableInterval44 = null;
        boolean boolean45 = readableInterval43.contains(readableInterval44);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = readableInterval43.toPeriod(periodType46);
        int[] intArray49 = chronology39.get((org.joda.time.ReadablePeriod) period47, (-210866846400000L));
        int[] intArray52 = chronology33.get((org.joda.time.ReadablePeriod) period47, 2173795348453L, (long) 1439);
        int int53 = zeroIsMaxDateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) partial26, intArray52);
        int int55 = zeroIsMaxDateTimeField10.getLeapAmount((long) 'a');
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28800000L + "'", long14 == 28800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 11176401600000L + "'", long17 == 11176401600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 28800000L + "'", long19 == 28800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 31507201439L + "'", long21 == 31507201439L);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PM" + "'", str30, "PM");
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 100, true);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField5 = gregorianChronology4.hours();
        org.joda.time.DurationField durationField6 = gregorianChronology4.seconds();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        int int4 = dateTimeZone2.getStandardOffset((long) 1);
        org.joda.time.chrono.ZonedChronology zonedChronology5 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.Chronology chronology6 = zonedChronology5.withUTC();
        org.joda.time.DurationField durationField7 = zonedChronology5.years();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zonedChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        java.lang.Object obj56 = null;
        boolean boolean57 = partial36.equals(obj56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException61 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType58, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType62 = dateTimeFieldType58.getDurationType();
        int int63 = partial36.get(dateTimeFieldType58);
        java.lang.String str64 = partial36.toString();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "00" + "'", str64, "00");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial2 = new org.joda.time.Partial(dateTimeFieldType0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.MutableInterval mutableInterval5 = readableInterval1.toMutableInterval();
        long long6 = readableInterval1.getStartMillis();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        boolean boolean10 = readableInterval8.contains(readableInterval9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = readableInterval8.toPeriod(periodType11);
        boolean boolean13 = readableInterval1.contains(readableInterval8);
        org.joda.time.Chronology chronology14 = readableInterval1.getChronology();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology17.millis();
        org.joda.time.DurationField durationField20 = chronology17.centuries();
        org.joda.time.Chronology chronology21 = chronology17.withUTC();
        org.joda.time.DurationField durationField22 = chronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField26 = new org.joda.time.field.DividedDateTimeField(dateTimeField23, dateTimeFieldType24, 10);
        long long29 = dividedDateTimeField26.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval31);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology33.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField36 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType30, durationField35);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField37 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField26, dateTimeFieldType30);
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale40 = null;
        java.lang.String str41 = dividedDateTimeField26.getAsShortText(readablePartial38, 29227899, locale40);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField43 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField26, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str45 = dateTimeFieldType44.getName();
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.ReadableInterval readableInterval48 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval47);
        org.joda.time.Chronology chronology49 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval47);
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfCentury();
        org.joda.time.Partial partial51 = new org.joda.time.Partial(dateTimeFieldType44, (int) (short) 0, chronology49);
        org.joda.time.ReadableInterval readableInterval52 = null;
        org.joda.time.ReadableInterval readableInterval53 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval52);
        org.joda.time.Chronology chronology54 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval52);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.yearOfCentury();
        org.joda.time.DurationField durationField56 = chronology54.millis();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField58 = chronology54.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial59 = null;
        int[] intArray66 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int67 = dateTimeField58.getMaximumValue(readablePartial59, intArray66);
        int int68 = dividedDateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) partial51, intArray66);
        boolean boolean70 = partial51.equals((java.lang.Object) "29227899");
        int[] intArray71 = partial51.getValues();
        org.joda.time.ReadableInterval readableInterval72 = null;
        org.joda.time.ReadableInterval readableInterval73 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        boolean boolean75 = readableInterval73.contains(readableInterval74);
        org.joda.time.Duration duration76 = readableInterval73.toDuration();
        org.joda.time.DateTime dateTime77 = readableInterval73.getEnd();
        org.joda.time.DateTime dateTime78 = partial51.toDateTime((org.joda.time.ReadableInstant) dateTime77);
        boolean boolean79 = readableInterval1.isBefore((org.joda.time.ReadableInstant) dateTime77);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(mutableInterval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1712714043496L + "'", long6 == 1712714043496L);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-30610224000000L) + "'", long29 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "29227899" + "'", str41, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hourOfDay" + "'", str45, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(readableInterval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 24 + "'", int67 == 24);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0]");
        org.junit.Assert.assertNotNull(readableInterval73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        int int5 = dateTimeField4.getMinimumValue();
        long long8 = dateTimeField4.add(0L, (long) (byte) 1);
        int int11 = dateTimeField4.getDifference(1712713995290L, 3600000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException15 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType12, (java.lang.Number) 60035L, "");
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField17 = new org.joda.time.field.OffsetDateTimeField(dateTimeField4, dateTimeFieldType12, (int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval19);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = chronology21.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField24 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType18, durationField23);
        long long27 = durationField23.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval29);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        boolean boolean33 = durationFieldType28.isSupported(chronology31);
        org.joda.time.field.ScaledDurationField scaledDurationField35 = new org.joda.time.field.ScaledDurationField(durationField23, durationFieldType28, (int) 'a');
        int int37 = scaledDurationField35.getValue((long) (short) -1);
        long long40 = scaledDurationField35.add((long) (-1), 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField43 = new org.joda.time.field.DividedDateTimeField(dateTimeField4, (org.joda.time.DurationField) scaledDurationField35, dateTimeFieldType41, 100);
        java.lang.String str44 = dividedDateTimeField43.getName();
        java.util.Locale locale46 = null;
        java.lang.String str47 = dividedDateTimeField43.getAsShortText(0L, locale46);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60000L + "'", long8 == 60000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28545173 + "'", int11 == 28545173);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-210866846400000L) + "'", long27 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 969L + "'", long40 == 969L);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "weekOfWeekyear" + "'", str44, "weekOfWeekyear");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "9" + "'", str47, "9");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(inputStream0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        int int4 = dateTimeZone2.getStandardOffset((long) 1);
        org.joda.time.chrono.ZonedChronology zonedChronology5 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.Chronology chronology6 = zonedChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zonedChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.joda.time.DurationFieldType durationFieldType0 = null;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis((long) '4', 1712714033116L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationFieldType durationFieldType2 = unsupportedDurationField1.getType();
        java.lang.String str3 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = unsupportedDurationField1.add((-20444576083200000L), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnsupportedDurationField[minutes]" + "'", str3, "UnsupportedDurationField[minutes]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        java.lang.String str6 = dateTimeZone0.getNameKey(1712714003101L);
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField8 = iSOChronology7.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology7.getZone();
        org.joda.time.DurationField durationField10 = iSOChronology7.hours();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        int[] intArray13 = iSOChronology7.get((org.joda.time.ReadablePartial) partial11, (-1L));
        int int14 = partial11.size();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        long long17 = readableInterval16.getStartMillis();
        org.joda.time.ReadableInterval readableInterval18 = null;
        boolean boolean19 = readableInterval16.isAfter(readableInterval18);
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        long long22 = readableInterval21.getStartMillis();
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.ReadableInterval readableInterval24 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        boolean boolean26 = readableInterval24.contains(readableInterval25);
        org.joda.time.Duration duration27 = readableInterval24.toDuration();
        org.joda.time.DateTime dateTime28 = readableInterval24.getEnd();
        boolean boolean29 = readableInterval21.contains((org.joda.time.ReadableInstant) dateTime28);
        long long30 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime28);
        boolean boolean31 = readableInterval16.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime32 = partial11.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        int int33 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(readableInterval16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1712714046097L + "'", long17 == 1712714046097L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(readableInterval21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1712714046098L + "'", long22 == 1712714046098L);
        org.junit.Assert.assertNotNull(readableInterval24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1712714046098L + "'", long30 == 1712714046098L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        boolean boolean12 = zeroIsMaxDateTimeField10.isLeap((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField10.add((-30610224000000L), (int) (short) 1);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology17 = partial16.getChronology();
        int int18 = zeroIsMaxDateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) partial16);
        boolean boolean20 = zeroIsMaxDateTimeField10.isLeap((long) (byte) 100);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-30578688000000L) + "'", long15 == (-30578688000000L));
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType0.getDurationType();
        java.lang.String str6 = durationFieldType5.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        long long25 = remainderDateTimeField22.getDifferenceAsLong((long) 3, (long) 0);
        org.joda.time.ReadablePartial readablePartial26 = null;
        int int27 = remainderDateTimeField22.getMinimumValue(readablePartial26);
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.ReadableInterval readableInterval29 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval28);
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval28);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfCentury();
        org.joda.time.DurationField durationField32 = chronology30.millis();
        org.joda.time.DurationField durationField33 = chronology30.centuries();
        org.joda.time.Chronology chronology34 = chronology30.withUTC();
        org.joda.time.DurationField durationField35 = chronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField39 = new org.joda.time.field.DividedDateTimeField(dateTimeField36, dateTimeFieldType37, 10);
        long long42 = dividedDateTimeField39.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval44);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DurationField durationField48 = chronology46.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField49 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType43, durationField48);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField50 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField39, dateTimeFieldType43);
        org.joda.time.ReadablePartial readablePartial51 = null;
        java.util.Locale locale53 = null;
        java.lang.String str54 = dividedDateTimeField39.getAsShortText(readablePartial51, 29227899, locale53);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField56 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField39, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str58 = dateTimeFieldType57.getName();
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.ReadableInterval readableInterval61 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval60);
        org.joda.time.Chronology chronology62 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval60);
        org.joda.time.DateTimeField dateTimeField63 = chronology62.yearOfCentury();
        org.joda.time.Partial partial64 = new org.joda.time.Partial(dateTimeFieldType57, (int) (short) 0, chronology62);
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DurationField durationField69 = chronology67.millis();
        org.joda.time.DateTimeField dateTimeField70 = chronology67.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField71 = chronology67.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial72 = null;
        int[] intArray79 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int80 = dateTimeField71.getMaximumValue(readablePartial72, intArray79);
        int int81 = dividedDateTimeField39.getMinimumValue((org.joda.time.ReadablePartial) partial64, intArray79);
        boolean boolean83 = partial64.equals((java.lang.Object) "29227899");
        org.joda.time.DateTimeField[] dateTimeFieldArray84 = partial64.getFields();
        java.util.Locale locale86 = null;
        java.lang.String str87 = remainderDateTimeField22.getAsText((org.joda.time.ReadablePartial) partial64, 4, locale86);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(readableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-30610224000000L) + "'", long42 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "29227899" + "'", str54, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hourOfDay" + "'", str58, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 24 + "'", int80 == 24);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "4" + "'", str87, "4");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        int int14 = dividedDateTimeField11.getMaximumValue();
        int int15 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.minutes();
        long long23 = durationField20.getDifferenceAsLong(1712713995290L, (long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField25 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, durationField20, dateTimeFieldType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str27 = dateTimeFieldType26.getName();
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval29);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        org.joda.time.Partial partial33 = new org.joda.time.Partial(dateTimeFieldType26, (int) (short) 0, chronology31);
        boolean boolean34 = dateTimeFieldType24.isSupported(chronology31);
        org.joda.time.DateTimeField dateTimeField35 = chronology31.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField36 = chronology31.weekyear();
        org.joda.time.DurationField durationField37 = chronology31.halfdays();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29227899 + "'", int14 == 29227899);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 28545233L + "'", long23 == 28545233L);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hourOfDay" + "'", str27, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.MutableInterval mutableInterval5 = readableInterval1.toMutableInterval();
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) mutableInterval5);
        org.joda.time.Chronology chronology7 = mutableInterval5.getChronology();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        boolean boolean11 = readableInterval9.contains(readableInterval10);
        org.joda.time.Duration duration12 = readableInterval9.toDuration();
        org.joda.time.DateTime dateTime13 = readableInterval9.getEnd();
        boolean boolean14 = mutableInterval5.isBefore((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        boolean boolean18 = readableInterval16.contains(readableInterval17);
        org.joda.time.Duration duration19 = readableInterval16.toDuration();
        org.joda.time.MutableInterval mutableInterval20 = readableInterval16.toMutableInterval();
        long long21 = readableInterval16.getStartMillis();
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.ReadableInterval readableInterval23 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval22);
        org.joda.time.ReadableInterval readableInterval24 = null;
        boolean boolean25 = readableInterval23.contains(readableInterval24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = readableInterval23.toPeriod(periodType26);
        boolean boolean28 = readableInterval16.contains(readableInterval23);
        boolean boolean29 = mutableInterval5.isAfter(readableInterval23);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(mutableInterval20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1712714046910L + "'", long21 == 1712714046910L);
        org.junit.Assert.assertNotNull(readableInterval23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        boolean boolean12 = zeroIsMaxDateTimeField10.isLeap((long) (byte) -1);
        long long14 = zeroIsMaxDateTimeField10.roundHalfEven(0L);
        long long17 = zeroIsMaxDateTimeField10.set(12060014400000L, 24);
        long long19 = zeroIsMaxDateTimeField10.roundCeiling((long) 'a');
        long long21 = zeroIsMaxDateTimeField10.remainder((long) 1439);
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField23 = iSOChronology22.minutes();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.halfdayOfDay();
        org.joda.time.Partial partial26 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology27 = partial26.getChronology();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) partial26, 1, locale29);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval31);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology33.millis();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.ReadableInterval readableInterval44 = null;
        boolean boolean45 = readableInterval43.contains(readableInterval44);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = readableInterval43.toPeriod(periodType46);
        int[] intArray49 = chronology39.get((org.joda.time.ReadablePeriod) period47, (-210866846400000L));
        int[] intArray52 = chronology33.get((org.joda.time.ReadablePeriod) period47, 2173795348453L, (long) 1439);
        int int53 = zeroIsMaxDateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) partial26, intArray52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.ReadableInterval readableInterval56 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval55);
        org.joda.time.Chronology chronology57 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval55);
        org.joda.time.DateTimeField dateTimeField58 = chronology57.yearOfCentury();
        org.joda.time.DurationField durationField59 = chronology57.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField60 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType54, durationField59);
        long long63 = unsupportedDateTimeField60.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = unsupportedDateTimeField60.getType();
        org.joda.time.DurationFieldType durationFieldType65 = dateTimeFieldType64.getRangeDurationType();
        java.lang.String str66 = dateTimeFieldType64.toString();
        int int67 = partial26.indexOf(dateTimeFieldType64);
        org.joda.time.Chronology chronology68 = partial26.getChronology();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28800000L + "'", long14 == 28800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 11176401600000L + "'", long17 == 11176401600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 28800000L + "'", long19 == 28800000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 31507201439L + "'", long21 == 31507201439L);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PM" + "'", str30, "PM");
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(readableInterval56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 4L + "'", long63 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "dayOfYear" + "'", str66, "dayOfYear");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(chronology68);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.hours();
        org.joda.time.Partial partial4 = new org.joda.time.Partial();
        int[] intArray6 = iSOChronology0.get((org.joda.time.ReadablePartial) partial4, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology0.getDateTimeMillis((-97), (-5), (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -5 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        long long2 = unsupportedDurationField1.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue((-3L), 3902L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        int[] intArray56 = partial36.getValues();
        java.lang.String str57 = partial36.toStringList();
        // The following exception was thrown during execution in test generation
        try {
            int int59 = partial36.getValue(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[hourOfDay=0]" + "'", str57, "[hourOfDay=0]");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        boolean boolean57 = partial36.equals((java.lang.Object) 1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean59 = partial36.isSupported(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        int int4 = dateTimeZone2.getStandardOffset((long) 1);
        org.joda.time.chrono.ZonedChronology zonedChronology5 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zonedChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        int int5 = dateTimeField4.getMinimumValue();
        long long8 = dateTimeField4.add(0L, (long) (byte) 1);
        int int11 = dateTimeField4.getDifference(1712713995290L, 3600000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException15 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType12, (java.lang.Number) 60035L, "");
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField17 = new org.joda.time.field.OffsetDateTimeField(dateTimeField4, dateTimeFieldType12, (int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval19);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = chronology21.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField24 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType18, durationField23);
        long long27 = durationField23.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval29);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        boolean boolean33 = durationFieldType28.isSupported(chronology31);
        org.joda.time.field.ScaledDurationField scaledDurationField35 = new org.joda.time.field.ScaledDurationField(durationField23, durationFieldType28, (int) 'a');
        int int37 = scaledDurationField35.getValue((long) (short) -1);
        long long40 = scaledDurationField35.add((long) (-1), 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField43 = new org.joda.time.field.DividedDateTimeField(dateTimeField4, (org.joda.time.DurationField) scaledDurationField35, dateTimeFieldType41, 100);
        java.util.Locale locale44 = null;
        int int45 = dateTimeField4.getMaximumShortTextLength(locale44);
        org.joda.time.DurationField durationField46 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology50.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField53 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType47, durationField52);
        long long56 = unsupportedDateTimeField53.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = unsupportedDateTimeField53.getType();
        org.joda.time.DurationFieldType durationFieldType58 = dateTimeFieldType57.getRangeDurationType();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField60 = new org.joda.time.field.RemainderDateTimeField(dateTimeField4, durationField46, dateTimeFieldType57, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial62 = new org.joda.time.Partial(dateTimeFieldType57, 53460006);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53460006 for dayOfYear must not be larger than 366");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60000L + "'", long8 == 60000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28545173 + "'", int11 == 28545173);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-210866846400000L) + "'", long27 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 969L + "'", long40 == 969L);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 4L + "'", long56 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(durationFieldType58);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray19 = new int[] { (byte) 1, (byte) 1, 40 };
        int int20 = dividedDateTimeField11.getMaximumValue(readablePartial15, intArray19);
        org.joda.time.Partial partial21 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology22 = partial21.getChronology();
        java.lang.String str23 = partial21.toString();
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = partial21.getFields();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField26 = iSOChronology25.minutes();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology25.halfdayOfDay();
        org.joda.time.DurationField durationField29 = iSOChronology25.seconds();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology25.era();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.ReadableInterval readableInterval39 = null;
        boolean boolean40 = readableInterval38.contains(readableInterval39);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = readableInterval38.toPeriod(periodType41);
        int[] intArray44 = chronology34.get((org.joda.time.ReadablePeriod) period42, (-210866846400000L));
        int[] intArray47 = iSOChronology25.get((org.joda.time.ReadablePeriod) period42, 0L, 2440588L);
        int int48 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial21, intArray47);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1, 40]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29227899 + "'", int20 == 29227899);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(dateTimeFieldArray24);
        org.junit.Assert.assertNotNull(iSOChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[0, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.DurationField durationField30 = chronology27.centuries();
        org.joda.time.Chronology chronology31 = chronology27.withUTC();
        org.joda.time.DurationField durationField32 = chronology31.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField36 = new org.joda.time.field.DividedDateTimeField(dateTimeField33, dateTimeFieldType34, 10);
        long long39 = dividedDateTimeField36.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.ReadableInterval readableInterval42 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval41);
        org.joda.time.Chronology chronology43 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval41);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.DurationField durationField45 = chronology43.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField46 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType40, durationField45);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField47 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField36, dateTimeFieldType40);
        org.joda.time.ReadablePartial readablePartial48 = null;
        java.util.Locale locale50 = null;
        java.lang.String str51 = dividedDateTimeField36.getAsShortText(readablePartial48, 29227899, locale50);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField53 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField36, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str55 = dateTimeFieldType54.getName();
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.ReadableInterval readableInterval58 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval57);
        org.joda.time.Chronology chronology59 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval57);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.Partial partial61 = new org.joda.time.Partial(dateTimeFieldType54, (int) (short) 0, chronology59);
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval62);
        org.joda.time.Chronology chronology64 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval62);
        org.joda.time.DateTimeField dateTimeField65 = chronology64.yearOfCentury();
        org.joda.time.DurationField durationField66 = chronology64.millis();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField68 = chronology64.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial69 = null;
        int[] intArray76 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int77 = dateTimeField68.getMaximumValue(readablePartial69, intArray76);
        int int78 = dividedDateTimeField36.getMinimumValue((org.joda.time.ReadablePartial) partial61, intArray76);
        boolean boolean80 = partial61.equals((java.lang.Object) "29227899");
        int[] intArray81 = partial61.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray83 = remainderDateTimeField22.addWrapField(readablePartial23, (int) (short) 1, intArray81, 186);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-30610224000000L) + "'", long39 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(readableInterval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "29227899" + "'", str51, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hourOfDay" + "'", str55, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(readableInterval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 24 + "'", int77 == 24);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        boolean boolean15 = readableInterval13.contains(readableInterval14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = readableInterval13.toPeriod(periodType16);
        int[] intArray19 = chronology9.get((org.joda.time.ReadablePeriod) period17, (-210866846400000L));
        int[] intArray22 = iSOChronology0.get((org.joda.time.ReadablePeriod) period17, 0L, 2440588L);
        long long26 = iSOChronology0.add(3902L, 60035L, 0);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField28 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology0.weekyear();
        org.joda.time.Partial partial30 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology31 = partial30.getChronology();
        int[] intArray33 = iSOChronology0.get((org.joda.time.ReadablePartial) partial30, (-210742430400000L));
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology0.minuteOfHour();
        java.util.Locale locale36 = null;
        int int37 = dateTimeField35.getMaximumTextLength(locale36);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3902L + "'", long26 == 3902L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str55 = dateTimeFieldType54.getName();
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.ReadableInterval readableInterval58 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval57);
        org.joda.time.Chronology chronology59 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval57);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.Partial partial61 = new org.joda.time.Partial(dateTimeFieldType54, (int) (short) 0, chronology59);
        org.joda.time.Chronology chronology62 = partial61.getChronology();
        org.joda.time.ReadableInterval readableInterval63 = null;
        org.joda.time.ReadableInterval readableInterval64 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval63);
        org.joda.time.ReadableInterval readableInterval65 = null;
        boolean boolean66 = readableInterval64.contains(readableInterval65);
        org.joda.time.Duration duration67 = readableInterval64.toDuration();
        org.joda.time.ReadableInterval readableInterval68 = null;
        org.joda.time.ReadableInterval readableInterval69 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval68);
        org.joda.time.ReadableInterval readableInterval70 = null;
        boolean boolean71 = readableInterval69.contains(readableInterval70);
        org.joda.time.Duration duration72 = readableInterval69.toDuration();
        org.joda.time.DateTime dateTime73 = readableInterval69.getEnd();
        boolean boolean74 = readableInterval64.isBefore((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = partial61.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime76 = partial36.toDateTime((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray77 = partial36.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray78 = partial36.getFieldTypes();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hourOfDay" + "'", str55, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(readableInterval64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(duration67);
        org.junit.Assert.assertNotNull(readableInterval69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray77);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray78);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.DurationField durationField23 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField25 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, durationField23, dateTimeFieldType24);
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.DurationField durationField31 = chronology28.centuries();
        org.joda.time.Chronology chronology32 = chronology28.withUTC();
        org.joda.time.DurationField durationField33 = chronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField37 = new org.joda.time.field.DividedDateTimeField(dateTimeField34, dateTimeFieldType35, 10);
        long long40 = dividedDateTimeField37.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.DurationField durationField46 = chronology44.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField47 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType41, durationField46);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField48 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField37, dateTimeFieldType41);
        org.joda.time.ReadablePartial readablePartial49 = null;
        java.util.Locale locale51 = null;
        java.lang.String str52 = dividedDateTimeField37.getAsShortText(readablePartial49, 29227899, locale51);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField54 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField37, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str56 = dateTimeFieldType55.getName();
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.ReadableInterval readableInterval59 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval58);
        org.joda.time.Chronology chronology60 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval58);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfCentury();
        org.joda.time.Partial partial62 = new org.joda.time.Partial(dateTimeFieldType55, (int) (short) 0, chronology60);
        org.joda.time.ReadableInterval readableInterval63 = null;
        org.joda.time.ReadableInterval readableInterval64 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval63);
        org.joda.time.Chronology chronology65 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval63);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.yearOfCentury();
        org.joda.time.DurationField durationField67 = chronology65.millis();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial70 = null;
        int[] intArray77 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int78 = dateTimeField69.getMaximumValue(readablePartial70, intArray77);
        int int79 = dividedDateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) partial62, intArray77);
        java.lang.String str80 = partial62.toString();
        int int81 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial62);
        int int83 = dividedDateTimeField11.getLeapAmount((-1830383999709L));
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-30610224000000L) + "'", long40 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "29227899" + "'", str52, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hourOfDay" + "'", str56, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(readableInterval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 24 + "'", int78 == 24);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "00" + "'", str80, "00");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        boolean boolean15 = durationFieldType10.isSupported(chronology13);
        org.joda.time.field.ScaledDurationField scaledDurationField17 = new org.joda.time.field.ScaledDurationField(durationField5, durationFieldType10, (int) 'a');
        int int19 = scaledDurationField17.getValue((long) (short) -1);
        long long22 = scaledDurationField17.getMillis((long) 100, 0L);
        long long23 = scaledDurationField17.getUnitMillis();
        long long25 = scaledDurationField17.getMillis(2440588L);
        long long28 = scaledDurationField17.getMillis((-28545223L), (-124392110400000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9700L + "'", long22 == 9700L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 236737036L + "'", long25 == 236737036L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-2768886631L) + "'", long28 == (-2768886631L));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField5 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, (int) (short) 100);
        long long7 = offsetDateTimeField5.remainder((-62135568421900L));
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DurationField durationField13 = chronology10.centuries();
        org.joda.time.Chronology chronology14 = chronology10.withUTC();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField19 = new org.joda.time.field.DividedDateTimeField(dateTimeField16, dateTimeFieldType17, 10);
        long long22 = dividedDateTimeField19.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval24);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField29 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType23, durationField28);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField30 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField19, dateTimeFieldType23);
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = null;
        java.lang.String str34 = dividedDateTimeField19.getAsShortText(readablePartial31, 29227899, locale33);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField36 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField19, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str38 = dateTimeFieldType37.getName();
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.Chronology chronology42 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.Partial partial44 = new org.joda.time.Partial(dateTimeFieldType37, (int) (short) 0, chronology42);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval45);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField49 = chronology47.millis();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = chronology47.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial52 = null;
        int[] intArray59 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int60 = dateTimeField51.getMaximumValue(readablePartial52, intArray59);
        int int61 = dividedDateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) partial44, intArray59);
        boolean boolean63 = partial44.equals((java.lang.Object) "29227899");
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean65 = partial44.equals((java.lang.Object) dateTimeFieldType64);
        java.lang.Object obj66 = null;
        boolean boolean67 = partial44.equals(obj66);
        org.joda.time.ReadableInterval readableInterval68 = null;
        org.joda.time.ReadableInterval readableInterval69 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval68);
        org.joda.time.Chronology chronology70 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval68);
        org.joda.time.DateTimeField dateTimeField71 = chronology70.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial72 = null;
        int int73 = dateTimeField71.getMinimumValue(readablePartial72);
        org.joda.time.ReadablePartial readablePartial74 = null;
        org.joda.time.ReadableInterval readableInterval75 = null;
        org.joda.time.ReadableInterval readableInterval76 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval75);
        org.joda.time.Chronology chronology77 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval75);
        org.joda.time.DateTimeField dateTimeField78 = chronology77.yearOfCentury();
        org.joda.time.DurationField durationField79 = chronology77.millis();
        org.joda.time.DateTimeField dateTimeField80 = chronology77.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField81 = chronology77.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial82 = null;
        int[] intArray89 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int90 = dateTimeField81.getMaximumValue(readablePartial82, intArray89);
        int int91 = dateTimeField71.getMinimumValue(readablePartial74, intArray89);
        int int92 = offsetDateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) partial44, intArray89);
        long long95 = offsetDateTimeField5.add(1712713998215L, 9);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-2177452799900L) + "'", long7 == (-2177452799900L));
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-30610224000000L) + "'", long22 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "29227899" + "'", str34, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hourOfDay" + "'", str38, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 24 + "'", int60 == 24);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(readableInterval69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(readableInterval76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(dateTimeField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 24 + "'", int90 == 24);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 100 + "'", int92 == 100);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 30113949198215L + "'", long95 == 30113949198215L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        long long13 = zeroIsMaxDateTimeField10.getDifferenceAsLong(1L, (long) (short) 10);
        int int15 = zeroIsMaxDateTimeField10.getMaximumValue(240237L);
        long long17 = zeroIsMaxDateTimeField10.remainder((long) 97);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 31507200097L + "'", long17 == 31507200097L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap0 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
        org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(strMap0);
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationField durationField2 = null;
        int int3 = unsupportedDurationField1.compareTo(durationField2);
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.joda.time.DurationField durationField5 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long8 = durationField5.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long10 = durationField5.getValueAsLong((long) 10);
        int int12 = durationField5.getValue((long) (byte) 10);
        boolean boolean13 = durationField5.isPrecise();
        boolean boolean14 = unsupportedDurationField1.equals((java.lang.Object) boolean13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str16 = dateTimeFieldType15.getName();
        boolean boolean17 = unsupportedDurationField1.equals((java.lang.Object) str16);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[minutes]" + "'", str4, "UnsupportedDurationField[minutes]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "dayOfMonth" + "'", str16, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset((long) 100, true);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone5 = gregorianChronology4.getZone();
        org.joda.time.Chronology chronology6 = gregorianChronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology4.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gregorianChronology4.getDateTimeMillis(35L, 2, (int) ' ', 186, 97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 186 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        int int4 = dateTimeZone2.getStandardOffset((long) 1);
        org.joda.time.chrono.ZonedChronology zonedChronology5 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.Chronology chronology6 = zonedChronology5.withUTC();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        int int12 = dateTimeField11.getMinimumValue();
        long long15 = dateTimeField11.add(0L, (long) (byte) 1);
        int int18 = dateTimeField11.getDifference(1712713995290L, 3600000L);
        boolean boolean19 = zonedChronology5.equals((java.lang.Object) 3600000L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zonedChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60000L + "'", long15 == 60000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28545173 + "'", int18 == 28545173);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.millis();
        org.joda.time.DurationField durationField7 = chronology4.centuries();
        org.joda.time.Chronology chronology8 = chronology4.withUTC();
        org.joda.time.DurationField durationField9 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField13 = new org.joda.time.field.DividedDateTimeField(dateTimeField10, dateTimeFieldType11, 10);
        long long16 = dividedDateTimeField13.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.ReadableInterval readableInterval19 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval18);
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval18);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        org.joda.time.DurationField durationField22 = chronology20.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField23 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType17, durationField22);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField24 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField13, dateTimeFieldType17);
        org.joda.time.ReadablePartial readablePartial25 = null;
        java.util.Locale locale27 = null;
        java.lang.String str28 = dividedDateTimeField13.getAsShortText(readablePartial25, 29227899, locale27);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField30 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField13, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str32 = dateTimeFieldType31.getName();
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.ReadableInterval readableInterval35 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval34);
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval34);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.yearOfCentury();
        org.joda.time.Partial partial38 = new org.joda.time.Partial(dateTimeFieldType31, (int) (short) 0, chronology36);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval39);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.DurationField durationField43 = chronology41.millis();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField45 = chronology41.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial46 = null;
        int[] intArray53 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int54 = dateTimeField45.getMaximumValue(readablePartial46, intArray53);
        int int55 = dividedDateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) partial38, intArray53);
        java.lang.String str56 = partial38.toString();
        org.joda.time.chrono.ISOChronology iSOChronology58 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField59 = iSOChronology58.minutes();
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology58.millisOfDay();
        org.joda.time.DateTimeField dateTimeField61 = iSOChronology58.halfdayOfDay();
        org.joda.time.DurationField durationField62 = iSOChronology58.seconds();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology58.secondOfDay();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology58.era();
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.ReadableInterval readableInterval72 = null;
        boolean boolean73 = readableInterval71.contains(readableInterval72);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = readableInterval71.toPeriod(periodType74);
        int[] intArray77 = chronology67.get((org.joda.time.ReadablePeriod) period75, (-210866846400000L));
        int[] intArray80 = iSOChronology58.get((org.joda.time.ReadablePeriod) period75, 0L, 2440588L);
        int[] intArray82 = dateTimeField1.add((org.joda.time.ReadablePartial) partial38, (int) (byte) 0, intArray80, 24);
        org.joda.time.Partial partial83 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology84 = partial83.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int85 = partial38.compareTo((org.joda.time.ReadablePartial) partial83);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-30610224000000L) + "'", long16 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(readableInterval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "29227899" + "'", str28, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hourOfDay" + "'", str32, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 24 + "'", int54 == 24);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "00" + "'", str56, "00");
        org.junit.Assert.assertNotNull(iSOChronology58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[24, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[24, 0, 0, 0, 0, 40, 40, 588]");
        org.junit.Assert.assertNotNull(chronology84);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        org.joda.time.ReadablePartial readablePartial54 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = partial36.isAfter(readablePartial54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        boolean boolean12 = zeroIsMaxDateTimeField10.isLeap((long) (byte) -1);
        long long15 = zeroIsMaxDateTimeField10.add((-30610224000000L), (int) (short) 1);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology17 = partial16.getChronology();
        int int18 = zeroIsMaxDateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) partial16);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval19);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = chronology21.millis();
        org.joda.time.DurationField durationField24 = chronology21.centuries();
        org.joda.time.Chronology chronology25 = chronology21.withUTC();
        org.joda.time.DurationField durationField26 = chronology25.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField30 = new org.joda.time.field.DividedDateTimeField(dateTimeField27, dateTimeFieldType28, 10);
        long long33 = dividedDateTimeField30.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.ReadableInterval readableInterval36 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval35);
        org.joda.time.Chronology chronology37 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval35);
        org.joda.time.DateTimeField dateTimeField38 = chronology37.yearOfCentury();
        org.joda.time.DurationField durationField39 = chronology37.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField40 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType34, durationField39);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField41 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField30, dateTimeFieldType34);
        org.joda.time.ReadablePartial readablePartial42 = null;
        java.util.Locale locale44 = null;
        java.lang.String str45 = dividedDateTimeField30.getAsShortText(readablePartial42, 29227899, locale44);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField47 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField30, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str49 = dateTimeFieldType48.getName();
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.ReadableInterval readableInterval52 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval51);
        org.joda.time.Chronology chronology53 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval51);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.yearOfCentury();
        org.joda.time.Partial partial55 = new org.joda.time.Partial(dateTimeFieldType48, (int) (short) 0, chronology53);
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.ReadableInterval readableInterval57 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval56);
        org.joda.time.Chronology chronology58 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval56);
        org.joda.time.DateTimeField dateTimeField59 = chronology58.yearOfCentury();
        org.joda.time.DurationField durationField60 = chronology58.millis();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial63 = null;
        int[] intArray70 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int71 = dateTimeField62.getMaximumValue(readablePartial63, intArray70);
        int int72 = dividedDateTimeField30.getMinimumValue((org.joda.time.ReadablePartial) partial55, intArray70);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str74 = dateTimeFieldType73.getName();
        org.joda.time.ReadableInterval readableInterval76 = null;
        org.joda.time.ReadableInterval readableInterval77 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval76);
        org.joda.time.Chronology chronology78 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval76);
        org.joda.time.DateTimeField dateTimeField79 = chronology78.yearOfCentury();
        org.joda.time.Partial partial80 = new org.joda.time.Partial(dateTimeFieldType73, (int) (short) 0, chronology78);
        org.joda.time.Chronology chronology81 = partial80.getChronology();
        org.joda.time.ReadableInterval readableInterval82 = null;
        org.joda.time.ReadableInterval readableInterval83 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval82);
        org.joda.time.ReadableInterval readableInterval84 = null;
        boolean boolean85 = readableInterval83.contains(readableInterval84);
        org.joda.time.Duration duration86 = readableInterval83.toDuration();
        org.joda.time.ReadableInterval readableInterval87 = null;
        org.joda.time.ReadableInterval readableInterval88 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval87);
        org.joda.time.ReadableInterval readableInterval89 = null;
        boolean boolean90 = readableInterval88.contains(readableInterval89);
        org.joda.time.Duration duration91 = readableInterval88.toDuration();
        org.joda.time.DateTime dateTime92 = readableInterval88.getEnd();
        boolean boolean93 = readableInterval83.isBefore((org.joda.time.ReadableInstant) dateTime92);
        org.joda.time.DateTime dateTime94 = partial80.toDateTime((org.joda.time.ReadableInstant) dateTime92);
        org.joda.time.DateTime dateTime95 = partial55.toDateTime((org.joda.time.ReadableInstant) dateTime94);
        // The following exception was thrown during execution in test generation
        try {
            int int96 = partial16.compareTo((org.joda.time.ReadablePartial) partial55);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-30578688000000L) + "'", long15 == (-30578688000000L));
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-30610224000000L) + "'", long33 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(readableInterval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "29227899" + "'", str45, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hourOfDay" + "'", str49, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(readableInterval57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 24 + "'", int71 == 24);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hourOfDay" + "'", str74, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval77);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(readableInterval83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(duration86);
        org.junit.Assert.assertNotNull(readableInterval88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(duration91);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertNotNull(dateTime95);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.hours();
        org.joda.time.Partial partial4 = new org.joda.time.Partial();
        int[] intArray6 = iSOChronology0.get((org.joda.time.ReadablePartial) partial4, (-1L));
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.millis();
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DurationField durationField12 = chronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField16 = new org.joda.time.field.DividedDateTimeField(dateTimeField13, dateTimeFieldType14, 10);
        long long19 = dividedDateTimeField16.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.Chronology chronology23 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval21);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology23.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField26 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType20, durationField25);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField27 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField16, dateTimeFieldType20);
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = null;
        java.lang.String str31 = dividedDateTimeField16.getAsShortText(readablePartial28, 29227899, locale30);
        boolean boolean32 = iSOChronology0.equals((java.lang.Object) str31);
        org.joda.time.DateTimeZone dateTimeZone33 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str36 = dateTimeZone35.toString();
        java.lang.String str38 = dateTimeZone35.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeUtils.getZone(dateTimeZone35);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone40 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone39);
        java.lang.String str41 = dateTimeZone39.toString();
        org.joda.time.Chronology chronology42 = iSOChronology0.withZone(dateTimeZone39);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-30610224000000L) + "'", long19 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(readableInterval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "29227899" + "'", str31, "29227899");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(cachedDateTimeZone40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertNotNull(chronology42);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        int int28 = dividedDateTimeField11.getLeapAmount(1712714007717L);
        org.joda.time.DateTimeField dateTimeField29 = dividedDateTimeField11.getWrappedField();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval30);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial34 = null;
        int int35 = dateTimeField33.getMinimumValue(readablePartial34);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeField33.getAsShortText(0L, locale37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField40 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField33, dateTimeFieldType39);
        boolean boolean42 = zeroIsMaxDateTimeField40.isLeap((long) (byte) -1);
        long long44 = zeroIsMaxDateTimeField40.roundHalfEven(0L);
        long long47 = zeroIsMaxDateTimeField40.set(12060014400000L, 24);
        long long49 = zeroIsMaxDateTimeField40.roundCeiling((long) 'a');
        long long51 = zeroIsMaxDateTimeField40.remainder((long) 1439);
        org.joda.time.chrono.ISOChronology iSOChronology52 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField53 = iSOChronology52.minutes();
        org.joda.time.DateTimeField dateTimeField54 = iSOChronology52.millisOfDay();
        org.joda.time.DateTimeField dateTimeField55 = iSOChronology52.halfdayOfDay();
        org.joda.time.Partial partial56 = new org.joda.time.Partial();
        org.joda.time.Chronology chronology57 = partial56.getChronology();
        java.util.Locale locale59 = null;
        java.lang.String str60 = dateTimeField55.getAsShortText((org.joda.time.ReadablePartial) partial56, 1, locale59);
        org.joda.time.ReadableInterval readableInterval61 = null;
        org.joda.time.ReadableInterval readableInterval62 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval61);
        org.joda.time.Chronology chronology63 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval61);
        org.joda.time.DateTimeField dateTimeField64 = chronology63.yearOfCentury();
        org.joda.time.DurationField durationField65 = chronology63.millis();
        org.joda.time.DateTimeField dateTimeField66 = chronology63.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval67 = null;
        org.joda.time.ReadableInterval readableInterval68 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval67);
        org.joda.time.Chronology chronology69 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval67);
        org.joda.time.DateTimeField dateTimeField70 = chronology69.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField71 = chronology69.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval72 = null;
        org.joda.time.ReadableInterval readableInterval73 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        boolean boolean75 = readableInterval73.contains(readableInterval74);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = readableInterval73.toPeriod(periodType76);
        int[] intArray79 = chronology69.get((org.joda.time.ReadablePeriod) period77, (-210866846400000L));
        int[] intArray82 = chronology63.get((org.joda.time.ReadablePeriod) period77, 2173795348453L, (long) 1439);
        int int83 = zeroIsMaxDateTimeField40.getMaximumValue((org.joda.time.ReadablePartial) partial56, intArray82);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval85 = null;
        org.joda.time.ReadableInterval readableInterval86 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval85);
        org.joda.time.Chronology chronology87 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval85);
        org.joda.time.DateTimeField dateTimeField88 = chronology87.yearOfCentury();
        org.joda.time.DurationField durationField89 = chronology87.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField90 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType84, durationField89);
        long long93 = unsupportedDateTimeField90.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType94 = unsupportedDateTimeField90.getType();
        org.joda.time.DurationFieldType durationFieldType95 = dateTimeFieldType94.getRangeDurationType();
        java.lang.String str96 = dateTimeFieldType94.toString();
        int int97 = partial56.indexOf(dateTimeFieldType94);
        int int98 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial56);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "69" + "'", str38, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 28800000L + "'", long44 == 28800000L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 11176401600000L + "'", long47 == 11176401600000L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 28800000L + "'", long49 == 28800000L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 31507201439L + "'", long51 == 31507201439L);
        org.junit.Assert.assertNotNull(iSOChronology52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PM" + "'", str60, "PM");
        org.junit.Assert.assertNotNull(readableInterval62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(readableInterval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(readableInterval73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertNotNull(readableInterval86);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(dateTimeField88);
        org.junit.Assert.assertNotNull(durationField89);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField90);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 4L + "'", long93 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType94);
        org.junit.Assert.assertNotNull(durationFieldType95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "dayOfYear" + "'", str96, "dayOfYear");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.DurationField durationField23 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField25 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, durationField23, dateTimeFieldType24);
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.DurationField durationField31 = chronology28.centuries();
        org.joda.time.Chronology chronology32 = chronology28.withUTC();
        org.joda.time.DurationField durationField33 = chronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField37 = new org.joda.time.field.DividedDateTimeField(dateTimeField34, dateTimeFieldType35, 10);
        long long40 = dividedDateTimeField37.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.DurationField durationField46 = chronology44.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField47 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType41, durationField46);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField48 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField37, dateTimeFieldType41);
        org.joda.time.ReadablePartial readablePartial49 = null;
        java.util.Locale locale51 = null;
        java.lang.String str52 = dividedDateTimeField37.getAsShortText(readablePartial49, 29227899, locale51);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField54 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField37, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str56 = dateTimeFieldType55.getName();
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.ReadableInterval readableInterval59 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval58);
        org.joda.time.Chronology chronology60 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval58);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfCentury();
        org.joda.time.Partial partial62 = new org.joda.time.Partial(dateTimeFieldType55, (int) (short) 0, chronology60);
        org.joda.time.ReadableInterval readableInterval63 = null;
        org.joda.time.ReadableInterval readableInterval64 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval63);
        org.joda.time.Chronology chronology65 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval63);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.yearOfCentury();
        org.joda.time.DurationField durationField67 = chronology65.millis();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial70 = null;
        int[] intArray77 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int78 = dateTimeField69.getMaximumValue(readablePartial70, intArray77);
        int int79 = dividedDateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) partial62, intArray77);
        java.lang.String str80 = partial62.toString();
        int int81 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial62);
        int int82 = dividedDateTimeField11.iDivisor;
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-30610224000000L) + "'", long40 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "29227899" + "'", str52, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hourOfDay" + "'", str56, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(readableInterval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 24 + "'", int78 == 24);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "00" + "'", str80, "00");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        long long7 = cachedDateTimeZone5.nextTransition(1233151473600032L);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = cachedDateTimeZone5.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1233151473600032L + "'", long7 == 1233151473600032L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        int int4 = dateTimeZone2.getStandardOffset((long) 1);
        org.joda.time.chrono.ZonedChronology zonedChronology5 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.Chronology chronology6 = zonedChronology5.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = zonedChronology5.getDateTimeMillis(0L, 53460006, 4, 0, (-41));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53460006 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zonedChronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField8 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType2, durationField7);
        long long11 = durationField7.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        boolean boolean17 = durationFieldType12.isSupported(chronology15);
        org.joda.time.field.ScaledDurationField scaledDurationField19 = new org.joda.time.field.ScaledDurationField(durationField7, durationFieldType12, (int) 'a');
        int int21 = scaledDurationField19.getValue((long) (short) -1);
        long long24 = scaledDurationField19.add((long) (-1), 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str26 = dateTimeFieldType25.getName();
        boolean boolean27 = scaledDurationField19.equals((java.lang.Object) str26);
        long long30 = scaledDurationField19.getMillis(100, 166133257543130L);
        int int31 = unsupportedDurationField1.compareTo((org.joda.time.DurationField) scaledDurationField19);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = unsupportedDurationField1.getMillis((int) (byte) 10, 2475960L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-210866846400000L) + "'", long11 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 969L + "'", long24 == 969L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hourOfDay" + "'", str26, "hourOfDay");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9700L + "'", long30 == 9700L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField10 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField3, dateTimeFieldType9);
        long long12 = zeroIsMaxDateTimeField10.roundHalfFloor(1712714007718L);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField14 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.centuryOfEra();
        org.joda.time.DurationField durationField17 = iSOChronology13.hours();
        org.joda.time.Partial partial18 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology13);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval19);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial23 = null;
        int int24 = dateTimeField22.getMinimumValue(readablePartial23);
        org.joda.time.DurationField durationField25 = dateTimeField22.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField30 = new org.joda.time.field.OffsetDateTimeField(dateTimeField22, dateTimeFieldType26, 24, 0, 1439);
        boolean boolean31 = partial18.isSupported(dateTimeFieldType26);
        int[] intArray32 = null;
        int int33 = zeroIsMaxDateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) partial18, intArray32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.ReadableInterval readableInterval36 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval35);
        org.joda.time.Chronology chronology37 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval35);
        org.joda.time.DateTimeField dateTimeField38 = chronology37.yearOfCentury();
        org.joda.time.DurationField durationField39 = chronology37.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField40 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType34, durationField39);
        long long43 = unsupportedDateTimeField40.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = unsupportedDateTimeField40.getType();
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType44.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial47 = partial18.withField(dateTimeFieldType44, 5681);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1704096000000L + "'", long12 == 1704096000000L);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(readableInterval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 4L + "'", long43 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(durationFieldType45);
    }
}

package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
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
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField18 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField18, and durationField5", !(durationField5.compareTo(unsupportedDurationField18) > 0 && unsupportedDurationField18.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        org.joda.time.DurationField durationField29 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField29, and durationField4", !(durationField4.compareTo(durationField29) > 0 && durationField29.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        int int21 = scaledDurationField17.getDifference((long) (byte) -1, (long) (short) 0);
        org.joda.time.DurationFieldType durationFieldType22 = scaledDurationField17.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField23 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField23, and durationField5", !(durationField5.compareTo(unsupportedDurationField23) > 0 && unsupportedDurationField23.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.weekyear();
        org.joda.time.DurationField durationField9 = chronology6.weekyears();
        org.joda.time.DurationField durationField10 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField10, and durationField4", !(durationField4.compareTo(durationField10) > 0 && durationField10.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DurationField durationField8 = chronology5.halfdays();
        org.joda.time.DurationField durationField9 = chronology5.seconds();
        int int10 = unsupportedDurationField1.compareTo(durationField9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField7, unsupportedDurationField1, and durationField7", !(durationField7.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(durationField7) > 0) || durationField7.compareTo(durationField7) > 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        long long31 = offsetDateTimeField28.roundFloor((long) (short) 1);
        org.joda.time.DurationField durationField32 = offsetDateTimeField28.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField32, and durationField4", !(durationField4.compareTo(durationField32) > 0 && durationField32.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = readableInterval6.contains(readableInterval7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = readableInterval6.toPeriod(periodType9);
        int[] intArray12 = chronology2.get((org.joda.time.ReadablePeriod) period10, (-210866846400000L));
        java.lang.String str13 = chronology2.toString();
        java.lang.String str14 = chronology2.toString();
        java.lang.String str15 = chronology2.toString();
        org.joda.time.DurationField durationField16 = chronology2.years();
        org.joda.time.DurationField durationField17 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField16, durationField17, and durationField16", !(durationField16.compareTo(durationField17) > 0 && durationField17.compareTo(durationField16) > 0) || durationField16.compareTo(durationField16) > 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        long long25 = scaledDurationField17.getMillis(1, 97L);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType26);
        boolean boolean28 = scaledDurationField17.equals((java.lang.Object) durationFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and unsupportedDurationField27", Math.signum(durationField5.compareTo(unsupportedDurationField27)) == -Math.signum(unsupportedDurationField27.compareTo(durationField5)));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField7, and durationField1", !(durationField1.compareTo(durationField7) > 0 && durationField7.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        int int15 = dividedDateTimeField11.iDivisor;
        org.joda.time.DurationField durationField16 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField16, and durationField4", !(durationField4.compareTo(durationField16) > 0 && durationField16.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        long long16 = dividedDateTimeField11.roundFloor((-210861660779418L));
        long long18 = dividedDateTimeField11.roundFloor(9700L);
        org.joda.time.DurationField durationField19 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField19, and durationField4", !(durationField4.compareTo(durationField19) > 0 && durationField19.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
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
        int int31 = dividedDateTimeField13.iDivisor;
        java.util.Locale locale33 = null;
        java.lang.String str34 = dividedDateTimeField13.getAsText((long) 100, locale33);
        org.joda.time.DurationField durationField35 = dividedDateTimeField13.getDurationField();
        int int36 = unsupportedDurationField1.compareTo(durationField35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField6, unsupportedDurationField1, and durationField6", !(durationField6.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(durationField6) > 0) || durationField6.compareTo(durationField6) > 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField7, and durationField4", !(durationField4.compareTo(durationField7) > 0 && durationField7.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((-210742430400000L));
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField10 = gregorianChronology9.eras();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology9.secondOfDay();
        org.joda.time.DurationField durationField12 = gregorianChronology9.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField10, durationField12, and durationField10", !(durationField10.compareTo(durationField12) > 0 && durationField12.compareTo(durationField10) > 0) || durationField10.compareTo(durationField10) > 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        org.joda.time.DurationField durationField15 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField15, and durationField4", !(durationField4.compareTo(durationField15) > 0 && durationField15.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        java.util.Locale locale72 = null;
        java.lang.String str73 = dividedDateTimeField11.getAsShortText((org.joda.time.ReadablePartial) partial51, (int) (short) 1, locale72);
        org.joda.time.DurationField durationField74 = dividedDateTimeField11.iRangeDurationField;
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField74, and durationField4", !(durationField4.compareTo(durationField74) > 0 && durationField74.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        int int18 = dividedDateTimeField11.getDifference((-210742430400000L), 0L);
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
        java.util.Locale locale74 = null;
        java.lang.String str75 = dividedDateTimeField11.getAsShortText((org.joda.time.ReadablePartial) partial55, (int) (short) 100, locale74);
        org.joda.time.DurationField durationField76 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField76, and durationField4", !(durationField4.compareTo(durationField76) > 0 && durationField76.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology17.minutes();
        long long22 = durationField19.getDifferenceAsLong(1712713656360L, (long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField24 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, durationField19, dateTimeFieldType23);
        org.joda.time.DurationField durationField25 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField25, and durationField4", !(durationField4.compareTo(durationField25) > 0 && durationField25.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        long long15 = dividedDateTimeField11.roundCeiling((long) (byte) 1);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval20);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.DurationField durationField25 = chronology22.centuries();
        org.joda.time.Chronology chronology26 = chronology22.withUTC();
        org.joda.time.DurationField durationField27 = chronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField31 = new org.joda.time.field.DividedDateTimeField(dateTimeField28, dateTimeFieldType29, 10);
        long long34 = dividedDateTimeField31.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.ReadableInterval readableInterval37 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval36);
        org.joda.time.Chronology chronology38 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval36);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.yearOfCentury();
        org.joda.time.DurationField durationField40 = chronology38.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField41 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType35, durationField40);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField42 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField31, dateTimeFieldType35);
        org.joda.time.ReadablePartial readablePartial43 = null;
        java.util.Locale locale45 = null;
        java.lang.String str46 = dividedDateTimeField31.getAsShortText(readablePartial43, 29227899, locale45);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField48 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField31, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str50 = dateTimeFieldType49.getName();
        org.joda.time.ReadableInterval readableInterval52 = null;
        org.joda.time.ReadableInterval readableInterval53 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval52);
        org.joda.time.Chronology chronology54 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval52);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.yearOfCentury();
        org.joda.time.Partial partial56 = new org.joda.time.Partial(dateTimeFieldType49, (int) (short) 0, chronology54);
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.ReadableInterval readableInterval58 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval57);
        org.joda.time.Chronology chronology59 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval57);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.DurationField durationField61 = chronology59.millis();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField63 = chronology59.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial64 = null;
        int[] intArray71 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int72 = dateTimeField63.getMaximumValue(readablePartial64, intArray71);
        int int73 = dividedDateTimeField31.getMinimumValue((org.joda.time.ReadablePartial) partial56, intArray71);
        boolean boolean75 = partial56.equals((java.lang.Object) "29227899");
        java.lang.Object obj76 = null;
        boolean boolean77 = partial56.equals(obj76);
        org.joda.time.Chronology chronology78 = partial56.getChronology();
        java.util.Locale locale80 = null;
        java.lang.String str81 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) partial56, 11, locale80);
        int int82 = dividedDateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) partial56);
        org.joda.time.DurationField durationField83 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField83, and durationField4", !(durationField4.compareTo(durationField83) > 0 && durationField83.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        long long7 = iSOChronology0.getDateTimeMillis(1, 1, (int) (byte) 1, (int) (short) 100);
        org.joda.time.Chronology chronology8 = iSOChronology0.withUTC();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField9, and durationField1", !(durationField1.compareTo(durationField9) > 0 && durationField9.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        int int17 = dividedDateTimeField11.getDifference(1712713658385L, 1712713659846L);
        long long20 = dividedDateTimeField11.add(10L, 0);
        org.joda.time.DurationField durationField21 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField21, and durationField4", !(durationField4.compareTo(durationField21) > 0 && durationField21.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }
}


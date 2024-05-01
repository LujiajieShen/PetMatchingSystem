package org.joda.time.format;

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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 'a', chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        int int5 = property3.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property3.getMaximumShortTextLength(locale6);
        org.joda.time.DateTime dateTime8 = property3.roundCeilingCopy();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((java.lang.Object) dateTime8);
        org.joda.time.Instant instant13 = instant11.minus(0L);
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology15, locale16, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long27 = fixedDateTimeZone24.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int34 = fixedDateTimeZone32.getStandardOffset(0L);
        long long36 = fixedDateTimeZone24.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone32, (long) (short) 10);
        dateTimeParserBucket19.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        org.joda.time.DateTime dateTime38 = instant11.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant11", (dateTime8.compareTo(instant11) == 0) == dateTime8.equals(instant11));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.Chronology chronology51 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval50);
        org.joda.time.DateTimeField dateTimeField52 = chronology51.millisOfDay();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField53 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField52);
        org.joda.time.DurationField durationField54 = delegatedDateTimeField53.getDurationField();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField55 = new org.joda.time.field.DelegatedDateTimeField((org.joda.time.DateTimeField) delegatedDateTimeField53);
        int int56 = dateTime45.get((org.joda.time.DateTimeField) delegatedDateTimeField55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField54", Math.signum(durationField15.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField15)));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology85 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DurationField durationField86 = gregorianChronology85.centuries();
        mutableDateTime8.setChronology((org.joda.time.Chronology) gregorianChronology85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField53 and durationField86", Math.signum(durationField53.compareTo(durationField86)) == -Math.signum(durationField86.compareTo(durationField53)));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology56 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField57 = gregorianChronology56.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology56);
        org.joda.time.chrono.GregorianChronology gregorianChronology59 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField60 = gregorianChronology59.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField61 = gregorianChronology59.monthOfYear();
        int int62 = gregorianChronology59.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField63 = gregorianChronology59.halfdays();
        org.joda.time.DurationField durationField64 = gregorianChronology59.years();
        org.joda.time.DateTimeField dateTimeField65 = gregorianChronology59.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder66.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber73 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType70, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder66.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber73);
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology76 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField77 = gregorianChronology76.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField78 = gregorianChronology76.monthOfYear();
        int int79 = gregorianChronology76.getMinimumDaysInFirstWeek();
        boolean boolean80 = dateTimeFieldType75.isSupported((org.joda.time.Chronology) gregorianChronology76);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder74.appendText(dateTimeFieldType75);
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction84 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType75, (int) (short) 100, (int) (byte) -1);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField86 = new org.joda.time.field.DividedDateTimeField(dateTimeField65, dateTimeFieldType75, (int) 'a');
        org.joda.time.LocalDateTime.Property property87 = localDateTime58.property(dateTimeFieldType75);
        int int88 = localDate8.get(dateTimeFieldType75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField63", Math.signum(durationField15.compareTo(durationField63)) == -Math.signum(durationField63.compareTo(durationField15)));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gJChronology5.eras();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.era();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology9, locale10, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long21 = fixedDateTimeZone18.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int28 = fixedDateTimeZone26.getStandardOffset(0L);
        long long30 = fixedDateTimeZone18.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone26, (long) (short) 10);
        dateTimeParserBucket13.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone18);
        boolean boolean32 = gJChronology5.equals((java.lang.Object) fixedDateTimeZone18);
        org.joda.time.DurationField durationField33 = gJChronology5.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField33, and durationField6", !(durationField6.compareTo(durationField33) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField33.compareTo(durationField6))));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        boolean boolean29 = dividedDateTimeField27.isLenient();
        int int31 = dividedDateTimeField27.getMinimumValue(432000053L);
        long long34 = dividedDateTimeField27.add((-2L), (int) (byte) 1);
        int int35 = dividedDateTimeField27.getMinimumValue();
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology38 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField39 = gregorianChronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology38.monthOfYear();
        int int41 = gregorianChronology38.getMinimumDaysInFirstWeek();
        boolean boolean42 = dateTimeFieldType37.isSupported((org.joda.time.Chronology) gregorianChronology38);
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology38.minuteOfDay();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(obj36, (org.joda.time.Chronology) gregorianChronology38);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone49 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology50 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone49);
        org.joda.time.DurationField durationField51 = gJChronology50.eras();
        org.joda.time.DateTimeField dateTimeField52 = gJChronology50.era();
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology54, locale55, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone63 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long66 = fixedDateTimeZone63.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone71 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int73 = fixedDateTimeZone71.getStandardOffset(0L);
        long long75 = fixedDateTimeZone63.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone71, (long) (short) 10);
        dateTimeParserBucket58.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone63);
        boolean boolean77 = gJChronology50.equals((java.lang.Object) fixedDateTimeZone63);
        org.joda.time.Interval interval78 = localDate44.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone63);
        org.joda.time.LocalDate.Property property79 = localDate44.dayOfWeek();
        org.joda.time.LocalDate localDate80 = property79.roundCeilingCopy();
        java.util.Locale locale82 = null;
        java.lang.String str83 = dividedDateTimeField27.getAsShortText((org.joda.time.ReadablePartial) localDate80, 69280587, locale82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField51", Math.signum(durationField4.compareTo(durationField51)) == -Math.signum(durationField51.compareTo(durationField4)));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 'a', chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfWeek();
        org.joda.time.DateTime dateTime6 = dateTime3.minusYears(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long17 = fixedDateTimeZone14.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int24 = fixedDateTimeZone22.getStandardOffset(0L);
        long long26 = fixedDateTimeZone14.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (long) (short) 10);
        mutableDateTime9.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone14);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) "2024-04-09", (org.joda.time.DateTimeZone) fixedDateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime9", (dateTime3.compareTo(mutableDateTime9) == 0) == dateTime3.equals(mutableDateTime9));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        boolean boolean29 = dividedDateTimeField27.isLenient();
        int int31 = dividedDateTimeField27.getMinimumValue(432000053L);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField33 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField27, dateTimeFieldType32);
        java.lang.Object obj34 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology36 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology36.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology36.monthOfYear();
        int int39 = gregorianChronology36.getMinimumDaysInFirstWeek();
        boolean boolean40 = dateTimeFieldType35.isSupported((org.joda.time.Chronology) gregorianChronology36);
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology36.minuteOfDay();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(obj34, (org.joda.time.Chronology) gregorianChronology36);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone47 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        org.joda.time.chrono.GJChronology gJChronology48 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone47);
        org.joda.time.DurationField durationField49 = gJChronology48.eras();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology48.era();
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology52, locale53, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone61 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long64 = fixedDateTimeZone61.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone69 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int71 = fixedDateTimeZone69.getStandardOffset(0L);
        long long73 = fixedDateTimeZone61.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone69, (long) (short) 10);
        dateTimeParserBucket56.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone61);
        boolean boolean75 = gJChronology48.equals((java.lang.Object) fixedDateTimeZone61);
        org.joda.time.Interval interval76 = localDate42.toInterval((org.joda.time.DateTimeZone) fixedDateTimeZone61);
        int int77 = localDate42.getMonthOfYear();
        org.joda.time.LocalDate localDate79 = localDate42.plusDays(97);
        int int80 = zeroIsMaxDateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localDate42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField49", Math.signum(durationField4.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField4)));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology46 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology46.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) gregorianChronology46);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.weekyear();
        org.joda.time.LocalDateTime localDateTime50 = property49.getLocalDateTime();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withDurationAdded(readableDuration51, 0);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.withMinuteOfHour(4);
        org.joda.time.chrono.GregorianChronology gregorianChronology56 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField57 = gregorianChronology56.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField58 = gregorianChronology56.monthOfYear();
        int int59 = gregorianChronology56.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField60 = gregorianChronology56.halfdays();
        org.joda.time.DurationField durationField61 = gregorianChronology56.years();
        org.joda.time.DateTimeField dateTimeField62 = gregorianChronology56.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder63.appendFractionOfHour((int) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber70 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType67, 1969, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder63.appendOptional((org.joda.time.format.DateTimeParser) fixedNumber70);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.chrono.GregorianChronology gregorianChronology73 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField74 = gregorianChronology73.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField75 = gregorianChronology73.monthOfYear();
        int int76 = gregorianChronology73.getMinimumDaysInFirstWeek();
        boolean boolean77 = dateTimeFieldType72.isSupported((org.joda.time.Chronology) gregorianChronology73);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder78 = dateTimeFormatterBuilder71.appendText(dateTimeFieldType72);
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction81 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType72, (int) (short) 100, (int) (byte) -1);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField83 = new org.joda.time.field.DividedDateTimeField(dateTimeField62, dateTimeFieldType72, (int) 'a');
        org.joda.time.DurationField durationField84 = dividedDateTimeField83.getRangeDurationField();
        boolean boolean85 = dividedDateTimeField83.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = dividedDateTimeField83.getType();
        int int87 = localDateTime50.indexOf(dateTimeFieldType86);
        boolean boolean88 = localDate8.isSupported(dateTimeFieldType86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField60", Math.signum(durationField15.compareTo(durationField60)) == -Math.signum(durationField60.compareTo(durationField15)));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 'a', chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfWeek();
        org.joda.time.DateTime dateTime6 = dateTime3.minusYears(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTime((org.joda.time.Chronology) gregorianChronology7);
        int int12 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime9, "org.joda.time.IllegalFieldValueException: Value \"Wednesday, December 31, 1969 4:00:00 PM -08:00\" for dayOfWeek is not supported", (int) ' ');
        boolean boolean13 = dateTimeFormatter0.isOffsetParsed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime9", (dateTime3.compareTo(mutableDateTime9) == 0) == dateTime3.equals(mutableDateTime9));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 'a', chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusSeconds(0);
        int int6 = dateTime5.getSecondOfMinute();
        org.joda.time.DateTime.Property property7 = dateTime5.yearOfCentury();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfYear();
        org.joda.time.DateTime dateTime11 = dateTime5.withChronology(chronology9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 'a', chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusSeconds(0);
        int int17 = dateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = dateTime14.minusYears((int) '#');
        java.util.Date date20 = dateTime14.toDate();
        org.joda.time.DateTime dateTime22 = dateTime14.withMillis((long) (byte) 10);
        boolean boolean23 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 'a', chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTime dateTime29 = dateTime26.minusYears(0);
        org.joda.time.chrono.GregorianChronology gregorianChronology30 = org.joda.time.chrono.GregorianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology30.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime29.toMutableDateTime((org.joda.time.Chronology) gregorianChronology30);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long40 = fixedDateTimeZone37.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone45 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int47 = fixedDateTimeZone45.getStandardOffset(0L);
        long long49 = fixedDateTimeZone37.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone45, (long) (short) 10);
        mutableDateTime32.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone37);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 'a', chronology52);
        org.joda.time.DateTime.Property property54 = dateTime53.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property54.getFieldType();
        org.joda.time.Interval interval56 = property54.toInterval();
        org.joda.time.DateTime dateTime57 = interval56.getStart();
        java.lang.String str58 = interval56.toString();
        long long59 = interval56.toDurationMillis();
        org.joda.time.Interval interval60 = interval56.toInterval();
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = interval60.toPeriod(periodType61);
        mutableDateTime32.add((org.joda.time.ReadablePeriod) period62);
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) 4, chronology65, locale66, (java.lang.Integer) 100, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone74 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        long long77 = fixedDateTimeZone74.convertLocalToUTC((long) '4', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone82 = new org.joda.time.tz.FixedDateTimeZone("hi!", "", (int) (byte) -1, (int) (byte) 10);
        int int84 = fixedDateTimeZone82.getStandardOffset(0L);
        long long86 = fixedDateTimeZone74.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone82, (long) (short) 10);
        dateTimeParserBucket69.setZone((org.joda.time.DateTimeZone) fixedDateTimeZone74);
        mutableDateTime32.setZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone74);
        org.joda.time.DateTime dateTime89 = dateTime22.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone74);
        org.joda.time.LocalDateTime localDateTime90 = new org.joda.time.LocalDateTime(0L, (org.joda.time.DateTimeZone) fixedDateTimeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime89", (dateTime22.compareTo(dateTime89) == 0) == dateTime22.equals(dateTime89));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket.SavedField savedField31 = new org.joda.time.format.DateTimeParserBucket.SavedField((org.joda.time.DateTimeField) dividedDateTimeField27, "yearOfCentury", locale30);
        int int33 = dividedDateTimeField27.getMaximumValue((long) 432000053);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField34 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField27);
        org.joda.time.DurationField durationField35 = remainderDateTimeField34.getRangeDurationField();
        long long38 = remainderDateTimeField34.set(32L, 8);
        long long40 = remainderDateTimeField34.remainder((long) 5);
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
        org.joda.time.LocalDate.Property property84 = localDate49.dayOfWeek();
        org.joda.time.LocalDate localDate85 = property84.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetMillis(69);
        org.joda.time.DateTime dateTime88 = localDate85.toDateTimeAtMidnight(dateTimeZone87);
        int int89 = localDate85.getCenturyOfEra();
        java.util.Locale locale91 = null;
        java.lang.String str92 = remainderDateTimeField34.getAsText((org.joda.time.ReadablePartial) localDate85, 0, locale91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField56", Math.signum(durationField4.compareTo(durationField56)) == -Math.signum(durationField56.compareTo(durationField4)));
    }
}


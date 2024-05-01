package org.joda.time;

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
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.eras();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField2", Math.signum(durationField1.compareTo(durationField2)) == -Math.signum(durationField2.compareTo(durationField1)));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        java.lang.String str11 = durationFieldType9.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and unsupportedDurationField10", Math.signum(durationField3.compareTo(unsupportedDurationField10)) == -Math.signum(unsupportedDurationField10.compareTo(durationField3)));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField2", Math.signum(durationField1.compareTo(durationField2)) == -Math.signum(durationField2.compareTo(durationField1)));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = dateTime3.minusDays(200);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology9.monthOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology9.weekyears();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.monthOfYear();
        org.joda.time.DurationField durationField16 = gregorianChronology13.weekyears();
        int int17 = durationField12.compareTo(durationField16);
        org.joda.time.DurationFieldType durationFieldType18 = durationField16.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField19 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType18);
        org.joda.time.DateTime dateTime21 = dateTime3.withFieldAdded(durationFieldType18, (int) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and unsupportedDurationField19", Math.signum(durationField12.compareTo(unsupportedDurationField19)) == -Math.signum(unsupportedDurationField19.compareTo(durationField12)));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.eras();
        java.lang.Object obj3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj3);
        org.joda.time.DateTime dateTime6 = dateTime4.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay7 = dateTime6.toTimeOfDay();
        boolean boolean8 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay7);
        int[] intArray10 = gregorianChronology0.get((org.joda.time.ReadablePartial) timeOfDay7, 1712715751520L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField2", Math.signum(durationField1.compareTo(durationField2)) == -Math.signum(durationField2.compareTo(durationField1)));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.eras();
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField2", Math.signum(durationField1.compareTo(durationField2)) == -Math.signum(durationField2.compareTo(durationField1)));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.eras();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.ERAS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField5 = new org.joda.time.field.PreciseDurationField(durationFieldType3, (-99994L));
        int int8 = preciseDurationField5.getValue((long) 1, (long) (byte) 8);
        long long11 = preciseDurationField5.getMillis(2024, 0L);
        int int12 = durationField2.compareTo((org.joda.time.DurationField) preciseDurationField5);
        java.lang.String str13 = preciseDurationField5.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField2", Math.signum(durationField1.compareTo(durationField2)) == -Math.signum(durationField2.compareTo(durationField1)));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        org.joda.time.DateMidnight dateMidnight12 = dateTime9.toDateMidnight();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology13.weekyearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime9.toDateTime((org.joda.time.Chronology) gregorianChronology13);
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField26 = new org.joda.time.field.OffsetDateTimeField(dateTimeField21, dateTimeFieldType22, (int) (byte) 7, 3, 0);
        int int27 = offsetDateTimeField26.getMaximumValue();
        int int29 = offsetDateTimeField26.getMaximumValue((-99979L));
        int int32 = offsetDateTimeField26.getDifference(12L, (long) '4');
        java.lang.Object obj33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(obj33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay37 = dateTime36.toTimeOfDay();
        boolean boolean38 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay37);
        org.joda.time.chrono.GregorianChronology gregorianChronology39 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology39.dayOfYear();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology39.monthOfYear();
        org.joda.time.DurationField durationField42 = gregorianChronology39.hours();
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology39.secondOfMinute();
        boolean boolean45 = dateTimeField43.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str47 = dateTimeFieldType46.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField48 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField43, dateTimeFieldType46);
        org.joda.time.ReadablePartial readablePartial49 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology50 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField51 = gregorianChronology50.dayOfYear();
        org.joda.time.DateTimeField dateTimeField52 = gregorianChronology50.monthOfYear();
        org.joda.time.DurationField durationField53 = gregorianChronology50.hours();
        org.joda.time.DateTimeField dateTimeField54 = gregorianChronology50.secondOfMinute();
        boolean boolean56 = dateTimeField54.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str58 = dateTimeFieldType57.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField59 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField54, dateTimeFieldType57);
        long long61 = zeroIsMaxDateTimeField59.roundFloor((long) 100);
        long long63 = zeroIsMaxDateTimeField59.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial64 = null;
        java.util.Locale locale66 = null;
        java.lang.String str67 = zeroIsMaxDateTimeField59.getAsText(readablePartial64, (int) (byte) 7, locale66);
        int int68 = zeroIsMaxDateTimeField59.getMinimumValue();
        int int71 = zeroIsMaxDateTimeField59.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial72 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology73 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField74 = gregorianChronology73.dayOfYear();
        org.joda.time.DateTimeField dateTimeField75 = gregorianChronology73.monthOfYear();
        org.joda.time.ReadablePartial readablePartial76 = null;
        int[] intArray77 = new int[] {};
        int int78 = dateTimeField75.getMaximumValue(readablePartial76, intArray77);
        int int79 = zeroIsMaxDateTimeField59.getMinimumValue(readablePartial72, intArray77);
        int int80 = dateTimeField43.getMinimumValue(readablePartial49, intArray77);
        int int81 = offsetDateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay37, intArray77);
        java.lang.Object obj82 = null;
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(obj82);
        org.joda.time.DateTime dateTime85 = dateTime83.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay86 = dateTime85.toTimeOfDay();
        int[] intArray87 = new int[] {};
        int int88 = offsetDateTimeField26.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay86, intArray87);
        int[] intArray90 = gregorianChronology13.get((org.joda.time.ReadablePartial) timeOfDay86, 518400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime17", (dateTime1.compareTo(dateTime17) == 0) == dateTime1.equals(dateTime17));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = gregorianChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.clockhourOfDay();
        org.joda.time.Chronology chronology7 = gregorianChronology1.withUTC();
        long long11 = gregorianChronology1.add((-99994L), (long) (byte) 5, 3);
        org.joda.time.DurationField durationField12 = gregorianChronology1.eras();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(1712715753709L, (org.joda.time.Chronology) gregorianChronology1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField12", Math.signum(durationField4.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField4)));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        long long6 = iSOChronology1.getDateTimeMillis((int) (byte) 10, (int) (short) 1, (int) (byte) 5, (int) (byte) 11);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime18 = dateTime14.toDateTimeISO();
        org.joda.time.DateTime dateTime20 = dateTime18.withMillis((-9L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int22 = dateTimeFormatter21.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone24.getShortName((long) '#', locale26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter21.withZone(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime20.toMutableDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology30 = iSOChronology1.withZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and mutableDateTime29", (dateTime20.compareTo(mutableDateTime29) == 0) == dateTime20.equals(mutableDateTime29));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = gregorianChronology7.weeks();
        org.joda.time.DurationField durationField9 = gregorianChronology7.halfdays();
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology7.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology11.monthOfYear();
        org.joda.time.DurationField durationField14 = gregorianChronology11.hours();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology11.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean19 = dateTimeZone17.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology20 = gregorianChronology11.withZone(dateTimeZone17);
        boolean boolean21 = dateTimeZone17.isFixed();
        org.joda.time.Chronology chronology22 = gregorianChronology7.withZone(dateTimeZone17);
        java.lang.String str23 = dateTimeZone17.toString();
        org.joda.time.DateTime dateTime24 = dateTime6.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone25);
        long long31 = iSOChronology26.getDateTimeMillis((int) (byte) 10, (int) (short) 1, (int) (byte) 5, (int) (byte) 11);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology26.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean36 = dateTimeZone34.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone34.isLocalDateTimeGap(localDateTime37);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone34.getName(1712715743778L, locale40);
        long long43 = dateTimeZone34.previousTransition(100L);
        java.lang.String str45 = dateTimeZone34.getName((long) 32);
        org.joda.time.Chronology chronology46 = iSOChronology26.withZone(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime6.toMutableDateTime(dateTimeZone34);
        java.lang.Object obj48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj48);
        org.joda.time.DateTime dateTime51 = dateTime49.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight52 = dateTime51.toDateMidnight();
        org.joda.time.DateTime dateTime54 = dateTime51.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime56 = dateTime51.minusDays(200);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.toDateTime(chronology57);
        boolean boolean59 = dateTimeZone34.equals((java.lang.Object) chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime24", (dateTime6.compareTo(dateTime24) == 0) == dateTime6.equals(dateTime24));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.lang.Object obj1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight5 = dateTime4.toDateMidnight();
        org.joda.time.DateTime dateTime7 = dateTime4.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) (byte) 23, (int) 'a');
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        org.joda.time.DateTime dateTime17 = dateTime14.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime14.minusDays(200);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(chronology20);
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.ReadableInterval readableInterval23 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval22);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        boolean boolean26 = readableInterval23.isAfter(readableInterval24);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.ReadableInterval readableInterval28 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        boolean boolean31 = readableInterval28.isAfter(readableInterval29);
        boolean boolean32 = readableInterval23.contains(readableInterval29);
        org.joda.time.Duration duration33 = readableInterval23.toDuration();
        org.joda.time.DateTime dateTime34 = dateTime19.minus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime36 = dateTime10.withDurationAdded((org.joda.time.ReadableDuration) duration33, 3);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder37 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder40 = dateTimeZoneBuilder37.setFixedSavings("-00:00:00.001", 200);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder43 = dateTimeZoneBuilder40.setFixedSavings("", 32);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeZoneBuilder40.toDateTimeZone("DateTimeField[centuryOfEra]", true);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime36.toMutableDateTime(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(9001L, dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime47", (dateTime10.compareTo(mutableDateTime47) == 0) == dateTime10.equals(mutableDateTime47));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((-9L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int14 = dateTimeFormatter13.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone16.getShortName((long) '#', locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter13.withZone(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime12.toMutableDateTime(dateTimeZone16);
        int int22 = dateTime12.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) (byte) 2);
        boolean boolean29 = dateTimeZone25.isStandardOffset((long) '#');
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 9, dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime12.toMutableDateTime(dateTimeZone25);
        java.lang.String str33 = dateTimeZone25.getNameKey(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime21", (dateTime12.compareTo(mutableDateTime21) == 0) == dateTime12.equals(mutableDateTime21));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        org.joda.time.Duration duration11 = readableInterval1.toDuration();
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight16 = dateTime15.toDateMidnight();
        org.joda.time.DateTime dateTime18 = dateTime15.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime22.centuryOfEra();
        int int24 = dateTime22.getDayOfYear();
        boolean boolean25 = readableInterval1.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology26.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology26.weekyearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime22.withChronology((org.joda.time.Chronology) gregorianChronology26);
        java.lang.Object obj31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight35 = dateTime34.toDateMidnight();
        org.joda.time.DateTime dateTime37 = dateTime34.minusDays((int) (byte) 1);
        boolean boolean38 = dateTime37.isEqualNow();
        java.lang.Object obj39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(obj39);
        boolean boolean41 = dateTime37.isEqual((org.joda.time.ReadableInstant) dateTime40);
        int int42 = dateTime40.getYearOfEra();
        org.joda.time.DateTime.Property property43 = dateTime40.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight44 = dateTime40.toDateMidnight();
        int int45 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime30", (dateTime22.compareTo(dateTime30) == 0) == dateTime22.equals(dateTime30));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        org.joda.time.DateMidnight dateMidnight12 = dateTime9.toDateMidnight();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology13.weekyearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime9.toDateTime((org.joda.time.Chronology) gregorianChronology13);
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology13.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime17", (dateTime1.compareTo(dateTime17) == 0) == dateTime1.equals(dateTime17));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str1 = iSOChronology0.toString();
        org.joda.time.DurationField durationField2 = iSOChronology0.centuries();
        java.lang.Object obj3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight7 = dateTime6.toDateMidnight();
        org.joda.time.DateTime dateTime9 = dateTime6.minusDays((int) (byte) 1);
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = gregorianChronology10.weeks();
        org.joda.time.DurationField durationField12 = gregorianChronology10.halfdays();
        org.joda.time.DateTimeZone dateTimeZone13 = gregorianChronology10.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.monthOfYear();
        org.joda.time.DurationField durationField17 = gregorianChronology14.hours();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology14.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean22 = dateTimeZone20.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology23 = gregorianChronology14.withZone(dateTimeZone20);
        boolean boolean24 = dateTimeZone20.isFixed();
        org.joda.time.Chronology chronology25 = gregorianChronology10.withZone(dateTimeZone20);
        java.lang.String str26 = dateTimeZone20.toString();
        org.joda.time.DateTime dateTime27 = dateTime9.withZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        long long34 = iSOChronology29.getDateTimeMillis((int) (byte) 10, (int) (short) 1, (int) (byte) 5, (int) (byte) 11);
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean39 = dateTimeZone37.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = dateTimeZone37.isLocalDateTimeGap(localDateTime40);
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone37.getName(1712715743778L, locale43);
        long long46 = dateTimeZone37.previousTransition(100L);
        java.lang.String str48 = dateTimeZone37.getName((long) 32);
        org.joda.time.Chronology chronology49 = iSOChronology29.withZone(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime9.toMutableDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology51 = iSOChronology0.withZone(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime27", (dateTime9.compareTo(dateTime27) == 0) == dateTime9.equals(dateTime27));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology6 = gregorianChronology0.withUTC();
        long long10 = gregorianChronology0.add((-99994L), (long) (byte) 5, 3);
        org.joda.time.DurationField durationField11 = gregorianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology6 = gregorianChronology0.withUTC();
        long long10 = gregorianChronology0.add((-99994L), (long) (byte) 5, 3);
        org.joda.time.DurationField durationField11 = gregorianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField11", Math.signum(durationField3.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField3)));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        org.joda.time.Duration duration11 = readableInterval1.toDuration();
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight16 = dateTime15.toDateMidnight();
        org.joda.time.DateTime dateTime18 = dateTime15.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime22.centuryOfEra();
        int int24 = dateTime22.getDayOfYear();
        boolean boolean25 = readableInterval1.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology26.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology26.weekyearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime22.withChronology((org.joda.time.Chronology) gregorianChronology26);
        org.joda.time.DateTime dateTime33 = dateTime22.withDurationAdded((long) 256000, (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime30", (dateTime22.compareTo(dateTime30) == 0) == dateTime22.equals(dateTime30));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        int int6 = dateTime4.getSecondOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.withYearOfCentury(32);
        boolean boolean10 = dateTime8.isAfter((long) 18);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean14 = dateTimeZone12.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone12.isLocalDateTimeGap(localDateTime15);
        boolean boolean17 = dateTime8.equals((java.lang.Object) dateTimeZone12);
        org.joda.time.DateTime dateTime19 = dateTime8.withYearOfEra(69757);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("12", "centuryOfEra", (int) (byte) 8, 70);
        int int26 = fixedDateTimeZone24.getOffset((long) 35);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime8.toMutableDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        int int29 = fixedDateTimeZone24.getOffset((-61084800000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime27", (dateTime8.compareTo(mutableDateTime27) == 0) == dateTime8.equals(mutableDateTime27));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        org.joda.time.Duration duration11 = readableInterval1.toDuration();
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight16 = dateTime15.toDateMidnight();
        org.joda.time.DateTime dateTime18 = dateTime15.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime.Property property23 = dateTime22.centuryOfEra();
        int int24 = dateTime22.getDayOfYear();
        boolean boolean25 = readableInterval1.contains((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology26.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology26.weekyearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime22.withChronology((org.joda.time.Chronology) gregorianChronology26);
        int int31 = dateTime22.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime30", (dateTime22.compareTo(dateTime30) == 0) == dateTime22.equals(dateTime30));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.eras();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.ERAS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField5 = new org.joda.time.field.PreciseDurationField(durationFieldType3, (-99994L));
        int int8 = preciseDurationField5.getValue((long) 1, (long) (byte) 8);
        long long11 = preciseDurationField5.getMillis(2024, 0L);
        int int12 = durationField2.compareTo((org.joda.time.DurationField) preciseDurationField5);
        long long13 = durationField2.getUnitMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField1, and preciseDurationField5", !(durationField2.compareTo(durationField1) == 0) || (Math.signum(durationField2.compareTo(preciseDurationField5)) == Math.signum(durationField1.compareTo(preciseDurationField5))));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        org.joda.time.DateMidnight dateMidnight12 = dateTime9.toDateMidnight();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology13.weekyearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime9.toDateTime((org.joda.time.Chronology) gregorianChronology13);
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.monthOfYear();
        org.joda.time.DurationField durationField21 = gregorianChronology18.weekyears();
        long long24 = durationField21.getValueAsLong((long) 0, 1712715743778L);
        boolean boolean25 = org.joda.time.field.FieldUtils.equals((java.lang.Object) gregorianChronology13, (java.lang.Object) 1712715743778L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime17", (dateTime1.compareTo(dateTime17) == 0) == dateTime1.equals(dateTime17));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField2", Math.signum(durationField1.compareTo(durationField2)) == -Math.signum(durationField2.compareTo(durationField1)));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        org.joda.time.DateTime dateTime16 = dateTime5.withCenturyOfEra((int) (byte) 5);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTimeISO();
        java.lang.Object obj24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusSeconds((int) (byte) 1);
        int int28 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime30 = dateTime25.minusYears(54);
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology31.monthOfYear();
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField35 = gregorianChronology31.months();
        org.joda.time.DurationField durationField36 = gregorianChronology31.months();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology31.yearOfCentury();
        java.lang.Object obj38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj38);
        org.joda.time.DateTime dateTime41 = dateTime39.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight42 = dateTime41.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int44 = dateMidnight42.get(dateTimeFieldType43);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField48 = new org.joda.time.field.OffsetDateTimeField(dateTimeField37, dateTimeFieldType43, (int) (byte) 4, (int) (byte) 7, (int) (byte) 19);
        int int49 = dateTime25.get(dateTimeFieldType43);
        boolean boolean50 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.chrono.GregorianChronology gregorianChronology51 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone53.getShortName((long) '#', locale55);
        org.joda.time.Chronology chronology57 = gregorianChronology51.withZone(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField58 = chronology57.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime25.toMutableDateTime(chronology57);
        org.joda.time.DateTime.Property property60 = dateTime25.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and mutableDateTime59", (dateTime39.compareTo(mutableDateTime59) == 0) == dateTime39.equals(mutableDateTime59));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        boolean boolean13 = unsupportedDurationField10.isSupported();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.monthOfYear();
        org.joda.time.DurationField durationField17 = gregorianChronology14.hours();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology14.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean22 = dateTimeZone20.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology23 = gregorianChronology14.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField24 = gregorianChronology14.minutes();
        int int25 = unsupportedDurationField10.compareTo(durationField24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on unsupportedDurationField10, durationField3, and durationField17", !(unsupportedDurationField10.compareTo(durationField3) == 0) || (Math.signum(unsupportedDurationField10.compareTo(durationField17)) == Math.signum(durationField3.compareTo(durationField17))));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        java.lang.String str2 = dateTimeFormatter0.print((-61661439779990L));
        java.lang.Object obj3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight7 = dateTime6.toDateMidnight();
        org.joda.time.DateTime dateTime9 = dateTime6.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime13 = dateTime9.toDateTimeISO();
        org.joda.time.DateTime dateTime15 = dateTime13.withMillis((-9L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int17 = dateTimeFormatter16.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getShortName((long) '#', locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter16.withZone(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime15.toMutableDateTime(dateTimeZone19);
        int int25 = dateTime15.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean30 = dateTimeZone28.isStandardOffset((long) (byte) 2);
        boolean boolean32 = dateTimeZone28.isStandardOffset((long) '#');
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 9, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime15.toMutableDateTime(dateTimeZone28);
        int int37 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime34, "+00:00:00.017", (-1712715767));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime24", (dateTime15.compareTo(mutableDateTime24) == 0) == dateTime15.equals(mutableDateTime24));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        int int6 = dateTime4.getSecondOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.withYearOfCentury(32);
        boolean boolean10 = dateTime8.isAfter((long) 18);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean14 = dateTimeZone12.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone12.isLocalDateTimeGap(localDateTime15);
        boolean boolean17 = dateTime8.equals((java.lang.Object) dateTimeZone12);
        org.joda.time.DateTime dateTime19 = dateTime8.withYearOfEra(69757);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("12", "centuryOfEra", (int) (byte) 8, 70);
        int int26 = fixedDateTimeZone24.getOffset((long) 35);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime8.toMutableDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone24.getName(1712715750996L, locale29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime27", (dateTime8.compareTo(mutableDateTime27) == 0) == dateTime8.equals(mutableDateTime27));
    }
}


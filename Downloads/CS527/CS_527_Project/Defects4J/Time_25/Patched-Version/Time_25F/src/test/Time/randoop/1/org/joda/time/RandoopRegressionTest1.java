package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTimeNoMillis();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology1.days();
        org.joda.time.Chronology chronology5 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = gregorianChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gregorianChronology1.getDateTimeMillis(1970, 2024, (int) (byte) 0, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        long long13 = zeroIsMaxDateTimeField9.roundHalfCeiling((long) (byte) 4);
        java.util.Locale locale15 = null;
        java.lang.String str16 = zeroIsMaxDateTimeField9.getAsShortText((long) 10, locale15);
        java.lang.String str17 = zeroIsMaxDateTimeField9.getName();
        java.lang.String str18 = zeroIsMaxDateTimeField9.toString();
        int int20 = zeroIsMaxDateTimeField9.getLeapAmount(8001L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "60" + "'", str16, "60");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "centuryOfEra" + "'", str17, "centuryOfEra");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateTimeField[centuryOfEra]" + "'", str18, "DateTimeField[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        int int6 = dateTimeZone1.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone1);
        int int9 = cachedDateTimeZone7.getOffset(0L);
        int int11 = cachedDateTimeZone7.getStandardOffset((long) 3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        java.lang.String str13 = unsupportedDurationField10.toString();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnsupportedDurationField[weekyears]" + "'", str13, "UnsupportedDurationField[weekyears]");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.monthOfYear();
        org.joda.time.DurationField durationField6 = gregorianChronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.secondOfMinute();
        boolean boolean9 = dateTimeField7.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str11 = dateTimeFieldType10.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField12 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField7, dateTimeFieldType10);
        long long14 = zeroIsMaxDateTimeField12.roundFloor((long) 100);
        long long16 = zeroIsMaxDateTimeField12.remainder((long) (byte) -1);
        java.util.Locale locale18 = null;
        java.lang.String str19 = zeroIsMaxDateTimeField12.getAsText((int) (byte) -1, locale18);
        boolean boolean20 = iSOChronology0.equals((java.lang.Object) str19);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 999L + "'", long16 == 999L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1" + "'", str19, "-1");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.SECONDS_TYPE;
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.dayOfMonth();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology3);
        boolean boolean7 = durationFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology3);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        int int16 = offsetDateTimeField8.getMaximumValue();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        int int6 = dateTimeZone1.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone1);
        java.lang.String str9 = cachedDateTimeZone7.getName((long) (byte) 22);
        int int11 = cachedDateTimeZone7.getOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = cachedDateTimeZone7.getUncachedZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("-00:00:00.001", 200);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("1969-12-31T15:59:59.999/1969-12-31T15:59:59.999", 20, (int) (byte) 6, 769, 'a', 57600999, 1, 1970, true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: a");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfYear();
        long long8 = gregorianChronology2.getDateTimeMillis((int) (byte) 1, 10, 10, (int) (byte) 5);
        java.lang.String str9 = gregorianChronology2.toString();
        org.joda.time.DurationField durationField10 = gregorianChronology2.hours();
        boolean boolean11 = durationFieldType1.isSupported((org.joda.time.Chronology) gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62111231999995L) + "'", long8 == (-62111231999995L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GregorianChronology[UTC]" + "'", str9, "GregorianChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gregorianChronology0.add(readablePeriod3, (long) (byte) 4, (int) ' ');
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.PeriodType periodType10 = org.joda.time.DateTimeUtils.getPeriodType(periodType9);
        org.joda.time.Period period11 = readableInterval8.toPeriod(periodType10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.DateTimeUtils.getPeriodType(periodType14);
        org.joda.time.Period period16 = readableInterval13.toPeriod(periodType15);
        org.joda.time.Period period17 = readableInterval8.toPeriod(periodType15);
        long long20 = gregorianChronology0.add((org.joda.time.ReadablePeriod) period17, (long) 19, 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Chronology chronology22 = gregorianChronology0.withZone(dateTimeZone21);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4L + "'", long6 == 4L);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 19L + "'", long20 == 19L);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        boolean boolean3 = readableInterval1.isBefore(readableInstant2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        boolean boolean6 = readableInterval1.isBefore(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusSeconds((int) (byte) 1);
        boolean boolean15 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = gregorianChronology16.weeks();
        org.joda.time.DurationField durationField18 = gregorianChronology16.weeks();
        boolean boolean19 = dateTime12.equals((java.lang.Object) gregorianChronology16);
        boolean boolean20 = readableInterval1.isBefore((org.joda.time.ReadableInstant) dateTime12);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (byte) 21, 26, (int) (byte) 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for  must be in the range [26,8]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        // The following exception was thrown during execution in test generation
        try {
            long long14 = offsetDateTimeField8.set(0L, "2024-04-09T19:26:44.843/2024-04-09T19:26:44.843");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2024-04-09T19:26:44.843/2024-04-09T19:26:44.843\" for era is not supported");
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
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime9 = dateTime8.toLocalTime();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        java.lang.String str5 = readableInterval1.toString();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31T16:00:54.000/1969-12-31T16:00:54.000" + "'", str5, "1969-12-31T16:00:54.000/1969-12-31T16:00:54.000");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        long long23 = zeroIsMaxDateTimeField9.add((long) 1969, 8);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9969L + "'", long23 == 9969L);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
        long long19 = zeroIsMaxDateTimeField9.set(0L, "7", locale18);
        org.joda.time.DurationField durationField20 = zeroIsMaxDateTimeField9.getLeapDurationField();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 7000L + "'", long19 == 7000L);
        org.junit.Assert.assertNull(durationField20);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology1.eras();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology13.centuryOfEra();
        int int19 = dateTime4.get(dateTimeField18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dateTime4.toString("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.hours();
        int int3 = durationField1.getValue((-99979L));
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 10L);
        long long4 = preciseDurationField2.getMillis((long) (short) 10);
        int int7 = preciseDurationField2.getValue((long) (byte) 4, (-6048000001L));
        org.joda.time.DurationFieldType durationFieldType8 = preciseDurationField2.getType();
        long long11 = preciseDurationField2.getValueAsLong((long) 1969, 1712716004371L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 196L + "'", long11 == 196L);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime10 = dateTime4.withTime(10, (int) (byte) 22, 1, 1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        boolean boolean18 = readableInterval15.isAfter(readableInterval16);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        boolean boolean23 = readableInterval20.isAfter(readableInterval21);
        boolean boolean24 = readableInterval15.contains(readableInterval21);
        org.joda.time.Duration duration25 = readableInterval15.toDuration();
        org.joda.time.DateTime dateTime26 = dateTime12.minus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateTime dateTime27 = dateTime4.minus((org.joda.time.ReadableDuration) duration25);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1969 + "'", int2 == 1969);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 54000L + "'", long5 == 54000L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertNotNull(readableInterval22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        long long16 = zeroIsMaxDateTimeField9.getDifferenceAsLong(0L, (long) (byte) 19);
        int int18 = zeroIsMaxDateTimeField9.getMaximumValue(1712716002000L);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        boolean boolean15 = readableInterval12.isAfter(readableInterval13);
        org.joda.time.Chronology chronology16 = readableInterval12.getChronology();
        org.joda.time.Interval interval17 = readableInterval12.toInterval();
        java.lang.String str18 = readableInterval12.toString();
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
        long long34 = zeroIsMaxDateTimeField28.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology35 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology35.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology35.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology35.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField43 = new org.joda.time.field.OffsetDateTimeField(dateTimeField38, dateTimeFieldType39, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException46 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType39, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField48 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField28, dateTimeFieldType39, (int) (byte) 19);
        long long51 = dividedDateTimeField48.addWrapField((-99994L), (int) (byte) 2);
        long long54 = dividedDateTimeField48.add(1L, (long) (byte) 14);
        org.joda.time.DurationField durationField55 = dividedDateTimeField48.getDurationField();
        boolean boolean56 = durationField55.isSupported();
        boolean boolean57 = readableInterval12.equals((java.lang.Object) durationField55);
        boolean boolean58 = readableInterval1.contains(readableInterval12);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology60 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField61 = dateTimeFieldType59.getField((org.joda.time.Chronology) gregorianChronology60);
        java.lang.String str62 = dateTimeFieldType59.toString();
        org.joda.time.IllegalFieldValueException illegalFieldValueException66 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType59, (java.lang.Number) 10L, (java.lang.Number) 100, (java.lang.Number) 1L);
        boolean boolean67 = readableInterval1.equals((java.lang.Object) dateTimeFieldType59);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(interval17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31T16:00:54.000/1969-12-31T16:00:54.000" + "'", str18, "1969-12-31T16:00:54.000/1969-12-31T16:00:54.000");
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-61994L) + "'", long51 == (-61994L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 266001L + "'", long54 == 266001L);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(gregorianChronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "yearOfCentury" + "'", str62, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) 100);
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumTextLength(locale7);
        org.joda.time.DateTime dateTime9 = property4.withMinimumValue();
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfSecond();
        org.joda.time.DateTime dateTime12 = property10.addToCopy(0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        long long6 = gregorianChronology0.getDateTimeMillis((int) (byte) 1, 10, 10, (int) (byte) 5);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62111231999995L) + "'", long6 == (-62111231999995L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
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
        int int82 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay37);
        java.util.Locale locale84 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = unsupportedDateTimeField12.getAsShortText((org.joda.time.ReadablePartial) timeOfDay37, (int) 'a', locale84);
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
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(gregorianChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "centuryOfEra" + "'", str47, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "centuryOfEra" + "'", str58, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 999L + "'", long63 == 999L);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "7" + "'", str67, "7");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 12 + "'", int78 == 12);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 8 + "'", int81 == 8);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        long long13 = zeroIsMaxDateTimeField9.roundHalfCeiling((long) (byte) 4);
        java.util.Locale locale15 = null;
        java.lang.String str16 = zeroIsMaxDateTimeField9.getAsShortText((long) 10, locale15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay21 = dateTime20.toTimeOfDay();
        int int22 = zeroIsMaxDateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay21);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "60" + "'", str16, "60");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
            long long12 = unsupportedDateTimeField9.roundCeiling((-86399001L));
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
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
            boolean boolean12 = unsupportedDateTimeField9.isLeap(0L);
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
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.lang.Object obj5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds((int) (byte) 1);
        boolean boolean12 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = gregorianChronology13.weeks();
        org.joda.time.DurationField durationField15 = gregorianChronology13.weeks();
        boolean boolean16 = dateTime9.equals((java.lang.Object) gregorianChronology13);
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str18 = iSOChronology17.toString();
        org.joda.time.Chronology chronology19 = iSOChronology17.withUTC();
        boolean boolean20 = gregorianChronology13.equals((java.lang.Object) chronology19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((int) (byte) 17, (-100), (int) (byte) 7, 769, 0, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[UTC]" + "'", str18, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
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
        java.util.Locale locale15 = null;
        java.lang.String str16 = zeroIsMaxDateTimeField9.getAsText((int) (byte) -1, locale15);
        long long19 = zeroIsMaxDateTimeField9.add(19L, 70000);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 70000019L + "'", long19 == 70000019L);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTime();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.monthOfYear();
        org.joda.time.DurationField durationField4 = gregorianChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.clockhourOfDay();
        org.joda.time.Chronology chronology7 = gregorianChronology1.withUTC();
        long long11 = gregorianChronology1.add((-99994L), (long) (byte) 5, 3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) gregorianChronology1);
        java.util.Locale locale13 = dateTimeFormatter12.getLocale();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-99979L) + "'", long11 == (-99979L));
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gregorianChronology1.add(readablePeriod4, 8000L, 0);
        org.joda.time.DurationField durationField8 = gregorianChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = gregorianChronology1.millis();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8000L + "'", long7 == 8000L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        long long5 = durationField3.getValueAsLong(2100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime1.withWeekyear(200);
        org.joda.time.DateTime dateTime6 = dateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.plusMinutes((int) (byte) 7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType9.getField((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology10.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime5.toMutableDateTime((org.joda.time.Chronology) gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
        long long15 = zeroIsMaxDateTimeField9.roundHalfFloor(1712716008010L);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1712716008000L + "'", long15 == 1712716008000L);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = gregorianChronology1.months();
        long long7 = durationField4.getDifferenceAsLong(518400000000L, (-3000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 197L + "'", long7 == 197L);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.HOURS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 1712716000046L);
        java.lang.String str3 = preciseDurationField2.toString();
        org.joda.time.DurationFieldType durationFieldType4 = preciseDurationField2.getType();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DurationField[hours]" + "'", str3, "DurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        long long16 = zeroIsMaxDateTimeField9.getDifferenceAsLong(0L, (long) (byte) 19);
        int int18 = zeroIsMaxDateTimeField9.getMaximumValue(1712716017280L);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = unsupportedDateTimeField9.getMinimumValue(readablePartial14);
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
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology9 = gregorianChronology0.withZone(dateTimeZone6);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.DateTimeUtils.getPeriodType(periodType12);
        org.joda.time.Period period14 = readableInterval11.toPeriod(periodType13);
        long long17 = gregorianChronology0.add((org.joda.time.ReadablePeriod) period14, (-61851226021989L), (int) 'a');
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61851226021989L) + "'", long17 == (-61851226021989L));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getShortName(locale1, "yearOfCentury", "100");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime1.withWeekyear(200);
        org.joda.time.DateTime dateTime8 = dateTime1.withDurationAdded(57599999L, (-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField((org.joda.time.Chronology) gregorianChronology10);
        org.joda.time.IllegalFieldValueException illegalFieldValueException14 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType9, (java.lang.Number) 9001L, "12");
        boolean boolean15 = dateTime1.isSupported(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.Period period10 = readableInterval7.toPeriod(periodType9);
        org.joda.time.DateTime dateTime11 = dateTime3.minus((org.joda.time.ReadablePeriod) period10);
        int int12 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime11.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 365 + "'", int5 == 365);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology6 = gregorianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
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
        long long22 = zeroIsMaxDateTimeField9.add((long) (short) 1, (int) ' ');
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
        org.joda.time.ReadablePartial readablePartial37 = null;
        java.util.Locale locale39 = null;
        java.lang.String str40 = zeroIsMaxDateTimeField32.getAsText(readablePartial37, (int) (byte) 7, locale39);
        int int41 = zeroIsMaxDateTimeField32.getMaximumValue();
        java.util.Locale locale43 = null;
        java.lang.String str44 = zeroIsMaxDateTimeField32.getAsText(12, locale43);
        long long47 = zeroIsMaxDateTimeField32.add(1L, (int) (byte) 9);
        java.lang.Object obj48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj48);
        org.joda.time.DateTime dateTime51 = dateTime49.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay52 = dateTime51.toTimeOfDay();
        int int53 = zeroIsMaxDateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay52);
        java.util.Locale locale54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = zeroIsMaxDateTimeField9.getAsText((org.joda.time.ReadablePartial) timeOfDay52, locale54);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62111231992995L) + "'", long19 == (-62111231992995L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32001L + "'", long22 == 32001L);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "7" + "'", str40, "7");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60 + "'", int41 == 60);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "12" + "'", str44, "12");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 9001L + "'", long47 == 9001L);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTimeNoMillis();
        java.io.Writer writer1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.LocalDate localDate5 = dateTimeFormatter2.parseLocalDate("12");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadablePartial) localDate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int10 = offsetDateTimeField8.getMaximumValue();
        long long12 = offsetDateTimeField8.roundHalfEven(25200022L);
        boolean boolean13 = offsetDateTimeField8.isSupported();
        int int15 = offsetDateTimeField8.getLeapAmount(1712716001910L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        long long23 = zeroIsMaxDateTimeField9.add(0L, 31536000000L);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 31536000000000L + "'", long23 == 31536000000000L);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTime();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.halfdayOfDay();
        org.joda.time.Chronology chronology4 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = gregorianChronology1.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone5);
        int int7 = dateTimeFormatter0.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeField7.getAsShortText(70000, locale9);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "70000" + "'", str10, "70000");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str2 = dateTimeFieldType1.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = gregorianChronology3.weeks();
        int int7 = durationField4.getValue((long) (short) 10, (long) 10);
        long long9 = durationField4.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField10 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType1, durationField4);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = unsupportedDateTimeField10.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.OffsetDateTimeField offsetDateTimeField13 = new org.joda.time.field.OffsetDateTimeField(dateTimeField0, dateTimeFieldType11, 70000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "centuryOfEra" + "'", str2, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.centuryOfEra();
        org.joda.time.DurationField durationField4 = gregorianChronology1.months();
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology5.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField13 = new org.joda.time.field.OffsetDateTimeField(dateTimeField8, dateTimeFieldType9, (int) (byte) 7, 3, 0);
        int int14 = offsetDateTimeField13.getMaximumValue();
        int int16 = offsetDateTimeField13.getMaximumValue((-99979L));
        int int19 = offsetDateTimeField13.getDifference(12L, (long) '4');
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay24 = dateTime23.toTimeOfDay();
        boolean boolean25 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay24);
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
        int int68 = offsetDateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay24, intArray64);
        long long70 = gregorianChronology1.set((org.joda.time.ReadablePartial) timeOfDay24, (long) 999);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8 + "'", int68 == 8);
// flaky:         org.junit.Assert.assertTrue("'" + long70 + "' != '" + 57654000L + "'", long70 == 57654000L);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        int int10 = dateTime6.getWeekyear();
        int int11 = dateTime6.getYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1969 + "'", int11 == 1969);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology5.getZone();
        int int12 = dateTimeZone10.getOffset((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
        long long16 = zeroIsMaxDateTimeField9.getDifferenceAsLong(0L, (long) (byte) 19);
        long long19 = zeroIsMaxDateTimeField9.addWrapField((long) (byte) 8, (int) (byte) 1);
        int int21 = zeroIsMaxDateTimeField9.getLeapAmount((long) (short) -1);
        long long23 = zeroIsMaxDateTimeField9.roundFloor(1712629604846L);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1008L + "'", long19 == 1008L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1712629604000L + "'", long23 == 1712629604000L);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DurationField durationField7 = gregorianChronology5.weeks();
        boolean boolean8 = gregorianChronology0.equals((java.lang.Object) durationField7);
        org.joda.time.DurationField durationField9 = gregorianChronology0.centuries();
        long long12 = durationField9.subtract(196L, 0L);
        long long15 = durationField9.getMillis(1012L, (-3000L));
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 196L + "'", long12 == 196L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3193563542400000L + "'", long15 == 3193563542400000L);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        int int28 = dateTime27.getYear();
        org.joda.time.ReadablePartial readablePartial29 = null;
        org.joda.time.DateTime dateTime30 = dateTime27.withFields(readablePartial29);
        int int31 = dateTime27.getMinuteOfHour();
        boolean boolean32 = dateTime24.isBefore((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1969 + "'", int28 == 1969);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = gregorianChronology4.weeks();
        org.joda.time.DurationField durationField6 = gregorianChronology4.halfdays();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology4.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology8.monthOfYear();
        org.joda.time.DurationField durationField11 = gregorianChronology8.hours();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology8.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean16 = dateTimeZone14.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology17 = gregorianChronology8.withZone(dateTimeZone14);
        boolean boolean18 = dateTimeZone14.isFixed();
        org.joda.time.Chronology chronology19 = gregorianChronology4.withZone(dateTimeZone14);
        org.joda.time.chrono.ZonedChronology zonedChronology20 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology1, dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField((org.joda.time.Chronology) gregorianChronology23);
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.dayOfMonth();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology23);
        int int27 = dateTime26.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime29 = dateTime26.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime31 = dateTime26.minusDays((int) (byte) 15);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean36 = dateTimeZone34.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone34.isLocalDateTimeGap(localDateTime37);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone34.getName(1712715987735L, locale40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone34);
        boolean boolean43 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime.Property property44 = dateTime42.millisOfDay();
        boolean boolean45 = zonedChronology20.equals((java.lang.Object) property44);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str2, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(zonedChronology20);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-00:00:00.001" + "'", str41, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime6.withYear(0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        org.joda.time.DurationField durationField9 = offsetDateTimeField8.getDurationField();
        org.joda.time.DurationField durationField10 = offsetDateTimeField8.getLeapDurationField();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNull(durationField10);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        long long48 = remainderDateTimeField44.remainder(0L);
        long long50 = remainderDateTimeField44.remainder(0L);
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
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int10 = offsetDateTimeField8.getMaximumValue();
        long long12 = offsetDateTimeField8.roundHalfEven(25200022L);
        long long14 = offsetDateTimeField8.remainder((-62135596800000L));
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 10L);
        long long4 = preciseDurationField2.getMillis((long) (short) 10);
        int int7 = preciseDurationField2.getValue((long) (byte) 4, (-6048000001L));
        java.lang.String str8 = preciseDurationField2.getName();
        long long10 = preciseDurationField2.getValueAsLong((long) 70);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millis" + "'", str8, "millis");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 7L + "'", long10 == 7L);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = dateTime3.minusDays(200);
        org.joda.time.ReadableInstant readableInstant9 = null;
        boolean boolean10 = dateTime8.isEqual(readableInstant9);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("GregorianChronology[UTC]", "");
        java.lang.Throwable[] throwableArray3 = illegalFieldValueException2.getSuppressed();
        java.lang.Number number4 = illegalFieldValueException2.getIllegalNumberValue();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNull(number4);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology3 = gregorianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.year();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.IllegalFieldValueException illegalFieldValueException15 = new org.joda.time.IllegalFieldValueException(durationFieldType13, "-00:00:00.001");
        java.lang.Number number16 = illegalFieldValueException15.getUpperBound();
        java.lang.Number number17 = illegalFieldValueException15.getLowerBound();
        illegalFieldValueException15.prependMessage("58");
        boolean boolean20 = dateTimeZone12.equals((java.lang.Object) "58");
        long long22 = dateTimeZone12.nextTransition((long) (short) 0);
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
        long long21 = zeroIsMaxDateTimeField9.add(0L, 518400000L);
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology22.monthOfYear();
        org.joda.time.DurationField durationField25 = gregorianChronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology22.centuryOfEra();
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay31 = dateTime30.toTimeOfDay();
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeField26.getAsShortText((org.joda.time.ReadablePartial) timeOfDay31, 99, locale33);
        java.util.Locale locale36 = null;
        java.lang.String str37 = zeroIsMaxDateTimeField9.getAsShortText((org.joda.time.ReadablePartial) timeOfDay31, (int) (byte) 14, locale36);
        boolean boolean39 = zeroIsMaxDateTimeField9.isLeap((long) (byte) 17);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 518400000000L + "'", long21 == 518400000000L);
        org.junit.Assert.assertNotNull(gregorianChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "99" + "'", str34, "99");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "14" + "'", str37, "14");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.Chronology chronology5 = readableInterval1.getChronology();
        org.joda.time.Interval interval6 = readableInterval1.toInterval();
        org.joda.time.MutableInterval mutableInterval7 = readableInterval1.toMutableInterval();
        long long8 = readableInterval1.getStartMillis();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(mutableInterval7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 54000L + "'", long8 == 54000L);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
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
        long long11 = readableInterval1.getEndMillis();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54000L + "'", long11 == 54000L);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        org.joda.time.Chronology chronology6 = gregorianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
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
        org.joda.time.ReadablePartial readablePartial22 = null;
        java.util.Locale locale24 = null;
        java.lang.String str25 = zeroIsMaxDateTimeField9.getAsShortText(readablePartial22, 769, locale24);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "769" + "'", str25, "769");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer2, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
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
        long long17 = zeroIsMaxDateTimeField9.roundCeiling(0L);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (long) 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        java.util.Locale locale26 = null;
        java.lang.String str27 = offsetDateTimeField8.getAsText((long) (short) 0, locale26);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = offsetDateTimeField8.add((long) (byte) 21, 70000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 71977 for era must be in the range [8,0]");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1977" + "'", str27, "1977");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property4.roundCeilingCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.minusSeconds(70004043);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean11 = dateTime9.isSupported(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology5.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        int int25 = dateTime24.getYear();
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.withFields(readablePartial26);
        long long28 = dateTime27.getMillis();
        org.joda.time.DateTime dateTime33 = dateTime27.withTime(10, (int) (byte) 22, 1, 1);
        org.joda.time.DateTime dateTime35 = dateTime27.withWeekyear(0);
        org.joda.time.DateTime dateTime37 = dateTime27.plusWeeks(12);
        boolean boolean38 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime21.withSecondOfMinute((int) (byte) 23);
        int int41 = dateTime40.getDayOfWeek();
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
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 54000L + "'", long28 == 54000L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 7 + "'", int41 == 7);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.secondOfMinute();
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = gregorianChronology7.hours();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology7.secondOfMinute();
        boolean boolean13 = dateTimeField11.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str15 = dateTimeFieldType14.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField16 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField11, dateTimeFieldType14);
        long long18 = zeroIsMaxDateTimeField16.roundFloor((long) 100);
        long long20 = zeroIsMaxDateTimeField16.remainder((long) (byte) -1);
        long long22 = zeroIsMaxDateTimeField16.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology23.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField31 = new org.joda.time.field.OffsetDateTimeField(dateTimeField26, dateTimeFieldType27, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException34 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType27, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField36 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField16, dateTimeFieldType27, (int) (byte) 19);
        long long39 = dividedDateTimeField36.addWrapField((-99994L), (int) (byte) 2);
        long long42 = dividedDateTimeField36.add(1L, (long) (byte) 14);
        org.joda.time.DurationField durationField43 = dividedDateTimeField36.getDurationField();
        long long45 = dividedDateTimeField36.remainder((-61851226021989L));
        org.joda.time.chrono.GregorianChronology gregorianChronology46 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology46.dayOfYear();
        org.joda.time.DateTimeField dateTimeField48 = gregorianChronology46.monthOfYear();
        org.joda.time.DurationField durationField49 = gregorianChronology46.hours();
        org.joda.time.DateTimeField dateTimeField50 = gregorianChronology46.secondOfMinute();
        boolean boolean52 = dateTimeField50.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str54 = dateTimeFieldType53.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField55 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField50, dateTimeFieldType53);
        long long57 = zeroIsMaxDateTimeField55.roundFloor((long) 100);
        long long59 = zeroIsMaxDateTimeField55.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial60 = null;
        java.util.Locale locale62 = null;
        java.lang.String str63 = zeroIsMaxDateTimeField55.getAsText(readablePartial60, (int) (byte) 7, locale62);
        int int64 = zeroIsMaxDateTimeField55.getMaximumValue();
        java.util.Locale locale66 = null;
        java.lang.String str67 = zeroIsMaxDateTimeField55.getAsText(12, locale66);
        long long70 = zeroIsMaxDateTimeField55.add(1L, (int) (byte) 9);
        java.lang.Object obj71 = null;
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime(obj71);
        org.joda.time.DateTime dateTime74 = dateTime72.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay75 = dateTime74.toTimeOfDay();
        int int76 = zeroIsMaxDateTimeField55.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay75);
        java.util.Locale locale78 = null;
        java.lang.String str79 = dividedDateTimeField36.getAsText((org.joda.time.ReadablePartial) timeOfDay75, (int) (short) 10, locale78);
        int[] intArray86 = new int[] { 48, 40, 20, (byte) 16, (byte) 9, 15 };
        // The following exception was thrown during execution in test generation
        try {
            gregorianChronology0.validate((org.joda.time.ReadablePartial) timeOfDay75, intArray86);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 999L + "'", long20 == 999L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-61994L) + "'", long39 == (-61994L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 266001L + "'", long42 == 266001L);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-61851226021989L) + "'", long45 == (-61851226021989L));
        org.junit.Assert.assertNotNull(gregorianChronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "centuryOfEra" + "'", str54, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 999L + "'", long59 == 999L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "7" + "'", str63, "7");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 60 + "'", int64 == 60);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "12" + "'", str67, "12");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 9001L + "'", long70 == 9001L);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(timeOfDay75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 60 + "'", int76 == 60);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "10" + "'", str79, "10");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[48, 40, 20, 16, 9, 15]");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime10 = dateTime4.withTime(10, (int) (byte) 22, 1, 1);
        int int11 = dateTime10.getMonthOfYear();
        int int12 = dateTime10.getCenturyOfEra();
        org.joda.time.DateTime dateTime13 = dateTime10.toDateTime();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 54000L + "'", long5 == 54000L);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.dayOfYear();
        org.joda.time.DurationField durationField6 = gregorianChronology0.halfdays();
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = gregorianChronology7.hours();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology7.secondOfMinute();
        boolean boolean13 = dateTimeField11.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str15 = dateTimeFieldType14.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField16 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField11, dateTimeFieldType14);
        long long18 = zeroIsMaxDateTimeField16.roundFloor((long) 100);
        long long20 = zeroIsMaxDateTimeField16.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial21 = null;
        java.util.Locale locale23 = null;
        java.lang.String str24 = zeroIsMaxDateTimeField16.getAsText(readablePartial21, (int) (byte) 7, locale23);
        int int25 = zeroIsMaxDateTimeField16.getMaximumValue();
        org.joda.time.DurationField durationField26 = zeroIsMaxDateTimeField16.getRangeDurationField();
        org.joda.time.DurationFieldType durationFieldType27 = durationField26.getType();
        org.joda.time.field.DecoratedDurationField decoratedDurationField28 = new org.joda.time.field.DecoratedDurationField(durationField6, durationFieldType27);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "centuryOfEra" + "'", str15, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 999L + "'", long20 == 999L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "7" + "'", str24, "7");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationFieldType27);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        int int10 = dateTime6.getWeekyear();
        int int11 = dateTime6.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1969 + "'", int11 == 1969);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 10);
        boolean boolean7 = dateTime3.isAfter((long) 256000);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = gregorianChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        java.lang.String str5 = property4.getName();
        org.joda.time.DateTime dateTime7 = property4.addWrapFieldToCopy((int) 'a');
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "yearOfCentury" + "'", str5, "yearOfCentury");
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        long long11 = gregorianChronology5.getDateTimeMillis((int) (byte) 1, 10, 10, (int) (byte) 5);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology5.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(70, (int) (byte) 0, 100, 99, 18981, (org.joda.time.Chronology) gregorianChronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-62111231999995L) + "'", long11 == (-62111231999995L));
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = dateTime3.minusDays(200);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.toDateTime(chronology9);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime8.toGregorianCalendar();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) (short) 0, 200);
        org.joda.time.DateTime dateTime15 = dateTime8.toDateTimeISO();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology1.days();
        org.joda.time.Chronology chronology5 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = gregorianChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.secondOfMinute();
        long long11 = dateTimeField9.roundHalfFloor(54000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54000L + "'", long11 == 54000L);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = nameProvider0.getName(locale1, "UnsupportedDateTimeField", "70000");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
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
            long long29 = dividedDateTimeField24.roundFloor((long) (byte) 10);
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
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        boolean boolean11 = unsupportedDateTimeField9.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = unsupportedDateTimeField9.remainder(1712715991341L);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        int int11 = dateTime6.getYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1969 + "'", int11 == 1969);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 10L);
        long long4 = preciseDurationField2.getMillis((long) (short) 10);
        int int7 = preciseDurationField2.getValue((long) (byte) 4, (-6048000001L));
        org.joda.time.DurationFieldType durationFieldType8 = preciseDurationField2.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = preciseDurationField2.getValue(1712715979970999L, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 171271597997099");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = nameProvider0.getName(locale1, "1969365T155959-0800", "ISOChronology[America/Los_Angeles]");
        java.util.Locale locale5 = null;
        java.lang.String str8 = nameProvider0.getShortName(locale5, "DateTimeField[centuryOfEra]", "");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology45.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.monthOfYear();
        org.joda.time.DurationField durationField48 = gregorianChronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology45.centuryOfEra();
        java.lang.Object obj50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(obj50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay54 = dateTime53.toTimeOfDay();
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeField49.getAsShortText((org.joda.time.ReadablePartial) timeOfDay54, 99, locale56);
        java.util.Locale locale59 = null;
        java.lang.String str60 = remainderDateTimeField44.getAsText((org.joda.time.ReadablePartial) timeOfDay54, 26, locale59);
        int int62 = remainderDateTimeField44.get(12L);
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
        org.junit.Assert.assertNotNull(gregorianChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "99" + "'", str57, "99");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "26" + "'", str60, "26");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.joda.time.DateTimeUtils.OffsetMillisProvider offsetMillisProvider1 = new org.joda.time.DateTimeUtils.OffsetMillisProvider(1712715992000L);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = unsupportedDateTimeField9.getType();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = unsupportedDateTimeField9.getAsText(9969L, locale12);
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
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime1.withTime(57600999, (-1), (int) '4', 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57600999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
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
        int int25 = offsetDateTimeField8.getOffset();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = gregorianChronology4.weeks();
        org.joda.time.DurationField durationField6 = gregorianChronology4.halfdays();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology4.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology8.monthOfYear();
        org.joda.time.DurationField durationField11 = gregorianChronology8.hours();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology8.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean16 = dateTimeZone14.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology17 = gregorianChronology8.withZone(dateTimeZone14);
        boolean boolean18 = dateTimeZone14.isFixed();
        org.joda.time.Chronology chronology19 = gregorianChronology4.withZone(dateTimeZone14);
        org.joda.time.chrono.ZonedChronology zonedChronology20 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology1, dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = zonedChronology20.getDateTimeMillis(0, 54, 48, (int) (byte) 18, (int) '#', (int) (byte) 17, 57599);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57599 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[UTC]" + "'", str2, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(zonedChronology20);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology19 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology19.monthOfYear();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType18.getField((org.joda.time.Chronology) gregorianChronology19);
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology19.minuteOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology26.monthOfYear();
        org.joda.time.DurationField durationField29 = gregorianChronology26.hours();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology26.secondOfMinute();
        boolean boolean32 = dateTimeField30.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str34 = dateTimeFieldType33.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField35 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField30, dateTimeFieldType33);
        long long37 = zeroIsMaxDateTimeField35.roundFloor((long) 100);
        long long39 = zeroIsMaxDateTimeField35.remainder((long) (byte) -1);
        long long41 = zeroIsMaxDateTimeField35.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology42 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology42.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology42.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology42.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField50 = new org.joda.time.field.OffsetDateTimeField(dateTimeField45, dateTimeFieldType46, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException53 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType46, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField55 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField35, dateTimeFieldType46, (int) (byte) 19);
        long long58 = dividedDateTimeField55.addWrapField((-99994L), (int) (byte) 2);
        long long61 = dividedDateTimeField55.add(1L, (long) (byte) 14);
        org.joda.time.ReadablePartial readablePartial62 = null;
        int int63 = dividedDateTimeField55.getMinimumValue(readablePartial62);
        int int64 = dividedDateTimeField55.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.IllegalFieldValueException illegalFieldValueException69 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType65, (java.lang.Number) (byte) 11, (java.lang.Number) (short) 0, (java.lang.Number) (short) 100);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField70 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField55, dateTimeFieldType65);
        org.joda.time.chrono.GregorianChronology gregorianChronology71 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField72 = gregorianChronology71.dayOfYear();
        org.joda.time.DateTimeField dateTimeField73 = gregorianChronology71.monthOfYear();
        org.joda.time.DurationField durationField74 = gregorianChronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField75 = gregorianChronology71.centuryOfEra();
        java.lang.Object obj76 = null;
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime(obj76);
        org.joda.time.DateTime dateTime79 = dateTime77.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay80 = dateTime79.toTimeOfDay();
        java.util.Locale locale82 = null;
        java.lang.String str83 = dateTimeField75.getAsShortText((org.joda.time.ReadablePartial) timeOfDay80, 99, locale82);
        java.util.Locale locale85 = null;
        java.lang.String str86 = remainderDateTimeField70.getAsText((org.joda.time.ReadablePartial) timeOfDay80, 26, locale85);
        long long88 = gregorianChronology19.set((org.joda.time.ReadablePartial) timeOfDay80, 70003391L);
        java.util.Locale locale89 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str90 = zeroIsMaxDateTimeField9.getAsShortText((org.joda.time.ReadablePartial) timeOfDay80, locale89);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "60" + "'", str11, "60");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(gregorianChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "centuryOfEra" + "'", str34, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 999L + "'", long39 == 999L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-61994L) + "'", long58 == (-61994L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 266001L + "'", long61 == 266001L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertNotNull(gregorianChronology71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(durationField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(timeOfDay80);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "99" + "'", str83, "99");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "26" + "'", str86, "26");
// flaky:         org.junit.Assert.assertTrue("'" + long88 + "' != '" + 54000L + "'", long88 == 54000L);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        int int6 = dateTimeZone1.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone1);
        int int9 = cachedDateTimeZone7.getStandardOffset(0L);
        long long11 = cachedDateTimeZone7.nextTransition(97L);
        boolean boolean12 = cachedDateTimeZone7.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
        org.joda.time.DateTime dateTime15 = dateTime13.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight16 = dateTime15.toDateMidnight();
        org.joda.time.DateTime dateTime18 = dateTime15.minusDays((int) (byte) 1);
        boolean boolean19 = dateTime18.isEqualNow();
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        boolean boolean22 = dateTime18.isEqual((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime21.getDayOfWeek();
        int int24 = dateTime21.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay25 = dateTime21.toTimeOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology26.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology26.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField((org.joda.time.Chronology) gregorianChronology31);
        org.joda.time.DurationField durationField33 = gregorianChronology31.weeks();
        boolean boolean34 = gregorianChronology26.equals((java.lang.Object) durationField33);
        org.joda.time.chrono.GregorianChronology gregorianChronology35 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology35.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology35.monthOfYear();
        org.joda.time.DurationField durationField38 = gregorianChronology35.hours();
        org.joda.time.DateTimeField dateTimeField39 = gregorianChronology35.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology35.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean44 = dateTimeZone42.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone42.isLocalDateTimeGap(localDateTime45);
        java.lang.String str47 = dateTimeZone42.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology49 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone42, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.ReadableInterval readableInterval51 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval50);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.PeriodType periodType53 = org.joda.time.DateTimeUtils.getPeriodType(periodType52);
        org.joda.time.Period period54 = readableInterval51.toPeriod(periodType53);
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.ReadableInterval readableInterval56 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval55);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.PeriodType periodType58 = org.joda.time.DateTimeUtils.getPeriodType(periodType57);
        org.joda.time.Period period59 = readableInterval56.toPeriod(periodType58);
        org.joda.time.Period period60 = readableInterval51.toPeriod(periodType58);
        int[] intArray63 = gregorianChronology49.get((org.joda.time.ReadablePeriod) period60, (long) 100, (-202387856L));
        int[] intArray65 = gregorianChronology35.get((org.joda.time.ReadablePeriod) period60, (long) 4);
        int[] intArray68 = gregorianChronology26.get((org.joda.time.ReadablePeriod) period60, 1712715991341L, 70005000L);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = unsupportedDateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay25, intArray68);
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
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(gregorianChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(gregorianChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-00:00:00.001" + "'", str47, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology49);
        org.junit.Assert.assertNotNull(readableInterval51);
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(readableInterval56);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0, 0, -2, -8, -13, -7, -956]");
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[0, 0, 0, 0, 0, 0, 0, 4]");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[-54, -3, -1, -1, -6, -59, -46, -341]");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
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
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
        boolean boolean13 = dateTimeZone6.isFixed();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone6);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        long long7 = durationField4.add(0L, (int) (byte) 18);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 47174400000L + "'", long7 == 47174400000L);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = unsupportedDateTimeField9.getAsText((long) (byte) 22, locale12);
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
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.secondOfDay();
        org.joda.time.Chronology chronology7 = gregorianChronology1.withUTC();
        java.lang.String str8 = gregorianChronology1.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GregorianChronology[UTC]" + "'", str8, "GregorianChronology[UTC]");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        boolean boolean3 = readableInterval1.isBefore(readableInstant2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        boolean boolean6 = readableInterval1.isBefore(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.year();
        boolean boolean9 = dateTimeField8.isSupported();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 10L);
        long long4 = preciseDurationField2.getMillis((long) (short) 10);
        long long6 = preciseDurationField2.getValueAsLong(7L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        int int11 = dateTime10.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.dayOfMonth();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology14);
        int int18 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime20 = dateTime17.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime22 = dateTime17.minusDays((int) (byte) 15);
        int int23 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property24 = dateTime17.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType25.getField((org.joda.time.Chronology) gregorianChronology26);
        org.joda.time.DurationField durationField28 = gregorianChronology26.weeks();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = gregorianChronology26.add(readablePeriod29, 8000L, 0);
        org.joda.time.DurationField durationField33 = gregorianChronology26.days();
        boolean boolean34 = dateTime17.equals((java.lang.Object) gregorianChronology26);
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology26.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 8000L + "'", long32 == 8000L);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        long long12 = unsupportedDateTimeField9.getDifferenceAsLong((long) 69, (long) 1969);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = unsupportedDateTimeField9.roundHalfEven((long) 70000);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localDateOptionalTimeParser();
        java.lang.Integer int1 = dateTimeFormatter0.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) '#', locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withZone(dateTimeZone3);
        java.lang.String str8 = dateTimeZone3.toString();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.yearOfEra();
        int int5 = gregorianChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField6 = gregorianChronology0.centuries();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str1 = iSOChronology0.toString();
        org.joda.time.DurationField durationField2 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ISOChronology[UTC]" + "'", str1, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology5.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, 10000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTime dateTime7 = dateTime5.plusWeeks((int) (byte) 14);
        java.lang.Object obj8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) (byte) 1);
        boolean boolean15 = dateTime14.isEqualNow();
        java.lang.Object obj16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj16);
        boolean boolean18 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime17);
        int int19 = dateTime17.getYearOfEra();
        boolean boolean20 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("hi!");
        java.lang.String str2 = jodaTimePermission1.getActions();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField((org.joda.time.Chronology) gregorianChronology4);
        java.lang.String str6 = dateTimeFieldType3.toString();
        org.joda.time.IllegalFieldValueException illegalFieldValueException10 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType3, (java.lang.Number) 10L, (java.lang.Number) 100, (java.lang.Number) 1L);
        jodaTimePermission1.checkGuard((java.lang.Object) 10L);
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight16 = dateTime15.toDateMidnight();
        org.joda.time.DateTime dateTime18 = dateTime15.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime.Property property22 = dateTime18.dayOfWeek();
        boolean boolean23 = jodaTimePermission1.equals((java.lang.Object) property22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "yearOfCentury" + "'", str6, "yearOfCentury");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        java.lang.Integer int2 = dateTimeFormatter0.getPivotYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unsupportedDateTimeField9.getMinimumValue(readablePartial12);
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
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        java.lang.String str5 = property4.getName();
        int int6 = property4.getMinimumValue();
        org.joda.time.DurationField durationField7 = property4.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "yearOfCentury" + "'", str5, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(durationField7);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
        org.joda.time.ReadablePartial readablePartial64 = null;
        int int65 = offsetDateTimeField8.getMaximumValue(readablePartial64);
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
        long long48 = remainderDateTimeField44.remainder(0L);
        int int49 = remainderDateTimeField44.getMaximumValue();
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
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 18 + "'", int49 == 18);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 2);
        long long7 = dateTimeZone1.convertLocalToUTC((long) (byte) 11, false, 0L);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.year();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        int int10 = dateTime6.getWeekyear();
        org.joda.time.DateTime.Property property11 = dateTime6.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property11.getFieldType();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        byte byte0 = org.joda.time.DateTimeFieldType.SECOND_OF_DAY;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 20 + "'", byte0 == (byte) 20);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        org.joda.time.Chronology chronology6 = gregorianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeField7.add((-3000L), (-62111231992995L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -62111231992995");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime1.withWeekyear(200);
        org.joda.time.DateTime dateTime8 = dateTime1.withDurationAdded(57599999L, (-1));
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusSeconds((int) (byte) 1);
        boolean boolean16 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = gregorianChronology17.weeks();
        org.joda.time.DurationField durationField19 = gregorianChronology17.weeks();
        boolean boolean20 = dateTime13.equals((java.lang.Object) gregorianChronology17);
        int int21 = dateTime13.getYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean25 = dateTimeZone23.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone23.isLocalDateTimeGap(localDateTime26);
        java.lang.String str28 = dateTimeZone23.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology30 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone23, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.PeriodType periodType34 = org.joda.time.DateTimeUtils.getPeriodType(periodType33);
        org.joda.time.Period period35 = readableInterval32.toPeriod(periodType34);
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.ReadableInterval readableInterval37 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval36);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.PeriodType periodType39 = org.joda.time.DateTimeUtils.getPeriodType(periodType38);
        org.joda.time.Period period40 = readableInterval37.toPeriod(periodType39);
        org.joda.time.Period period41 = readableInterval32.toPeriod(periodType39);
        int[] intArray44 = gregorianChronology30.get((org.joda.time.ReadablePeriod) period41, (long) 100, (-202387856L));
        org.joda.time.DateTime dateTime46 = dateTime13.withPeriodAdded((org.joda.time.ReadablePeriod) period41, (int) (short) 1);
        org.joda.time.DateTime dateTime47 = dateTime8.plus((org.joda.time.ReadablePeriod) period41);
        org.joda.time.chrono.GregorianChronology gregorianChronology48 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology48.dayOfYear();
        org.joda.time.DateTimeField dateTimeField50 = gregorianChronology48.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField51 = gregorianChronology48.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField56 = new org.joda.time.field.OffsetDateTimeField(dateTimeField51, dateTimeFieldType52, (int) (byte) 7, 3, 0);
        int int57 = dateTime47.get(dateTimeFieldType52);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-00:00:00.001" + "'", str28, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology30);
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(readableInterval37);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 0, -2, -8, -13, -7, -956]");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(gregorianChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology5.getZone();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getName((long) (-1), locale12);
        java.lang.String str15 = dateTimeZone10.getShortName((long) (byte) 8);
        int int17 = dateTimeZone10.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        int int12 = offsetDateTimeField8.getMaximumValue();
        int int13 = offsetDateTimeField8.getOffset();
        int int14 = offsetDateTimeField8.getOffset();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime.Property property10 = dateTime6.dayOfWeek();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property10.getAsText(locale11);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Wednesday" + "'", str12, "Wednesday");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
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
            long long15 = unsupportedDateTimeField9.roundHalfEven(0L);
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
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.monthOfYear();
        org.joda.time.DurationField durationField24 = gregorianChronology21.hours();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology21.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = gregorianChronology21.add(readablePeriod26, (long) (byte) 4, 0);
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology21.hourOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology31.monthOfYear();
        org.joda.time.DurationField durationField34 = gregorianChronology31.hours();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology31.secondOfMinute();
        boolean boolean37 = dateTimeField35.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str39 = dateTimeFieldType38.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField40 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField35, dateTimeFieldType38);
        long long42 = zeroIsMaxDateTimeField40.roundFloor((long) 100);
        long long45 = zeroIsMaxDateTimeField40.getDifferenceAsLong((long) (byte) 9, (long) (byte) 4);
        org.joda.time.ReadablePartial readablePartial46 = null;
        java.util.Locale locale48 = null;
        java.lang.String str49 = zeroIsMaxDateTimeField40.getAsText(readablePartial46, (int) (short) -1, locale48);
        long long51 = zeroIsMaxDateTimeField40.roundFloor((long) 0);
        java.lang.Object obj52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj52);
        org.joda.time.DateTime dateTime55 = dateTime53.plusSeconds((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = dateTime55.toLocalDateTime();
        int int57 = zeroIsMaxDateTimeField40.getMaximumValue((org.joda.time.ReadablePartial) localDateTime56);
        int[] intArray59 = gregorianChronology21.get((org.joda.time.ReadablePartial) localDateTime56, (long) 40);
        org.joda.time.chrono.GregorianChronology gregorianChronology61 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField62 = gregorianChronology61.dayOfYear();
        org.joda.time.DateTimeField dateTimeField63 = gregorianChronology61.monthOfYear();
        org.joda.time.DurationField durationField64 = gregorianChronology61.hours();
        org.joda.time.DateTimeField dateTimeField65 = gregorianChronology61.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField66 = gregorianChronology61.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean70 = dateTimeZone68.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime71 = null;
        boolean boolean72 = dateTimeZone68.isLocalDateTimeGap(localDateTime71);
        java.lang.String str73 = dateTimeZone68.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology75 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone68, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval76 = null;
        org.joda.time.ReadableInterval readableInterval77 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval76);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.PeriodType periodType79 = org.joda.time.DateTimeUtils.getPeriodType(periodType78);
        org.joda.time.Period period80 = readableInterval77.toPeriod(periodType79);
        org.joda.time.ReadableInterval readableInterval81 = null;
        org.joda.time.ReadableInterval readableInterval82 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval81);
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.PeriodType periodType84 = org.joda.time.DateTimeUtils.getPeriodType(periodType83);
        org.joda.time.Period period85 = readableInterval82.toPeriod(periodType84);
        org.joda.time.Period period86 = readableInterval77.toPeriod(periodType84);
        int[] intArray89 = gregorianChronology75.get((org.joda.time.ReadablePeriod) period86, (long) 100, (-202387856L));
        int[] intArray91 = gregorianChronology61.get((org.joda.time.ReadablePeriod) period86, (long) 4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray93 = zeroIsMaxDateTimeField9.addWrapField((org.joda.time.ReadablePartial) localDateTime56, (int) (byte) 23, intArray91, 70004043);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1712715992000L + "'", long17 == 1712715992000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97005L + "'", long20 == 97005L);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 4L + "'", long29 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(gregorianChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "centuryOfEra" + "'", str39, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-1" + "'", str49, "-1");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 60 + "'", int57 == 60);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[1970, 1, 1, 40]");
        org.junit.Assert.assertNotNull(gregorianChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "-00:00:00.001" + "'", str73, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology75);
        org.junit.Assert.assertNotNull(readableInterval77);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(readableInterval82);
        org.junit.Assert.assertNotNull(periodType84);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[0, 0, 0, -2, -8, -13, -7, -956]");
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[0, 0, 0, 0, 0, 0, 0, 4]");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(57600999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int10 = offsetDateTimeField8.getMaximumValue();
        long long12 = offsetDateTimeField8.roundHalfEven(25200022L);
        boolean boolean13 = offsetDateTimeField8.isSupported();
        int int15 = offsetDateTimeField8.getMaximumValue((long) 5);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.joda.time.DateTimeUtils.FixedMillisProvider fixedMillisProvider1 = new org.joda.time.DateTimeUtils.FixedMillisProvider(25200022L);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        int int6 = dateTimeZone1.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone1);
        java.lang.String str9 = dateTimeZone1.getNameKey(100L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
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
        long long13 = zeroIsMaxDateTimeField9.roundHalfCeiling((long) (byte) 4);
        java.util.Locale locale15 = null;
        java.lang.String str16 = zeroIsMaxDateTimeField9.getAsShortText((long) 10, locale15);
        java.lang.String str17 = zeroIsMaxDateTimeField9.getName();
        java.lang.String str18 = zeroIsMaxDateTimeField9.toString();
        long long20 = zeroIsMaxDateTimeField9.roundHalfCeiling((long) 57599);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "60" + "'", str16, "60");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "centuryOfEra" + "'", str17, "centuryOfEra");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateTimeField[centuryOfEra]" + "'", str18, "DateTimeField[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 58000L + "'", long20 == 58000L);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
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
        java.security.PermissionCollection permissionCollection23 = jodaTimePermission1.newPermissionCollection();
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
        org.junit.Assert.assertNotNull(permissionCollection23);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("Tuesday");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology6.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = gregorianChronology6.months();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology6.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((int) (byte) 100, 70001, 0, (int) (byte) 18, 2, (int) (short) -1, (org.joda.time.Chronology) gregorianChronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        java.lang.Object obj2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTimeISO();
        boolean boolean9 = readableInterval1.equals((java.lang.Object) dateTime7);
        java.lang.String str10 = readableInterval1.toString();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T00:00:53.999/1970-01-01T00:00:53.999" + "'", str10, "1970-01-01T00:00:53.999/1970-01-01T00:00:53.999");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName((long) '#', locale8);
        int int11 = dateTimeZone6.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone12 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone6);
        java.lang.String str14 = cachedDateTimeZone12.getNameKey((-99994L));
        boolean boolean15 = cachedDateTimeZone12.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(0, 2, (int) (byte) 18, 9, 2024, (org.joda.time.DateTimeZone) cachedDateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = gregorianChronology0.hours();
        org.joda.time.DurationField durationField6 = gregorianChronology0.days();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.halfdays();
        org.joda.time.DurationField durationField3 = gregorianChronology0.months();
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str5 = iSOChronology4.toString();
        org.joda.time.DurationField durationField6 = iSOChronology4.centuries();
        org.joda.time.DurationFieldType durationFieldType7 = durationField6.getType();
        org.joda.time.field.DecoratedDurationField decoratedDurationField8 = new org.joda.time.field.DecoratedDurationField(durationField3, durationFieldType7);
        long long11 = decoratedDurationField8.getValueAsLong(1712715979970999L, 589001L);
        long long12 = decoratedDurationField8.getUnitMillis();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(iSOChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 651285L + "'", long11 == 651285L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2629746000L + "'", long12 == 2629746000L);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology1.days();
        org.joda.time.Chronology chronology5 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = gregorianChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gregorianChronology1.getDateTimeMillis(1712716000046L, 99, (int) (byte) 18, 60, 70001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider2 = new org.joda.time.tz.ZoneInfoProvider("-00:00:00.001", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"-00:00:00.001/ZoneInfoMap\" ClassLoader: system");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.weekOfWeekyear();
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
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTime();
        java.lang.String str2 = dateTimeFormatter0.print((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970W014T000000.009-0000" + "'", str2, "1970W014T000000.009-0000");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        int int6 = dateTimeZone1.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone1);
        java.lang.String str9 = dateTimeZone1.getShortName(1470021L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = iSOChronology1.getDateTimeMillis(1712716002000L, (int) (byte) 6, 60, 999, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateParser();
        org.joda.time.MutableDateTime mutableDateTime3 = dateTimeFormatter1.parseMutableDateTime("-1");
        int int6 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "", (int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser9);
        int int11 = dateTimePrinter7.estimatePrintedLength();
        int int12 = dateTimePrinter7.estimatePrintedLength();
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-11) + "'", int6 == (-11));
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "clockhourOfHalfday" + "'", str1, "clockhourOfHalfday");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        java.lang.String str6 = dateTime4.toString("-00:00:00.001");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean10 = dateTimeZone8.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone8.isLocalDateTimeGap(localDateTime11);
        java.lang.String str13 = dateTimeZone8.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.DateTimeUtils.getPeriodType(periodType18);
        org.joda.time.Period period20 = readableInterval17.toPeriod(periodType19);
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.DateTimeUtils.getPeriodType(periodType23);
        org.joda.time.Period period25 = readableInterval22.toPeriod(periodType24);
        org.joda.time.Period period26 = readableInterval17.toPeriod(periodType24);
        int[] intArray29 = gregorianChronology15.get((org.joda.time.ReadablePeriod) period26, (long) 100, (-202387856L));
        org.joda.time.DateTime dateTime30 = dateTime4.plus((org.joda.time.ReadablePeriod) period26);
        int int31 = dateTime30.getYearOfEra();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(readableInterval22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, -2, -8, -13, -7, -956]");
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        boolean boolean7 = dateTimeZone2.isStandardOffset((long) (short) -1);
        org.joda.time.Chronology chronology8 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getShortName((long) '#', locale12);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.monthOfYear();
        org.joda.time.DurationField durationField17 = gregorianChronology14.hours();
        boolean boolean18 = dateTimeZone10.equals((java.lang.Object) gregorianChronology14);
        org.joda.time.DateTimeZone dateTimeZone19 = gregorianChronology14.getZone();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getName((long) (-1), locale21);
        java.lang.String str24 = dateTimeZone19.getShortName((long) (byte) 8);
        org.joda.time.Chronology chronology25 = iSOChronology0.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology26 = iSOChronology0.withUTC();
        org.joda.time.Chronology chronology27 = iSOChronology0.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 17);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName(1L, locale8);
        java.lang.String str11 = dateTimeZone6.getName((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) (byte) 18, 2, 70001, 2024, (int) (byte) 4, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.017" + "'", str9, "+00:00:00.017");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.017" + "'", str11, "+00:00:00.017");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("69");
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = gregorianChronology3.weeks();
        org.joda.time.DurationField durationField5 = gregorianChronology3.halfdays();
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology3.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = gregorianChronology7.hours();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology7.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean15 = dateTimeZone13.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology16 = gregorianChronology7.withZone(dateTimeZone13);
        boolean boolean17 = dateTimeZone13.isFixed();
        org.joda.time.Chronology chronology18 = gregorianChronology3.withZone(dateTimeZone13);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) 4016L, dateTimeZone13);
        org.joda.time.DateTime dateTime21 = dateTime19.minus(4016L);
        boolean boolean22 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("hi!");
        java.lang.String str2 = jodaTimePermission1.getActions();
        java.lang.String str3 = jodaTimePermission1.toString();
        java.lang.String str4 = jodaTimePermission1.getActions();
        boolean boolean6 = jodaTimePermission1.equals((java.lang.Object) (-1712716007L));
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = gregorianChronology7.hours();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology7.halfdayOfDay();
        boolean boolean12 = jodaTimePermission1.equals((java.lang.Object) dateTimeField11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(\"org.joda.time.JodaTimePermission\" \"hi!\")" + "'", str3, "(\"org.joda.time.JodaTimePermission\" \"hi!\")");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.secondOfDay();
        org.joda.time.Chronology chronology7 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.HOURS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 1712716000046L);
        java.lang.String str3 = preciseDurationField2.toString();
        long long4 = preciseDurationField2.getUnitMillis();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DurationField[hours]" + "'", str3, "DurationField[hours]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1712716000046L + "'", long4 == 1712716000046L);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = unsupportedDateTimeField9.getType();
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
        long long24 = zeroIsMaxDateTimeField20.roundHalfCeiling((long) (byte) 4);
        java.util.Locale locale26 = null;
        java.lang.String str27 = zeroIsMaxDateTimeField20.getAsShortText((long) 10, locale26);
        java.lang.String str28 = zeroIsMaxDateTimeField20.getName();
        java.lang.Object obj29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay33 = dateTime32.toTimeOfDay();
        int[] intArray34 = new int[] {};
        int int35 = zeroIsMaxDateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay33, intArray34);
        org.joda.time.chrono.GregorianChronology gregorianChronology36 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology36.dayOfYear();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology36.monthOfYear();
        org.joda.time.DurationField durationField39 = gregorianChronology36.hours();
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology36.secondOfMinute();
        boolean boolean42 = dateTimeField40.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str44 = dateTimeFieldType43.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField45 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField40, dateTimeFieldType43);
        long long47 = zeroIsMaxDateTimeField45.roundFloor((long) 100);
        long long49 = zeroIsMaxDateTimeField45.roundHalfCeiling((long) (byte) 4);
        java.util.Locale locale51 = null;
        java.lang.String str52 = zeroIsMaxDateTimeField45.getAsShortText((long) 10, locale51);
        java.lang.String str53 = zeroIsMaxDateTimeField45.getName();
        java.lang.Object obj54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(obj54);
        org.joda.time.DateTime dateTime57 = dateTime55.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay58 = dateTime57.toTimeOfDay();
        int[] intArray59 = new int[] {};
        int int60 = zeroIsMaxDateTimeField45.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay58, intArray59);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology62 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType61.getField((org.joda.time.Chronology) gregorianChronology62);
        org.joda.time.DurationField durationField64 = gregorianChronology62.weeks();
        java.lang.Object obj65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(obj65);
        org.joda.time.DateTime dateTime68 = dateTime66.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property69 = dateTime68.yearOfCentury();
        int int70 = dateTime68.getDayOfYear();
        org.joda.time.ReadableInterval readableInterval71 = null;
        org.joda.time.ReadableInterval readableInterval72 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval71);
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.PeriodType periodType74 = org.joda.time.DateTimeUtils.getPeriodType(periodType73);
        org.joda.time.Period period75 = readableInterval72.toPeriod(periodType74);
        org.joda.time.DateTime dateTime76 = dateTime68.minus((org.joda.time.ReadablePeriod) period75);
        int[] intArray79 = gregorianChronology62.get((org.joda.time.ReadablePeriod) period75, 1712715992000L, (long) 99);
        int int80 = zeroIsMaxDateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay58, intArray79);
        java.util.Locale locale82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = unsupportedDateTimeField9.getAsText((org.joda.time.ReadablePartial) timeOfDay58, 0, locale82);
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
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "centuryOfEra" + "'", str19, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "60" + "'", str27, "60");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "centuryOfEra" + "'", str28, "centuryOfEra");
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertNotNull(gregorianChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "centuryOfEra" + "'", str44, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "60" + "'", str52, "60");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "centuryOfEra" + "'", str53, "centuryOfEra");
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 60 + "'", int60 == 60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(gregorianChronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(property69);
// flaky:         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(readableInterval72);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-54, -3, -1, -2, -2, -26, -31, -901]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 60 + "'", int80 == 60);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology6 = gregorianChronology0.withUTC();
        long long10 = gregorianChronology0.add((-99994L), (long) (byte) 5, 3);
        org.joda.time.DateTimeZone dateTimeZone11 = gregorianChronology0.getZone();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-99979L) + "'", long10 == (-99979L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        java.lang.String str3 = dateTimeFieldType0.toString();
        java.lang.String str4 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yearOfCentury" + "'", str3, "yearOfCentury");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yearOfCentury" + "'", str4, "yearOfCentury");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gregorianChronology1.add(readablePeriod4, 8000L, 0);
        org.joda.time.DurationField durationField8 = gregorianChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.weekOfWeekyear();
        int int10 = gregorianChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8000L + "'", long7 == 8000L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.monthOfYear();
        int int4 = dateTimeField3.getMinimumValue();
        org.junit.Assert.assertNotNull(iSOChronology1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[-00:00:00.001]" + "'", str2, "ISOChronology[-00:00:00.001]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DurationField durationField7 = gregorianChronology5.weeks();
        boolean boolean8 = gregorianChronology0.equals((java.lang.Object) durationField7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology9.monthOfYear();
        org.joda.time.DurationField durationField12 = gregorianChronology9.hours();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology9.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone16.isLocalDateTimeGap(localDateTime19);
        java.lang.String str21 = dateTimeZone16.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone16, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.PeriodType periodType27 = org.joda.time.DateTimeUtils.getPeriodType(periodType26);
        org.joda.time.Period period28 = readableInterval25.toPeriod(periodType27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.PeriodType periodType32 = org.joda.time.DateTimeUtils.getPeriodType(periodType31);
        org.joda.time.Period period33 = readableInterval30.toPeriod(periodType32);
        org.joda.time.Period period34 = readableInterval25.toPeriod(periodType32);
        int[] intArray37 = gregorianChronology23.get((org.joda.time.ReadablePeriod) period34, (long) 100, (-202387856L));
        int[] intArray39 = gregorianChronology9.get((org.joda.time.ReadablePeriod) period34, (long) 4);
        int[] intArray42 = gregorianChronology0.get((org.joda.time.ReadablePeriod) period34, 1712715991341L, 70005000L);
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-00:00:00.001" + "'", str21, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, 0, -2, -8, -13, -7, -956]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, 0, 0, 0, 0, 0, 4]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-54, -3, -1, -1, -6, -59, -46, -341]");
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
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
        org.joda.time.DateTime.Property property12 = dateTime4.monthOfYear();
        org.joda.time.DateTime dateTime13 = dateTime4.toDateTime();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 97005L, "DateTimeField[weekyear]");
        java.lang.String str4 = illegalFieldValueException3.getIllegalStringValue();
        java.lang.String str5 = illegalFieldValueException3.getIllegalStringValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.Chronology chronology5 = readableInterval1.getChronology();
        org.joda.time.Interval interval6 = readableInterval1.toInterval();
        org.joda.time.MutableInterval mutableInterval7 = readableInterval1.toMutableInterval();
        java.lang.String str8 = mutableInterval7.toString();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(mutableInterval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01T00:00:53.999/1970-01-01T00:00:53.999" + "'", str8, "1970-01-01T00:00:53.999/1970-01-01T00:00:53.999");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone6.isLocalDateTimeGap(localDateTime9);
        java.lang.String str12 = dateTimeZone6.getName((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((int) 'a', 90142947, 769, 70000, 0, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        int int10 = dateTime9.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 57230 + "'", int10 == 57230);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        boolean boolean11 = unsupportedDateTimeField9.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = unsupportedDateTimeField9.roundHalfCeiling(4L);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gregorianChronology1.add(readablePeriod4, 8000L, 0);
        org.joda.time.DurationField durationField8 = gregorianChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8000L + "'", long7 == 8000L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        int int6 = durationField3.getValue((long) (byte) 5, 0L);
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DurationField durationField12 = property11.getRangeDurationField();
        int int13 = durationField3.compareTo(durationField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) 21, (int) (byte) 0, (int) (byte) -1, (int) (byte) 5, 2024);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime10 = dateTime4.withTime(10, (int) (byte) 22, 1, 1);
        org.joda.time.DateTime dateTime12 = dateTime4.withWeekyear(0);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime16.weekyear();
        org.joda.time.DateTime dateTime21 = dateTime16.plus((long) (byte) 15);
        boolean boolean22 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime4.getYearOfEra();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 54000L + "'", long5 == 54000L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("hi!");
        java.lang.Object obj2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTimeISO();
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds((int) (byte) 1);
        int int13 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime15 = dateTime10.minusYears(54);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear((int) ' ');
        jodaTimePermission1.checkGuard((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(69996, 769);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53826924 + "'", int2 == 53826924);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
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
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean14 = dateTimeZone12.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology15 = iSOChronology7.withZone(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = dateTime3.minusDays(200);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.toDateTime(chronology9);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime8.toGregorianCalendar();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) (short) 0, 200);
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfDay();
        org.joda.time.DurationField durationField16 = property15.getRangeDurationField();
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        int int19 = dateTime18.getYear();
        org.joda.time.ReadablePartial readablePartial20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.withFields(readablePartial20);
        int int22 = dateTime18.getMinuteOfHour();
        int int23 = property15.getDifference((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-287999) + "'", int23 == (-287999));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
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
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight19 = dateTime18.toDateMidnight();
        org.joda.time.DateTime dateTime21 = dateTime18.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime21.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTimeISO();
        org.joda.time.DateTime.Property property26 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime28 = property26.addWrapFieldToCopy((int) ' ');
        org.joda.time.Chronology chronology29 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime.Property property30 = dateTime5.dayOfMonth();
        java.lang.String str31 = property30.getAsText();
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
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1" + "'", str31, "1");
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("GregorianChronology[UTC]", "");
        java.lang.Throwable[] throwableArray3 = illegalFieldValueException2.getSuppressed();
        java.lang.String str4 = illegalFieldValueException2.getFieldName();
        illegalFieldValueException2.prependMessage("");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = illegalFieldValueException2.getDateTimeFieldType();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GregorianChronology[UTC]" + "'", str4, "GregorianChronology[UTC]");
        org.junit.Assert.assertNull(dateTimeFieldType7);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
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
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        int int25 = dateTime24.getYear();
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.withFields(readablePartial26);
        long long28 = dateTime27.getMillis();
        org.joda.time.DateTime dateTime33 = dateTime27.withTime(10, (int) (byte) 22, 1, 1);
        org.joda.time.DateTime dateTime35 = dateTime27.withWeekyear(0);
        org.joda.time.DateTime dateTime37 = dateTime27.plusWeeks(12);
        boolean boolean38 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.ReadableInterval readableInterval42 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval41);
        boolean boolean43 = readableInterval40.isAfter(readableInterval41);
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        boolean boolean48 = readableInterval45.isAfter(readableInterval46);
        boolean boolean49 = readableInterval40.contains(readableInterval46);
        java.lang.Object obj50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(obj50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight54 = dateTime53.toDateMidnight();
        org.joda.time.DateTime dateTime56 = dateTime53.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime58 = dateTime53.minusDays(200);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.toDateTime(chronology59);
        boolean boolean61 = readableInterval40.isAfter((org.joda.time.ReadableInstant) dateTime60);
        java.lang.Object obj62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(obj62);
        int int64 = dateTime63.getYear();
        org.joda.time.ReadablePartial readablePartial65 = null;
        org.joda.time.DateTime dateTime66 = dateTime63.withFields(readablePartial65);
        long long67 = dateTime66.getMillis();
        org.joda.time.DateTime dateTime72 = dateTime66.withTime(10, (int) (byte) 22, 1, 1);
        org.joda.time.DateTime dateTime74 = dateTime66.withWeekyear(0);
        org.joda.time.DateTime dateTime76 = dateTime66.plusWeeks(12);
        boolean boolean77 = dateTime60.isAfter((org.joda.time.ReadableInstant) dateTime76);
        int int78 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime76);
        java.util.GregorianCalendar gregorianCalendar79 = dateTime21.toGregorianCalendar();
        org.joda.time.DateTime dateTime81 = dateTime21.minusDays(70);
        org.joda.time.DateTime dateTime83 = dateTime21.withMillisOfSecond(70);
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
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 54000L + "'", long28 == 54000L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertNotNull(readableInterval42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1970 + "'", int64 == 1970);
        org.junit.Assert.assertNotNull(dateTime66);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 54000L + "'", long67 == 54000L);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(gregorianCalendar79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime83);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime1.withWeekyear(200);
        org.joda.time.DateTime dateTime6 = dateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.plusMinutes((int) (byte) 7);
        org.joda.time.DateTime dateTime10 = dateTime5.withEra(0);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMonths(60);
        org.joda.time.DateTime dateTime13 = dateTime10.toDateTime();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.weekyear();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
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
        java.lang.String str13 = unsupportedDurationField10.toString();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnsupportedDurationField[weekyears]" + "'", str13, "UnsupportedDurationField[weekyears]");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException11 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType4, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        java.lang.Throwable[] throwableArray12 = illegalFieldValueException11.getSuppressed();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfYear();
        long long8 = gregorianChronology2.getDateTimeMillis((int) (byte) 1, 10, 10, (int) (byte) 5);
        java.lang.String str9 = gregorianChronology2.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62111231999995L) + "'", long8 == (-62111231999995L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GregorianChronology[UTC]" + "'", str9, "GregorianChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
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
        long long48 = remainderDateTimeField44.remainder(0L);
        long long50 = remainderDateTimeField44.roundHalfFloor(1712716010216L);
        java.util.Locale locale52 = null;
        java.lang.String str53 = remainderDateTimeField44.getAsShortText(25200022L, locale52);
        org.joda.time.ReadablePartial readablePartial54 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean58 = dateTimeZone56.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime59 = null;
        boolean boolean60 = dateTimeZone56.isLocalDateTimeGap(localDateTime59);
        java.lang.String str61 = dateTimeZone56.getID();
        org.joda.time.chrono.GregorianChronology gregorianChronology63 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone56, (int) (short) 1);
        org.joda.time.ReadableInterval readableInterval64 = null;
        org.joda.time.ReadableInterval readableInterval65 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval64);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.PeriodType periodType67 = org.joda.time.DateTimeUtils.getPeriodType(periodType66);
        org.joda.time.Period period68 = readableInterval65.toPeriod(periodType67);
        org.joda.time.ReadableInterval readableInterval69 = null;
        org.joda.time.ReadableInterval readableInterval70 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval69);
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.PeriodType periodType72 = org.joda.time.DateTimeUtils.getPeriodType(periodType71);
        org.joda.time.Period period73 = readableInterval70.toPeriod(periodType72);
        org.joda.time.Period period74 = readableInterval65.toPeriod(periodType72);
        int[] intArray77 = gregorianChronology63.get((org.joda.time.ReadablePeriod) period74, (long) 100, (-202387856L));
        int int78 = remainderDateTimeField44.getMinimumValue(readablePartial54, intArray77);
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
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1712716010000L + "'", long50 == 1712716010000L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "3" + "'", str53, "3");
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-00:00:00.001" + "'", str61, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology63);
        org.junit.Assert.assertNotNull(readableInterval65);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(readableInterval70);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 0, -2, -8, -13, -7, -956]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTimeNoMillis();
        java.lang.Appendable appendable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, 1712715987735L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.DateTime dateTime4 = dateTime1.minusMonths((int) (byte) 1);
        int int5 = dateTime4.getMillisOfDay();
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime();
        int int7 = dateTime4.getMillisOfDay();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53999 + "'", int5 == 53999);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53999 + "'", int7 == 53999);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField((org.joda.time.Chronology) gregorianChronology12);
        org.joda.time.DurationField durationField14 = gregorianChronology12.weeks();
        java.lang.Object obj15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        int int20 = dateTime18.getDayOfYear();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.DateTimeUtils.getPeriodType(periodType23);
        org.joda.time.Period period25 = readableInterval22.toPeriod(periodType24);
        org.joda.time.DateTime dateTime26 = dateTime18.minus((org.joda.time.ReadablePeriod) period25);
        int[] intArray29 = gregorianChronology12.get((org.joda.time.ReadablePeriod) period25, 1712715992000L, (long) 99);
        org.joda.time.DateTime dateTime30 = dateTime5.minus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTime dateTime32 = dateTime5.plusMinutes((int) (byte) 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(readableInterval22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-54, -3, -1, -2, -2, -26, -31, -901]");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology45.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.monthOfYear();
        org.joda.time.DurationField durationField48 = gregorianChronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology45.centuryOfEra();
        java.lang.Object obj50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(obj50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay54 = dateTime53.toTimeOfDay();
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeField49.getAsShortText((org.joda.time.ReadablePartial) timeOfDay54, 99, locale56);
        java.util.Locale locale59 = null;
        java.lang.String str60 = remainderDateTimeField44.getAsText((org.joda.time.ReadablePartial) timeOfDay54, 26, locale59);
        long long62 = remainderDateTimeField44.roundFloor(97005L);
        int int64 = remainderDateTimeField44.get(1712716007070L);
        long long67 = remainderDateTimeField44.addWrapField((long) 1969, 2000);
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
        org.junit.Assert.assertNotNull(gregorianChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "99" + "'", str57, "99");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "26" + "'", str60, "26");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 97000L + "'", long62 == 97000L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 9 + "'", int64 == 9);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 6969L + "'", long67 == 6969L);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.halfdays();
        org.joda.time.DurationField durationField3 = gregorianChronology0.months();
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str5 = iSOChronology4.toString();
        org.joda.time.DurationField durationField6 = iSOChronology4.centuries();
        org.joda.time.DurationFieldType durationFieldType7 = durationField6.getType();
        org.joda.time.field.DecoratedDurationField decoratedDurationField8 = new org.joda.time.field.DecoratedDurationField(durationField3, durationFieldType7);
        long long11 = decoratedDurationField8.add(54000L, (long) 57600999);
        long long14 = decoratedDurationField8.getValueAsLong((-9L), (long) 69);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(iSOChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 151475996678454000L + "'", long11 == 151475996678454000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) 8);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime12);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.centuryOfEra();
        java.lang.Object obj10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay14 = dateTime13.toTimeOfDay();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeField9.getAsShortText((org.joda.time.ReadablePartial) timeOfDay14, 99, locale16);
        boolean boolean18 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay14);
        int[] intArray21 = new int[] { 17, (byte) 3 };
        // The following exception was thrown during execution in test generation
        try {
            gregorianChronology0.validate((org.joda.time.ReadablePartial) timeOfDay14, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "99" + "'", str17, "99");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[17, 3]");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
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
        int int13 = property12.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        long long6 = durationField3.subtract(151475996678454000L, (int) (short) 1);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 151475996674854000L + "'", long6 == 151475996674854000L);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(18981);
        int int9 = dateTimeZone7.getOffsetFromLocal(1008L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((int) (short) 1, (int) (byte) 8, 999, 32, 53826924, (int) (short) 100, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 18981 + "'", int9 == 18981);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("60");
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
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
        java.lang.String str46 = remainderDateTimeField44.getAsText((long) (byte) 10);
        int int47 = remainderDateTimeField44.getDivisor();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "3" + "'", str46, "3");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 19 + "'", int47 == 19);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) 100);
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumTextLength(locale7);
        org.joda.time.DateTime dateTime9 = property4.withMinimumValue();
        org.joda.time.DateTime.Property property10 = dateTime9.millisOfSecond();
        org.joda.time.DateTime dateTime12 = property10.setCopy((int) (byte) 17);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology13.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField21 = new org.joda.time.field.OffsetDateTimeField(dateTimeField16, dateTimeFieldType17, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException24 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType17, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        java.lang.Number number25 = illegalFieldValueException24.getLowerBound();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = illegalFieldValueException24.getDateTimeFieldType();
        org.joda.time.DateTime.Property property27 = dateTime12.property(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNull(number25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.years();
        long long6 = gregorianChronology0.add((long) (byte) 6, (long) (byte) 3, 1969);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5913L + "'", long6 == 5913L);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology1.days();
        org.joda.time.Chronology chronology5 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology1.weekyearOfCentury();
        org.joda.time.Chronology chronology7 = gregorianChronology1.withUTC();
        org.joda.time.DurationField durationField8 = gregorianChronology1.months();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 70004043, (long) (byte) 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 140008086 + "'", int2 == 140008086);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
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
        long long21 = zeroIsMaxDateTimeField9.add(0L, 518400000L);
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology22.monthOfYear();
        org.joda.time.DurationField durationField25 = gregorianChronology22.hours();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology22.secondOfMinute();
        boolean boolean28 = dateTimeField26.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str30 = dateTimeFieldType29.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField31 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField26, dateTimeFieldType29);
        long long33 = zeroIsMaxDateTimeField31.roundFloor((long) 100);
        long long35 = zeroIsMaxDateTimeField31.roundHalfCeiling((long) (byte) 4);
        java.util.Locale locale37 = null;
        java.lang.String str38 = zeroIsMaxDateTimeField31.getAsShortText((long) 10, locale37);
        java.lang.String str39 = zeroIsMaxDateTimeField31.getName();
        java.lang.Object obj40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj40);
        org.joda.time.DateTime dateTime43 = dateTime41.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay44 = dateTime43.toTimeOfDay();
        int[] intArray45 = new int[] {};
        int int46 = zeroIsMaxDateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay44, intArray45);
        org.joda.time.chrono.GregorianChronology gregorianChronology48 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology48.dayOfYear();
        org.joda.time.DateTimeField dateTimeField50 = gregorianChronology48.monthOfYear();
        org.joda.time.DurationField durationField51 = gregorianChronology48.hours();
        org.joda.time.DateTimeField dateTimeField52 = gregorianChronology48.secondOfMinute();
        boolean boolean54 = dateTimeField52.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str56 = dateTimeFieldType55.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField57 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField52, dateTimeFieldType55);
        long long59 = zeroIsMaxDateTimeField57.roundFloor((long) 100);
        long long61 = zeroIsMaxDateTimeField57.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial62 = null;
        java.util.Locale locale64 = null;
        java.lang.String str65 = zeroIsMaxDateTimeField57.getAsText(readablePartial62, (int) (byte) 7, locale64);
        int int66 = zeroIsMaxDateTimeField57.getMinimumValue();
        int int69 = zeroIsMaxDateTimeField57.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial70 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology71 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField72 = gregorianChronology71.dayOfYear();
        org.joda.time.DateTimeField dateTimeField73 = gregorianChronology71.monthOfYear();
        org.joda.time.ReadablePartial readablePartial74 = null;
        int[] intArray75 = new int[] {};
        int int76 = dateTimeField73.getMaximumValue(readablePartial74, intArray75);
        int int77 = zeroIsMaxDateTimeField57.getMinimumValue(readablePartial70, intArray75);
        java.util.Locale locale79 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray80 = zeroIsMaxDateTimeField9.set((org.joda.time.ReadablePartial) timeOfDay44, 17, intArray75, "1969365T155959-0800", locale79);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969365T155959-0800\" for centuryOfEra is not supported");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 518400000000L + "'", long21 == 518400000000L);
        org.junit.Assert.assertNotNull(gregorianChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "centuryOfEra" + "'", str30, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "60" + "'", str38, "60");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "centuryOfEra" + "'", str39, "centuryOfEra");
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60 + "'", int46 == 60);
        org.junit.Assert.assertNotNull(gregorianChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "centuryOfEra" + "'", str56, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 999L + "'", long61 == 999L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "7" + "'", str65, "7");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 12 + "'", int76 == 12);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField((org.joda.time.Chronology) gregorianChronology12);
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType9.getField((org.joda.time.Chronology) gregorianChronology12);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeField15.getAsShortText(57230, locale17);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(gregorianChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "57230" + "'", str18, "57230");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = gregorianChronology4.weeks();
        org.joda.time.DurationField durationField6 = gregorianChronology4.halfdays();
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology4.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology8.monthOfYear();
        org.joda.time.DurationField durationField11 = gregorianChronology8.hours();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology8.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean16 = dateTimeZone14.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology17 = gregorianChronology8.withZone(dateTimeZone14);
        boolean boolean18 = dateTimeZone14.isFixed();
        org.joda.time.Chronology chronology19 = gregorianChronology4.withZone(dateTimeZone14);
        org.joda.time.chrono.ZonedChronology zonedChronology20 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology1, dateTimeZone14);
        java.lang.String str21 = zonedChronology20.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[-00:00:00.001]" + "'", str2, "ISOChronology[-00:00:00.001]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(zonedChronology20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ZonedChronology[ISOChronology[UTC], -00:00:00.001]" + "'", str21, "ZonedChronology[ISOChronology[UTC], -00:00:00.001]");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        org.joda.time.Chronology chronology6 = gregorianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        long long11 = offsetDateTimeField8.roundHalfCeiling((long) (byte) 10);
        int int13 = offsetDateTimeField8.getLeapAmount(1712629604846L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = gregorianChronology0.weeks();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(57230);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
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
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable12, 1470021L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.017" + "'", str11, "00:00:00.017");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.monthOfYear();
        org.joda.time.DurationField durationField24 = gregorianChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology21.centuryOfEra();
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay30 = dateTime29.toTimeOfDay();
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) timeOfDay30, 99, locale32);
        boolean boolean34 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay30);
        java.util.Locale locale36 = null;
        java.lang.String str37 = zeroIsMaxDateTimeField9.getAsShortText((org.joda.time.ReadablePartial) timeOfDay30, 32, locale36);
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
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "99" + "'", str33, "99");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "32" + "'", str37, "32");
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) '#', locale13);
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology15.monthOfYear();
        org.joda.time.DurationField durationField18 = gregorianChronology15.hours();
        boolean boolean19 = dateTimeZone11.equals((java.lang.Object) gregorianChronology15);
        java.lang.String str21 = dateTimeZone11.getNameKey((-1L));
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 1712716003015L);
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1712716003015L + "'", long23 == 1712716003015L);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(iSOChronology25);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        int int6 = dateTimeZone1.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone1);
        java.lang.String str9 = cachedDateTimeZone7.getNameKey((-99994L));
        boolean boolean10 = cachedDateTimeZone7.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) cachedDateTimeZone7);
        long long13 = cachedDateTimeZone7.nextTransition((-99994L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-99994L) + "'", long13 == (-99994L));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        boolean boolean7 = dateTimeZone2.isStandardOffset((long) (short) -1);
        org.joda.time.Chronology chronology8 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField9 = iSOChronology0.weeks();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        java.lang.Object obj2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime7.withHourOfDay((int) (byte) 5);
        boolean boolean11 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime7);
        int int12 = dateTime1.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.Period period10 = readableInterval7.toPeriod(periodType9);
        org.joda.time.DateTime dateTime11 = dateTime3.minus((org.joda.time.ReadablePeriod) period10);
        int int12 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime11.era();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusSeconds((int) (byte) 1);
        boolean boolean21 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = gregorianChronology22.weeks();
        org.joda.time.DurationField durationField24 = gregorianChronology22.weeks();
        boolean boolean25 = dateTime18.equals((java.lang.Object) gregorianChronology22);
        int int26 = dateTime18.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(gregorianChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 53 + "'", int26 == 53);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property4.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = property4.roundHalfFloorCopy();
        int int9 = property4.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str1 = iSOChronology0.toString();
        org.joda.time.DurationField durationField2 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ISOChronology[UTC]" + "'", str1, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
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
            long long14 = unsupportedDateTimeField9.set(1L, "2024-04-09T19:26:43.898/2024-04-09T19:26:43.898");
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
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) (byte) -1);
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime1.withWeekyear(200);
        org.joda.time.DateTime dateTime6 = dateTime5.toDateTime();
        java.lang.String str7 = dateTime5.toString();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        boolean boolean12 = readableInterval9.isAfter(readableInterval10);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        boolean boolean17 = readableInterval14.isAfter(readableInterval15);
        boolean boolean18 = readableInterval9.contains(readableInterval15);
        org.joda.time.Duration duration19 = readableInterval9.toDuration();
        org.joda.time.DateTime dateTime21 = dateTime5.withDurationAdded((org.joda.time.ReadableDuration) duration19, 3);
        org.joda.time.DateTime dateTime23 = dateTime5.withWeekyear(19);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0200-01-02T00:00:53.999-00:00:00.001" + "'", str7, "0200-01-02T00:00:53.999-00:00:00.001");
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.monthOfYear();
        org.joda.time.DurationField durationField24 = gregorianChronology21.hours();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology21.secondOfMinute();
        boolean boolean27 = dateTimeField25.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str29 = dateTimeFieldType28.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField30 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField25, dateTimeFieldType28);
        long long32 = zeroIsMaxDateTimeField30.roundFloor((long) 100);
        long long35 = zeroIsMaxDateTimeField30.getDifferenceAsLong((long) (byte) 9, (long) (byte) 4);
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale38 = null;
        java.lang.String str39 = zeroIsMaxDateTimeField30.getAsText(readablePartial36, (int) (short) -1, locale38);
        long long41 = zeroIsMaxDateTimeField30.roundFloor((long) 0);
        java.lang.Object obj42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusSeconds((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = dateTime45.toLocalDateTime();
        int int47 = zeroIsMaxDateTimeField30.getMaximumValue((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.chrono.GregorianChronology gregorianChronology49 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField50 = gregorianChronology49.dayOfYear();
        org.joda.time.DateTimeField dateTimeField51 = gregorianChronology49.monthOfYear();
        org.joda.time.DurationField durationField52 = gregorianChronology49.hours();
        org.joda.time.DateTimeField dateTimeField53 = gregorianChronology49.secondOfMinute();
        boolean boolean55 = dateTimeField53.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str57 = dateTimeFieldType56.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField58 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField53, dateTimeFieldType56);
        long long60 = zeroIsMaxDateTimeField58.roundFloor((long) 100);
        long long62 = zeroIsMaxDateTimeField58.remainder((long) (byte) -1);
        long long64 = zeroIsMaxDateTimeField58.roundHalfEven((long) (byte) 2);
        org.joda.time.ReadablePartial readablePartial65 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology66 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField67 = gregorianChronology66.dayOfYear();
        org.joda.time.DateTimeField dateTimeField68 = gregorianChronology66.monthOfYear();
        org.joda.time.DurationField durationField69 = gregorianChronology66.hours();
        org.joda.time.DateTimeField dateTimeField70 = gregorianChronology66.secondOfMinute();
        boolean boolean72 = dateTimeField70.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str74 = dateTimeFieldType73.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField75 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField70, dateTimeFieldType73);
        long long77 = zeroIsMaxDateTimeField75.roundFloor((long) 100);
        long long79 = zeroIsMaxDateTimeField75.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial80 = null;
        java.util.Locale locale82 = null;
        java.lang.String str83 = zeroIsMaxDateTimeField75.getAsText(readablePartial80, (int) (byte) 7, locale82);
        int int84 = zeroIsMaxDateTimeField75.getMinimumValue();
        int int87 = zeroIsMaxDateTimeField75.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial88 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology89 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField90 = gregorianChronology89.dayOfYear();
        org.joda.time.DateTimeField dateTimeField91 = gregorianChronology89.monthOfYear();
        org.joda.time.ReadablePartial readablePartial92 = null;
        int[] intArray93 = new int[] {};
        int int94 = dateTimeField91.getMaximumValue(readablePartial92, intArray93);
        int int95 = zeroIsMaxDateTimeField75.getMinimumValue(readablePartial88, intArray93);
        int int96 = zeroIsMaxDateTimeField58.getMinimumValue(readablePartial65, intArray93);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray98 = zeroIsMaxDateTimeField9.addWrapField((org.joda.time.ReadablePartial) localDateTime46, (int) (byte) 16, intArray93, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "centuryOfEra" + "'", str29, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-1" + "'", str39, "-1");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
        org.junit.Assert.assertNotNull(gregorianChronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "centuryOfEra" + "'", str57, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 999L + "'", long62 == 999L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "centuryOfEra" + "'", str74, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 999L + "'", long79 == 999L);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "7" + "'", str83, "7");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology89);
        org.junit.Assert.assertNotNull(dateTimeField90);
        org.junit.Assert.assertNotNull(dateTimeField91);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 12 + "'", int94 == 12);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
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
        java.util.Locale locale40 = null;
        int int41 = dividedDateTimeField29.getMaximumTextLength(locale40);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
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
        int int29 = zeroIsMaxDateTimeField20.getMaximumValue();
        java.util.Locale locale31 = null;
        java.lang.String str32 = zeroIsMaxDateTimeField20.getAsText(12, locale31);
        long long35 = zeroIsMaxDateTimeField20.add(1L, (int) (byte) 9);
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay40 = dateTime39.toTimeOfDay();
        int int41 = zeroIsMaxDateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay40);
        java.util.Locale locale43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = unsupportedDateTimeField9.getAsShortText((org.joda.time.ReadablePartial) timeOfDay40, 0, locale43);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 60 + "'", int29 == 60);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "12" + "'", str32, "12");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9001L + "'", long35 == 9001L);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60 + "'", int41 == 60);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        int int5 = dateTime3.getDayOfYear();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.DateTimeUtils.getPeriodType(periodType8);
        org.joda.time.Period period10 = readableInterval7.toPeriod(periodType9);
        org.joda.time.DateTime dateTime11 = dateTime3.minus((org.joda.time.ReadablePeriod) period10);
        int int12 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime11.era();
        java.lang.Object obj14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj14);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.ReadableInterval readableInterval18 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval17);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        boolean boolean21 = readableInterval18.isAfter(readableInterval19);
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.ReadableInterval readableInterval23 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval22);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        boolean boolean26 = readableInterval23.isAfter(readableInterval24);
        boolean boolean27 = readableInterval18.contains(readableInterval24);
        org.joda.time.Duration duration28 = readableInterval18.toDuration();
        org.joda.time.DateTime dateTime29 = dateTime15.minus((org.joda.time.ReadableDuration) duration28);
        int int30 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(readableInterval18);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(readableInterval23);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
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
        boolean boolean28 = dateTime24.isBefore((long) 26);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 54999 + "'", int26 == 54999);
// flaky:         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
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
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology0.year();
        long long13 = dateTimeField11.roundFloor((long) 26);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.weeks();
        java.lang.String str3 = durationField2.toString();
        long long5 = durationField2.getMillis((long) 1969);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DurationField[weeks]" + "'", str3, "DurationField[weeks]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1190851200000L + "'", long5 == 1190851200000L);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        int int11 = dateTime10.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.dayOfMonth();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology14);
        int int18 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime20 = dateTime17.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime22 = dateTime17.minusDays((int) (byte) 15);
        int int23 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime17);
        int int24 = dateTime17.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDate();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTime();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.halfdayOfDay();
        org.joda.time.Chronology chronology4 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = gregorianChronology1.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter6.parseDateTime("2024-04-09T19:26:37.031/2024-04-09T19:26:37.031");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2024-04-09T19:26:37.031/2024-04-...\"");
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
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        long long13 = offsetDateTimeField8.roundFloor(1470021L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        boolean boolean7 = dateTime6.isEqualNow();
        org.joda.time.LocalTime localTime8 = dateTime6.toLocalTime();
        org.joda.time.Instant instant9 = dateTime6.toInstant();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime5.withCenturyOfEra((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for centuryOfEra must be in the range [1,2922790]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
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
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        int int25 = dateTime24.getYear();
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.withFields(readablePartial26);
        long long28 = dateTime27.getMillis();
        org.joda.time.DateTime dateTime33 = dateTime27.withTime(10, (int) (byte) 22, 1, 1);
        org.joda.time.DateTime dateTime35 = dateTime27.withWeekyear(0);
        org.joda.time.DateTime dateTime37 = dateTime27.plusWeeks(12);
        boolean boolean38 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.ReadableInterval readableInterval42 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval41);
        boolean boolean43 = readableInterval40.isAfter(readableInterval41);
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        boolean boolean48 = readableInterval45.isAfter(readableInterval46);
        boolean boolean49 = readableInterval40.contains(readableInterval46);
        java.lang.Object obj50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(obj50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight54 = dateTime53.toDateMidnight();
        org.joda.time.DateTime dateTime56 = dateTime53.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime58 = dateTime53.minusDays(200);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.toDateTime(chronology59);
        boolean boolean61 = readableInterval40.isAfter((org.joda.time.ReadableInstant) dateTime60);
        java.lang.Object obj62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(obj62);
        int int64 = dateTime63.getYear();
        org.joda.time.ReadablePartial readablePartial65 = null;
        org.joda.time.DateTime dateTime66 = dateTime63.withFields(readablePartial65);
        long long67 = dateTime66.getMillis();
        org.joda.time.DateTime dateTime72 = dateTime66.withTime(10, (int) (byte) 22, 1, 1);
        org.joda.time.DateTime dateTime74 = dateTime66.withWeekyear(0);
        org.joda.time.DateTime dateTime76 = dateTime66.plusWeeks(12);
        boolean boolean77 = dateTime60.isAfter((org.joda.time.ReadableInstant) dateTime76);
        int int78 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.DateTime dateTime80 = dateTime76.plusSeconds((int) (byte) 14);
        java.lang.Object obj81 = null;
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime(obj81);
        org.joda.time.DateTime dateTime84 = dateTime82.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight85 = dateTime84.toDateMidnight();
        org.joda.time.DateTime dateTime87 = dateTime84.minusDays((int) (byte) 1);
        boolean boolean88 = dateTime87.isEqualNow();
        java.lang.Object obj89 = null;
        org.joda.time.DateTime dateTime90 = new org.joda.time.DateTime(obj89);
        boolean boolean91 = dateTime87.isEqual((org.joda.time.ReadableInstant) dateTime90);
        int int92 = dateTime90.getDayOfWeek();
        int int93 = dateTime90.getMinuteOfHour();
        org.joda.time.TimeOfDay timeOfDay94 = dateTime90.toTimeOfDay();
        org.joda.time.DateTime dateTime95 = dateTime76.withFields((org.joda.time.ReadablePartial) timeOfDay94);
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
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 54000L + "'", long28 == 54000L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertNotNull(readableInterval42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1970 + "'", int64 == 1970);
        org.junit.Assert.assertNotNull(dateTime66);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 54000L + "'", long67 == 54000L);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateMidnight85);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int92 + "' != '" + 4 + "'", int92 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(timeOfDay94);
        org.junit.Assert.assertNotNull(dateTime95);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
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
        org.joda.time.DurationField durationField18 = offsetDateTimeField8.getLeapDurationField();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(durationField18);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.DurationField durationField1 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.hourOfDay();
        org.joda.time.DurationField durationField5 = gregorianChronology2.days();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology2.minuteOfDay();
        org.joda.time.DurationField durationField8 = gregorianChronology2.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.PreciseDateTimeField preciseDateTimeField9 = new org.joda.time.field.PreciseDateTimeField(dateTimeFieldType0, durationField1, durationField8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
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
        long long21 = zeroIsMaxDateTimeField9.getDifferenceAsLong((long) (byte) 17, 100L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = zeroIsMaxDateTimeField9.getAsText(10001L, locale23);
        java.lang.Object obj25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight29 = dateTime28.toDateMidnight();
        org.joda.time.DateTime dateTime31 = dateTime28.minusDays((int) (byte) 1);
        boolean boolean32 = dateTime31.isEqualNow();
        org.joda.time.LocalTime localTime33 = dateTime31.toLocalTime();
        int int34 = zeroIsMaxDateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localTime33);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 10L);
        long long4 = preciseDurationField2.getMillis((long) (short) 10);
        int int7 = preciseDurationField2.getValue((long) (byte) 4, (-6048000001L));
        long long10 = preciseDurationField2.getMillis(2000L, (long) (byte) 22);
        java.lang.String str11 = preciseDurationField2.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 20000L + "'", long10 == 20000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DurationField[millis]" + "'", str11, "DurationField[millis]");
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
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
        long long22 = zeroIsMaxDateTimeField9.add(1712716004371L, 6969L);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1712722973371L + "'", long22 == 1712722973371L);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTimeISO();
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusSeconds((int) (byte) 1);
        int int11 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime13 = dateTime8.minusYears(54);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int15 = dateTime8.get(dateTimeFieldType14);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.monthOfYear();
        org.joda.time.DurationField durationField19 = gregorianChronology16.hours();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology16.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType14.getField((org.joda.time.Chronology) gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.dayOfYear();
        long long8 = gregorianChronology0.add((long) 18981, 0L, (int) (byte) 12);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18981L + "'", long8 == 18981L);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        long long6 = iSOChronology1.getDateTimeMillis((int) (byte) 10, (int) (short) 1, (int) (byte) 5, (int) (byte) 11);
        org.joda.time.DurationField durationField7 = iSOChronology1.weeks();
        long long10 = durationField7.add(1712716034844L, (int) (byte) 18);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-61851254399988L) + "'", long6 == (-61851254399988L));
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1723602434844L + "'", long10 == 1723602434844L);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) 100);
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime10.minusHours((-100));
        int int14 = property4.getDifference((org.joda.time.ReadableInstant) dateTime13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = property4.setCopy(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
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
        java.lang.Object obj23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj23);
        int int25 = dateTime24.getYear();
        org.joda.time.ReadablePartial readablePartial26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.withFields(readablePartial26);
        long long28 = dateTime27.getMillis();
        org.joda.time.DateTime dateTime33 = dateTime27.withTime(10, (int) (byte) 22, 1, 1);
        org.joda.time.DateTime dateTime35 = dateTime27.withWeekyear(0);
        org.joda.time.DateTime dateTime37 = dateTime27.plusWeeks(12);
        boolean boolean38 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime37);
        java.util.GregorianCalendar gregorianCalendar39 = dateTime21.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) gregorianCalendar39, dateTimeZone41);
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
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 54000L + "'", long28 == 54000L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(gregorianCalendar39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = zeroIsMaxDateTimeField9.set((long) (byte) 20, 57230);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57230 for centuryOfEra must be in the range [1,60]");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62111231992995L) + "'", long19 == (-62111231992995L));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getName(1712715987735L, locale7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) '#', locale13);
        org.joda.time.Chronology chronology15 = gregorianChronology9.withZone(dateTimeZone11);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone11.getOffset(readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone19.isLocalDateTimeGap(localDateTime22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone19.getName(1712715987735L, locale25);
        long long28 = dateTimeZone11.getMillisKeepLocal(dateTimeZone19, (long) (byte) 100);
        long long30 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, (long) 'a');
        java.lang.Object obj31 = dateTimeZone19.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-00:00:00.001" + "'", str26, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
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
            long long12 = unsupportedDurationField10.getMillis(57654000L);
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
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        boolean boolean3 = readableInterval1.isBefore(readableInstant2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        boolean boolean6 = readableInterval1.isBefore(readableInterval4);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        boolean boolean12 = readableInterval9.isAfter(readableInterval10);
        org.joda.time.Chronology chronology13 = readableInterval9.getChronology();
        org.joda.time.Interval interval14 = readableInterval9.toInterval();
        boolean boolean15 = readableInterval1.isAfter(readableInterval9);
        long long16 = readableInterval1.getStartMillis();
        org.joda.time.Chronology chronology17 = readableInterval1.getChronology();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 54000L + "'", long16 == 54000L);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.hourOfDay();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField5.getAsText(1012L, locale7);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 10L);
        long long4 = preciseDurationField2.getMillis((long) (short) 10);
        int int7 = preciseDurationField2.getValue((long) (byte) 4, (-6048000001L));
        long long10 = preciseDurationField2.getMillis(2000L, (long) (byte) 22);
        long long12 = preciseDurationField2.getMillis(200);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = gregorianChronology13.weeks();
        org.joda.time.DurationField durationField15 = gregorianChronology13.years();
        int int16 = preciseDurationField2.compareTo(durationField15);
        int int18 = preciseDurationField2.getValue((long) 1969);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 20000L + "'", long10 == 20000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2000L + "'", long12 == 2000L);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 196 + "'", int18 == 196);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        long long5 = dateTimeZone1.convertLocalToUTC(31536000000000L, false, (-62111231992995L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 70");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 31536000000001L + "'", long5 == 31536000000001L);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTimeISO();
        java.lang.Object obj7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusSeconds((int) (byte) 1);
        int int11 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime13 = dateTime8.minusYears(54);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear((int) (byte) 9);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
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
        int int20 = zeroIsMaxDateTimeField9.getLeapAmount((-99979L));
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology21.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField29 = new org.joda.time.field.OffsetDateTimeField(dateTimeField24, dateTimeFieldType25, (int) (byte) 7, 3, 0);
        int int30 = offsetDateTimeField29.getMaximumValue();
        int int32 = offsetDateTimeField29.getMaximumValue((-99979L));
        int int35 = offsetDateTimeField29.getDifference(12L, (long) '4');
        java.lang.Object obj36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay40 = dateTime39.toTimeOfDay();
        boolean boolean41 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay40);
        org.joda.time.chrono.GregorianChronology gregorianChronology42 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology42.dayOfYear();
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology42.monthOfYear();
        org.joda.time.DurationField durationField45 = gregorianChronology42.hours();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology42.secondOfMinute();
        boolean boolean48 = dateTimeField46.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str50 = dateTimeFieldType49.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField51 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField46, dateTimeFieldType49);
        org.joda.time.ReadablePartial readablePartial52 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology53 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField54 = gregorianChronology53.dayOfYear();
        org.joda.time.DateTimeField dateTimeField55 = gregorianChronology53.monthOfYear();
        org.joda.time.DurationField durationField56 = gregorianChronology53.hours();
        org.joda.time.DateTimeField dateTimeField57 = gregorianChronology53.secondOfMinute();
        boolean boolean59 = dateTimeField57.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str61 = dateTimeFieldType60.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField62 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField57, dateTimeFieldType60);
        long long64 = zeroIsMaxDateTimeField62.roundFloor((long) 100);
        long long66 = zeroIsMaxDateTimeField62.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial67 = null;
        java.util.Locale locale69 = null;
        java.lang.String str70 = zeroIsMaxDateTimeField62.getAsText(readablePartial67, (int) (byte) 7, locale69);
        int int71 = zeroIsMaxDateTimeField62.getMinimumValue();
        int int74 = zeroIsMaxDateTimeField62.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial75 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology76 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField77 = gregorianChronology76.dayOfYear();
        org.joda.time.DateTimeField dateTimeField78 = gregorianChronology76.monthOfYear();
        org.joda.time.ReadablePartial readablePartial79 = null;
        int[] intArray80 = new int[] {};
        int int81 = dateTimeField78.getMaximumValue(readablePartial79, intArray80);
        int int82 = zeroIsMaxDateTimeField62.getMinimumValue(readablePartial75, intArray80);
        int int83 = dateTimeField46.getMinimumValue(readablePartial52, intArray80);
        int int84 = offsetDateTimeField29.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay40, intArray80);
        int int85 = zeroIsMaxDateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay40);
        long long87 = zeroIsMaxDateTimeField9.remainder(1712716007070L);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(gregorianChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "centuryOfEra" + "'", str50, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "centuryOfEra" + "'", str61, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 999L + "'", long66 == 999L);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "7" + "'", str70, "7");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 12 + "'", int81 == 12);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 8 + "'", int84 == 8);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 70L + "'", long87 == 70L);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 10L);
        long long4 = preciseDurationField2.getMillis((long) (short) 10);
        int int7 = preciseDurationField2.getValue((long) (byte) 4, (-6048000001L));
        org.joda.time.DurationFieldType durationFieldType8 = preciseDurationField2.getType();
        int int10 = preciseDurationField2.getValue((long) (byte) 12);
        long long12 = preciseDurationField2.getMillis((int) (byte) 10);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime12 = dateTime9.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime14 = dateTime9.minusDays(200);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        java.util.GregorianCalendar gregorianCalendar17 = dateTime14.toGregorianCalendar();
        boolean boolean18 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime4.withMillisOfSecond(70004043);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70004043 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 54000L + "'", long5 == 54000L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(gregorianCalendar17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology9 = gregorianChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.centuryOfEra();
        int int12 = dateTimeField10.getLeapAmount((long) 2);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(651285L, 1712716001910L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1115466241303954350L + "'", long2 == 1115466241303954350L);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withDayOfWeek(69996);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69996 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime10 = dateTime4.withTime(10, (int) (byte) 22, 1, 1);
        org.joda.time.DateTime dateTime12 = dateTime4.withWeekyear(0);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfHour();
        int int14 = dateTime12.getSecondOfDay();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 54000L + "'", long5 == 54000L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        int int9 = dateTime5.getWeekOfWeekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str11 = dateTime5.toString(dateTimeFormatter10);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = gregorianChronology13.weeks();
        org.joda.time.DurationField durationField15 = gregorianChronology13.halfdays();
        org.joda.time.DateTimeZone dateTimeZone16 = gregorianChronology13.getZone();
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology17.monthOfYear();
        org.joda.time.DurationField durationField20 = gregorianChronology17.hours();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology17.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean25 = dateTimeZone23.isStandardOffset((long) (byte) 2);
        org.joda.time.Chronology chronology26 = gregorianChronology17.withZone(dateTimeZone23);
        boolean boolean27 = dateTimeZone23.isFixed();
        org.joda.time.Chronology chronology28 = gregorianChronology13.withZone(dateTimeZone23);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((java.lang.Object) 4016L, dateTimeZone23);
        boolean boolean30 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = dateTime5.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.minusYears((int) (short) -1);
        int int34 = dateTime31.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00Z" + "'", str11, "00:00:00Z");
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.ERAS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, (-99994L));
        org.joda.time.DurationFieldType durationFieldType3 = preciseDurationField2.getType();
        long long4 = preciseDurationField2.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType5 = preciseDurationField2.getType();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99994L) + "'", long4 == (-99994L));
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime5.minusDays((int) (byte) 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField((org.joda.time.Chronology) gregorianChronology13);
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.dayOfMonth();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology13);
        int int17 = dateTime16.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property21 = dateTime19.property(dateTimeFieldType20);
        int int22 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
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
        long long41 = dividedDateTimeField29.getDifferenceAsLong(25200022L, (long) 10);
        int int42 = dividedDateTimeField29.getMaximumValue();
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
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1326L + "'", long41 == 1326L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology45.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.monthOfYear();
        org.joda.time.DurationField durationField48 = gregorianChronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology45.centuryOfEra();
        java.lang.Object obj50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(obj50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay54 = dateTime53.toTimeOfDay();
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeField49.getAsShortText((org.joda.time.ReadablePartial) timeOfDay54, 99, locale56);
        java.util.Locale locale59 = null;
        java.lang.String str60 = remainderDateTimeField44.getAsText((org.joda.time.ReadablePartial) timeOfDay54, 26, locale59);
        long long62 = remainderDateTimeField44.roundFloor(97005L);
        int int64 = remainderDateTimeField44.get(1712716007070L);
        long long66 = remainderDateTimeField44.roundHalfCeiling(8L);
        long long68 = remainderDateTimeField44.roundHalfEven(14400000L);
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
        org.junit.Assert.assertNotNull(gregorianChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "99" + "'", str57, "99");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "26" + "'", str60, "26");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 97000L + "'", long62 == 97000L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 9 + "'", int64 == 9);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 14400000L + "'", long68 == 14400000L);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        java.lang.String str10 = unsupportedDateTimeField9.toString();
        java.lang.String str11 = unsupportedDateTimeField9.getName();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField9.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnsupportedDateTimeField" + "'", str10, "UnsupportedDateTimeField");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
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
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        int int15 = dateTime14.getYear();
        org.joda.time.LocalTime localTime16 = dateTime14.toLocalTime();
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = unsupportedDateTimeField9.getAsShortText((org.joda.time.ReadablePartial) localTime16, locale17);
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
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyearOfCentury();
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
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime10 = dateTime4.withTime(10, (int) (byte) 22, 1, 1);
        org.joda.time.DateTime dateTime12 = dateTime4.withWeekyear(0);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime16.weekyear();
        org.joda.time.DateTime dateTime21 = dateTime16.plus((long) (byte) 15);
        boolean boolean22 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime4.getYearOfCentury();
        org.joda.time.DateTime.Property property24 = dateTime4.minuteOfHour();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 54000L + "'", long5 == 54000L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 70 + "'", int23 == 70);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.monthOfYear();
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
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
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
        long long15 = zeroIsMaxDateTimeField9.roundHalfCeiling((long) 1969);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, 54999, 70000, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54999 for centuryOfEra must be in the range [70000,-1]");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2000L + "'", long15 == 2000L);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
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
        org.joda.time.DurationField durationField12 = gregorianChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology9.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8000L + "'", long7 == 8000L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        int int10 = dateTime6.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime6.toMutableDateTime();
        long long12 = dateTime6.getMillis();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-86345000L) + "'", long12 == (-86345000L));
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = gregorianChronology0.eras();
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
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
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
        int int37 = dividedDateTimeField29.getMinimumValue();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
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
        org.joda.time.DurationField durationField22 = zeroIsMaxDateTimeField9.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology25 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField((org.joda.time.Chronology) gregorianChronology25);
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology25.dayOfMonth();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology25);
        int int29 = dateTime28.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime31 = dateTime28.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime32 = dateTime31.toLocalTime();
        org.joda.time.chrono.GregorianChronology gregorianChronology33 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology33.dayOfYear();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology33.monthOfYear();
        org.joda.time.DurationField durationField36 = gregorianChronology33.hours();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology33.secondOfMinute();
        boolean boolean39 = dateTimeField37.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str41 = dateTimeFieldType40.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField42 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField37, dateTimeFieldType40);
        org.joda.time.ReadablePartial readablePartial43 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology44 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology44.monthOfYear();
        org.joda.time.DurationField durationField47 = gregorianChronology44.hours();
        org.joda.time.DateTimeField dateTimeField48 = gregorianChronology44.secondOfMinute();
        boolean boolean50 = dateTimeField48.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str52 = dateTimeFieldType51.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField53 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField48, dateTimeFieldType51);
        long long55 = zeroIsMaxDateTimeField53.roundFloor((long) 100);
        long long57 = zeroIsMaxDateTimeField53.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial58 = null;
        java.util.Locale locale60 = null;
        java.lang.String str61 = zeroIsMaxDateTimeField53.getAsText(readablePartial58, (int) (byte) 7, locale60);
        int int62 = zeroIsMaxDateTimeField53.getMinimumValue();
        int int65 = zeroIsMaxDateTimeField53.getDifference(10L, (long) (short) 1);
        org.joda.time.ReadablePartial readablePartial66 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology67 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField68 = gregorianChronology67.dayOfYear();
        org.joda.time.DateTimeField dateTimeField69 = gregorianChronology67.monthOfYear();
        org.joda.time.ReadablePartial readablePartial70 = null;
        int[] intArray71 = new int[] {};
        int int72 = dateTimeField69.getMaximumValue(readablePartial70, intArray71);
        int int73 = zeroIsMaxDateTimeField53.getMinimumValue(readablePartial66, intArray71);
        int int74 = dateTimeField37.getMinimumValue(readablePartial43, intArray71);
        int int75 = zeroIsMaxDateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) localTime32, intArray71);
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
        org.junit.Assert.assertNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(gregorianChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(gregorianChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "centuryOfEra" + "'", str41, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "centuryOfEra" + "'", str52, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 999L + "'", long57 == 999L);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "7" + "'", str61, "7");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(gregorianChronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 12 + "'", int72 == 12);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("hi!");
        java.lang.String str2 = jodaTimePermission1.getActions();
        java.lang.String str3 = jodaTimePermission1.toString();
        java.lang.String str4 = jodaTimePermission1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(\"org.joda.time.JodaTimePermission\" \"hi!\")" + "'", str3, "(\"org.joda.time.JodaTimePermission\" \"hi!\")");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(\"org.joda.time.JodaTimePermission\" \"hi!\")" + "'", str4, "(\"org.joda.time.JodaTimePermission\" \"hi!\")");
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology45.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.monthOfYear();
        org.joda.time.DurationField durationField48 = gregorianChronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology45.centuryOfEra();
        java.lang.Object obj50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(obj50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay54 = dateTime53.toTimeOfDay();
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeField49.getAsShortText((org.joda.time.ReadablePartial) timeOfDay54, 99, locale56);
        java.util.Locale locale59 = null;
        java.lang.String str60 = remainderDateTimeField44.getAsText((org.joda.time.ReadablePartial) timeOfDay54, 26, locale59);
        long long62 = remainderDateTimeField44.roundFloor(97005L);
        long long64 = remainderDateTimeField44.roundHalfEven(57599999L);
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
        org.junit.Assert.assertNotNull(gregorianChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "99" + "'", str57, "99");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "26" + "'", str60, "26");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 97000L + "'", long62 == 97000L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 57600000L + "'", long64 == 57600000L);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
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
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone11.getShortName((long) 769, locale19);
        int int22 = dateTimeZone11.getStandardOffset((long) 196);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = offsetDateTimeField8.getType();
        long long12 = offsetDateTimeField8.remainder((long) (byte) 21);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21L + "'", long12 == 21L);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = gregorianChronology2.weeks();
        int int6 = durationField3.getValue((long) (short) 10, (long) 10);
        long long8 = durationField3.getMillis(0);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField3);
        long long12 = durationField3.subtract(1712629604846L, 999);
        long long14 = durationField3.getValueAsLong((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1108434404846L + "'", long12 == 1108434404846L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
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
        boolean boolean20 = zeroIsMaxDateTimeField9.isLeap(17012L);
        long long23 = zeroIsMaxDateTimeField9.add(20000L, 1970);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1990000L + "'", long23 == 1990000L);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
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
        int int12 = zeroIsMaxDateTimeField9.getMinimumValue();
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale locale15 = null;
        java.lang.String str16 = zeroIsMaxDateTimeField9.getAsShortText(readablePartial13, (int) (byte) 15, locale15);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "centuryOfEra" + "'", str8, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "15" + "'", str16, "15");
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
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
        int int17 = zeroIsMaxDateTimeField9.getMinimumValue();
        java.util.Locale locale19 = null;
        java.lang.String str20 = zeroIsMaxDateTimeField9.getAsText((long) (byte) 0, locale19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight25 = dateTime24.toDateMidnight();
        org.joda.time.DateTime dateTime27 = dateTime24.minusDays((int) (byte) 1);
        boolean boolean28 = dateTime27.isEqualNow();
        org.joda.time.LocalTime localTime29 = dateTime27.toLocalTime();
        java.util.Locale locale31 = null;
        java.lang.String str32 = zeroIsMaxDateTimeField9.getAsText((org.joda.time.ReadablePartial) localTime29, (int) (byte) 21, locale31);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "60" + "'", str20, "60");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "21" + "'", str32, "21");
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gregorianChronology0.add(readablePeriod5, (long) (byte) 4, 0);
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4L + "'", long8 == 4L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = dateTime3.minusDays(200);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.toDateTime(chronology9);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime8.toGregorianCalendar();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) (short) 0, 200);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTime8.toString("70000", locale16);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "70000" + "'", str17, "70000");
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        java.lang.String str2 = dateTimeFormatter0.print((long) 1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.monthOfYear();
        org.joda.time.DurationField durationField6 = gregorianChronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.secondOfMinute();
        boolean boolean9 = dateTimeField7.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str11 = dateTimeFieldType10.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField12 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField7, dateTimeFieldType10);
        long long14 = zeroIsMaxDateTimeField12.roundFloor((long) 100);
        long long16 = zeroIsMaxDateTimeField12.remainder((long) (byte) -1);
        java.lang.String str18 = zeroIsMaxDateTimeField12.getAsShortText(0L);
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str20 = iSOChronology19.toString();
        org.joda.time.Chronology chronology21 = iSOChronology19.withUTC();
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology22.monthOfYear();
        org.joda.time.DurationField durationField25 = gregorianChronology22.hours();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology22.secondOfMinute();
        boolean boolean28 = dateTimeField26.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str30 = dateTimeFieldType29.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField31 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField26, dateTimeFieldType29);
        long long33 = zeroIsMaxDateTimeField31.roundFloor((long) 100);
        long long35 = zeroIsMaxDateTimeField31.remainder((long) (byte) -1);
        org.joda.time.ReadablePartial readablePartial36 = null;
        java.util.Locale locale38 = null;
        java.lang.String str39 = zeroIsMaxDateTimeField31.getAsText(readablePartial36, (int) (byte) 7, locale38);
        int int40 = zeroIsMaxDateTimeField31.getMaximumValue();
        java.util.Locale locale42 = null;
        java.lang.String str43 = zeroIsMaxDateTimeField31.getAsText(12, locale42);
        long long46 = zeroIsMaxDateTimeField31.add(1L, (int) (byte) 9);
        java.lang.Object obj47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(obj47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay51 = dateTime50.toTimeOfDay();
        int int52 = zeroIsMaxDateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay51);
        long long54 = chronology21.set((org.joda.time.ReadablePartial) timeOfDay51, 0L);
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
        int int85 = zeroIsMaxDateTimeField12.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay51, intArray82);
        java.lang.String str86 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) timeOfDay51);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-001" + "'", str2, "1970-001");
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "centuryOfEra" + "'", str11, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 999L + "'", long16 == 999L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "60" + "'", str18, "60");
        org.junit.Assert.assertNotNull(iSOChronology19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[UTC]" + "'", str20, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(gregorianChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "centuryOfEra" + "'", str30, "centuryOfEra");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 999L + "'", long35 == 999L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "7" + "'", str39, "7");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "12" + "'", str43, "12");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 9001L + "'", long46 == 9001L);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 60 + "'", int52 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 53999L + "'", long54 == 53999L);
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 60 + "'", int85 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str86, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField((org.joda.time.Chronology) gregorianChronology2);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology2);
        int int6 = dateTime5.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime10 = dateTime5.minusDays((int) (byte) 15);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean15 = dateTimeZone13.isStandardOffset((long) (byte) 2);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone13.isLocalDateTimeGap(localDateTime16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone13.getName(1712715987735L, locale19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 100, dateTimeZone13);
        boolean boolean22 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime24 = dateTime10.withMillisOfDay(99);
        int int25 = dateTime10.getEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-00:00:00.001" + "'", str20, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology45.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.monthOfYear();
        org.joda.time.DurationField durationField48 = gregorianChronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology45.centuryOfEra();
        java.lang.Object obj50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(obj50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay54 = dateTime53.toTimeOfDay();
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeField49.getAsShortText((org.joda.time.ReadablePartial) timeOfDay54, 99, locale56);
        java.util.Locale locale59 = null;
        java.lang.String str60 = remainderDateTimeField44.getAsText((org.joda.time.ReadablePartial) timeOfDay54, 26, locale59);
        long long62 = remainderDateTimeField44.roundFloor(97005L);
        int int64 = remainderDateTimeField44.get(1712716007070L);
        long long66 = remainderDateTimeField44.roundHalfFloor(10001L);
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
        org.junit.Assert.assertNotNull(gregorianChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "99" + "'", str57, "99");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "26" + "'", str60, "26");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 97000L + "'", long62 == 97000L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 9 + "'", int64 == 9);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 10000L + "'", long66 == 10000L);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        org.joda.time.Chronology chronology6 = gregorianChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.yearOfCentury();
        long long10 = dateTimeField8.roundFloor(0L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = gregorianChronology0.hours();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        org.joda.time.field.DecoratedDurationField decoratedDurationField7 = new org.joda.time.field.DecoratedDurationField(durationField5, durationFieldType6);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.Chronology chronology5 = readableInterval1.getChronology();
        long long6 = readableInterval1.getEndMillis();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(chronology5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 54000L + "'", long6 == 54000L);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
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
        org.joda.time.DateTime.Property property15 = dateTime5.weekOfWeekyear();
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
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) 100);
        java.lang.String str7 = property4.getAsShortText();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "70" + "'", str7, "70");
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
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
        long long37 = dividedDateTimeField29.roundFloor((long) (byte) 23);
        long long40 = dividedDateTimeField29.getDifferenceAsLong((long) (short) 0, (long) 15);
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 57000L + "'", long37 == 57000L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology6 = gregorianChronology0.withUTC();
        org.joda.time.Chronology chronology7 = chronology6.withUTC();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.halfdays();
        org.joda.time.DurationField durationField3 = gregorianChronology0.months();
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str5 = iSOChronology4.toString();
        org.joda.time.DurationField durationField6 = iSOChronology4.centuries();
        org.joda.time.DurationFieldType durationFieldType7 = durationField6.getType();
        org.joda.time.field.DecoratedDurationField decoratedDurationField8 = new org.joda.time.field.DecoratedDurationField(durationField3, durationFieldType7);
        long long11 = decoratedDurationField8.getValueAsLong(1712715979970999L, 589001L);
        boolean boolean12 = decoratedDurationField8.isPrecise();
        boolean boolean13 = decoratedDurationField8.isSupported();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(iSOChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 651285L + "'", long11 == 651285L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
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
            java.lang.String str14 = unsupportedDateTimeField12.getAsShortText(70003391L);
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
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime.Property property5 = dateTime3.hourOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTime7.getZone();
        org.joda.time.DateTime dateTime9 = dateTime3.toDateTime(dateTimeZone8);
        int int10 = dateTime3.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.halfdays();
        org.joda.time.DurationField durationField3 = gregorianChronology0.months();
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str5 = iSOChronology4.toString();
        org.joda.time.DurationField durationField6 = iSOChronology4.centuries();
        org.joda.time.DurationFieldType durationFieldType7 = durationField6.getType();
        org.joda.time.field.DecoratedDurationField decoratedDurationField8 = new org.joda.time.field.DecoratedDurationField(durationField3, durationFieldType7);
        long long11 = decoratedDurationField8.getValueAsLong(1712715979970999L, 589001L);
        boolean boolean12 = decoratedDurationField8.isPrecise();
        java.lang.String str13 = decoratedDurationField8.getName();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(iSOChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 651285L + "'", long11 == 651285L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "centuries" + "'", str13, "centuries");
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateParser();
        org.joda.time.MutableDateTime mutableDateTime3 = dateTimeFormatter1.parseMutableDateTime("-1");
        int int6 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "", (int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter0.getPrinter();
        int int8 = dateTimePrinter7.estimatePrintedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-11) + "'", int6 == (-11));
        org.junit.Assert.assertNotNull(dateTimePrinter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
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
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str15 = iSOChronology14.toString();
        org.joda.time.Chronology chronology16 = iSOChronology14.withUTC();
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
        int int35 = zeroIsMaxDateTimeField26.getMaximumValue();
        java.util.Locale locale37 = null;
        java.lang.String str38 = zeroIsMaxDateTimeField26.getAsText(12, locale37);
        long long41 = zeroIsMaxDateTimeField26.add(1L, (int) (byte) 9);
        java.lang.Object obj42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay46 = dateTime45.toTimeOfDay();
        int int47 = zeroIsMaxDateTimeField26.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay46);
        long long49 = chronology16.set((org.joda.time.ReadablePartial) timeOfDay46, 0L);
        int[] intArray51 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray53 = unsupportedDateTimeField9.addWrapField((org.joda.time.ReadablePartial) timeOfDay46, 26, intArray51, 140008086);
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
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[UTC]" + "'", str15, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology16);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "12" + "'", str38, "12");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 9001L + "'", long41 == 9001L);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 53999L + "'", long49 == 53999L);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronology();
        org.joda.time.LocalDate localDate19 = dateTimeFormatter16.parseLocalDate("12");
        int int20 = zeroIsMaxDateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) localDate19);
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
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(chronology17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        long long11 = offsetDateTimeField8.roundFloor(589001L);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = offsetDateTimeField8.set(1712716024756L, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for era must be in the range [8,0]");
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
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 10);
        int int6 = dateTime5.getDayOfMonth();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(instant7);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        java.lang.String str2 = dateTimeFormatter0.print(97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00:00:00-00:00:00.001" + "'", str2, "00:00:00-00:00:00.001");
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
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
        long long39 = dividedDateTimeField29.roundFloor((long) 54999);
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
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 38000L + "'", long39 == 38000L);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology3 = gregorianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = dateTime3.minusDays(200);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.toDateTime(chronology9);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime8.toGregorianCalendar();
        java.lang.Object obj12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight16 = dateTime15.toDateMidnight();
        org.joda.time.DateTime dateTime18 = dateTime15.minusDays((int) (byte) 1);
        boolean boolean19 = dateTime18.isEqualNow();
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        boolean boolean22 = dateTime18.isEqual((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime21.getYearOfEra();
        boolean boolean24 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime26 = dateTime8.withDayOfMonth((int) (byte) 18);
        java.lang.Object obj27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight31 = dateTime30.toDateMidnight();
        int int32 = dateTime30.getYearOfCentury();
        boolean boolean33 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateMidnight31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 70 + "'", int32 == 70);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        long long11 = offsetDateTimeField8.roundFloor(589001L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = offsetDateTimeField8.getAsShortText(1970, locale13);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970" + "'", str14, "1970");
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
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
        org.joda.time.DurationField durationField36 = dividedDateTimeField29.getDurationField();
        org.joda.time.DurationField durationField37 = dividedDateTimeField29.getRangeDurationField();
        org.joda.time.DurationField durationField38 = dividedDateTimeField29.getDurationField();
        int int41 = dividedDateTimeField29.getDifference((long) (byte) 100, 38000L);
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
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("GregorianChronology[UTC]", "");
        java.lang.Throwable[] throwableArray3 = illegalFieldValueException2.getSuppressed();
        java.lang.String str4 = illegalFieldValueException2.getFieldName();
        illegalFieldValueException2.prependMessage("");
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException("GregorianChronology[UTC]", "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        java.lang.String str11 = illegalFieldValueException9.getFieldName();
        illegalFieldValueException2.addSuppressed((java.lang.Throwable) illegalFieldValueException9);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GregorianChronology[UTC]" + "'", str4, "GregorianChronology[UTC]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GregorianChronology[UTC]" + "'", str11, "GregorianChronology[UTC]");
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.DurationField durationField7 = gregorianChronology5.weeks();
        boolean boolean8 = gregorianChronology0.equals((java.lang.Object) durationField7);
        org.joda.time.DurationField durationField9 = gregorianChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology6 = gregorianChronology0.withUTC();
        long long10 = gregorianChronology0.add((-99994L), (long) (byte) 5, 3);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-99979L) + "'", long10 == (-99979L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int10 = offsetDateTimeField8.getMaximumValue();
        long long12 = offsetDateTimeField8.roundHalfEven(25200022L);
        boolean boolean13 = offsetDateTimeField8.isSupported();
        long long15 = offsetDateTimeField8.roundHalfCeiling(1326L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = offsetDateTimeField8.getAsShortText(0, locale17);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime10 = dateTime4.withTime(10, (int) (byte) 22, 1, 1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        org.joda.time.DateTime dateTime17 = dateTime14.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime14.minusDays(200);
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime22 = dateTime19.withYear((int) (byte) 2);
        org.joda.time.DateTime.Property property23 = dateTime19.yearOfCentury();
        org.joda.time.DateTime dateTime24 = property23.withMinimumValue();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 54000L + "'", long5 == 54000L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
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
        org.joda.time.DurationField durationField36 = dividedDateTimeField29.getDurationField();
        org.joda.time.DurationField durationField37 = dividedDateTimeField29.getDurationField();
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
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        boolean boolean10 = readableInterval7.isAfter(readableInterval8);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        boolean boolean15 = readableInterval12.isAfter(readableInterval13);
        boolean boolean16 = readableInterval7.contains(readableInterval13);
        java.lang.Object obj17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight21 = dateTime20.toDateMidnight();
        org.joda.time.DateTime dateTime23 = dateTime20.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime25 = dateTime20.minusDays(200);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime(chronology26);
        boolean boolean28 = readableInterval7.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.PeriodType periodType32 = org.joda.time.DateTimeUtils.getPeriodType(periodType31);
        org.joda.time.Period period33 = readableInterval30.toPeriod(periodType32);
        org.joda.time.Period period34 = readableInterval7.toPeriod(periodType32);
        org.joda.time.Period period35 = readableInterval1.toPeriod(periodType32);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(readableInterval30);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 9);
        org.joda.time.Chronology chronology5 = gregorianChronology0.withZone(dateTimeZone4);
        long long7 = dateTimeZone4.convertUTCToLocal((long) 7);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 16L + "'", long7 == 16L);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
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
        org.joda.time.DateTime.Property property13 = dateTime4.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unsupportedDurationField10.getValue(38000L);
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
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str1 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ISOChronology[UTC]" + "'", str1, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
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
        int int45 = dividedDateTimeField29.getMinimumValue();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField46 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField29);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-9L), (long) 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-360) + "'", int2 == (-360));
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int6 = dateMidnight4.get(dateTimeFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType5.getDurationType();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = gregorianChronology0.days();
        org.joda.time.Chronology chronology4 = gregorianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatterBuilder0.toFormatter();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Both printing and parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = dateTimeField7.getRangeDurationField();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNull(durationField8);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        boolean boolean2 = dateTimeFormatter0.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField4.getAsShortText(readablePartial5, 1, locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeField4.getAsShortText(1712716010000L, locale10);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "15" + "'", str11, "15");
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.ReadableInterval readableInterval6 = null;
        boolean boolean7 = readableInterval5.isBefore(readableInterval6);
        org.joda.time.Duration duration8 = readableInterval5.toDuration();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.Chronology chronology2 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        int int11 = dateTime10.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.dayOfMonth();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology14);
        int int18 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime20 = dateTime17.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime22 = dateTime17.minusDays((int) (byte) 15);
        int int23 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property24 = dateTime17.weekyear();
        org.joda.time.DateTime.Property property25 = dateTime17.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 2);
        long long7 = dateTimeZone1.convertLocalToUTC((long) (byte) 11, false, 0L);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.weekOfWeekyear();
        org.joda.time.Chronology chronology10 = iSOChronology8.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = dateTime1.withWeekyear(200);
        org.joda.time.DateTime dateTime7 = dateTime5.minusYears(0);
        boolean boolean9 = dateTime5.isAfter((long) 3);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((long) '#', locale4);
        int int7 = dateTimeZone2.getOffset(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone2);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(1712716003015L, (org.joda.time.DateTimeZone) cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = gregorianChronology1.add(readablePeriod4, 8000L, 0);
        org.joda.time.DurationField durationField8 = gregorianChronology1.hours();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology1.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8000L + "'", long7 == 8000L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
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
        org.joda.time.DurationField durationField36 = dividedDateTimeField29.getDurationField();
        java.util.Locale locale38 = null;
        java.lang.String str39 = dividedDateTimeField29.getAsText(2000, locale38);
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
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2000" + "'", str39, "2000");
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.field.PreciseDurationField preciseDurationField2 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 57599999L);
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
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
        java.util.Locale locale17 = null;
        java.lang.String str18 = zeroIsMaxDateTimeField9.getAsText(99, locale17);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "99" + "'", str18, "99");
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DurationField durationField3 = gregorianChronology1.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology1.days();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName((long) '#', locale8);
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.monthOfYear();
        org.joda.time.DurationField durationField13 = gregorianChronology10.hours();
        boolean boolean14 = dateTimeZone6.equals((java.lang.Object) gregorianChronology10);
        org.joda.time.chrono.ZonedChronology zonedChronology15 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) gregorianChronology1, dateTimeZone6);
        java.lang.String str16 = zonedChronology15.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = zonedChronology15.getDateTimeMillis((int) (short) 1, (int) ' ', 17, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zonedChronology15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ZonedChronology[GregorianChronology[UTC], -00:00:00.001]" + "'", str16, "ZonedChronology[GregorianChronology[UTC], -00:00:00.001]");
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        int int10 = dateTime6.getWeekyear();
        org.joda.time.DateTime.Property property11 = dateTime6.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property11.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = property11.setCopy((-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = dateTime3.minusDays(200);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.toDateTime(chronology9);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime8.toGregorianCalendar();
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded((long) (short) 0, 200);
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfDay();
        org.joda.time.DurationField durationField16 = property15.getLeapDurationField();
        org.joda.time.DateTime dateTime17 = property15.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
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
        long long14 = zeroIsMaxDateTimeField9.roundCeiling(1712716001828L);
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology15.monthOfYear();
        org.joda.time.DurationField durationField18 = gregorianChronology15.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology15.centuryOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay24 = dateTime23.toTimeOfDay();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) timeOfDay24, 99, locale26);
        boolean boolean28 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) timeOfDay24);
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = zeroIsMaxDateTimeField9.getAsShortText((org.joda.time.ReadablePartial) timeOfDay24, locale29);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1712716002000L + "'", long14 == 1712716002000L);
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "99" + "'", str27, "99");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.ordinalDateTimeNoMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("ISOChronology[UTC]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime.Property property5 = dateTime3.hourOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj6);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTime7.getZone();
        org.joda.time.DateTime dateTime9 = dateTime3.toDateTime(dateTimeZone8);
        java.lang.String str10 = dateTimeZone8.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
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
        long long16 = zeroIsMaxDateTimeField9.add((long) (-287999), (long) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-287999L) + "'", long16 == (-287999L));
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
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
        int int21 = zeroIsMaxDateTimeField9.getMaximumValue();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.IllegalFieldValueException illegalFieldValueException5 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 9001L, "12");
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType6.getField((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.DurationField durationField12 = gregorianChronology7.centuries();
        long long14 = durationField12.getMillis(1L);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField15 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = unsupportedDateTimeField15.getAsText((long) 69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: yearOfCentury field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3155695200000L + "'", long14 == 3155695200000L);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField15);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
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
        org.joda.time.DurationField durationField14 = unsupportedDateTimeField12.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = unsupportedDateTimeField12.getLeapAmount(19L);
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
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology13.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = gregorianChronology13.months();
        boolean boolean18 = durationField17.isSupported();
        org.joda.time.chrono.GregorianChronology gregorianChronology19 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology19.monthOfYear();
        org.joda.time.DurationField durationField22 = gregorianChronology19.hours();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology19.halfdayOfDay();
        org.joda.time.DurationField durationField24 = gregorianChronology19.hours();
        org.joda.time.DurationField durationField25 = gregorianChronology19.seconds();
        long long28 = durationField25.subtract((long) (byte) 6, 100);
        int int29 = durationField17.compareTo(durationField25);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.ERAS_TYPE;
        org.joda.time.field.PreciseDurationField preciseDurationField32 = new org.joda.time.field.PreciseDurationField(durationFieldType30, (-99994L));
        int int35 = preciseDurationField32.getValue((long) 1, (long) (byte) 8);
        long long38 = preciseDurationField32.getMillis(2024, 0L);
        long long41 = preciseDurationField32.getValueAsLong((-6048000001L), (long) (byte) 7);
        java.lang.String str42 = preciseDurationField32.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.PreciseDateTimeField preciseDateTimeField43 = new org.joda.time.field.PreciseDateTimeField(dateTimeFieldType0, durationField25, (org.joda.time.DurationField) preciseDurationField32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The effective range must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(gregorianChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-99994L) + "'", long28 == (-99994L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-202387856L) + "'", long38 == (-202387856L));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 60483L + "'", long41 == 60483L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "eras" + "'", str42, "eras");
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime.Property property10 = dateTime6.dayOfWeek();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.DurationField durationField12 = property10.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Wednesday" + "'", str11, "Wednesday");
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = gregorianChronology0.withZone(dateTimeZone4);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField3 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = gregorianChronology0.weekyears();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
        org.joda.time.DateTimeZone.setNameProvider((org.joda.time.tz.NameProvider) defaultNameProvider0);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withFields(readablePartial3);
        long long5 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime10 = dateTime4.withTime(10, (int) (byte) 22, 1, 1);
        org.joda.time.DateTime dateTime12 = dateTime4.withWeekyear(0);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfHour();
        org.joda.time.DateTime dateTime14 = property13.getDateTime();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 54000L + "'", long5 == 54000L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) '#', locale3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.monthOfYear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.hours();
        boolean boolean9 = dateTimeZone1.equals((java.lang.Object) gregorianChronology5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) '#', locale13);
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology15.monthOfYear();
        org.joda.time.DurationField durationField18 = gregorianChronology15.hours();
        boolean boolean19 = dateTimeZone11.equals((java.lang.Object) gregorianChronology15);
        java.lang.String str21 = dateTimeZone11.getNameKey((-1L));
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 1712716003015L);
        long long26 = dateTimeZone1.convertLocalToUTC(7L, false);
        int int28 = dateTimeZone1.getOffsetFromLocal((long) 16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1712716003015L + "'", long23 == 1712716003015L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 8L + "'", long26 == 8L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
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
        org.joda.time.DateTime.Property property11 = dateTime5.weekOfWeekyear();
        boolean boolean13 = dateTime5.isBefore(1008L);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
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
        org.joda.time.DateTime.Property property11 = dateTime5.weekOfWeekyear();
        int int12 = dateTime5.getWeekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[UTC]" + "'", str8, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral(' ');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = unsupportedDateTimeField12.getType();
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
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.secondOfDay();
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
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = gregorianChronology0.months();
        org.joda.time.DurationField durationField5 = gregorianChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = zeroIsMaxDateTimeField9.getType();
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
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        boolean boolean4 = readableInterval1.isAfter(readableInterval2);
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        java.lang.String str6 = readableInterval5.toString();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(readableInterval5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T00:00:53.999/1970-01-01T00:00:53.999" + "'", str6, "1970-01-01T00:00:53.999/1970-01-01T00:00:53.999");
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        int int11 = offsetDateTimeField8.getMaximumValue((-99979L));
        org.joda.time.DurationField durationField12 = offsetDateTimeField8.getDurationField();
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
        long long28 = zeroIsMaxDateTimeField22.roundHalfEven((long) (byte) 2);
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology29.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField37 = new org.joda.time.field.OffsetDateTimeField(dateTimeField32, dateTimeFieldType33, (int) (byte) 7, 3, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException40 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType33, (java.lang.Number) 1712715991341L, "GregorianChronology[UTC]");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField42 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField22, dateTimeFieldType33, (int) (byte) 19);
        long long45 = dividedDateTimeField42.addWrapField((-99994L), (int) (byte) 2);
        long long48 = dividedDateTimeField42.add(1L, (long) (byte) 14);
        org.joda.time.DurationField durationField49 = dividedDateTimeField42.getDurationField();
        long long51 = dividedDateTimeField42.remainder((-61851226021989L));
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
        int int70 = zeroIsMaxDateTimeField61.getMaximumValue();
        java.util.Locale locale72 = null;
        java.lang.String str73 = zeroIsMaxDateTimeField61.getAsText(12, locale72);
        long long76 = zeroIsMaxDateTimeField61.add(1L, (int) (byte) 9);
        java.lang.Object obj77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(obj77);
        org.joda.time.DateTime dateTime80 = dateTime78.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay81 = dateTime80.toTimeOfDay();
        int int82 = zeroIsMaxDateTimeField61.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay81);
        java.util.Locale locale84 = null;
        java.lang.String str85 = dividedDateTimeField42.getAsText((org.joda.time.ReadablePartial) timeOfDay81, (int) (short) 10, locale84);
        int int86 = offsetDateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay81);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-61994L) + "'", long45 == (-61994L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 266001L + "'", long48 == 266001L);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-61851226021989L) + "'", long51 == (-61851226021989L));
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 60 + "'", int70 == 60);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "12" + "'", str73, "12");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 9001L + "'", long76 == 9001L);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(timeOfDay81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 60 + "'", int82 == 60);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "10" + "'", str85, "10");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 8 + "'", int86 == 8);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology10.halfdayOfDay();
        org.joda.time.Chronology chronology13 = gregorianChronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology10.dayOfWeek();
        boolean boolean15 = dateTime9.equals((java.lang.Object) gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(gregorianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
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
        long long48 = remainderDateTimeField44.remainder(0L);
        long long50 = remainderDateTimeField44.roundHalfFloor(1712716010216L);
        java.util.Locale locale52 = null;
        java.lang.String str53 = remainderDateTimeField44.getAsShortText(25200022L, locale52);
        long long55 = remainderDateTimeField44.roundHalfFloor((long) 54000);
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
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1712716010000L + "'", long50 == 1712716010000L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "3" + "'", str53, "3");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 54000L + "'", long55 == 54000L);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str1 = iSOChronology0.toString();
        org.joda.time.DurationField durationField2 = iSOChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = iSOChronology0.getDateTimeMillis(256000, (int) (byte) 1, 18, (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -100 for millisOfDay must be in the range [0,86400000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ISOChronology[UTC]" + "'", str1, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        int int11 = dateTime10.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.dayOfMonth();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology14);
        int int18 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime20 = dateTime17.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime22 = dateTime17.minusDays((int) (byte) 15);
        int int23 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property24 = dateTime17.weekyear();
        org.joda.time.DurationField durationField25 = property24.getDurationField();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology28 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology28.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology28.monthOfYear();
        org.joda.time.DurationField durationField31 = gregorianChronology28.hours();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology28.secondOfMinute();
        boolean boolean34 = dateTimeField32.isLeap((long) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str36 = dateTimeFieldType35.toString();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField37 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField32, dateTimeFieldType35);
        java.lang.String str39 = zeroIsMaxDateTimeField37.getAsShortText((long) (short) 1);
        boolean boolean41 = zeroIsMaxDateTimeField37.isLeap((long) (byte) 11);
        long long43 = zeroIsMaxDateTimeField37.roundCeiling(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = org.joda.time.format.ISODateTimeFormat.time();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology47 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType46.getField((org.joda.time.Chronology) gregorianChronology47);
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology47.dayOfMonth();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology47);
        int int51 = dateTime50.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime53 = dateTime50.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime54 = dateTime53.toLocalTime();
        java.lang.String str55 = dateTimeFormatter44.print((org.joda.time.ReadablePartial) localTime54);
        int int56 = zeroIsMaxDateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) localTime54);
        java.util.Locale locale58 = null;
        java.lang.String str59 = dividedDateTimeField24.getAsShortText((org.joda.time.ReadablePartial) localTime54, (-360), locale58);
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
        org.junit.Assert.assertNotNull(gregorianChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "centuryOfEra" + "'", str36, "centuryOfEra");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "60" + "'", str39, "60");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(gregorianChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "00:00:00.017" + "'", str55, "00:00:00.017");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-360" + "'", str59, "-360");
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTime();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.halfdayOfDay();
        org.joda.time.Chronology chronology4 = gregorianChronology1.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = gregorianChronology1.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone5);
        boolean boolean7 = dateTimeFormatter6.isPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField21 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) zeroIsMaxDateTimeField9, dateTimeFieldType19, 2);
        int int24 = zeroIsMaxDateTimeField9.getDifference((long) (short) 10, (-61994L));
        long long27 = zeroIsMaxDateTimeField9.getDifferenceAsLong(0L, 16L);
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
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 62 + "'", int24 == 62);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
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
            int int13 = unsupportedDateTimeField9.get(0L);
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
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (byte) 2);
        long long7 = dateTimeZone1.convertLocalToUTC((long) (byte) 11, false, 0L);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = iSOChronology8.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField2 = gregorianChronology0.halfdays();
        org.joda.time.DurationField durationField3 = gregorianChronology0.months();
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        java.lang.String str5 = iSOChronology4.toString();
        org.joda.time.DurationField durationField6 = iSOChronology4.centuries();
        org.joda.time.DurationFieldType durationFieldType7 = durationField6.getType();
        org.joda.time.field.DecoratedDurationField decoratedDurationField8 = new org.joda.time.field.DecoratedDurationField(durationField3, durationFieldType7);
        long long11 = decoratedDurationField8.add(54000L, (long) 57600999);
        long long14 = decoratedDurationField8.getDifferenceAsLong(1712716010216L, (long) (byte) 12);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(iSOChronology4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 151475996678454000L + "'", long11 == 151475996678454000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 651L + "'", long14 == 651L);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
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
        int int38 = dividedDateTimeField29.getMinimumValue();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField8 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType4, (int) (byte) 7, 3, 0);
        int int9 = offsetDateTimeField8.getMaximumValue();
        long long11 = offsetDateTimeField8.roundFloor(589001L);
        long long13 = offsetDateTimeField8.roundHalfCeiling((long) 53);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology45.dayOfYear();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.monthOfYear();
        org.joda.time.DurationField durationField48 = gregorianChronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField49 = gregorianChronology45.centuryOfEra();
        java.lang.Object obj50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(obj50);
        org.joda.time.DateTime dateTime53 = dateTime51.minusYears(0);
        org.joda.time.TimeOfDay timeOfDay54 = dateTime53.toTimeOfDay();
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeField49.getAsShortText((org.joda.time.ReadablePartial) timeOfDay54, 99, locale56);
        java.util.Locale locale59 = null;
        java.lang.String str60 = remainderDateTimeField44.getAsText((org.joda.time.ReadablePartial) timeOfDay54, 26, locale59);
        long long62 = remainderDateTimeField44.roundFloor(97005L);
        int int64 = remainderDateTimeField44.get(1712716007070L);
        long long66 = remainderDateTimeField44.roundHalfCeiling(8L);
        long long68 = remainderDateTimeField44.roundHalfCeiling((-1712716007L));
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
        org.junit.Assert.assertNotNull(gregorianChronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "99" + "'", str57, "99");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "26" + "'", str60, "26");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 97000L + "'", long62 == 97000L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 9 + "'", int64 == 9);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-1712716000L) + "'", long68 == (-1712716000L));
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusSeconds((int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime3.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded((long) (byte) 23, (int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        int int11 = dateTime10.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.dayOfMonth();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 17, (org.joda.time.Chronology) gregorianChronology14);
        int int18 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime20 = dateTime17.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime22 = dateTime17.minusDays((int) (byte) 15);
        int int23 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime.Property property24 = dateTime17.weekyear();
        java.util.Locale locale25 = null;
        int int26 = property24.getMaximumTextLength(locale25);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }
}

package org.jfree.chart.plot;

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
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.SegmentedTimeline segmentedTimeline4 = org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline();
        long long6 = segmentedTimeline4.getTimeFromLong((long) (byte) 10);
        long long7 = segmentedTimeline4.getSegmentSize();
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createHighLowChart("RectangleEdge.RIGHT", "", "[10.0, 0.0]", oHLCDataset3, (org.jfree.chart.axis.Timeline) segmentedTimeline4, true);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer11 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean13 = xYAreaRenderer11.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint14 = xYAreaRenderer11.getBaseLegendTextPaint();
        java.awt.Stroke stroke16 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer11.setSeriesOutlineStroke(0, stroke16, false);
        java.awt.Font font20 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        xYAreaRenderer11.setSeriesItemLabelFont(0, font20);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart9.setTextAntiAlias((java.lang.Object) xYAreaRenderer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.renderer.xy.XYAreaRenderer@6e2d2c6b incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(segmentedTimeline4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("Last", "PlotOrientation.VERTICAL", "LGPL", oHLCDataset3, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.chart.JFreeChart@5c05e44e is not of type class sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.entity.EntityCollection entityCollection19 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = new org.jfree.chart.ChartRenderingInfo(entityCollection19);
        java.awt.Paint paint21 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean22 = chartRenderingInfo20.equals((java.lang.Object) paint21);
        java.awt.geom.Rectangle2D rectangle2D23 = chartRenderingInfo20.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = chartRenderingInfo20.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = plotRenderingInfo24.getOwner();
        java.awt.geom.Point2D point2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            combinedDomainXYPlot1.zoomRangeAxes((double) 100L, plotRenderingInfo24, point2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'source' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rectangle2D23);
        org.junit.Assert.assertNotNull(plotRenderingInfo24);
        org.junit.Assert.assertNotNull(chartRenderingInfo25);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.TimeZone timeZone4 = org.jfree.chart.axis.SegmentedTimeline.DEFAULT_TIME_ZONE;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection5 = new org.jfree.data.time.TimeSeriesCollection(timeZone4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer8 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection9 = categoryPlot6.getDomainMarkers((int) 'a', layer8);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        categoryPlot6.setDataset(4, categoryDataset11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        int int14 = categoryPlot13.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = categoryPlot13.getOrientation();
        categoryPlot6.setOrientation(plotOrientation15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart20 = org.jfree.chart.ChartFactory.createXYBarChart("", "0,0,0,0,0,0,0,0", false, "", (org.jfree.data.xy.IntervalXYDataset) timeSeriesCollection5, plotOrientation15, true, true, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.chart.JFreeChart@40612858 is not of type class sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Pacific Standard Time");
        org.junit.Assert.assertNotNull(layer8);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(plotOrientation15);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer11 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer11.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator14 = null;
        xYAreaRenderer11.setLegendItemURLGenerator(xYSeriesLabelGenerator14);
        xYAreaRenderer11.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean20 = xYAreaRenderer11.isSeriesVisible((-16777216));
        java.awt.Shape shape22 = xYAreaRenderer11.getLegendShape(0);
        java.awt.Shape shape24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer11.setSeriesShape((int) (byte) 100, shape24, false);
        java.awt.Paint paint28 = xYAreaRenderer11.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer11);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = combinedDomainXYPlot1.removeAnnotation(xYAnnotation30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNull(paint28);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        java.awt.geom.Point2D point2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            combinedDomainXYPlot1.setQuadrantOrigin(point2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'origin' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(textBlock23);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer11 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer11.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator14 = null;
        xYAreaRenderer11.setLegendItemURLGenerator(xYSeriesLabelGenerator14);
        xYAreaRenderer11.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean20 = xYAreaRenderer11.isSeriesVisible((-16777216));
        java.awt.Shape shape22 = xYAreaRenderer11.getLegendShape(0);
        java.awt.Shape shape24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer11.setSeriesShape((int) (byte) 100, shape24, false);
        java.awt.Paint paint28 = xYAreaRenderer11.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer11);
        java.awt.Stroke stroke30 = null;
        // The following exception was thrown during execution in test generation
        try {
            combinedDomainXYPlot1.setDomainZeroBaselineStroke(stroke30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNull(paint28);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("[10.0, 0.0]", "DatasetRenderingOrder.FORWARD", "0,0,0,0,0,0,0,0", oHLCDataset3, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.chart.JFreeChart@58fbb474 is not of type class sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font4 = barRenderer3D0.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        barRenderer3D0.setSeriesToolTipGenerator(15, categoryToolTipGenerator6, true);
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer12 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection13 = categoryPlot10.getDomainMarkers((int) 'a', layer12);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        categoryPlot10.setDataset(4, categoryDataset15);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        int int18 = categoryPlot17.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = categoryPlot17.getOrientation();
        categoryPlot10.setOrientation(plotOrientation19);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot10.getDomainAxisLocation();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        categoryPlot10.setDomainAxis(7, categoryAxis23, false);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot27 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis26);
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.entity.EntityCollection entityCollection29 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo30 = new org.jfree.chart.ChartRenderingInfo(entityCollection29);
        java.awt.Paint paint31 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean32 = chartRenderingInfo30.equals((java.lang.Object) paint31);
        java.awt.geom.Rectangle2D rectangle2D33 = chartRenderingInfo30.getChartArea();
        java.util.List list34 = null;
        combinedDomainXYPlot27.drawDomainGridlines(graphics2D28, rectangle2D33, list34);
        org.jfree.chart.axis.NumberAxis numberAxis37 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity40 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D33, (org.jfree.chart.axis.Axis) numberAxis37, "", "DatasetRenderingOrder.FORWARD");
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup42 = piePlot41.getDatasetGroup();
        int int43 = piePlot41.getBackgroundImageAlignment();
        boolean boolean44 = piePlot41.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        piePlot41.createAndAddEntity(rectangle2D45, plotRenderingInfo46, "hi!", "LGPL");
        piePlot41.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem54 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color57 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean58 = xYDataItem54.equals((java.lang.Object) "hi!");
        java.awt.Color color59 = java.awt.Color.MAGENTA;
        piePlot41.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color59);
        java.awt.Graphics2D graphics2D61 = null;
        org.jfree.chart.entity.EntityCollection entityCollection62 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo63 = new org.jfree.chart.ChartRenderingInfo(entityCollection62);
        java.awt.Paint paint64 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean65 = chartRenderingInfo63.equals((java.lang.Object) paint64);
        java.awt.geom.Rectangle2D rectangle2D66 = chartRenderingInfo63.getChartArea();
        piePlot41.drawBackgroundImage(graphics2D61, rectangle2D66);
        java.awt.Color color69 = java.awt.Color.blue;
        java.awt.Stroke stroke70 = null;
        // The following exception was thrown during execution in test generation
        try {
            barRenderer3D0.drawRangeLine(graphics2D9, categoryPlot10, (org.jfree.chart.axis.ValueAxis) numberAxis37, rectangle2D66, 0.05d, (java.awt.Paint) color69, stroke70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(layer12);
        org.junit.Assert.assertNull(collection13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(rectangle2D33);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(rectangle2D66);
        org.junit.Assert.assertNotNull(color69);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        combinedDomainXYPlot1.clearSelection();
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = combinedDomainXYPlot1.getRangeAxisEdge(15);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.axis.NumberAxis numberAxis11 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity14 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D7, (org.jfree.chart.axis.Axis) numberAxis11, "", "DatasetRenderingOrder.FORWARD");
        numberAxis11.setMinorTickMarkInsideLength((float) 60000L);
        java.text.NumberFormat numberFormat17 = numberAxis11.getNumberFormatOverride();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertNull(numberFormat17);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.canSelectByRegion();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D1 = new org.jfree.chart.axis.CategoryAxis3D("hi!");
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot5 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis4);
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.entity.EntityCollection entityCollection7 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo8 = new org.jfree.chart.ChartRenderingInfo(entityCollection7);
        java.awt.Paint paint9 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean10 = chartRenderingInfo8.equals((java.lang.Object) paint9);
        java.awt.geom.Rectangle2D rectangle2D11 = chartRenderingInfo8.getChartArea();
        java.util.List list12 = null;
        combinedDomainXYPlot5.drawDomainGridlines(graphics2D6, rectangle2D11, list12);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot15 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis14);
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.entity.EntityCollection entityCollection17 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = new org.jfree.chart.ChartRenderingInfo(entityCollection17);
        java.awt.Paint paint19 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean20 = chartRenderingInfo18.equals((java.lang.Object) paint19);
        java.awt.geom.Rectangle2D rectangle2D21 = chartRenderingInfo18.getChartArea();
        java.util.List list22 = null;
        combinedDomainXYPlot15.drawDomainGridlines(graphics2D16, rectangle2D21, list22);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer26 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection27 = categoryPlot24.getDomainMarkers((int) 'a', layer26);
        categoryPlot24.setAnchorValue((double) 0.0f, false);
        categoryPlot24.configureDomainAxes();
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = org.jfree.chart.util.RectangleEdge.RIGHT;
        double double36 = categoryPlot24.getRectX(0.0d, (double) ' ', (double) 15, rectangleEdge35);
        org.jfree.chart.entity.EntityCollection entityCollection37 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo38 = new org.jfree.chart.ChartRenderingInfo(entityCollection37);
        java.awt.Paint paint39 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean40 = chartRenderingInfo38.equals((java.lang.Object) paint39);
        java.awt.geom.Rectangle2D rectangle2D41 = chartRenderingInfo38.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = chartRenderingInfo38.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = plotRenderingInfo42.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo43);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.AxisState axisState45 = categoryAxis3D1.draw(graphics2D2, 0.0d, rectangle2D11, rectangle2D21, rectangleEdge35, plotRenderingInfo44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangle2D11);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangle2D21);
        org.junit.Assert.assertNotNull(layer26);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 15.0d + "'", double36 == 15.0d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(rectangle2D41);
        org.junit.Assert.assertNotNull(plotRenderingInfo42);
        org.junit.Assert.assertNotNull(chartRenderingInfo43);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot1.getDatasetGroup();
        int int3 = piePlot1.getBackgroundImageAlignment();
        boolean boolean4 = piePlot1.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot1.createAndAddEntity(rectangle2D5, plotRenderingInfo6, "hi!", "LGPL");
        java.awt.Paint paint10 = piePlot1.getLabelPaint();
        java.awt.Stroke stroke11 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        piePlot1.setOutlineStroke(stroke11);
        combinedDomainXYPlot0.setDomainMinorGridlineStroke(stroke11);
        combinedDomainXYPlot0.clearRangeMarkers();
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        java.awt.Color color13 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer15 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean17 = xYAreaRenderer15.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint18 = xYAreaRenderer15.getBaseLegendTextPaint();
        java.awt.Stroke stroke20 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer15.setSeriesOutlineStroke(0, stroke20, false);
        java.awt.Color color25 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer27 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean29 = xYAreaRenderer27.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint30 = xYAreaRenderer27.getBaseLegendTextPaint();
        java.awt.Stroke stroke32 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer27.setSeriesOutlineStroke(0, stroke32, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker36 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color13, stroke20, (java.awt.Paint) color25, stroke32, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor37 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker36.setLabelTextAnchor(textAnchor37);
        java.lang.String str39 = intervalMarker36.getLabel();
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer42 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection43 = categoryPlot40.getDomainMarkers((int) 'a', layer42);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        categoryPlot40.setDataset(4, categoryDataset45);
        org.jfree.chart.axis.AxisSpace axisSpace47 = categoryPlot40.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        org.jfree.chart.util.Layer layer51 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot40.drawRangeMarkers(graphics2D48, rectangle2D49, 0, layer51);
        java.awt.Color color55 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer57 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean59 = xYAreaRenderer57.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint60 = xYAreaRenderer57.getBaseLegendTextPaint();
        java.awt.Stroke stroke62 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer57.setSeriesOutlineStroke(0, stroke62, false);
        java.awt.Color color67 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer69 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean71 = xYAreaRenderer69.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint72 = xYAreaRenderer69.getBaseLegendTextPaint();
        java.awt.Stroke stroke74 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer69.setSeriesOutlineStroke(0, stroke74, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker78 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color55, stroke62, (java.awt.Paint) color67, stroke74, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor79 = intervalMarker78.getLabelTextAnchor();
        org.jfree.chart.util.Layer layer80 = org.jfree.chart.util.Layer.BACKGROUND;
        boolean boolean81 = categoryPlot40.removeDomainMarker((org.jfree.chart.plot.Marker) intervalMarker78, layer80);
        // The following exception was thrown during execution in test generation
        try {
            combinedDomainXYPlot1.addRangeMarker((int) '#', (org.jfree.chart.plot.Marker) intervalMarker36, layer80, true);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.chart.plot.CombinedDomainXYPlot@26db5336 is not of type class sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(textAnchor37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(layer42);
        org.junit.Assert.assertNull(collection43);
        org.junit.Assert.assertNull(axisSpace47);
        org.junit.Assert.assertNotNull(layer51);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(paint60);
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertNotNull(color67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(paint72);
        org.junit.Assert.assertNotNull(stroke74);
        org.junit.Assert.assertNotNull(textAnchor79);
        org.junit.Assert.assertNotNull(layer80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        org.junit.Assert.assertNotNull(axisLocation0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.jfree.chart.axis.NumberAxis numberAxis1 = new org.jfree.chart.axis.NumberAxis("");
        int int2 = numberAxis1.getMinorTickCount();
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot5.getDatasetGroup();
        int int7 = piePlot5.getBackgroundImageAlignment();
        boolean boolean8 = piePlot5.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot5.createAndAddEntity(rectangle2D9, plotRenderingInfo10, "hi!", "LGPL");
        piePlot5.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem18 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color21 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean22 = xYDataItem18.equals((java.lang.Object) "hi!");
        java.awt.Color color23 = java.awt.Color.MAGENTA;
        piePlot5.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color23);
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.entity.EntityCollection entityCollection26 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = new org.jfree.chart.ChartRenderingInfo(entityCollection26);
        java.awt.Paint paint28 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean29 = chartRenderingInfo27.equals((java.lang.Object) paint28);
        java.awt.geom.Rectangle2D rectangle2D30 = chartRenderingInfo27.getChartArea();
        piePlot5.drawBackgroundImage(graphics2D25, rectangle2D30);
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot33 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis32);
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.entity.EntityCollection entityCollection35 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo36 = new org.jfree.chart.ChartRenderingInfo(entityCollection35);
        java.awt.Paint paint37 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean38 = chartRenderingInfo36.equals((java.lang.Object) paint37);
        java.awt.geom.Rectangle2D rectangle2D39 = chartRenderingInfo36.getChartArea();
        java.util.List list40 = null;
        combinedDomainXYPlot33.drawDomainGridlines(graphics2D34, rectangle2D39, list40);
        org.jfree.chart.axis.NumberAxis numberAxis43 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity46 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D39, (org.jfree.chart.axis.Axis) numberAxis43, "", "DatasetRenderingOrder.FORWARD");
        org.jfree.chart.util.RectangleEdge rectangleEdge47 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str48 = rectangleEdge47.toString();
        org.jfree.chart.entity.EntityCollection entityCollection49 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo50 = new org.jfree.chart.ChartRenderingInfo(entityCollection49);
        java.awt.Paint paint51 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean52 = chartRenderingInfo50.equals((java.lang.Object) paint51);
        java.awt.geom.Rectangle2D rectangle2D53 = chartRenderingInfo50.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = chartRenderingInfo50.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo55 = plotRenderingInfo54.getOwner();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo56 = new org.jfree.chart.plot.PlotRenderingInfo(chartRenderingInfo55);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.AxisState axisState57 = numberAxis1.draw(graphics2D3, 149.0d, rectangle2D30, rectangle2D39, rectangleEdge47, plotRenderingInfo56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(rectangle2D30);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(rectangle2D39);
        org.junit.Assert.assertNotNull(rectangleEdge47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "RectangleEdge.RIGHT" + "'", str48, "RectangleEdge.RIGHT");
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(rectangle2D53);
        org.junit.Assert.assertNotNull(plotRenderingInfo54);
        org.junit.Assert.assertNotNull(chartRenderingInfo55);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        org.jfree.chart.title.TextTitle textTitle9 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity10 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D7, (org.jfree.chart.title.Title) textTitle9);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D12 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D7, rectangleAnchor11);
        org.jfree.chart.title.TextTitle textTitle15 = new org.jfree.chart.title.TextTitle("");
        boolean boolean16 = textTitle15.getExpandToFitSpace();
        textTitle15.setText("");
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        boolean boolean20 = textTitle15.equals((java.lang.Object) stroke19);
        java.awt.Paint paint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            combinedDomainXYPlot1.drawVerticalLine(graphics2D2, rectangle2D7, 0.0d, stroke19, paint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(point2D12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        categoryPlot0.setDataset(4, categoryDataset5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot0.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.util.Layer layer11 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.drawRangeMarkers(graphics2D8, rectangle2D9, 0, layer11);
        java.awt.Color color15 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer17 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean19 = xYAreaRenderer17.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint20 = xYAreaRenderer17.getBaseLegendTextPaint();
        java.awt.Stroke stroke22 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer17.setSeriesOutlineStroke(0, stroke22, false);
        java.awt.Color color27 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer29 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean31 = xYAreaRenderer29.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint32 = xYAreaRenderer29.getBaseLegendTextPaint();
        java.awt.Stroke stroke34 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer29.setSeriesOutlineStroke(0, stroke34, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker38 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color15, stroke22, (java.awt.Paint) color27, stroke34, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor39 = intervalMarker38.getLabelTextAnchor();
        org.jfree.chart.util.Layer layer40 = org.jfree.chart.util.Layer.BACKGROUND;
        boolean boolean41 = categoryPlot0.removeDomainMarker((org.jfree.chart.plot.Marker) intervalMarker38, layer40);
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot42 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        // The following exception was thrown during execution in test generation
        try {
            intervalMarker38.addChangeListener((org.jfree.chart.event.MarkerChangeListener) combinedDomainXYPlot42);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.chart.plot.CombinedDomainXYPlot@3da5d5b7 is not of type class sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(layer2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(axisSpace7);
        org.junit.Assert.assertNotNull(layer11);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(textAnchor39);
        org.junit.Assert.assertNotNull(layer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.jfree.data.general.SeriesException seriesException1 = new org.jfree.data.general.SeriesException("[10.0, 0.0]");
        org.jfree.data.general.SeriesException seriesException3 = new org.jfree.data.general.SeriesException("[10.0, 0.0]");
        seriesException1.addSuppressed((java.lang.Throwable) seriesException3);
        org.jfree.data.general.SeriesException seriesException6 = new org.jfree.data.general.SeriesException("[10.0, 0.0]");
        org.jfree.data.general.SeriesException seriesException8 = new org.jfree.data.general.SeriesException("[10.0, 0.0]");
        seriesException6.addSuppressed((java.lang.Throwable) seriesException8);
        seriesException3.addSuppressed((java.lang.Throwable) seriesException8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        java.awt.Paint paint26 = combinedDomainXYPlot1.getRangeGridlinePaint();
        org.jfree.chart.plot.Marker marker28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer31 = org.jfree.chart.util.Layer.BACKGROUND;
        java.util.Collection collection32 = categoryPlot29.getRangeMarkers(7, layer31);
        // The following exception was thrown during execution in test generation
        try {
            combinedDomainXYPlot1.addRangeMarker(4, marker28, layer31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(textBlock23);
        org.junit.Assert.assertNotNull(seriesRenderingOrder25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(layer31);
        org.junit.Assert.assertNull(collection32);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        combinedDomainXYPlot1.setDomainAxis(valueAxis18);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot21 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis20);
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.entity.EntityCollection entityCollection23 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = new org.jfree.chart.ChartRenderingInfo(entityCollection23);
        java.awt.Paint paint25 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean26 = chartRenderingInfo24.equals((java.lang.Object) paint25);
        java.awt.geom.Rectangle2D rectangle2D27 = chartRenderingInfo24.getChartArea();
        java.util.List list28 = null;
        combinedDomainXYPlot21.drawDomainGridlines(graphics2D22, rectangle2D27, list28);
        org.jfree.chart.axis.NumberAxis numberAxis31 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity34 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D27, (org.jfree.chart.axis.Axis) numberAxis31, "", "DatasetRenderingOrder.FORWARD");
        combinedDomainXYPlot1.setRangeAxis((org.jfree.chart.axis.ValueAxis) numberAxis31);
        double double36 = numberAxis31.getLowerMargin();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangle2D27);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.05d + "'", double36 == 0.05d);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list1 = combinedRangeXYPlot0.getSubplots();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis2);
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.entity.EntityCollection entityCollection5 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo6 = new org.jfree.chart.ChartRenderingInfo(entityCollection5);
        java.awt.Paint paint7 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean8 = chartRenderingInfo6.equals((java.lang.Object) paint7);
        java.awt.geom.Rectangle2D rectangle2D9 = chartRenderingInfo6.getChartArea();
        java.util.List list10 = null;
        combinedDomainXYPlot3.drawDomainGridlines(graphics2D4, rectangle2D9, list10);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer13 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer13.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator16 = null;
        xYAreaRenderer13.setLegendItemURLGenerator(xYSeriesLabelGenerator16);
        xYAreaRenderer13.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean22 = xYAreaRenderer13.isSeriesVisible((-16777216));
        java.awt.Shape shape24 = xYAreaRenderer13.getLegendShape(0);
        java.awt.Shape shape26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer13.setSeriesShape((int) (byte) 100, shape26, false);
        java.awt.Paint paint30 = xYAreaRenderer13.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot3.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer13);
        int int32 = combinedRangeXYPlot0.getIndexOf((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer13);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYAreaRenderer13.setLegendItemLabelGenerator(xYSeriesLabelGenerator33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'generator' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangle2D9);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer11 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer11.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator14 = null;
        xYAreaRenderer11.setLegendItemURLGenerator(xYSeriesLabelGenerator14);
        xYAreaRenderer11.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean20 = xYAreaRenderer11.isSeriesVisible((-16777216));
        java.awt.Shape shape22 = xYAreaRenderer11.getLegendShape(0);
        java.awt.Shape shape24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer11.setSeriesShape((int) (byte) 100, shape24, false);
        java.awt.Paint paint28 = xYAreaRenderer11.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer11);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator30 = null;
        xYAreaRenderer11.setBaseURLGenerator(xYURLGenerator30);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator33 = xYAreaRenderer11.getSeriesURLGenerator((int) (short) 10);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNull(xYURLGenerator33);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.axis.NumberAxis numberAxis11 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity14 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D7, (org.jfree.chart.axis.Axis) numberAxis11, "", "DatasetRenderingOrder.FORWARD");
        numberAxis11.centerRange(10.0d);
        org.jfree.chart.axis.TickUnits tickUnits17 = new org.jfree.chart.axis.TickUnits();
        numberAxis11.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource) tickUnits17);
        int int19 = tickUnits17.size();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str6 = rectangleEdge5.toString();
        double double7 = categoryPlot0.getRectX((double) '4', (double) 'a', (double) 'a', rectangleEdge5);
        boolean boolean8 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxis(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot13 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.entity.EntityCollection entityCollection15 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = new org.jfree.chart.ChartRenderingInfo(entityCollection15);
        java.awt.Paint paint17 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean18 = chartRenderingInfo16.equals((java.lang.Object) paint17);
        java.awt.geom.Rectangle2D rectangle2D19 = chartRenderingInfo16.getChartArea();
        java.util.List list20 = null;
        combinedDomainXYPlot13.drawDomainGridlines(graphics2D14, rectangle2D19, list20);
        org.jfree.chart.axis.NumberAxis numberAxis23 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity26 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D19, (org.jfree.chart.axis.Axis) numberAxis23, "", "DatasetRenderingOrder.FORWARD");
        numberAxis23.centerRange(10.0d);
        org.jfree.data.Range range29 = categoryPlot0.getDataRange((org.jfree.chart.axis.ValueAxis) numberAxis23);
        numberAxis23.setAutoRangeStickyZero(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RectangleEdge.RIGHT" + "'", str6, "RectangleEdge.RIGHT");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 149.0d + "'", double7 == 149.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle2D19);
        org.junit.Assert.assertNull(range29);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        categoryPlot0.setDataset(4, categoryDataset5);
        org.jfree.chart.axis.AxisLocation axisLocation7 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        categoryPlot0.setRangeAxisLocation(axisLocation7, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), plotRenderingInfo11, point2D12, false);
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot16 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list17 = combinedRangeXYPlot16.getSubplots();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot0.mapDatasetToDomainAxes(4, list17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(layer2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        // The following exception was thrown during execution in test generation
        try {
            combinedDomainXYPlot1.rendererChanged(rendererChangeEvent26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(textBlock23);
        org.junit.Assert.assertNotNull(seriesRenderingOrder25);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D1 = new org.jfree.chart.axis.CategoryAxis3D("hi!");
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer5 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection6 = categoryPlot3.getDomainMarkers((int) 'a', layer5);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        categoryPlot3.setDataset(4, categoryDataset8);
        org.jfree.chart.entity.EntityCollection entityCollection10 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = new org.jfree.chart.ChartRenderingInfo(entityCollection10);
        java.awt.Paint paint12 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean13 = chartRenderingInfo11.equals((java.lang.Object) paint12);
        java.awt.geom.Rectangle2D rectangle2D14 = chartRenderingInfo11.getChartArea();
        org.jfree.chart.title.TextTitle textTitle16 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity17 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D14, (org.jfree.chart.title.Title) textTitle16);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D19 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D14, rectangleAnchor18);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color21 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot20.setRangeZeroBaselinePaint((java.awt.Paint) color21);
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot20.getRangeAxisEdge((int) ' ');
        org.jfree.chart.axis.AxisSpace axisSpace25 = new org.jfree.chart.axis.AxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot28 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis27);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer30 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer30.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator33 = null;
        xYAreaRenderer30.setLegendItemURLGenerator(xYSeriesLabelGenerator33);
        xYAreaRenderer30.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean41 = xYAreaRenderer30.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot28.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer30);
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        int int44 = combinedDomainXYPlot28.getRangeAxisIndex(valueAxis43);
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        combinedDomainXYPlot28.setDomainAxis(valueAxis45);
        org.jfree.chart.util.RectangleEdge rectangleEdge48 = combinedDomainXYPlot28.getDomainAxisEdge(0);
        axisSpace25.add((double) 10L, rectangleEdge48);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.AxisSpace axisSpace50 = categoryAxis3D1.reserveSpace(graphics2D2, (org.jfree.chart.plot.Plot) categoryPlot3, rectangle2D14, rectangleEdge24, axisSpace25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(layer5);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangle2D14);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(point2D19);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(rectangleEdge24);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge48);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        combinedDomainXYPlot1.setDomainAxis(valueAxis18);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot21 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis20);
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.entity.EntityCollection entityCollection23 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = new org.jfree.chart.ChartRenderingInfo(entityCollection23);
        java.awt.Paint paint25 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean26 = chartRenderingInfo24.equals((java.lang.Object) paint25);
        java.awt.geom.Rectangle2D rectangle2D27 = chartRenderingInfo24.getChartArea();
        java.util.List list28 = null;
        combinedDomainXYPlot21.drawDomainGridlines(graphics2D22, rectangle2D27, list28);
        org.jfree.chart.axis.NumberAxis numberAxis31 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity34 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D27, (org.jfree.chart.axis.Axis) numberAxis31, "", "DatasetRenderingOrder.FORWARD");
        combinedDomainXYPlot1.setRangeAxis((org.jfree.chart.axis.ValueAxis) numberAxis31);
        org.jfree.chart.axis.NumberTickUnit numberTickUnit36 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberAxis31.setTickUnit(numberTickUnit36, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'unit' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangle2D27);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        java.awt.Paint paint26 = org.jfree.chart.plot.PolarPlot.DEFAULT_GRIDLINE_PAINT;
        combinedDomainXYPlot1.setRangeTickBandPaint(paint26);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(textBlock23);
        org.junit.Assert.assertNotNull(seriesRenderingOrder25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.jfree.chart.title.TextTitle textTitle1 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.util.HorizontalAlignment horizontalAlignment2 = textTitle1.getTextAlignment();
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer4 = new org.jfree.chart.block.BlockContainer((org.jfree.chart.block.Arrangement) borderArrangement3);
        boolean boolean5 = horizontalAlignment2.equals((java.lang.Object) borderArrangement3);
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        java.util.TimeZone timeZone7 = null;
        org.jfree.data.time.TimeSeriesCollection timeSeriesCollection8 = new org.jfree.data.time.TimeSeriesCollection(timeZone7);
        org.jfree.chart.title.LegendItemBlockContainer legendItemBlockContainer10 = new org.jfree.chart.title.LegendItemBlockContainer((org.jfree.chart.block.Arrangement) borderArrangement6, (org.jfree.data.general.Dataset) timeSeriesCollection8, (java.lang.Comparable) (byte) 10);
        java.lang.Object obj11 = legendItemBlockContainer10.clone();
        org.jfree.data.general.Dataset dataset12 = legendItemBlockContainer10.getDataset();
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.data.Range range15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = new org.jfree.chart.block.RectangleConstraint(0.0d, range15);
        org.jfree.data.Range range19 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range22 = new org.jfree.data.Range((double) (-1L), 0.0d);
        org.jfree.data.Range range23 = org.jfree.data.Range.combine(range19, range22);
        org.jfree.data.Range range24 = org.jfree.chart.axis.ValueAxis.DEFAULT_RANGE;
        org.jfree.data.Range range25 = org.jfree.data.Range.combine(range19, range24);
        org.jfree.chart.block.RectangleConstraint rectangleConstraint26 = rectangleConstraint16.toRangeWidth(range19);
        org.jfree.data.Range range27 = org.jfree.chart.axis.ValueAxis.DEFAULT_RANGE;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint28 = rectangleConstraint16.toRangeHeight(range27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D29 = borderArrangement3.arrange((org.jfree.chart.block.BlockContainer) legendItemBlockContainer10, graphics2D13, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(horizontalAlignment2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(dataset12);
        org.junit.Assert.assertNotNull(range23);
        org.junit.Assert.assertNotNull(range24);
        org.junit.Assert.assertNotNull(range25);
        org.junit.Assert.assertNotNull(rectangleConstraint26);
        org.junit.Assert.assertNotNull(range27);
        org.junit.Assert.assertNotNull(rectangleConstraint28);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        combinedDomainXYPlot1.setDomainAxis(valueAxis18);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot21 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis20);
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.entity.EntityCollection entityCollection23 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = new org.jfree.chart.ChartRenderingInfo(entityCollection23);
        java.awt.Paint paint25 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean26 = chartRenderingInfo24.equals((java.lang.Object) paint25);
        java.awt.geom.Rectangle2D rectangle2D27 = chartRenderingInfo24.getChartArea();
        java.util.List list28 = null;
        combinedDomainXYPlot21.drawDomainGridlines(graphics2D22, rectangle2D27, list28);
        org.jfree.chart.axis.NumberAxis numberAxis31 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity34 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D27, (org.jfree.chart.axis.Axis) numberAxis31, "", "DatasetRenderingOrder.FORWARD");
        combinedDomainXYPlot1.setRangeAxis((org.jfree.chart.axis.ValueAxis) numberAxis31);
        numberAxis31.setTickMarksVisible(false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangle2D27);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.jfree.chart.axis.NumberAxis numberAxis1 = new org.jfree.chart.axis.NumberAxis("");
        double double2 = numberAxis1.getAutoRangeMinimumSize();
        numberAxis1.setLowerBound((double) (byte) -1);
        java.lang.Object obj5 = numberAxis1.clone();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-8d + "'", double2 == 1.0E-8d);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        boolean boolean4 = xYAreaRenderer1.getPlotLines();
        boolean boolean5 = xYAreaRenderer1.getBaseItemLabelsVisible();
        java.awt.Paint paint6 = xYAreaRenderer1.getBasePaint();
        java.awt.Font font7 = xYAreaRenderer1.getBaseItemLabelFont();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator8 = null;
        xYAreaRenderer1.setBaseItemLabelGenerator(xYItemLabelGenerator8);
        xYAreaRenderer1.setUseFillPaint(true);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        combinedDomainXYPlot14.clearDomainMarkers();
        boolean boolean30 = combinedDomainXYPlot14.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.NumberAxis numberAxis32 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis32.pan((double) 1);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot36 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis35);
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.entity.EntityCollection entityCollection38 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo39 = new org.jfree.chart.ChartRenderingInfo(entityCollection38);
        java.awt.Paint paint40 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean41 = chartRenderingInfo39.equals((java.lang.Object) paint40);
        java.awt.geom.Rectangle2D rectangle2D42 = chartRenderingInfo39.getChartArea();
        java.util.List list43 = null;
        combinedDomainXYPlot36.drawDomainGridlines(graphics2D37, rectangle2D42, list43);
        org.jfree.chart.axis.NumberAxis numberAxis46 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity49 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D42, (org.jfree.chart.axis.Axis) numberAxis46, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer1.drawDomainGridLine(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) numberAxis32, rectangle2D42, (double) 11);
        numberAxis32.setLabelToolTip("{0}: ({1}, {2})");
        org.jfree.chart.text.TextLine textLine55 = new org.jfree.chart.text.TextLine("hi!");
        org.jfree.chart.text.TextFragment textFragment56 = textLine55.getLastTextFragment();
        java.awt.Font font57 = textFragment56.getFont();
        numberAxis32.setLabelFont(font57);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(rectangle2D42);
        org.junit.Assert.assertNotNull(textFragment56);
        org.junit.Assert.assertNotNull(font57);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.Number number0 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.axis.TickType tickType6 = org.jfree.chart.axis.TickType.MINOR;
        java.awt.Color color11 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer13 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean15 = xYAreaRenderer13.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint16 = xYAreaRenderer13.getBaseLegendTextPaint();
        java.awt.Stroke stroke18 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer13.setSeriesOutlineStroke(0, stroke18, false);
        java.awt.Color color23 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer25 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean27 = xYAreaRenderer25.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint28 = xYAreaRenderer25.getBaseLegendTextPaint();
        java.awt.Stroke stroke30 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer25.setSeriesOutlineStroke(0, stroke30, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker34 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color11, stroke18, (java.awt.Paint) color23, stroke30, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor35 = intervalMarker34.getLabelTextAnchor();
        java.awt.Color color38 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer40 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean42 = xYAreaRenderer40.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint43 = xYAreaRenderer40.getBaseLegendTextPaint();
        java.awt.Stroke stroke45 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer40.setSeriesOutlineStroke(0, stroke45, false);
        java.awt.Color color50 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer52 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean54 = xYAreaRenderer52.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint55 = xYAreaRenderer52.getBaseLegendTextPaint();
        java.awt.Stroke stroke57 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer52.setSeriesOutlineStroke(0, stroke57, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker61 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color38, stroke45, (java.awt.Paint) color50, stroke57, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor62 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker61.setLabelTextAnchor(textAnchor62);
        org.jfree.chart.axis.NumberTick numberTick65 = new org.jfree.chart.axis.NumberTick(tickType6, 2.0d, "ThreadContext", textAnchor35, textAnchor62, 0.0d);
        org.jfree.chart.text.TextAnchor textAnchor67 = org.jfree.chart.text.TextAnchor.TOP_RIGHT;
        java.awt.Shape shape68 = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds("", graphics2D3, (float) 255, (float) 100, textAnchor35, (double) (-1L), textAnchor67);
        java.awt.Color color71 = java.awt.Color.cyan;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer73 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean75 = xYAreaRenderer73.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint76 = xYAreaRenderer73.getBaseLegendTextPaint();
        java.awt.Stroke stroke78 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer73.setSeriesOutlineStroke(0, stroke78, false);
        java.awt.Color color83 = java.awt.Color.getColor("hi!", (int) (short) 100);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer85 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean87 = xYAreaRenderer85.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint88 = xYAreaRenderer85.getBaseLegendTextPaint();
        java.awt.Stroke stroke90 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer85.setSeriesOutlineStroke(0, stroke90, false);
        org.jfree.chart.plot.IntervalMarker intervalMarker94 = new org.jfree.chart.plot.IntervalMarker((double) 0, (double) (byte) 100, (java.awt.Paint) color71, stroke78, (java.awt.Paint) color83, stroke90, (float) (byte) 1);
        org.jfree.chart.text.TextAnchor textAnchor95 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        intervalMarker94.setLabelTextAnchor(textAnchor95);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.NumberTick numberTick98 = new org.jfree.chart.axis.NumberTick(number0, "0,0,0,0,0,0,0,0", textAnchor35, textAnchor95, (double) 60000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tickType6);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(textAnchor35);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(paint43);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(paint55);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(textAnchor62);
        org.junit.Assert.assertNotNull(textAnchor67);
        org.junit.Assert.assertNull(shape68);
        org.junit.Assert.assertNotNull(color71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(paint76);
        org.junit.Assert.assertNotNull(stroke78);
        org.junit.Assert.assertNotNull(color83);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(paint88);
        org.junit.Assert.assertNotNull(stroke90);
        org.junit.Assert.assertNotNull(textAnchor95);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        boolean boolean10 = combinedDomainXYPlot1.isDomainGridlinesVisible();
        combinedDomainXYPlot1.setDomainPannable(true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = combinedRangeXYPlot0.getLegendItems();
        combinedRangeXYPlot0.setRangePannable(false);
        org.junit.Assert.assertNotNull(legendItemCollection1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double20 = rectangleInsets19.getLeft();
        double double22 = rectangleInsets19.calculateLeftOutset((double) 0L);
        combinedDomainXYPlot1.setAxisOffset(rectangleInsets19);
        combinedDomainXYPlot1.setDomainGridlinesVisible(false);
        boolean boolean26 = combinedDomainXYPlot1.isDomainMinorGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D2 = new org.jfree.chart.renderer.category.BarRenderer3D((double) 0.0f, (double) 100L);
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot4 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis3);
        java.awt.Color color5 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot4.setRangeMinorGridlinePaint((java.awt.Paint) color5);
        boolean boolean7 = combinedDomainXYPlot4.canSelectByRegion();
        barRenderer3D2.addChangeListener((org.jfree.chart.event.RendererChangeListener) combinedDomainXYPlot4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        combinedDomainXYPlot1.setDomainMinorGridlinesVisible(false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        double double1 = combinedRangeXYPlot0.getGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.isRangeCrosshairVisible();
        boolean boolean19 = combinedDomainXYPlot1.isDomainMinorGridlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.jfree.data.general.WaferMapDataset waferMapDataset0 = null;
        org.jfree.chart.renderer.WaferMapRenderer waferMapRenderer1 = null;
        org.jfree.chart.plot.WaferMapPlot waferMapPlot2 = new org.jfree.chart.plot.WaferMapPlot(waferMapDataset0, waferMapRenderer1);
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer5 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer5.clearSeriesStrokes(false);
        boolean boolean8 = xYAreaRenderer5.getPlotLines();
        boolean boolean9 = xYAreaRenderer5.getBaseItemLabelsVisible();
        java.awt.Paint paint10 = xYAreaRenderer5.getBasePaint();
        java.awt.Font font11 = xYAreaRenderer5.getBaseItemLabelFont();
        org.jfree.chart.labels.XYItemLabelGenerator xYItemLabelGenerator12 = null;
        xYAreaRenderer5.setBaseItemLabelGenerator(xYItemLabelGenerator12);
        xYAreaRenderer5.setUseFillPaint(true);
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot18 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis17);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer20 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer20.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator23 = null;
        xYAreaRenderer20.setLegendItemURLGenerator(xYSeriesLabelGenerator23);
        xYAreaRenderer20.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean31 = xYAreaRenderer20.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot18.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer20);
        combinedDomainXYPlot18.clearDomainMarkers();
        boolean boolean34 = combinedDomainXYPlot18.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.NumberAxis numberAxis36 = new org.jfree.chart.axis.NumberAxis("");
        numberAxis36.pan((double) 1);
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot40 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis39);
        java.awt.Graphics2D graphics2D41 = null;
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        java.util.List list47 = null;
        combinedDomainXYPlot40.drawDomainGridlines(graphics2D41, rectangle2D46, list47);
        org.jfree.chart.axis.NumberAxis numberAxis50 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity53 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D46, (org.jfree.chart.axis.Axis) numberAxis50, "", "DatasetRenderingOrder.FORWARD");
        xYAreaRenderer5.drawDomainGridLine(graphics2D16, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot18, (org.jfree.chart.axis.ValueAxis) numberAxis36, rectangle2D46, (double) 11);
        // The following exception was thrown during execution in test generation
        try {
            waferMapPlot2.drawWaferEdge(graphics2D3, rectangle2D46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(rectangle2D46);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.jfree.chart.plot.XYPlot xYPlot0 = new org.jfree.chart.plot.XYPlot();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.jfree.data.time.Year year1 = new org.jfree.data.time.Year((int) (short) 0);
        long long2 = year1.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = year1.previous();
        java.util.Date date4 = year1.getStart();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-62167363200000L) + "'", long2 == (-62167363200000L));
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 PST 1");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        boolean boolean16 = combinedDomainXYPlot1.canSelectByPoint();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer19 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer19.clearSeriesStrokes(false);
        boolean boolean22 = xYAreaRenderer19.getPlotLines();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer19.setSeriesStroke((int) (short) 1, stroke24, true);
        combinedDomainXYPlot1.setRenderer(1, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer19, true);
        xYAreaRenderer19.setAutoPopulateSeriesPaint(true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.jfree.chart.renderer.category.BarRenderer3D barRenderer3D0 = new org.jfree.chart.renderer.category.BarRenderer3D();
        java.awt.Font font4 = barRenderer3D0.getItemLabelFont((int) (byte) -1, (int) (byte) 1, false);
        java.awt.Shape shape5 = barRenderer3D0.getBaseShape();
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer8 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer8.clearSeriesStrokes(false);
        boolean boolean11 = xYAreaRenderer8.getPlotLines();
        boolean boolean12 = xYAreaRenderer8.getBaseItemLabelsVisible();
        java.awt.Paint paint14 = org.jfree.chart.plot.WaferMapPlot.DEFAULT_CROSSHAIR_PAINT;
        xYAreaRenderer8.setSeriesFillPaint(7, paint14);
        barRenderer3D0.setSeriesFillPaint(10, paint14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = barRenderer3D0.findRangeBounds(categoryDataset17);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = barRenderer3D0.getBaseURLGenerator();
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer23 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection24 = categoryPlot21.getDomainMarkers((int) 'a', layer23);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        categoryPlot21.setDataset(4, categoryDataset26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = categoryPlot21.getDrawingSupplier();
        org.jfree.chart.axis.CategoryAxis3D categoryAxis3D30 = new org.jfree.chart.axis.CategoryAxis3D("LGPL");
        org.jfree.chart.plot.CategoryMarker categoryMarker31 = null;
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup33 = piePlot32.getDatasetGroup();
        int int34 = piePlot32.getBackgroundImageAlignment();
        boolean boolean35 = piePlot32.getAutoPopulateSectionOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        piePlot32.createAndAddEntity(rectangle2D36, plotRenderingInfo37, "hi!", "LGPL");
        piePlot32.setStartAngle((double) 1);
        org.jfree.data.xy.XYDataItem xYDataItem45 = new org.jfree.data.xy.XYDataItem((double) (byte) 10, (double) 0);
        java.awt.Color color48 = java.awt.Color.getColor("hi!", (int) (short) 100);
        boolean boolean49 = xYDataItem45.equals((java.lang.Object) "hi!");
        java.awt.Color color50 = java.awt.Color.MAGENTA;
        piePlot32.setSectionPaint((java.lang.Comparable) "hi!", (java.awt.Paint) color50);
        java.awt.Graphics2D graphics2D52 = null;
        org.jfree.chart.entity.EntityCollection entityCollection53 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo54 = new org.jfree.chart.ChartRenderingInfo(entityCollection53);
        java.awt.Paint paint55 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean56 = chartRenderingInfo54.equals((java.lang.Object) paint55);
        java.awt.geom.Rectangle2D rectangle2D57 = chartRenderingInfo54.getChartArea();
        piePlot32.drawBackgroundImage(graphics2D52, rectangle2D57);
        // The following exception was thrown during execution in test generation
        try {
            barRenderer3D0.drawDomainMarker(graphics2D20, categoryPlot21, (org.jfree.chart.axis.CategoryAxis) categoryAxis3D30, categoryMarker31, rectangle2D57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNull(categoryURLGenerator19);
        org.junit.Assert.assertNotNull(layer23);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertNotNull(drawingSupplier28);
        org.junit.Assert.assertNull(datasetGroup33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(rectangle2D57);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer11 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer11.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator14 = null;
        xYAreaRenderer11.setLegendItemURLGenerator(xYSeriesLabelGenerator14);
        xYAreaRenderer11.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean20 = xYAreaRenderer11.isSeriesVisible((-16777216));
        java.awt.Shape shape22 = xYAreaRenderer11.getLegendShape(0);
        java.awt.Shape shape24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer11.setSeriesShape((int) (byte) 100, shape24, false);
        java.awt.Paint paint28 = xYAreaRenderer11.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer11);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator30 = null;
        xYAreaRenderer11.setBaseURLGenerator(xYURLGenerator30);
        java.awt.Color color32 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        xYAreaRenderer11.setBaseFillPaint((java.awt.Paint) color32);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer35 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer35.clearSeriesStrokes(false);
        boolean boolean38 = xYAreaRenderer35.getPlotLines();
        boolean boolean39 = xYAreaRenderer35.getBaseItemLabelsVisible();
        java.awt.Paint paint40 = xYAreaRenderer35.getBasePaint();
        double double41 = xYAreaRenderer35.getItemLabelAnchorOffset();
        java.awt.Stroke stroke42 = xYAreaRenderer35.getBaseOutlineStroke();
        xYAreaRenderer11.setBaseOutlineStroke(stroke42, false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 2.0d + "'", double41 == 2.0d);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str6 = rectangleEdge5.toString();
        double double7 = categoryPlot0.getRectX((double) '4', (double) 'a', (double) 'a', rectangleEdge5);
        boolean boolean8 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxis(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot13 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.entity.EntityCollection entityCollection15 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = new org.jfree.chart.ChartRenderingInfo(entityCollection15);
        java.awt.Paint paint17 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean18 = chartRenderingInfo16.equals((java.lang.Object) paint17);
        java.awt.geom.Rectangle2D rectangle2D19 = chartRenderingInfo16.getChartArea();
        java.util.List list20 = null;
        combinedDomainXYPlot13.drawDomainGridlines(graphics2D14, rectangle2D19, list20);
        org.jfree.chart.axis.NumberAxis numberAxis23 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity26 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D19, (org.jfree.chart.axis.Axis) numberAxis23, "", "DatasetRenderingOrder.FORWARD");
        numberAxis23.centerRange(10.0d);
        org.jfree.data.Range range29 = categoryPlot0.getDataRange((org.jfree.chart.axis.ValueAxis) numberAxis23);
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.axis.AxisState axisState31 = new org.jfree.chart.axis.AxisState();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer34 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection35 = categoryPlot32.getDomainMarkers((int) 'a', layer34);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        categoryPlot32.setDataset(4, categoryDataset37);
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot();
        int int40 = categoryPlot39.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation41 = categoryPlot39.getOrientation();
        categoryPlot32.setOrientation(plotOrientation41);
        boolean boolean43 = categoryPlot32.isDomainPannable();
        categoryPlot32.setRangeCrosshairValue((double) 10);
        java.awt.Graphics2D graphics2D46 = null;
        org.jfree.chart.entity.EntityCollection entityCollection47 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo48 = new org.jfree.chart.ChartRenderingInfo(entityCollection47);
        java.awt.Paint paint49 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean50 = chartRenderingInfo48.equals((java.lang.Object) paint49);
        java.awt.geom.Rectangle2D rectangle2D51 = chartRenderingInfo48.getChartArea();
        org.jfree.chart.title.TextTitle textTitle53 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity54 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D51, (org.jfree.chart.title.Title) textTitle53);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor55 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D56 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D51, rectangleAnchor55);
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity63 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D51, pieDataset57, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.AxisSpace axisSpace64 = new org.jfree.chart.axis.AxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis66 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot67 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis66);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer69 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer69.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator72 = null;
        xYAreaRenderer69.setLegendItemURLGenerator(xYSeriesLabelGenerator72);
        xYAreaRenderer69.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean80 = xYAreaRenderer69.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot67.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer69);
        org.jfree.chart.axis.ValueAxis valueAxis82 = null;
        int int83 = combinedDomainXYPlot67.getRangeAxisIndex(valueAxis82);
        org.jfree.chart.axis.ValueAxis valueAxis84 = null;
        combinedDomainXYPlot67.setDomainAxis(valueAxis84);
        org.jfree.chart.util.RectangleEdge rectangleEdge87 = combinedDomainXYPlot67.getDomainAxisEdge(0);
        axisSpace64.add((double) 10L, rectangleEdge87);
        org.jfree.chart.axis.AxisSpace axisSpace89 = categoryPlot32.calculateDomainAxisSpace(graphics2D46, rectangle2D51, axisSpace64);
        org.jfree.chart.plot.CategoryPlot categoryPlot90 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color91 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot90.setRangeZeroBaselinePaint((java.awt.Paint) color91);
        org.jfree.chart.util.RectangleEdge rectangleEdge94 = categoryPlot90.getRangeAxisEdge((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list95 = numberAxis23.refreshTicks(graphics2D30, axisState31, rectangle2D51, rectangleEdge94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RectangleEdge.RIGHT" + "'", str6, "RectangleEdge.RIGHT");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 149.0d + "'", double7 == 149.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle2D19);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertNotNull(layer34);
        org.junit.Assert.assertNull(collection35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(plotOrientation41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(rectangle2D51);
        org.junit.Assert.assertNotNull(rectangleAnchor55);
        org.junit.Assert.assertNotNull(point2D56);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge87);
        org.junit.Assert.assertNotNull(axisSpace89);
        org.junit.Assert.assertNotNull(color91);
        org.junit.Assert.assertNotNull(rectangleEdge94);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis19 = combinedDomainXYPlot1.getRangeAxis((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(valueAxis19);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("ThreadContext", "MINOR", "RectangleAnchor.BOTTOM_RIGHT", oHLCDataset3, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.chart.JFreeChart@4f47dbd0 is not of type class sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.axis.NumberAxis numberAxis11 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity14 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D7, (org.jfree.chart.axis.Axis) numberAxis11, "", "DatasetRenderingOrder.FORWARD");
        numberAxis11.centerRange(10.0d);
        org.jfree.chart.axis.TickUnits tickUnits17 = new org.jfree.chart.axis.TickUnits();
        numberAxis11.setStandardTickUnits((org.jfree.chart.axis.TickUnitSource) tickUnits17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.TickUnit tickUnit20 = tickUnits17.getCeilingTickUnit((double) (-16777116));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        boolean boolean4 = xYAreaRenderer1.getPlotLines();
        java.awt.Paint paint8 = xYAreaRenderer1.getItemPaint((int) (byte) -1, 7, false);
        java.awt.Shape shape10 = xYAreaRenderer1.getLegendShape(8);
        org.jfree.chart.labels.XYToolTipGenerator xYToolTipGenerator11 = xYAreaRenderer1.getBaseToolTipGenerator();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot13 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis12);
        java.awt.Color color14 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot13.setRangeMinorGridlinePaint((java.awt.Paint) color14);
        boolean boolean16 = combinedDomainXYPlot13.isDomainPannable();
        xYAreaRenderer1.setPlot((org.jfree.chart.plot.XYPlot) combinedDomainXYPlot13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(xYToolTipGenerator11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = combinedDomainXYPlot1.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.title.Title.DEFAULT_PADDING;
        double double20 = rectangleInsets19.getLeft();
        double double22 = rectangleInsets19.calculateLeftOutset((double) 0L);
        combinedDomainXYPlot1.setAxisOffset(rectangleInsets19);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation24 = null;
        // The following exception was thrown during execution in test generation
        try {
            combinedDomainXYPlot1.addAnnotation(xYAnnotation24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke1 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot0.setRangeCrosshairStroke(stroke1);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            combinedRangeXYPlot0.addAnnotation(xYAnnotation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.jfree.data.time.Year year2 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year4 = new org.jfree.data.time.Year((int) (short) 0);
        long long5 = year4.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis6 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year2, (org.jfree.data.time.RegularTimePeriod) year4);
        org.jfree.chart.entity.EntityCollection entityCollection8 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = new org.jfree.chart.ChartRenderingInfo(entityCollection8);
        java.awt.Paint paint10 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean11 = chartRenderingInfo9.equals((java.lang.Object) paint10);
        java.awt.geom.Rectangle2D rectangle2D12 = chartRenderingInfo9.getChartArea();
        org.jfree.chart.title.TextTitle textTitle14 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity15 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D12, (org.jfree.chart.title.Title) textTitle14);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D17 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D12, rectangleAnchor16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Color color19 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot18.setRangeZeroBaselinePaint((java.awt.Paint) color19);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot18.getRangeAxisEdge((int) ' ');
        double double23 = periodAxis6.java2DToValue(0.0d, rectangle2D12, rectangleEdge22);
        java.lang.String str24 = periodAxis6.getLabelToolTip();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-62167363200000L) + "'", long5 == (-62167363200000L));
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rectangle2D12);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertNotNull(point2D17);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(rectangleEdge22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.axis.NumberAxis numberAxis11 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity14 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D7, (org.jfree.chart.axis.Axis) numberAxis11, "", "DatasetRenderingOrder.FORWARD");
        java.lang.String str15 = axisEntity14.toString();
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AxisEntity: tooltip = " + "'", str15, "AxisEntity: tooltip = ");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Stroke stroke2 = combinedDomainXYPlot1.getRangeZeroBaselineStroke();
        org.junit.Assert.assertNotNull(stroke2);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        combinedDomainXYPlot1.setDomainAxis(valueAxis18);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot21 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis20);
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.entity.EntityCollection entityCollection23 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = new org.jfree.chart.ChartRenderingInfo(entityCollection23);
        java.awt.Paint paint25 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean26 = chartRenderingInfo24.equals((java.lang.Object) paint25);
        java.awt.geom.Rectangle2D rectangle2D27 = chartRenderingInfo24.getChartArea();
        java.util.List list28 = null;
        combinedDomainXYPlot21.drawDomainGridlines(graphics2D22, rectangle2D27, list28);
        org.jfree.chart.axis.NumberAxis numberAxis31 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity34 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D27, (org.jfree.chart.axis.Axis) numberAxis31, "", "DatasetRenderingOrder.FORWARD");
        combinedDomainXYPlot1.setRangeAxis((org.jfree.chart.axis.ValueAxis) numberAxis31);
        org.jfree.chart.ui.ProjectInfo projectInfo37 = org.jfree.chart.JFreeChart.INFO;
        org.jfree.chart.ui.Library[] libraryArray38 = projectInfo37.getOptionalLibraries();
        org.jfree.chart.axis.SegmentedTimeline segmentedTimeline39 = org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline();
        boolean boolean42 = segmentedTimeline39.containsDomainRange((long) 1, (long) (byte) 10);
        long long44 = segmentedTimeline39.toTimelineValue((long) '#');
        java.util.List list45 = segmentedTimeline39.getExceptionSegments();
        projectInfo37.setContributors(list45);
        // The following exception was thrown during execution in test generation
        try {
            combinedDomainXYPlot1.mapDatasetToDomainAxes((int) (byte) 10, list45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangle2D27);
        org.junit.Assert.assertNotNull(projectInfo37);
        org.junit.Assert.assertNotNull(libraryArray38);
        org.junit.Assert.assertNotNull(segmentedTimeline39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1577894400035L + "'", long44 == 1577894400035L);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        categoryPlot0.setAnchorValue((double) 0.0f, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = categoryPlot0.getDomainAxis(0);
        org.junit.Assert.assertNotNull(layer2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(categoryAxis8);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        java.util.List list8 = null;
        combinedDomainXYPlot1.drawDomainGridlines(graphics2D2, rectangle2D7, list8);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer11 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer11.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator14 = null;
        xYAreaRenderer11.setLegendItemURLGenerator(xYSeriesLabelGenerator14);
        xYAreaRenderer11.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean20 = xYAreaRenderer11.isSeriesVisible((-16777216));
        java.awt.Shape shape22 = xYAreaRenderer11.getLegendShape(0);
        java.awt.Shape shape24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        xYAreaRenderer11.setSeriesShape((int) (byte) 100, shape24, false);
        java.awt.Paint paint28 = xYAreaRenderer11.getSeriesItemLabelPaint(5);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer11);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator31 = null;
        xYAreaRenderer11.setSeriesURLGenerator(5, xYURLGenerator31);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNull(paint28);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        combinedDomainXYPlot1.clearDomainMarkers();
        java.awt.Font font18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint19 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer22 = null;
        org.jfree.chart.text.TextBlock textBlock23 = org.jfree.chart.text.TextUtilities.createTextBlock("", font18, paint19, (float) (-1L), (int) (short) -1, textMeasurer22);
        combinedDomainXYPlot1.setDomainCrosshairPaint(paint19);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = combinedDomainXYPlot1.getSeriesRenderingOrder();
        combinedDomainXYPlot1.clearDomainMarkers();
        int int27 = combinedDomainXYPlot1.getRendererCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = combinedDomainXYPlot1.getRenderer((-1));
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot32 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis31);
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.entity.EntityCollection entityCollection34 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo35 = new org.jfree.chart.ChartRenderingInfo(entityCollection34);
        java.awt.Paint paint36 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean37 = chartRenderingInfo35.equals((java.lang.Object) paint36);
        java.awt.geom.Rectangle2D rectangle2D38 = chartRenderingInfo35.getChartArea();
        java.util.List list39 = null;
        combinedDomainXYPlot32.drawDomainGridlines(graphics2D33, rectangle2D38, list39);
        org.jfree.chart.axis.NumberAxis numberAxis42 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity45 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D38, (org.jfree.chart.axis.Axis) numberAxis42, "", "DatasetRenderingOrder.FORWARD");
        java.lang.Object obj46 = numberAxis42.clone();
        combinedDomainXYPlot1.setRangeAxis(0, (org.jfree.chart.axis.ValueAxis) numberAxis42);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(textBlock23);
        org.junit.Assert.assertNotNull(seriesRenderingOrder25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(xYItemRenderer29);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(rectangle2D38);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Color color2 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot1.setRangeMinorGridlinePaint((java.awt.Paint) color2);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = combinedDomainXYPlot1.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer2 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection3 = categoryPlot0.getDomainMarkers((int) 'a', layer2);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        categoryPlot0.setDataset(4, categoryDataset5);
        org.jfree.chart.axis.AxisSpace axisSpace7 = categoryPlot0.getFixedDomainAxisSpace();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.util.Layer layer11 = org.jfree.chart.util.Layer.BACKGROUND;
        categoryPlot0.drawRangeMarkers(graphics2D8, rectangle2D9, 0, layer11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        int int14 = categoryPlot13.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str19 = rectangleEdge18.toString();
        double double20 = categoryPlot13.getRectX((double) '4', (double) 'a', (double) 'a', rectangleEdge18);
        boolean boolean21 = categoryPlot13.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot13.getDomainAxis(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot13.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot26 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis25);
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.entity.EntityCollection entityCollection28 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo29 = new org.jfree.chart.ChartRenderingInfo(entityCollection28);
        java.awt.Paint paint30 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean31 = chartRenderingInfo29.equals((java.lang.Object) paint30);
        java.awt.geom.Rectangle2D rectangle2D32 = chartRenderingInfo29.getChartArea();
        java.util.List list33 = null;
        combinedDomainXYPlot26.drawDomainGridlines(graphics2D27, rectangle2D32, list33);
        org.jfree.chart.axis.NumberAxis numberAxis36 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity39 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D32, (org.jfree.chart.axis.Axis) numberAxis36, "", "DatasetRenderingOrder.FORWARD");
        numberAxis36.centerRange(10.0d);
        org.jfree.data.Range range42 = categoryPlot13.getDataRange((org.jfree.chart.axis.ValueAxis) numberAxis36);
        org.jfree.data.Range range43 = categoryPlot0.getDataRange((org.jfree.chart.axis.ValueAxis) numberAxis36);
        org.junit.Assert.assertNotNull(layer2);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNull(axisSpace7);
        org.junit.Assert.assertNotNull(layer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RectangleEdge.RIGHT" + "'", str19, "RectangleEdge.RIGHT");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 149.0d + "'", double20 == 149.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge24);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(rectangle2D32);
        org.junit.Assert.assertNull(range42);
        org.junit.Assert.assertNull(range43);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.lang.Object obj1 = combinedRangeXYPlot0.clone();
        double double2 = combinedRangeXYPlot0.getGap();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = combinedRangeXYPlot0.getLegendItems();
        combinedRangeXYPlot0.setRangeGridlinesVisible(true);
        org.junit.Assert.assertNotNull(legendItemCollection1);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        boolean boolean4 = xYAreaRenderer1.getPlotLines();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        xYAreaRenderer1.setSeriesStroke((int) (short) 1, stroke6, true);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot11 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis10);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer13 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer13.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator16 = null;
        xYAreaRenderer13.setLegendItemURLGenerator(xYSeriesLabelGenerator16);
        xYAreaRenderer13.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean24 = xYAreaRenderer13.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot11.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer13);
        java.awt.Stroke stroke26 = combinedDomainXYPlot11.getDomainCrosshairStroke();
        xYAreaRenderer1.setSeriesOutlineStroke((int) (short) 100, stroke26, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        java.awt.Color color2 = org.jfree.chart.ChartColor.DARK_BLUE;
        combinedDomainXYPlot1.setRangeMinorGridlinePaint((java.awt.Paint) color2);
        boolean boolean4 = combinedDomainXYPlot1.canSelectByRegion();
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        combinedDomainXYPlot1.setFixedRangeAxisSpace(axisSpace5, false);
        java.awt.Stroke stroke8 = combinedDomainXYPlot1.getRangeCrosshairStroke();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.jfree.chart.title.TextTitle textTitle1 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis2);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer5 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer5.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator8 = null;
        xYAreaRenderer5.setLegendItemURLGenerator(xYSeriesLabelGenerator8);
        xYAreaRenderer5.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean16 = xYAreaRenderer5.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot3.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer5);
        boolean boolean18 = combinedDomainXYPlot3.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation19 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        combinedDomainXYPlot3.setRangeAxisLocation(axisLocation19, true);
        boolean boolean22 = textTitle1.equals((java.lang.Object) combinedDomainXYPlot3);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer25 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer25.clearSeriesStrokes(false);
        boolean boolean28 = xYAreaRenderer25.getPlotLines();
        combinedDomainXYPlot3.setRenderer(0, (org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer25, true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        boolean boolean3 = xYAreaRenderer1.isSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Paint paint4 = xYAreaRenderer1.getBaseLegendTextPaint();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYAreaRenderer1.setSeriesOutlineStroke(0, stroke6, false);
        org.jfree.chart.LegendItem legendItem11 = xYAreaRenderer1.getLegendItem(8, (int) (byte) 10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot14 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis13);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer16 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer16.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator19 = null;
        xYAreaRenderer16.setLegendItemURLGenerator(xYSeriesLabelGenerator19);
        xYAreaRenderer16.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean27 = xYAreaRenderer16.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot14.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer16);
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        int int30 = combinedDomainXYPlot14.getRangeAxisIndex(valueAxis29);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        combinedDomainXYPlot14.setDomainAxis(valueAxis31);
        combinedDomainXYPlot14.clearRangeMarkers();
        org.jfree.data.time.Year year36 = new org.jfree.data.time.Year((int) (short) 0);
        long long37 = year36.getFirstMillisecond();
        org.jfree.data.time.Year year39 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.chart.axis.PeriodAxis periodAxis40 = new org.jfree.chart.axis.PeriodAxis("RectangleEdge.RIGHT", (org.jfree.data.time.RegularTimePeriod) year36, (org.jfree.data.time.RegularTimePeriod) year39);
        org.jfree.data.time.Year year43 = new org.jfree.data.time.Year((int) (short) 0);
        org.jfree.data.time.Year year45 = new org.jfree.data.time.Year((int) (short) 0);
        long long46 = year45.getFirstMillisecond();
        org.jfree.chart.axis.PeriodAxis periodAxis47 = new org.jfree.chart.axis.PeriodAxis("Following", (org.jfree.data.time.RegularTimePeriod) year43, (org.jfree.data.time.RegularTimePeriod) year45);
        periodAxis40.setLast((org.jfree.data.time.RegularTimePeriod) year45);
        java.awt.Stroke stroke49 = periodAxis40.getMinorTickMarkStroke();
        java.lang.Class class50 = periodAxis40.getMajorTickTimePeriodClass();
        org.jfree.chart.plot.Marker marker51 = null;
        org.jfree.chart.entity.EntityCollection entityCollection52 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo53 = new org.jfree.chart.ChartRenderingInfo(entityCollection52);
        java.awt.Paint paint54 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean55 = chartRenderingInfo53.equals((java.lang.Object) paint54);
        java.awt.geom.Rectangle2D rectangle2D56 = chartRenderingInfo53.getChartArea();
        org.jfree.chart.title.TextTitle textTitle58 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity59 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D56, (org.jfree.chart.title.Title) textTitle58);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor60 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D61 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D56, rectangleAnchor60);
        xYAreaRenderer1.drawDomainMarker(graphics2D12, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot14, (org.jfree.chart.axis.ValueAxis) periodAxis40, marker51, rectangle2D56);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(legendItem11);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-62167363200000L) + "'", long37 == (-62167363200000L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-62167363200000L) + "'", long46 == (-62167363200000L));
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(class50);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(rectangle2D56);
        org.junit.Assert.assertNotNull(rectangleAnchor60);
        org.junit.Assert.assertNotNull(point2D61);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        java.awt.Graphics2D graphics2D2 = null;
        java.util.List list3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer7 = org.jfree.chart.util.Layer.FOREGROUND;
        java.util.Collection collection8 = categoryPlot5.getDomainMarkers((int) 'a', layer7);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        categoryPlot5.setDataset(4, categoryDataset10);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        int int13 = categoryPlot12.getDatasetCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = categoryPlot12.getOrientation();
        categoryPlot5.setOrientation(plotOrientation14);
        boolean boolean16 = categoryPlot5.isDomainPannable();
        categoryPlot5.setRangeCrosshairValue((double) 10);
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.entity.EntityCollection entityCollection20 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = new org.jfree.chart.ChartRenderingInfo(entityCollection20);
        java.awt.Paint paint22 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean23 = chartRenderingInfo21.equals((java.lang.Object) paint22);
        java.awt.geom.Rectangle2D rectangle2D24 = chartRenderingInfo21.getChartArea();
        org.jfree.chart.title.TextTitle textTitle26 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity27 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D24, (org.jfree.chart.title.Title) textTitle26);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D29 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D24, rectangleAnchor28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.entity.PieSectionEntity pieSectionEntity36 = new org.jfree.chart.entity.PieSectionEntity((java.awt.Shape) rectangle2D24, pieDataset30, (int) ' ', (int) (short) 1, (java.lang.Comparable) 149.0d, "Following", "NO_CHANGE");
        org.jfree.chart.axis.AxisSpace axisSpace37 = new org.jfree.chart.axis.AxisSpace();
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot40 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis39);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer42 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer42.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator45 = null;
        xYAreaRenderer42.setLegendItemURLGenerator(xYSeriesLabelGenerator45);
        xYAreaRenderer42.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean53 = xYAreaRenderer42.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot40.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer42);
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        int int56 = combinedDomainXYPlot40.getRangeAxisIndex(valueAxis55);
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        combinedDomainXYPlot40.setDomainAxis(valueAxis57);
        org.jfree.chart.util.RectangleEdge rectangleEdge60 = combinedDomainXYPlot40.getDomainAxisEdge(0);
        axisSpace37.add((double) 10L, rectangleEdge60);
        org.jfree.chart.axis.AxisSpace axisSpace62 = categoryPlot5.calculateDomainAxisSpace(graphics2D19, rectangle2D24, axisSpace37);
        org.jfree.chart.entity.EntityCollection entityCollection63 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo64 = new org.jfree.chart.ChartRenderingInfo(entityCollection63);
        java.awt.Paint paint65 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean66 = chartRenderingInfo64.equals((java.lang.Object) paint65);
        java.awt.geom.Rectangle2D rectangle2D67 = chartRenderingInfo64.getChartArea();
        org.jfree.chart.title.TextTitle textTitle69 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity70 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D67, (org.jfree.chart.title.Title) textTitle69);
        org.jfree.chart.plot.PiePlotState piePlotState71 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.drawSimpleLabels(graphics2D2, list3, 1.0d, rectangle2D24, rectangle2D67, piePlotState71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(layer7);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(plotOrientation14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(rectangle2D24);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertNotNull(point2D29);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge60);
        org.junit.Assert.assertNotNull(axisSpace62);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(rectangle2D67);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = org.jfree.chart.plot.PlotOrientation.VERTICAL;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("ClassContext", "LGPL", "", xYZDataset3, plotOrientation4, false, true, false);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Listener org.jfree.chart.JFreeChart@513ceed7 is not of type class sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(plotOrientation4);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list1 = combinedRangeXYPlot0.getSubplots();
        combinedRangeXYPlot0.setGap((double) (-16777216));
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = combinedRangeXYPlot0.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list1 = combinedRangeXYPlot0.getSubplots();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot3 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis2);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer5 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer5.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator8 = null;
        xYAreaRenderer5.setLegendItemURLGenerator(xYSeriesLabelGenerator8);
        xYAreaRenderer5.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean16 = xYAreaRenderer5.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot3.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer5);
        combinedDomainXYPlot3.clearDomainMarkers();
        java.awt.Font font20 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.awt.Paint paint21 = org.jfree.chart.renderer.category.BarRenderer3D.DEFAULT_WALL_PAINT;
        org.jfree.chart.text.TextMeasurer textMeasurer24 = null;
        org.jfree.chart.text.TextBlock textBlock25 = org.jfree.chart.text.TextUtilities.createTextBlock("", font20, paint21, (float) (-1L), (int) (short) -1, textMeasurer24);
        combinedDomainXYPlot3.setDomainCrosshairPaint(paint21);
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot27.getDatasetGroup();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        piePlot27.addChangeListener(plotChangeListener29);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent31 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) piePlot27);
        combinedDomainXYPlot3.plotChanged(plotChangeEvent31);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType33 = plotChangeEvent31.getType();
        combinedRangeXYPlot0.plotChanged(plotChangeEvent31);
        org.jfree.chart.plot.IntervalMarker intervalMarker37 = new org.jfree.chart.plot.IntervalMarker((double) (short) 100, (double) 10);
        boolean boolean38 = combinedRangeXYPlot0.removeRangeMarker((org.jfree.chart.plot.Marker) intervalMarker37);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(textBlock25);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertNotNull(chartChangeEventType33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer1 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer1.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator4 = null;
        xYAreaRenderer1.setLegendItemURLGenerator(xYSeriesLabelGenerator4);
        xYAreaRenderer1.setSeriesVisibleInLegend((int) (byte) 10, (java.lang.Boolean) false);
        xYAreaRenderer1.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.XYURLGenerator xYURLGenerator12 = null;
        xYAreaRenderer1.setSeriesURLGenerator((int) (short) 100, xYURLGenerator12, false);
        java.awt.Paint paint18 = xYAreaRenderer1.getItemFillPaint((int) (short) 10, (int) 'a', true);
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot21 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis20);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer23 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer23.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator26 = null;
        xYAreaRenderer23.setLegendItemURLGenerator(xYSeriesLabelGenerator26);
        xYAreaRenderer23.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean34 = xYAreaRenderer23.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot21.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer23);
        boolean boolean36 = combinedDomainXYPlot21.canSelectByPoint();
        org.jfree.chart.axis.NumberAxis numberAxis38 = new org.jfree.chart.axis.NumberAxis("");
        int int39 = numberAxis38.getMinorTickCount();
        numberAxis38.setMinorTickMarksVisible(true);
        org.jfree.chart.entity.EntityCollection entityCollection42 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = new org.jfree.chart.ChartRenderingInfo(entityCollection42);
        java.awt.Paint paint44 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean45 = chartRenderingInfo43.equals((java.lang.Object) paint44);
        java.awt.geom.Rectangle2D rectangle2D46 = chartRenderingInfo43.getChartArea();
        org.jfree.chart.title.TextTitle textTitle48 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity49 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D46, (org.jfree.chart.title.Title) textTitle48);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = org.jfree.chart.util.RectangleAnchor.CENTER;
        java.awt.geom.Point2D point2D51 = org.jfree.chart.util.RectangleAnchor.coordinates(rectangle2D46, rectangleAnchor50);
        java.awt.Paint paint53 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot54 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.awt.Stroke stroke55 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        combinedRangeXYPlot54.setRangeCrosshairStroke(stroke55);
        xYAreaRenderer1.drawDomainLine(graphics2D19, (org.jfree.chart.plot.XYPlot) combinedDomainXYPlot21, (org.jfree.chart.axis.ValueAxis) numberAxis38, rectangle2D46, (double) 60000L, paint53, stroke55);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(rectangle2D46);
        org.junit.Assert.assertNotNull(rectangleAnchor50);
        org.junit.Assert.assertNotNull(point2D51);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(stroke55);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.jfree.chart.plot.CombinedRangeXYPlot combinedRangeXYPlot0 = new org.jfree.chart.plot.CombinedRangeXYPlot();
        java.util.List list1 = combinedRangeXYPlot0.getSubplots();
        combinedRangeXYPlot0.setGap((double) (-16777216));
        org.jfree.chart.entity.EntityCollection entityCollection6 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo7 = new org.jfree.chart.ChartRenderingInfo(entityCollection6);
        java.awt.Paint paint8 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean9 = chartRenderingInfo7.equals((java.lang.Object) paint8);
        java.awt.geom.Rectangle2D rectangle2D10 = chartRenderingInfo7.getChartArea();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = chartRenderingInfo7.getPlotInfo();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo12 = plotRenderingInfo11.getOwner();
        combinedRangeXYPlot0.handleClick((-9999), 5, plotRenderingInfo11);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rectangle2D10);
        org.junit.Assert.assertNotNull(plotRenderingInfo11);
        org.junit.Assert.assertNotNull(chartRenderingInfo12);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.jfree.chart.axis.ValueAxis valueAxis0 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot1 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis0);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer3 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        xYAreaRenderer3.clearSeriesStrokes(false);
        org.jfree.chart.labels.XYSeriesLabelGenerator xYSeriesLabelGenerator6 = null;
        xYAreaRenderer3.setLegendItemURLGenerator(xYSeriesLabelGenerator6);
        xYAreaRenderer3.setSeriesVisibleInLegend(0, (java.lang.Boolean) true);
        boolean boolean14 = xYAreaRenderer3.isItemLabelVisible((int) '#', (int) '#', true);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = combinedDomainXYPlot1.getRangeAxisIndex(valueAxis16);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        combinedDomainXYPlot1.setRangeCrosshairStroke(stroke18);
        org.jfree.chart.renderer.xy.XYAreaRenderer xYAreaRenderer21 = new org.jfree.chart.renderer.xy.XYAreaRenderer((int) '4');
        org.jfree.chart.labels.StandardXYToolTipGenerator standardXYToolTipGenerator23 = org.jfree.chart.labels.StandardXYToolTipGenerator.getTimeSeriesInstance();
        java.text.NumberFormat numberFormat24 = standardXYToolTipGenerator23.getXFormat();
        java.lang.Object obj25 = standardXYToolTipGenerator23.clone();
        xYAreaRenderer21.setSeriesToolTipGenerator(1, (org.jfree.chart.labels.XYToolTipGenerator) standardXYToolTipGenerator23, false);
        combinedDomainXYPlot1.setRenderer((org.jfree.chart.renderer.xy.XYItemRenderer) xYAreaRenderer21);
        boolean boolean29 = xYAreaRenderer21.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(standardXYToolTipGenerator23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
        java.awt.Paint paint1 = combinedDomainXYPlot0.getRangeGridlinePaint();
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.entity.EntityCollection entityCollection3 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo4 = new org.jfree.chart.ChartRenderingInfo(entityCollection3);
        java.awt.Paint paint5 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean6 = chartRenderingInfo4.equals((java.lang.Object) paint5);
        java.awt.geom.Rectangle2D rectangle2D7 = chartRenderingInfo4.getChartArea();
        org.jfree.chart.title.TextTitle textTitle9 = new org.jfree.chart.title.TextTitle("");
        org.jfree.chart.entity.TitleEntity titleEntity10 = new org.jfree.chart.entity.TitleEntity((java.awt.Shape) rectangle2D7, (org.jfree.chart.title.Title) textTitle9);
        combinedDomainXYPlot0.drawQuadrants(graphics2D2, rectangle2D7);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle2D7);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        int int1 = categoryPlot0.getDatasetCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge5 = org.jfree.chart.util.RectangleEdge.RIGHT;
        java.lang.String str6 = rectangleEdge5.toString();
        double double7 = categoryPlot0.getRectX((double) '4', (double) 'a', (double) 'a', rectangleEdge5);
        boolean boolean8 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = categoryPlot0.getDomainAxis(10);
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.plot.CombinedDomainXYPlot combinedDomainXYPlot13 = new org.jfree.chart.plot.CombinedDomainXYPlot(valueAxis12);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.entity.EntityCollection entityCollection15 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = new org.jfree.chart.ChartRenderingInfo(entityCollection15);
        java.awt.Paint paint17 = org.jfree.chart.title.LegendTitle.DEFAULT_ITEM_PAINT;
        boolean boolean18 = chartRenderingInfo16.equals((java.lang.Object) paint17);
        java.awt.geom.Rectangle2D rectangle2D19 = chartRenderingInfo16.getChartArea();
        java.util.List list20 = null;
        combinedDomainXYPlot13.drawDomainGridlines(graphics2D14, rectangle2D19, list20);
        org.jfree.chart.axis.NumberAxis numberAxis23 = new org.jfree.chart.axis.NumberAxis("");
        org.jfree.chart.entity.AxisEntity axisEntity26 = new org.jfree.chart.entity.AxisEntity((java.awt.Shape) rectangle2D19, (org.jfree.chart.axis.Axis) numberAxis23, "", "DatasetRenderingOrder.FORWARD");
        numberAxis23.centerRange(10.0d);
        org.jfree.data.Range range29 = categoryPlot0.getDataRange((org.jfree.chart.axis.ValueAxis) numberAxis23);
        categoryPlot0.clearRangeMarkers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RectangleEdge.RIGHT" + "'", str6, "RectangleEdge.RIGHT");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 149.0d + "'", double7 == 149.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categoryAxis10);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle2D19);
        org.junit.Assert.assertNull(range29);
    }
}

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        xYPlot4.clearRangeAxes();
        java.awt.Paint paint10 = xYPlot4.getRangeMinorGridlinePaint();
        xYPlot4.clearDomainMarkers(1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        xYPlot4.clearRangeMarkers((int) ' ');
        xYPlot4.setForegroundAlpha((float) (short) 0);
        xYPlot4.clearAnnotations();
        xYPlot4.clearRangeAxes();
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        java.awt.Stroke stroke21 = xYPlot20.getRangeCrosshairStroke();
        int int22 = xYPlot20.getBackgroundImageAlignment();
        int int23 = xYPlot20.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup24 = xYPlot20.getDatasetGroup();
        org.jfree.data.xy.XYDataset xYDataset26 = null;
        xYPlot20.setDataset(10, xYDataset26);
        java.awt.Paint paint28 = xYPlot20.getRangeCrosshairPaint();
        int int29 = xYPlot20.getDatasetCount();
        java.awt.Stroke stroke30 = xYPlot20.getDomainCrosshairStroke();
        xYPlot4.setRangeMinorGridlineStroke(stroke30);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets9, true);
        xYPlot4.setBackgroundImageAlignment((-1));
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        int int15 = xYPlot4.getRangeAxisIndex(valueAxis14);
        xYPlot4.configureDomainAxes();
        org.jfree.chart.axis.AxisSpace axisSpace17 = xYPlot4.getFixedRangeAxisSpace();
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        java.awt.Stroke stroke23 = xYPlot22.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        int int25 = xYPlot22.getIndexOf(xYItemRenderer24);
        float float26 = xYPlot22.getBackgroundAlpha();
        java.awt.Paint paint27 = xYPlot22.getDomainGridlinePaint();
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot(xYDataset28, valueAxis29, valueAxis30, xYItemRenderer31);
        org.jfree.chart.plot.Marker marker34 = null;
        org.jfree.chart.util.Layer layer35 = null;
        boolean boolean36 = xYPlot32.removeDomainMarker((int) '4', marker34, layer35);
        xYPlot32.clearRangeAxes();
        java.awt.Paint paint38 = xYPlot32.getDomainGridlinePaint();
        xYPlot22.setDomainZeroBaselinePaint(paint38);
        xYPlot4.setRangeZeroBaselinePaint(paint38);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(axisSpace17);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot4.getDomainMarkers(layer6);
        java.awt.Stroke stroke8 = xYPlot4.getRangeMinorGridlineStroke();
        java.awt.Paint paint9 = xYPlot4.getRangeMinorGridlinePaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        xYPlot4.clearRangeMarkers();
        java.awt.Paint paint24 = xYPlot4.getRangeTickBandPaint();
        boolean boolean25 = xYPlot4.isRangeMinorGridlinesVisible();
        java.awt.Stroke stroke26 = xYPlot4.getDomainMinorGridlineStroke();
        boolean boolean27 = xYPlot4.isRangeMinorGridlinesVisible();
        java.awt.geom.GeneralPath generalPath28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.RenderingSource renderingSource30 = null;
        xYPlot4.select(generalPath28, rectangle2D29, renderingSource30);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        xYPlot4.setRangeCrosshairVisible(true);
        xYPlot4.clearDomainMarkers((int) (short) -1);
        boolean boolean12 = xYPlot4.canSelectByRegion();
        org.jfree.chart.plot.Marker marker13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addDomainMarker(marker13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        xYPlot4.axisChanged(axisChangeEvent7);
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        xYPlot4.removeChangeListener(plotChangeListener9);
        xYPlot4.setRangePannable(false);
        boolean boolean13 = xYPlot4.isRangeCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot4.getRendererForDataset(xYDataset21);
        org.jfree.chart.plot.Marker marker24 = null;
        org.jfree.chart.util.Layer layer25 = null;
        boolean boolean27 = xYPlot4.removeDomainMarker((int) (byte) 0, marker24, layer25, true);
        org.jfree.chart.plot.Marker marker28 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addDomainMarker(marker28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        boolean boolean11 = xYPlot4.isRangeCrosshairLockedOnData();
        xYPlot4.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace14);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addAnnotation(xYAnnotation16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        int int11 = xYPlot4.getIndexOf(xYItemRenderer10);
        java.awt.Paint paint12 = xYPlot4.getDomainZeroBaselinePaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot4.zoomDomainAxes((double) (-1), 10.0d, plotRenderingInfo19, point2D20);
        int int22 = xYPlot4.getDomainAxisCount();
        java.awt.Paint paint23 = xYPlot4.getRangeTickBandPaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(paint23);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot4.getRangeAxisLocation((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = xYPlot4.getAxisOffset();
        org.jfree.chart.plot.Plot plot20 = xYPlot4.getParent();
        boolean boolean21 = xYPlot4.isRangeGridlinesVisible();
        xYPlot4.setRangePannable(false);
        org.jfree.chart.plot.Marker marker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = xYPlot4.removeRangeMarker((int) (byte) 10, marker25, layer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNull(plot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis(valueAxis13);
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        xYPlot19.clearRangeMarkers(15);
        int int22 = xYPlot19.getDomainAxisCount();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        java.awt.Stroke stroke28 = xYPlot27.getRangeCrosshairStroke();
        xYPlot27.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis32 = xYPlot27.getDomainAxis((int) (byte) 100);
        xYPlot27.setDomainCrosshairValue((double) 1L);
        boolean boolean35 = xYPlot27.isOutlineVisible();
        org.jfree.data.xy.XYDataset xYDataset36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer39 = null;
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot(xYDataset36, valueAxis37, valueAxis38, xYItemRenderer39);
        org.jfree.chart.axis.AxisSpace axisSpace41 = null;
        xYPlot40.setFixedRangeAxisSpace(axisSpace41, false);
        org.jfree.chart.axis.ValueAxis valueAxis44 = xYPlot40.getRangeAxis();
        xYPlot40.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = xYPlot40.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = xYPlot40.getAxisOffset();
        xYPlot40.setNotify(false);
        xYPlot40.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke52 = xYPlot40.getRangeCrosshairStroke();
        xYPlot27.setRangeGridlineStroke(stroke52);
        xYPlot19.setDomainZeroBaselineStroke(stroke52);
        xYPlot4.setRangeGridlineStroke(stroke52);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(valueAxis32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(valueAxis44);
        org.junit.Assert.assertNull(xYItemRenderer46);
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot4.getRangeAxis((int) (short) 10);
        org.jfree.data.general.DatasetGroup datasetGroup13 = xYPlot4.getDatasetGroup();
        boolean boolean14 = xYPlot4.canSelectByRegion();
        boolean boolean15 = xYPlot4.isRangeGridlinesVisible();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.clearDomainMarkers();
        java.awt.Paint paint7 = xYPlot4.getBackgroundPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        xYPlot4.datasetChanged(datasetChangeEvent8);
        boolean boolean10 = xYPlot4.isRangeGridlinesVisible();
        java.awt.Paint paint11 = xYPlot4.getDomainMinorGridlinePaint();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis14 = xYPlot4.getDomainAxis((int) (byte) 0);
        xYPlot4.setDomainPannable(true);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(valueAxis14);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        int int23 = xYPlot4.getBackgroundImageAlignment();
        boolean boolean24 = xYPlot4.isRangeZoomable();
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        int int26 = xYPlot4.indexOf(xYDataset25);
        java.awt.Paint paint27 = xYPlot4.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot4.getDataRange(valueAxis11);
        xYPlot4.configureRangeAxes();
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        java.awt.Stroke stroke21 = xYPlot20.getRangeCrosshairStroke();
        xYPlot20.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot20.getDomainAxis((int) (byte) 100);
        xYPlot20.setDomainCrosshairValue((double) 1L);
        java.awt.Stroke stroke28 = xYPlot20.getRangeMinorGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot(xYDataset29, valueAxis30, valueAxis31, xYItemRenderer32);
        java.awt.Stroke stroke34 = xYPlot33.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        int int36 = xYPlot33.getIndexOf(xYItemRenderer35);
        float float37 = xYPlot33.getBackgroundAlpha();
        java.awt.Stroke stroke38 = xYPlot33.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = xYPlot33.getRangeAxisEdge();
        java.awt.Paint paint40 = xYPlot33.getNoDataMessagePaint();
        xYPlot20.setDomainTickBandPaint(paint40);
        xYPlot4.setDomainTickBandPaint(paint40);
        org.jfree.data.xy.XYDataset xYDataset43 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer44 = xYPlot4.getRendererForDataset(xYDataset43);
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot(xYDataset47, valueAxis48, valueAxis49, xYItemRenderer50);
        java.awt.Stroke stroke52 = xYPlot51.getRangeCrosshairStroke();
        xYPlot51.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo56 = null;
        java.awt.geom.Point2D point2D57 = null;
        xYPlot51.zoomRangeAxes(0.0d, plotRenderingInfo56, point2D57);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo60 = null;
        java.awt.geom.Point2D point2D61 = null;
        xYPlot51.panRangeAxes((double) (byte) 1, plotRenderingInfo60, point2D61);
        xYPlot51.setRangeMinorGridlinesVisible(false);
        java.awt.geom.Point2D point2D65 = xYPlot51.getQuadrantOrigin();
        org.jfree.chart.plot.PlotState plotState66 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo67 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.draw(graphics2D45, rectangle2D46, point2D65, plotState66, plotRenderingInfo67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(rectangleEdge39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(xYItemRenderer44);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(point2D65);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        xYPlot4.panRangeAxes((-1.0d), plotRenderingInfo18, point2D19);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.data.Range range22 = xYPlot4.getDataRange(valueAxis21);
        xYPlot4.setDomainCrosshairVisible(true);
        java.awt.geom.Point2D point2D25 = xYPlot4.getQuadrantOrigin();
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot4.getDomainAxis();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(range22);
        org.junit.Assert.assertNotNull(point2D25);
        org.junit.Assert.assertNull(valueAxis26);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = xYPlot4.getRenderer();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        xYPlot4.drawAnnotations(graphics2D9, rectangle2D10, plotRenderingInfo11);
        java.awt.Paint paint13 = xYPlot4.getRangeCrosshairPaint();
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = xYPlot4.getRendererForDataset(xYDataset14);
        org.junit.Assert.assertNull(xYItemRenderer8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(xYItemRenderer15);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        xYPlot4.axisChanged(axisChangeEvent7);
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        xYPlot4.removeChangeListener(plotChangeListener9);
        xYPlot4.clearRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis((int) (short) 1, valueAxis13, false);
        xYPlot4.clearSelection();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        xYPlot4.axisChanged(axisChangeEvent5);
        xYPlot4.mapDatasetToDomainAxis(10, (int) '#');
        java.awt.Stroke stroke10 = xYPlot4.getDomainZeroBaselineStroke();
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        int int23 = xYPlot4.getBackgroundImageAlignment();
        boolean boolean24 = xYPlot4.isRangeZoomable();
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = xYPlot4.getRendererForDataset(xYDataset25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace27);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(xYItemRenderer26);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.clearDomainMarkers();
        java.awt.Paint paint7 = xYPlot4.getBackgroundPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        xYPlot4.datasetChanged(datasetChangeEvent8);
        boolean boolean10 = xYPlot4.isRangeGridlinesVisible();
        java.awt.Paint paint11 = xYPlot4.getDomainMinorGridlinePaint();
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        java.awt.Stroke stroke17 = xYPlot16.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        int int19 = xYPlot16.getIndexOf(xYItemRenderer18);
        float float20 = xYPlot16.getBackgroundAlpha();
        java.awt.Image image21 = null;
        xYPlot16.setBackgroundImage(image21);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        xYPlot16.setRangeAxis(0, valueAxis24);
        java.awt.Paint paint26 = xYPlot16.getDomainZeroBaselinePaint();
        xYPlot4.setDomainTickBandPaint(paint26);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        int int18 = xYPlot4.getIndexOf(xYItemRenderer17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot4.setDomainAxis(0, valueAxis20, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot4.zoomRangeAxes(1.0d, plotRenderingInfo24, point2D25);
        double double27 = xYPlot4.getDomainCrosshairValue();
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot(xYDataset28, valueAxis29, valueAxis30, xYItemRenderer31);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder33 = xYPlot32.getSeriesRenderingOrder();
        xYPlot32.clearDomainMarkers();
        java.awt.Paint paint35 = xYPlot32.getBackgroundPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent36 = null;
        xYPlot32.datasetChanged(datasetChangeEvent36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        java.awt.geom.Point2D point2D40 = null;
        xYPlot32.zoomRangeAxes(100.0d, plotRenderingInfo39, point2D40, true);
        org.jfree.data.xy.XYDataset xYDataset43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = null;
        org.jfree.chart.plot.XYPlot xYPlot47 = new org.jfree.chart.plot.XYPlot(xYDataset43, valueAxis44, valueAxis45, xYItemRenderer46);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent48 = null;
        xYPlot47.axisChanged(axisChangeEvent48);
        xYPlot47.mapDatasetToDomainAxis(10, (int) '#');
        org.jfree.chart.plot.PlotOrientation plotOrientation53 = xYPlot47.getOrientation();
        xYPlot32.setOrientation(plotOrientation53);
        org.jfree.data.xy.XYDataset xYDataset55 = null;
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer58 = null;
        org.jfree.chart.plot.XYPlot xYPlot59 = new org.jfree.chart.plot.XYPlot(xYDataset55, valueAxis56, valueAxis57, xYItemRenderer58);
        java.awt.Stroke stroke60 = xYPlot59.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer61 = null;
        int int62 = xYPlot59.getIndexOf(xYItemRenderer61);
        org.jfree.chart.axis.ValueAxis valueAxis64 = null;
        xYPlot59.setRangeAxis((int) 'a', valueAxis64);
        boolean boolean66 = xYPlot59.canSelectByRegion();
        org.jfree.chart.axis.AxisLocation axisLocation68 = xYPlot59.getRangeAxisLocation((int) (byte) -1);
        xYPlot32.setRangeAxisLocation(axisLocation68, false);
        xYPlot4.setDomainAxisLocation(axisLocation68);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(seriesRenderingOrder33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(plotOrientation53);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(axisLocation68);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        double double10 = xYPlot4.getRangeCrosshairValue();
        org.jfree.data.xy.XYDataset xYDataset11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot(xYDataset11, valueAxis12, valueAxis13, xYItemRenderer14);
        java.awt.Stroke stroke16 = xYPlot15.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot15.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo19, point2D20);
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        xYPlot15.setDataset((int) (short) 0, xYDataset23);
        xYPlot15.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        int int29 = xYPlot15.getIndexOf(xYItemRenderer28);
        java.awt.Stroke stroke30 = xYPlot15.getDomainMinorGridlineStroke();
        xYPlot4.setRangeGridlineStroke(stroke30);
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot(xYDataset32, valueAxis33, valueAxis34, xYItemRenderer35);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder37 = xYPlot36.getSeriesRenderingOrder();
        xYPlot36.clearDomainMarkers();
        java.awt.Paint paint39 = xYPlot36.getBackgroundPaint();
        xYPlot4.setRangeTickBandPaint(paint39);
        org.jfree.chart.plot.Plot plot41 = xYPlot4.getParent();
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        xYPlot4.setRangeAxis((int) (byte) 100, valueAxis43, false);
        java.awt.Stroke stroke46 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setRangeZeroBaselineStroke(stroke46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(seriesRenderingOrder37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(plot41);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        boolean boolean11 = xYPlot4.isRangeCrosshairLockedOnData();
        xYPlot4.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        xYPlot4.setRenderer((int) (byte) 1, xYItemRenderer15, true);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.axis.AxisSpace axisSpace23 = null;
        xYPlot22.setFixedRangeAxisSpace(axisSpace23, false);
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot22.getRangeAxis();
        xYPlot22.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        java.awt.Stroke stroke36 = xYPlot35.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        int int38 = xYPlot35.getIndexOf(xYItemRenderer37);
        float float39 = xYPlot35.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer43 = null;
        org.jfree.chart.plot.XYPlot xYPlot44 = new org.jfree.chart.plot.XYPlot(xYDataset40, valueAxis41, valueAxis42, xYItemRenderer43);
        org.jfree.chart.axis.AxisSpace axisSpace45 = null;
        xYPlot44.setFixedRangeAxisSpace(axisSpace45, false);
        org.jfree.chart.axis.ValueAxis valueAxis48 = xYPlot44.getRangeAxis();
        xYPlot44.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation51 = xYPlot44.getRangeAxisLocation((int) (short) -1);
        xYPlot35.setRangeAxisLocation(axisLocation51, false);
        xYPlot22.setDomainAxisLocation((int) (byte) 10, axisLocation51);
        xYPlot22.setDomainCrosshairValue((double) 0);
        xYPlot22.clearDomainAxes();
        xYPlot22.clearRangeAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier59 = xYPlot22.getDrawingSupplier();
        xYPlot4.setDrawingSupplier(drawingSupplier59);
        boolean boolean61 = xYPlot4.isDomainCrosshairVisible();
        java.awt.Stroke stroke62 = xYPlot4.getDomainZeroBaselineStroke();
        org.jfree.chart.axis.AxisSpace axisSpace63 = xYPlot4.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNull(valueAxis48);
        org.junit.Assert.assertNotNull(axisLocation51);
        org.junit.Assert.assertNotNull(drawingSupplier59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertNull(axisSpace63);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        xYPlot4.setWeight((int) '4');
        int int13 = xYPlot4.getRendererCount();
        org.jfree.chart.plot.Marker marker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker((-1), marker15, layer16, true);
        boolean boolean19 = xYPlot4.isDomainZeroBaselineVisible();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        java.awt.Stroke stroke25 = xYPlot24.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        int int27 = xYPlot24.getIndexOf(xYItemRenderer26);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = xYPlot24.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint30 = xYPlot24.getOutlinePaint();
        xYPlot24.mapDatasetToRangeAxis(100, (int) 'a');
        java.awt.Font font34 = xYPlot24.getNoDataMessageFont();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray35 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot24.setRenderers(xYItemRendererArray35);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray37 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot24.setDomainAxes(valueAxisArray37);
        xYPlot4.setDomainAxes(valueAxisArray37);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(xYItemRendererArray35);
        org.junit.Assert.assertNotNull(valueAxisArray37);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        int int11 = xYPlot4.getIndexOf(xYItemRenderer10);
        xYPlot4.setDomainMinorGridlinesVisible(true);
        java.awt.Image image14 = xYPlot4.getBackgroundImage();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(image14);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getDomainAxis((int) (byte) 100);
        xYPlot4.setDomainCrosshairValue((double) 1L);
        java.awt.Stroke stroke12 = xYPlot4.getRangeMinorGridlineStroke();
        java.awt.Paint paint13 = xYPlot4.getRangeCrosshairPaint();
        boolean boolean14 = xYPlot4.isDomainZoomable();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Paint paint9 = xYPlot4.getDomainGridlinePaint();
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        boolean boolean18 = xYPlot14.removeDomainMarker((int) '4', marker16, layer17);
        xYPlot14.clearRangeAxes();
        java.awt.Paint paint20 = xYPlot14.getDomainGridlinePaint();
        xYPlot4.setDomainZeroBaselinePaint(paint20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        int int23 = xYPlot4.getRangeAxisIndex(valueAxis22);
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot4.getRangeAxisLocation();
        xYPlot4.setDomainMinorGridlinesVisible(true);
        java.awt.Paint paint29 = xYPlot4.getDomainCrosshairPaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        xYPlot4.axisChanged(axisChangeEvent7);
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        xYPlot4.removeChangeListener(plotChangeListener9);
        xYPlot4.clearRangeAxes();
        double double12 = xYPlot4.getRangeCrosshairValue();
        boolean boolean13 = xYPlot4.isSubplot();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        int int15 = xYPlot4.getIndexOf(xYItemRenderer14);
        xYPlot4.setDomainMinorGridlinesVisible(false);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        int int18 = xYPlot4.getIndexOf(xYItemRenderer17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot4.setDomainAxis(0, valueAxis20, true);
        float float23 = xYPlot4.getForegroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = xYPlot4.getRendererForDataset(xYDataset24);
        xYPlot4.configureDomainAxes();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNull(xYItemRenderer25);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.axis.AxisLocation axisLocation6 = xYPlot4.getDomainAxisLocation();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        java.awt.Stroke stroke12 = xYPlot11.getRangeCrosshairStroke();
        xYPlot11.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        java.awt.geom.Point2D point2D17 = null;
        xYPlot11.zoomRangeAxes(0.0d, plotRenderingInfo16, point2D17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        java.awt.geom.Point2D point2D21 = null;
        xYPlot11.panRangeAxes((double) (byte) 1, plotRenderingInfo20, point2D21);
        java.awt.Stroke stroke23 = xYPlot11.getRangeCrosshairStroke();
        boolean boolean24 = xYPlot11.isRangeZeroBaselineVisible();
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = xYPlot11.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation6, plotOrientation25);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(plotOrientation25);
        org.junit.Assert.assertNotNull(rectangleEdge26);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        xYPlot4.panRangeAxes((-1.0d), plotRenderingInfo18, point2D19);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.data.Range range22 = xYPlot4.getDataRange(valueAxis21);
        xYPlot4.setRangeCrosshairValue((double) (byte) 0, false);
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        xYPlot4.setOutlinePaint(paint26);
        org.jfree.chart.plot.Marker marker28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = xYPlot4.removeRangeMarker(marker28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(range22);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = xYPlot4.getRangeAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        java.awt.Stroke stroke22 = xYPlot21.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        int int24 = xYPlot21.getIndexOf(xYItemRenderer23);
        float float25 = xYPlot21.getBackgroundAlpha();
        java.awt.Stroke stroke26 = xYPlot21.getDomainGridlineStroke();
        xYPlot13.setDomainZeroBaselineStroke(stroke26);
        xYPlot4.setRangeZeroBaselineStroke(stroke26);
        xYPlot4.clearRangeAxes();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation30 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addAnnotation(xYAnnotation30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.clearDomainMarkers();
        java.awt.Paint paint7 = xYPlot4.getBackgroundPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        xYPlot4.datasetChanged(datasetChangeEvent8);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        xYPlot14.setFixedRangeAxisSpace(axisSpace15, false);
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot14.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        int int20 = xYPlot14.getRangeAxisIndex(valueAxis19);
        boolean boolean21 = xYPlot14.isRangeGridlinesVisible();
        boolean boolean22 = xYPlot14.canSelectByPoint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        xYPlot14.removeChangeListener(plotChangeListener23);
        java.awt.Paint paint25 = xYPlot14.getNoDataMessagePaint();
        xYPlot4.setDomainTickBandPaint(paint25);
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot4.getDomainAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        xYPlot4.setRangeAxis(valueAxis28);
        org.jfree.data.xy.XYDataset xYDataset30 = null;
        xYPlot4.setDataset(xYDataset30);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(axisLocation27);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        int int20 = xYPlot4.getRendererCount();
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot(xYDataset21, valueAxis22, valueAxis23, xYItemRenderer24);
        java.awt.Stroke stroke26 = xYPlot25.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        int int28 = xYPlot25.getIndexOf(xYItemRenderer27);
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = xYPlot25.getRangeAxisEdge((int) (byte) 10);
        java.awt.Stroke stroke31 = xYPlot25.getRangeZeroBaselineStroke();
        xYPlot4.setDomainZeroBaselineStroke(stroke31);
        org.jfree.data.xy.XYDataset xYDataset33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot(xYDataset33, valueAxis34, valueAxis35, xYItemRenderer36);
        java.awt.Stroke stroke38 = xYPlot37.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer39 = null;
        int int40 = xYPlot37.getIndexOf(xYItemRenderer39);
        xYPlot37.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation43 = xYPlot37.getOrientation();
        xYPlot4.setOrientation(plotOrientation43);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(plotOrientation43);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot4.getRangeAxis();
        double double21 = xYPlot4.getDomainCrosshairValue();
        boolean boolean22 = xYPlot4.isDomainMinorGridlinesVisible();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        xYPlot4.setDomainCrosshairValue((double) 0L, true);
        xYPlot4.setRangeCrosshairLockedOnData(true);
        int int22 = xYPlot4.getSeriesCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = xYPlot4.getRenderer((-1));
        java.awt.Stroke stroke25 = xYPlot4.getDomainGridlineStroke();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(xYItemRenderer24);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Paint paint9 = xYPlot4.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = xYPlot4.getAxisOffset();
        boolean boolean11 = xYPlot4.isDomainGridlinesVisible();
        float float12 = xYPlot4.getBackgroundImageAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation14 = xYPlot4.getDomainAxisLocation((int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        xYPlot4.setDomainAxis(valueAxis15);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(axisLocation14);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        xYPlot4.removeChangeListener(plotChangeListener23);
        java.awt.Image image25 = xYPlot4.getBackgroundImage();
        double double26 = xYPlot4.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot4.getDataRange(valueAxis11);
        xYPlot4.configureRangeAxes();
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        java.awt.Stroke stroke21 = xYPlot20.getRangeCrosshairStroke();
        xYPlot20.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot20.getDomainAxis((int) (byte) 100);
        xYPlot20.setDomainCrosshairValue((double) 1L);
        java.awt.Stroke stroke28 = xYPlot20.getRangeMinorGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot(xYDataset29, valueAxis30, valueAxis31, xYItemRenderer32);
        java.awt.Stroke stroke34 = xYPlot33.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        int int36 = xYPlot33.getIndexOf(xYItemRenderer35);
        float float37 = xYPlot33.getBackgroundAlpha();
        java.awt.Stroke stroke38 = xYPlot33.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = xYPlot33.getRangeAxisEdge();
        java.awt.Paint paint40 = xYPlot33.getNoDataMessagePaint();
        xYPlot20.setDomainTickBandPaint(paint40);
        xYPlot4.setDomainTickBandPaint(paint40);
        xYPlot4.setBackgroundImageAlpha(0.0f);
        xYPlot4.setRangeMinorGridlinesVisible(true);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(rectangleEdge39);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        xYPlot16.setFixedRangeAxisSpace(axisSpace17, false);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot16.getRangeAxis();
        xYPlot16.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot16.getRenderer();
        java.awt.Paint paint23 = xYPlot16.getDomainZeroBaselinePaint();
        xYPlot4.setDomainGridlinePaint(paint23);
        xYPlot4.setRangeMinorGridlinesVisible(true);
        xYPlot4.setDomainCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot4.getDomainAxisForDataset((int) (byte) 0);
        float float31 = xYPlot4.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        xYPlot4.setDomainCrosshairValue((double) 0L, true);
        java.awt.Paint paint20 = xYPlot4.getDomainCrosshairPaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot4.getRenderer((int) 'a');
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(xYItemRenderer22);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        java.awt.Image image12 = xYPlot4.getBackgroundImage();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        java.awt.Stroke stroke20 = xYPlot19.getRangeCrosshairStroke();
        xYPlot19.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot19.zoomRangeAxes(0.0d, plotRenderingInfo24, point2D25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        xYPlot19.panRangeAxes((double) (byte) 1, plotRenderingInfo28, point2D29);
        xYPlot19.setRangeMinorGridlinesVisible(false);
        java.awt.geom.Point2D point2D33 = xYPlot19.getQuadrantOrigin();
        org.jfree.chart.plot.PlotState plotState34 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.draw(graphics2D13, rectangle2D14, point2D33, plotState34, plotRenderingInfo35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(point2D33);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        int int23 = xYPlot4.getSeriesCount();
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot(xYDataset24, valueAxis25, valueAxis26, xYItemRenderer27);
        java.awt.Stroke stroke29 = xYPlot28.getRangeCrosshairStroke();
        xYPlot28.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        xYPlot28.zoomRangeAxes(0.0d, plotRenderingInfo33, point2D34);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder36 = xYPlot28.getDatasetRenderingOrder();
        xYPlot4.setDatasetRenderingOrder(datasetRenderingOrder36);
        java.awt.Stroke stroke38 = xYPlot4.getDomainMinorGridlineStroke();
        xYPlot4.setRangeGridlinesVisible(false);
        int int41 = xYPlot4.getBackgroundImageAlignment();
        xYPlot4.clearRangeAxes();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(datasetRenderingOrder36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 15 + "'", int41 == 15);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        int int11 = xYPlot4.getBackgroundImageAlignment();
        int int12 = xYPlot4.getBackgroundImageAlignment();
        java.util.List list13 = xYPlot4.getAnnotations();
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        xYPlot18.setFixedRangeAxisSpace(axisSpace19, false);
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot18.getRangeAxis();
        xYPlot18.clearRangeMarkers();
        java.awt.Stroke stroke24 = xYPlot18.getRangeZeroBaselineStroke();
        java.awt.Image image25 = null;
        xYPlot18.setBackgroundImage(image25);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        xYPlot18.removeChangeListener(plotChangeListener27);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = xYPlot18.getRangeMarkers(layer29);
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        xYPlot35.setFixedRangeAxisSpace(axisSpace36, false);
        org.jfree.chart.axis.ValueAxis valueAxis39 = xYPlot35.getRangeAxis();
        xYPlot35.clearRangeMarkers();
        java.awt.Stroke stroke41 = xYPlot35.getRangeZeroBaselineStroke();
        java.awt.Image image42 = null;
        xYPlot35.setBackgroundImage(image42);
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        xYPlot35.removeChangeListener(plotChangeListener44);
        org.jfree.data.xy.XYDataset xYDataset46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer49 = null;
        org.jfree.chart.plot.XYPlot xYPlot50 = new org.jfree.chart.plot.XYPlot(xYDataset46, valueAxis47, valueAxis48, xYItemRenderer49);
        org.jfree.chart.axis.AxisSpace axisSpace51 = null;
        xYPlot50.setFixedRangeAxisSpace(axisSpace51, false);
        org.jfree.chart.axis.ValueAxis valueAxis54 = xYPlot50.getRangeAxis();
        xYPlot50.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation57 = xYPlot50.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset58 = null;
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer61 = null;
        org.jfree.chart.plot.XYPlot xYPlot62 = new org.jfree.chart.plot.XYPlot(xYDataset58, valueAxis59, valueAxis60, xYItemRenderer61);
        org.jfree.chart.axis.AxisSpace axisSpace63 = null;
        xYPlot62.setFixedRangeAxisSpace(axisSpace63, false);
        org.jfree.chart.axis.ValueAxis valueAxis66 = xYPlot62.getRangeAxis();
        xYPlot62.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer68 = xYPlot62.getRenderer();
        java.awt.Paint paint69 = xYPlot62.getDomainZeroBaselinePaint();
        xYPlot50.setDomainGridlinePaint(paint69);
        xYPlot35.setRangeMinorGridlinePaint(paint69);
        xYPlot18.setDomainTickBandPaint(paint69);
        xYPlot4.setRangeCrosshairPaint(paint69);
        org.jfree.chart.axis.ValueAxis valueAxis75 = xYPlot4.getRangeAxis((int) 'a');
        org.jfree.chart.util.Layer layer77 = null;
        java.util.Collection collection78 = xYPlot4.getDomainMarkers((int) (byte) 1, layer77);
        boolean boolean79 = xYPlot4.isDomainMinorGridlinesVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets80 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setAxisOffset(rectangleInsets80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNull(valueAxis54);
        org.junit.Assert.assertNotNull(axisLocation57);
        org.junit.Assert.assertNull(valueAxis66);
        org.junit.Assert.assertNull(xYItemRenderer68);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNull(valueAxis75);
        org.junit.Assert.assertNull(collection78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot4.getRangeAxisLocation((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = xYPlot4.getAxisOffset();
        xYPlot4.setDomainZeroBaselineVisible(true);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = xYPlot4.getDomainAxisEdge((int) 'a');
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleEdge23);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.clearDomainMarkers();
        java.awt.Paint paint7 = xYPlot4.getBackgroundPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        xYPlot4.datasetChanged(datasetChangeEvent8);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        xYPlot14.setFixedRangeAxisSpace(axisSpace15, false);
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot14.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        int int20 = xYPlot14.getRangeAxisIndex(valueAxis19);
        boolean boolean21 = xYPlot14.isRangeGridlinesVisible();
        boolean boolean22 = xYPlot14.canSelectByPoint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        xYPlot14.removeChangeListener(plotChangeListener23);
        java.awt.Paint paint25 = xYPlot14.getNoDataMessagePaint();
        xYPlot4.setDomainTickBandPaint(paint25);
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = xYPlot4.getDomainMarkers(layer27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        org.jfree.chart.plot.CrosshairState crosshairState33 = null;
        boolean boolean34 = xYPlot4.render(graphics2D29, rectangle2D30, (int) (byte) 1, plotRenderingInfo32, crosshairState33);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        xYPlot4.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot4.addChangeListener(plotChangeListener13);
        double double15 = xYPlot4.getDomainCrosshairValue();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        org.jfree.chart.axis.ValueAxis valueAxis11 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.AxisLocation axisLocation12 = xYPlot4.getRangeAxisLocation();
        java.awt.Paint paint13 = xYPlot4.getRangeTickBandPaint();
        java.awt.Paint paint14 = xYPlot4.getOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder20 = xYPlot19.getSeriesRenderingOrder();
        xYPlot19.clearDomainMarkers();
        java.awt.Paint paint22 = xYPlot19.getBackgroundPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        xYPlot19.datasetChanged(datasetChangeEvent23);
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot(xYDataset25, valueAxis26, valueAxis27, xYItemRenderer28);
        org.jfree.chart.axis.AxisSpace axisSpace30 = null;
        xYPlot29.setFixedRangeAxisSpace(axisSpace30, false);
        org.jfree.chart.axis.ValueAxis valueAxis33 = xYPlot29.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        int int35 = xYPlot29.getRangeAxisIndex(valueAxis34);
        boolean boolean36 = xYPlot29.isRangeGridlinesVisible();
        boolean boolean37 = xYPlot29.canSelectByPoint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        xYPlot29.removeChangeListener(plotChangeListener38);
        java.awt.Paint paint40 = xYPlot29.getNoDataMessagePaint();
        xYPlot19.setDomainTickBandPaint(paint40);
        xYPlot4.setOutlinePaint(paint40);
        java.awt.Paint paint43 = xYPlot4.getDomainMinorGridlinePaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis11);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(seriesRenderingOrder20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(valueAxis33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        int int18 = xYPlot4.getIndexOf(xYItemRenderer17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot4.setDomainAxis(0, valueAxis20, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot4.zoomRangeAxes(1.0d, plotRenderingInfo24, point2D25);
        double double27 = xYPlot4.getDomainCrosshairValue();
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot(xYDataset28, valueAxis29, valueAxis30, xYItemRenderer31);
        java.awt.Stroke stroke33 = xYPlot32.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        int int35 = xYPlot32.getIndexOf(xYItemRenderer34);
        float float36 = xYPlot32.getBackgroundAlpha();
        java.awt.Stroke stroke37 = xYPlot32.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = xYPlot32.getRangeAxisEdge();
        boolean boolean39 = xYPlot32.isRangeCrosshairLockedOnData();
        xYPlot32.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.axis.AxisSpace axisSpace42 = null;
        xYPlot32.setFixedDomainAxisSpace(axisSpace42);
        org.jfree.data.xy.XYDataset xYDataset44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer47 = null;
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot(xYDataset44, valueAxis45, valueAxis46, xYItemRenderer47);
        org.jfree.chart.axis.AxisSpace axisSpace49 = null;
        xYPlot48.setFixedRangeAxisSpace(axisSpace49, false);
        org.jfree.chart.axis.ValueAxis valueAxis52 = xYPlot48.getRangeAxis();
        xYPlot48.clearRangeMarkers();
        java.awt.Stroke stroke54 = xYPlot48.getRangeZeroBaselineStroke();
        java.awt.Image image55 = null;
        xYPlot48.setBackgroundImage(image55);
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        xYPlot48.setDomainAxis(0, valueAxis58, true);
        org.jfree.chart.plot.PlotOrientation plotOrientation61 = xYPlot48.getOrientation();
        xYPlot32.setOrientation(plotOrientation61);
        org.jfree.chart.plot.Marker marker63 = null;
        org.jfree.chart.util.Layer layer64 = null;
        boolean boolean65 = xYPlot32.removeDomainMarker(marker63, layer64);
        java.awt.Paint paint66 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_PAINT;
        xYPlot32.setDomainTickBandPaint(paint66);
        xYPlot4.setDomainMinorGridlinePaint(paint66);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer69 = null;
        xYPlot4.setRenderer(xYItemRenderer69);
        java.awt.Stroke stroke71 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Paint paint72 = xYPlot4.getDomainTickBandPaint();
        org.jfree.chart.plot.Marker marker73 = null;
        org.jfree.chart.util.Layer layer74 = null;
        boolean boolean75 = xYPlot4.removeDomainMarker(marker73, layer74);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(rectangleEdge38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(valueAxis52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(plotOrientation61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertNull(paint72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        xYPlot4.clearRangeAxes();
        java.awt.Paint paint10 = xYPlot4.getDomainGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot4.getDomainAxis((int) (byte) 0);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = xYPlot4.getDomainAxisEdge();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        boolean boolean11 = xYPlot4.canSelectByRegion();
        double double12 = xYPlot4.getRangeCrosshairValue();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        xYPlot4.notifyListeners(plotChangeEvent13);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getAxisOffset();
        xYPlot4.setNotify(false);
        xYPlot4.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke16 = xYPlot4.getRangeCrosshairStroke();
        java.awt.Image image17 = null;
        xYPlot4.setBackgroundImage(image17);
        double double19 = xYPlot4.getRangeCrosshairValue();
        xYPlot4.setBackgroundImageAlignment(100);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getAxisOffset();
        xYPlot4.setNotify(false);
        xYPlot4.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke16 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        java.awt.Stroke stroke23 = xYPlot22.getRangeCrosshairStroke();
        xYPlot22.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        xYPlot22.zoomRangeAxes(0.0d, plotRenderingInfo27, point2D28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot22.panRangeAxes((double) (byte) 1, plotRenderingInfo31, point2D32);
        float float34 = xYPlot22.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation36 = xYPlot22.getRangeAxisLocation((int) (short) 100);
        xYPlot4.setRangeAxisLocation((int) 'a', axisLocation36);
        java.awt.Paint paint38 = xYPlot4.getOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot(xYDataset39, valueAxis40, valueAxis41, xYItemRenderer42);
        java.awt.Stroke stroke44 = xYPlot43.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        java.awt.geom.Point2D point2D48 = null;
        xYPlot43.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo47, point2D48);
        org.jfree.data.xy.XYDataset xYDataset51 = null;
        xYPlot43.setDataset((int) (short) 0, xYDataset51);
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = xYPlot43.getAxisOffset();
        int int54 = xYPlot43.getBackgroundImageAlignment();
        xYPlot43.clearDomainAxes();
        int int56 = xYPlot43.getDatasetCount();
        float float57 = xYPlot43.getBackgroundImageAlpha();
        java.awt.Font font58 = xYPlot43.getNoDataMessageFont();
        xYPlot4.setNoDataMessageFont(font58);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation36);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(rectangleInsets53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 15 + "'", int54 == 15);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.5f + "'", float57 == 0.5f);
        org.junit.Assert.assertNotNull(font58);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        double double11 = xYPlot4.getRangeCrosshairValue();
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace14);
        java.awt.Stroke stroke16 = xYPlot4.getRangeZeroBaselineStroke();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = xYPlot4.getAxisOffset();
        org.jfree.chart.plot.Plot plot15 = null;
        xYPlot4.setParent(plot15);
        xYPlot4.mapDatasetToDomainAxis((int) (short) 100, (int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot4.getDomainAxisLocation();
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot4.getDomainAxis((int) (byte) 0);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(valueAxis22);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = xYPlot4.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace13);
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        java.awt.Stroke stroke20 = xYPlot19.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        xYPlot19.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo23, point2D24);
        org.jfree.data.xy.XYDataset xYDataset27 = null;
        xYPlot19.setDataset((int) (short) 0, xYDataset27);
        xYPlot19.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker32 = null;
        boolean boolean33 = xYPlot19.removeDomainMarker(marker32);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = xYPlot19.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis35 = xYPlot19.getRangeAxis();
        boolean boolean36 = xYPlot19.isRangeGridlinesVisible();
        java.awt.Image image37 = xYPlot19.getBackgroundImage();
        org.jfree.data.xy.XYDataset xYDataset38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot(xYDataset38, valueAxis39, valueAxis40, xYItemRenderer41);
        java.awt.Stroke stroke43 = xYPlot42.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer44 = null;
        int int45 = xYPlot42.getIndexOf(xYItemRenderer44);
        float float46 = xYPlot42.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot(xYDataset47, valueAxis48, valueAxis49, xYItemRenderer50);
        org.jfree.chart.axis.AxisSpace axisSpace52 = null;
        xYPlot51.setFixedRangeAxisSpace(axisSpace52, false);
        org.jfree.chart.axis.ValueAxis valueAxis55 = xYPlot51.getRangeAxis();
        xYPlot51.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation58 = xYPlot51.getRangeAxisLocation((int) (short) -1);
        xYPlot42.setRangeAxisLocation(axisLocation58, false);
        int int61 = xYPlot42.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection62 = xYPlot42.getLegendItems();
        xYPlot19.setFixedLegendItems(legendItemCollection62);
        xYPlot4.setFixedLegendItems(legendItemCollection62);
        boolean boolean65 = xYPlot4.isDomainZeroBaselineVisible();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertNull(valueAxis35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(image37);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertNull(valueAxis55);
        org.junit.Assert.assertNotNull(axisLocation58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = xYPlot4.getAxisOffset();
        int int15 = xYPlot4.getBackgroundImageAlignment();
        xYPlot4.clearDomainAxes();
        java.awt.Stroke stroke17 = xYPlot4.getRangeGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis19 = xYPlot4.getDomainAxis(0);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot4.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        xYPlot4.setRangeAxis(valueAxis21);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNull(valueAxis20);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getNoDataMessagePaint();
        org.jfree.chart.axis.AxisSpace axisSpace11 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace11, false);
        int int14 = xYPlot4.getDomainAxisCount();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        xYPlot4.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot4.zoomDomainAxes((double) (byte) 1, plotRenderingInfo15, point2D16);
        int int18 = xYPlot4.getBackgroundImageAlignment();
        java.awt.Paint paint19 = xYPlot4.getDomainZeroBaselinePaint();
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addDomainMarker(marker20, layer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes((double) 0L, plotRenderingInfo9, point2D10);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        xYPlot4.setDataset((int) (byte) 10, xYDataset13);
        org.jfree.chart.plot.Plot plot15 = xYPlot4.getParent();
        java.awt.Stroke stroke16 = xYPlot4.getDomainZeroBaselineStroke();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        xYPlot4.axisChanged(axisChangeEvent5);
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        java.awt.Stroke stroke12 = xYPlot11.getRangeCrosshairStroke();
        xYPlot11.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot11.getDomainAxis((int) (byte) 100);
        xYPlot11.setDomainCrosshairValue((double) 1L);
        boolean boolean19 = xYPlot11.isOutlineVisible();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = null;
        xYPlot24.setFixedRangeAxisSpace(axisSpace25, false);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        xYPlot24.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = xYPlot24.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = xYPlot24.getAxisOffset();
        xYPlot24.setNotify(false);
        xYPlot24.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke36 = xYPlot24.getRangeCrosshairStroke();
        xYPlot11.setRangeGridlineStroke(stroke36);
        xYPlot4.setDomainZeroBaselineStroke(stroke36);
        boolean boolean39 = xYPlot4.isDomainMinorGridlinesVisible();
        java.awt.Image image40 = null;
        xYPlot4.setBackgroundImage(image40);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNull(xYItemRenderer30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer8 = xYPlot4.getRenderer();
        xYPlot4.mapDatasetToRangeAxis(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint13 = xYPlot4.getQuadrantPaint((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (100) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYItemRenderer8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        int int17 = xYPlot4.getDomainAxisCount();
        xYPlot4.setOutlineVisible(false);
        java.lang.String str20 = xYPlot4.getNoDataMessage();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        java.util.List list12 = xYPlot4.getAnnotations();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(11, valueAxis14);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder10 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.configureRangeAxes();
        boolean boolean12 = xYPlot4.isDomainZoomable();
        java.util.List list13 = xYPlot4.getAnnotations();
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        boolean boolean22 = xYPlot18.removeDomainMarker((int) '4', marker20, layer21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot18.setInsets(rectangleInsets23, true);
        xYPlot18.setBackgroundImageAlignment((-1));
        java.awt.Image image28 = null;
        xYPlot18.setBackgroundImage(image28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        xYPlot18.setDrawingSupplier(drawingSupplier30);
        java.awt.Paint paint32 = xYPlot18.getNoDataMessagePaint();
        xYPlot4.setDomainGridlinePaint(paint32);
        boolean boolean34 = xYPlot4.isRangeCrosshairLockedOnData();
        org.jfree.chart.util.Layer layer35 = null;
        java.util.Collection collection36 = xYPlot4.getDomainMarkers(layer35);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(seriesRenderingOrder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(collection36);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        java.awt.Stroke stroke14 = xYPlot13.getRangeCrosshairStroke();
        xYPlot13.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        xYPlot13.zoomRangeAxes(0.0d, plotRenderingInfo18, point2D19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        xYPlot13.panRangeAxes((double) (byte) 1, plotRenderingInfo22, point2D23);
        float float25 = xYPlot13.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot13.getRangeAxisLocation((int) (short) 100);
        xYPlot4.setRangeAxisLocation(axisLocation27, true);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot(xYDataset32, valueAxis33, valueAxis34, xYItemRenderer35);
        org.jfree.chart.plot.Marker marker38 = null;
        org.jfree.chart.util.Layer layer39 = null;
        boolean boolean40 = xYPlot36.removeDomainMarker((int) '4', marker38, layer39);
        org.jfree.chart.axis.AxisLocation axisLocation41 = xYPlot36.getDomainAxisLocation();
        xYPlot4.setDomainAxisLocation(axisLocation41, false);
        xYPlot4.setRangeCrosshairValue((double) (short) -1);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(axisLocation41);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        int int7 = xYPlot4.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = xYPlot4.getDatasetGroup();
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        xYPlot4.setDataset(10, xYDataset10);
        java.awt.Paint paint12 = xYPlot4.getRangeCrosshairPaint();
        int int13 = xYPlot4.getRangeAxisCount();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot17.getIndexOf(xYItemRenderer19);
        float float21 = xYPlot17.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        xYPlot26.setFixedRangeAxisSpace(axisSpace27, false);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot26.getRangeAxis();
        xYPlot26.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot26.getRangeAxisLocation((int) (short) -1);
        xYPlot17.setRangeAxisLocation(axisLocation33, false);
        xYPlot4.setDomainAxisLocation((int) (byte) 10, axisLocation33);
        xYPlot4.setDomainCrosshairValue((double) 0);
        xYPlot4.clearRangeMarkers();
        java.awt.Paint paint40 = xYPlot4.getRangeTickBandPaint();
        xYPlot4.setNotify(true);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(paint40);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        xYPlot4.mapDatasetToDomainAxis((int) (byte) 10, (int) (short) -1);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = xYPlot4.removeAnnotation(xYAnnotation26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        int int18 = xYPlot4.getIndexOf(xYItemRenderer17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot4.setDomainAxis(0, valueAxis20, true);
        java.lang.String str23 = xYPlot4.getNoDataMessage();
        xYPlot4.clearSelection();
        xYPlot4.setRangeGridlinesVisible(false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        java.awt.Stroke stroke13 = xYPlot12.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        int int15 = xYPlot12.getIndexOf(xYItemRenderer14);
        float float16 = xYPlot12.getBackgroundAlpha();
        java.awt.Stroke stroke17 = xYPlot12.getDomainGridlineStroke();
        xYPlot4.setDomainZeroBaselineStroke(stroke17);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = xYPlot4.getRenderer();
        xYPlot4.setRangeCrosshairVisible(false);
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        java.awt.Stroke stroke27 = xYPlot26.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        xYPlot26.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo30, point2D31);
        xYPlot26.setDomainCrosshairLockedOnData(false);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray35 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot26.setRenderers(xYItemRendererArray35);
        xYPlot4.setRenderers(xYItemRendererArray35);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(xYItemRenderer19);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(xYItemRendererArray35);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        boolean boolean11 = xYPlot4.canSelectByRegion();
        xYPlot4.setDomainCrosshairValue(100.0d);
        org.jfree.chart.plot.Plot plot14 = xYPlot4.getRootPlot();
        org.jfree.chart.axis.AxisSpace axisSpace15 = xYPlot4.getFixedRangeAxisSpace();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        xYPlot4.setRenderer(xYItemRenderer16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        org.jfree.chart.plot.CrosshairState crosshairState22 = null;
        boolean boolean23 = xYPlot4.render(graphics2D18, rectangle2D19, (int) (short) 1, plotRenderingInfo21, crosshairState22);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(axisSpace15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Paint paint9 = xYPlot4.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = xYPlot4.getAxisOffset();
        boolean boolean11 = xYPlot4.isRangeCrosshairLockedOnData();
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = xYPlot4.getRendererForDataset(xYDataset12);
        org.jfree.chart.plot.Plot plot14 = xYPlot4.getParent();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYItemRenderer13);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        int int18 = xYPlot4.getIndexOf(xYItemRenderer17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot4.setDomainAxis(0, valueAxis20, true);
        org.jfree.chart.axis.AxisSpace axisSpace23 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace23);
        double double25 = xYPlot4.getDomainCrosshairValue();
        java.awt.Paint paint26 = xYPlot4.getOutlinePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        xYPlot4.removeChangeListener(plotChangeListener27);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot4.getRendererForDataset(xYDataset21);
        org.jfree.chart.plot.Marker marker24 = null;
        org.jfree.chart.util.Layer layer25 = null;
        boolean boolean27 = xYPlot4.removeDomainMarker((int) (byte) 0, marker24, layer25, true);
        org.jfree.chart.util.Layer layer28 = null;
        java.util.Collection collection29 = xYPlot4.getDomainMarkers(layer28);
        org.jfree.data.xy.XYDataset xYDataset30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer33 = null;
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot(xYDataset30, valueAxis31, valueAxis32, xYItemRenderer33);
        org.jfree.chart.plot.Marker marker36 = null;
        org.jfree.chart.util.Layer layer37 = null;
        boolean boolean38 = xYPlot34.removeDomainMarker((int) '4', marker36, layer37);
        boolean boolean39 = xYPlot34.isSubplot();
        org.jfree.data.general.DatasetGroup datasetGroup40 = xYPlot34.getDatasetGroup();
        java.awt.Paint paint41 = xYPlot34.getDomainGridlinePaint();
        org.jfree.data.xy.XYDataset xYDataset42 = null;
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = null;
        org.jfree.chart.plot.XYPlot xYPlot46 = new org.jfree.chart.plot.XYPlot(xYDataset42, valueAxis43, valueAxis44, xYItemRenderer45);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder47 = xYPlot46.getSeriesRenderingOrder();
        xYPlot46.clearDomainMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis49 = xYPlot46.getDomainAxis();
        java.awt.Paint paint50 = xYPlot46.getDomainTickBandPaint();
        org.jfree.data.xy.XYDataset xYDataset51 = null;
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.axis.ValueAxis valueAxis53 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer54 = null;
        org.jfree.chart.plot.XYPlot xYPlot55 = new org.jfree.chart.plot.XYPlot(xYDataset51, valueAxis52, valueAxis53, xYItemRenderer54);
        java.awt.Stroke stroke56 = xYPlot55.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer57 = null;
        int int58 = xYPlot55.getIndexOf(xYItemRenderer57);
        float float59 = xYPlot55.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset60 = null;
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.axis.ValueAxis valueAxis62 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer63 = null;
        org.jfree.chart.plot.XYPlot xYPlot64 = new org.jfree.chart.plot.XYPlot(xYDataset60, valueAxis61, valueAxis62, xYItemRenderer63);
        org.jfree.chart.axis.AxisSpace axisSpace65 = null;
        xYPlot64.setFixedRangeAxisSpace(axisSpace65, false);
        org.jfree.chart.axis.ValueAxis valueAxis68 = xYPlot64.getRangeAxis();
        xYPlot64.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation71 = xYPlot64.getRangeAxisLocation((int) (short) -1);
        xYPlot55.setRangeAxisLocation(axisLocation71, false);
        java.awt.Paint paint74 = xYPlot55.getOutlinePaint();
        java.awt.Paint paint75 = xYPlot55.getRangeMinorGridlinePaint();
        xYPlot46.setOutlinePaint(paint75);
        xYPlot34.setDomainCrosshairPaint(paint75);
        xYPlot4.setDomainZeroBaselinePaint(paint75);
        int int79 = xYPlot4.getDatasetCount();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(datasetGroup40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(seriesRenderingOrder47);
        org.junit.Assert.assertNull(valueAxis49);
        org.junit.Assert.assertNull(paint50);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 1.0f + "'", float59 == 1.0f);
        org.junit.Assert.assertNull(valueAxis68);
        org.junit.Assert.assertNotNull(axisLocation71);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertNotNull(paint75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getAxisOffset();
        xYPlot4.setNotify(false);
        xYPlot4.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke16 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        java.awt.Stroke stroke23 = xYPlot22.getRangeCrosshairStroke();
        xYPlot22.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        xYPlot22.zoomRangeAxes(0.0d, plotRenderingInfo27, point2D28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot22.panRangeAxes((double) (byte) 1, plotRenderingInfo31, point2D32);
        float float34 = xYPlot22.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation36 = xYPlot22.getRangeAxisLocation((int) (short) 100);
        xYPlot4.setRangeAxisLocation((int) 'a', axisLocation36);
        org.jfree.data.xy.XYDataset xYDataset38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot(xYDataset38, valueAxis39, valueAxis40, xYItemRenderer41);
        xYPlot42.clearRangeMarkers(15);
        org.jfree.data.xy.XYDataset xYDataset45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer48 = null;
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot(xYDataset45, valueAxis46, valueAxis47, xYItemRenderer48);
        org.jfree.chart.axis.AxisSpace axisSpace50 = null;
        xYPlot49.setFixedRangeAxisSpace(axisSpace50, false);
        org.jfree.chart.axis.ValueAxis valueAxis53 = xYPlot49.getRangeAxis();
        xYPlot49.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer55 = xYPlot49.getRenderer();
        java.awt.Paint paint56 = xYPlot49.getDomainZeroBaselinePaint();
        xYPlot42.setRangeGridlinePaint(paint56);
        xYPlot4.setDomainCrosshairPaint(paint56);
        org.jfree.data.xy.XYDataset xYDataset59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer62 = null;
        org.jfree.chart.plot.XYPlot xYPlot63 = new org.jfree.chart.plot.XYPlot(xYDataset59, valueAxis60, valueAxis61, xYItemRenderer62);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent64 = null;
        xYPlot63.axisChanged(axisChangeEvent64);
        org.jfree.data.xy.XYDataset xYDataset66 = null;
        org.jfree.chart.axis.ValueAxis valueAxis67 = null;
        org.jfree.chart.axis.ValueAxis valueAxis68 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer69 = null;
        org.jfree.chart.plot.XYPlot xYPlot70 = new org.jfree.chart.plot.XYPlot(xYDataset66, valueAxis67, valueAxis68, xYItemRenderer69);
        java.awt.Stroke stroke71 = xYPlot70.getRangeCrosshairStroke();
        xYPlot70.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis75 = xYPlot70.getDomainAxis((int) (byte) 100);
        xYPlot70.setDomainCrosshairValue((double) 1L);
        boolean boolean78 = xYPlot70.isOutlineVisible();
        org.jfree.data.xy.XYDataset xYDataset79 = null;
        org.jfree.chart.axis.ValueAxis valueAxis80 = null;
        org.jfree.chart.axis.ValueAxis valueAxis81 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer82 = null;
        org.jfree.chart.plot.XYPlot xYPlot83 = new org.jfree.chart.plot.XYPlot(xYDataset79, valueAxis80, valueAxis81, xYItemRenderer82);
        org.jfree.chart.axis.AxisSpace axisSpace84 = null;
        xYPlot83.setFixedRangeAxisSpace(axisSpace84, false);
        org.jfree.chart.axis.ValueAxis valueAxis87 = xYPlot83.getRangeAxis();
        xYPlot83.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer89 = xYPlot83.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets90 = xYPlot83.getAxisOffset();
        xYPlot83.setNotify(false);
        xYPlot83.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke95 = xYPlot83.getRangeCrosshairStroke();
        xYPlot70.setRangeGridlineStroke(stroke95);
        xYPlot63.setDomainZeroBaselineStroke(stroke95);
        xYPlot4.setDomainGridlineStroke(stroke95);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation36);
        org.junit.Assert.assertNull(valueAxis53);
        org.junit.Assert.assertNull(xYItemRenderer55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertNull(valueAxis75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(valueAxis87);
        org.junit.Assert.assertNull(xYItemRenderer89);
        org.junit.Assert.assertNotNull(rectangleInsets90);
        org.junit.Assert.assertNotNull(stroke95);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder18 = xYPlot17.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = null;
        xYPlot24.setFixedRangeAxisSpace(axisSpace25, false);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        xYPlot24.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot24.getRangeAxisLocation((int) (short) -1);
        xYPlot17.setDomainAxisLocation(0, axisLocation31, false);
        int int34 = xYPlot17.getWeight();
        java.awt.Paint paint35 = xYPlot17.getDomainZeroBaselinePaint();
        xYPlot4.setDomainMinorGridlinePaint(paint35);
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.drawOutline(graphics2D37, rectangle2D38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(seriesRenderingOrder18);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        double double11 = xYPlot4.getRangeCrosshairValue();
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.util.List list18 = null;
        xYPlot4.drawRangeTickBands(graphics2D16, rectangle2D17, list18);
        java.awt.geom.Point2D point2D20 = xYPlot4.getQuadrantOrigin();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        xYPlot4.setRenderer(xYItemRenderer21);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(point2D20);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = xYPlot4.getRangeAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        java.awt.Stroke stroke22 = xYPlot21.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        int int24 = xYPlot21.getIndexOf(xYItemRenderer23);
        float float25 = xYPlot21.getBackgroundAlpha();
        java.awt.Stroke stroke26 = xYPlot21.getDomainGridlineStroke();
        xYPlot13.setDomainZeroBaselineStroke(stroke26);
        xYPlot4.setRangeZeroBaselineStroke(stroke26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        xYPlot4.zoomDomainAxes((double) ' ', plotRenderingInfo30, point2D31, false);
        org.jfree.chart.util.Layer layer34 = null;
        java.util.Collection collection35 = xYPlot4.getDomainMarkers(layer34);
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        org.jfree.chart.RenderingSource renderingSource39 = null;
        xYPlot4.select((double) 1, (double) (-1), rectangle2D38, renderingSource39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = xYPlot4.getInsets();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(collection35);
        org.junit.Assert.assertNotNull(rectangleInsets41);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        xYPlot4.clearRangeMarkers();
        java.awt.Paint paint24 = xYPlot4.getRangeTickBandPaint();
        boolean boolean25 = xYPlot4.isRangeMinorGridlinesVisible();
        java.awt.Stroke stroke26 = xYPlot4.getDomainMinorGridlineStroke();
        boolean boolean27 = xYPlot4.isRangeMinorGridlinesVisible();
        java.awt.Paint paint28 = xYPlot4.getRangeTickBandPaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(paint28);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        int int11 = xYPlot4.getIndexOf(xYItemRenderer10);
        xYPlot4.setDomainMinorGridlinesVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot4.getRangeAxis((int) (short) 10);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        java.awt.Stroke stroke21 = xYPlot20.getRangeCrosshairStroke();
        xYPlot20.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        xYPlot20.zoomRangeAxes(0.0d, plotRenderingInfo25, point2D26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        xYPlot20.panRangeAxes((double) (byte) 1, plotRenderingInfo29, point2D30);
        float float32 = xYPlot20.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation34 = xYPlot20.getRangeAxisLocation((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = xYPlot20.getAxisOffset();
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = xYPlot20.getDomainAxisEdge();
        java.awt.Image image37 = xYPlot20.getBackgroundImage();
        java.awt.geom.GeneralPath generalPath38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        org.jfree.chart.RenderingSource renderingSource40 = null;
        xYPlot20.select(generalPath38, rectangle2D39, renderingSource40);
        java.awt.Paint paint42 = xYPlot20.getOutlinePaint();
        xYPlot4.setParent((org.jfree.chart.plot.Plot) xYPlot20);
        org.jfree.data.xy.XYDataset xYDataset44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer47 = null;
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot(xYDataset44, valueAxis45, valueAxis46, xYItemRenderer47);
        java.awt.Stroke stroke49 = xYPlot48.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        int int51 = xYPlot48.getIndexOf(xYItemRenderer50);
        float float52 = xYPlot48.getBackgroundAlpha();
        java.awt.Paint paint53 = xYPlot48.getDomainGridlinePaint();
        org.jfree.data.xy.XYDataset xYDataset54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer57 = null;
        org.jfree.chart.plot.XYPlot xYPlot58 = new org.jfree.chart.plot.XYPlot(xYDataset54, valueAxis55, valueAxis56, xYItemRenderer57);
        java.awt.Stroke stroke59 = xYPlot58.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo62 = null;
        java.awt.geom.Point2D point2D63 = null;
        xYPlot58.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo62, point2D63);
        org.jfree.data.xy.XYDataset xYDataset66 = null;
        xYPlot58.setDataset((int) (short) 0, xYDataset66);
        xYPlot58.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = xYPlot58.getAxisOffset();
        xYPlot48.setAxisOffset(rectangleInsets71);
        xYPlot20.setAxisOffset(rectangleInsets71);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNotNull(rectangleEdge36);
        org.junit.Assert.assertNull(image37);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.0f + "'", float52 == 1.0f);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNotNull(rectangleInsets71);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot4.getDataRange(valueAxis11);
        boolean boolean13 = xYPlot4.isDomainPannable();
        xYPlot4.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        xYPlot4.clearRangeMarkers(15);
        int int7 = xYPlot4.getDomainAxisCount();
        java.awt.Paint paint9 = xYPlot4.getQuadrantPaint((int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        xYPlot4.setDomainAxis(valueAxis10);
        java.awt.Stroke stroke12 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        int int14 = xYPlot4.getRangeAxisIndex(valueAxis13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot4.removeChangeListener(plotChangeListener13);
        java.awt.Paint paint15 = xYPlot4.getNoDataMessagePaint();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = xYPlot4.getRenderer();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(xYItemRenderer17);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = xYPlot4.getDatasetRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        int int14 = xYPlot4.indexOf(xYDataset13);
        xYPlot4.setNotify(true);
        java.awt.Stroke stroke17 = xYPlot4.getOutlineStroke();
        org.jfree.data.xy.XYDataset xYDataset18 = xYPlot4.getDataset();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(xYDataset18);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot4.getRangeAxis();
        double double21 = xYPlot4.getDomainCrosshairValue();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        xYPlot4.setRenderer(11, xYItemRenderer23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot(xYDataset28, valueAxis29, valueAxis30, xYItemRenderer31);
        org.jfree.chart.axis.AxisSpace axisSpace33 = null;
        xYPlot32.setFixedRangeAxisSpace(axisSpace33, false);
        org.jfree.chart.axis.ValueAxis valueAxis36 = xYPlot32.getRangeAxis();
        xYPlot32.clearRangeMarkers();
        java.awt.Stroke stroke38 = xYPlot32.getRangeZeroBaselineStroke();
        java.awt.Image image39 = null;
        xYPlot32.setBackgroundImage(image39);
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        xYPlot32.setDomainAxis(0, valueAxis42, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        java.awt.geom.Point2D point2D47 = null;
        xYPlot32.panRangeAxes((-1.0d), plotRenderingInfo46, point2D47);
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.data.Range range50 = xYPlot32.getDataRange(valueAxis49);
        xYPlot32.setDomainCrosshairVisible(true);
        java.awt.geom.Point2D point2D53 = xYPlot32.getQuadrantOrigin();
        xYPlot4.zoomDomainAxes((double) 0.5f, (double) 0.0f, plotRenderingInfo27, point2D53);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(valueAxis36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNull(range50);
        org.junit.Assert.assertNotNull(point2D53);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        java.awt.Stroke stroke14 = xYPlot13.getRangeCrosshairStroke();
        xYPlot13.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        xYPlot13.zoomRangeAxes(0.0d, plotRenderingInfo18, point2D19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        xYPlot13.panRangeAxes((double) (byte) 1, plotRenderingInfo22, point2D23);
        float float25 = xYPlot13.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot13.getRangeAxisLocation((int) (short) 100);
        xYPlot4.setRangeAxisLocation(axisLocation27, true);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset32 = xYPlot4.getDataset();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder33 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.chart.util.Layer layer34 = null;
        java.util.Collection collection35 = xYPlot4.getRangeMarkers(layer34);
        xYPlot4.mapDatasetToRangeAxis((int) (byte) 10, (int) (short) 0);
        xYPlot4.setForegroundAlpha((float) 1L);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNull(xYDataset32);
        org.junit.Assert.assertNotNull(seriesRenderingOrder33);
        org.junit.Assert.assertNull(collection35);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        java.awt.Paint paint11 = xYPlot4.getNoDataMessagePaint();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder12 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.clearDomainMarkers((int) (byte) 10);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        xYPlot20.setFixedRangeAxisSpace(axisSpace21, false);
        org.jfree.chart.axis.ValueAxis valueAxis24 = xYPlot20.getRangeAxis();
        xYPlot20.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = xYPlot20.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = xYPlot20.getAxisOffset();
        xYPlot20.setBackgroundAlpha((float) 'a');
        java.awt.Paint paint30 = xYPlot20.getOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setQuadrantPaint((int) (byte) 10, paint30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (10) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(seriesRenderingOrder12);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertNull(xYItemRenderer26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder13 = xYPlot12.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        xYPlot19.setFixedRangeAxisSpace(axisSpace20, false);
        org.jfree.chart.axis.ValueAxis valueAxis23 = xYPlot19.getRangeAxis();
        xYPlot19.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot19.getRangeAxisLocation((int) (short) -1);
        xYPlot12.setDomainAxisLocation(0, axisLocation26, false);
        xYPlot12.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot12.setBackgroundAlpha(0.0f);
        boolean boolean33 = xYPlot12.canSelectByRegion();
        xYPlot4.setParent((org.jfree.chart.plot.Plot) xYPlot12);
        xYPlot12.setRangePannable(false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(seriesRenderingOrder13);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        java.awt.Stroke stroke13 = xYPlot12.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        int int15 = xYPlot12.getIndexOf(xYItemRenderer14);
        float float16 = xYPlot12.getBackgroundAlpha();
        java.awt.Stroke stroke17 = xYPlot12.getDomainGridlineStroke();
        xYPlot4.setDomainZeroBaselineStroke(stroke17);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = xYPlot4.getRenderer();
        xYPlot4.setRangeCrosshairVisible(false);
        java.util.List list22 = xYPlot4.getAnnotations();
        java.awt.Paint paint23 = xYPlot4.getRangeZeroBaselinePaint();
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(xYItemRenderer19);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        xYPlot4.setDomainPannable(true);
        int int18 = xYPlot4.getSeriesCount();
        float float19 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        java.awt.Stroke stroke25 = xYPlot24.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        int int27 = xYPlot24.getIndexOf(xYItemRenderer26);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = xYPlot24.getRangeAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot(xYDataset29, valueAxis30, valueAxis31, xYItemRenderer32);
        org.jfree.chart.axis.AxisSpace axisSpace34 = null;
        xYPlot33.setFixedRangeAxisSpace(axisSpace34, false);
        org.jfree.data.xy.XYDataset xYDataset37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer40 = null;
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot(xYDataset37, valueAxis38, valueAxis39, xYItemRenderer40);
        java.awt.Stroke stroke42 = xYPlot41.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer43 = null;
        int int44 = xYPlot41.getIndexOf(xYItemRenderer43);
        float float45 = xYPlot41.getBackgroundAlpha();
        java.awt.Stroke stroke46 = xYPlot41.getDomainGridlineStroke();
        xYPlot33.setDomainZeroBaselineStroke(stroke46);
        xYPlot24.setRangeZeroBaselineStroke(stroke46);
        xYPlot4.setRangeMinorGridlineStroke(stroke46);
        java.awt.Stroke stroke50 = xYPlot4.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 1.0f + "'", float45 == 1.0f);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(stroke50);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        int int21 = xYPlot4.getWeight();
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = xYPlot4.getDomainMarkers((int) (short) 1, layer23);
        org.jfree.chart.plot.Marker marker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addDomainMarker(marker25, layer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(collection24);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        xYPlot12.setFixedRangeAxisSpace(axisSpace13, false);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        java.awt.Stroke stroke21 = xYPlot20.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = null;
        int int23 = xYPlot20.getIndexOf(xYItemRenderer22);
        float float24 = xYPlot20.getBackgroundAlpha();
        java.awt.Stroke stroke25 = xYPlot20.getDomainGridlineStroke();
        xYPlot12.setDomainZeroBaselineStroke(stroke25);
        xYPlot4.setOutlineStroke(stroke25);
        java.awt.geom.Point2D point2D28 = xYPlot4.getQuadrantOrigin();
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(point2D28);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        xYPlot4.setRangeZeroBaselineVisible(true);
        int int13 = xYPlot4.getSeriesCount();
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.RenderingSource renderingSource17 = null;
        xYPlot4.select((double) '4', 100.0d, rectangle2D16, renderingSource17);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis(valueAxis13);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = xYPlot4.getRenderer((int) ' ');
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(xYItemRenderer16);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        xYPlot4.setForegroundAlpha((float) 'a');
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        xYPlot14.setFixedRangeAxisSpace(axisSpace15, false);
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot14.getRangeAxis();
        boolean boolean19 = xYPlot14.isRangeMinorGridlinesVisible();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        java.awt.Stroke stroke25 = xYPlot24.getRangeCrosshairStroke();
        xYPlot24.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        xYPlot24.zoomRangeAxes(0.0d, plotRenderingInfo29, point2D30);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder32 = xYPlot24.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace33 = null;
        xYPlot24.setFixedRangeAxisSpace(axisSpace33);
        org.jfree.data.xy.XYDataset xYDataset35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot(xYDataset35, valueAxis36, valueAxis37, xYItemRenderer38);
        java.awt.Stroke stroke40 = xYPlot39.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        java.awt.geom.Point2D point2D44 = null;
        xYPlot39.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo43, point2D44);
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        xYPlot39.setDataset((int) (short) 0, xYDataset47);
        xYPlot39.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker52 = null;
        boolean boolean53 = xYPlot39.removeDomainMarker(marker52);
        org.jfree.chart.util.RectangleEdge rectangleEdge54 = xYPlot39.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis55 = xYPlot39.getRangeAxis();
        boolean boolean56 = xYPlot39.isRangeGridlinesVisible();
        java.awt.Image image57 = xYPlot39.getBackgroundImage();
        org.jfree.data.xy.XYDataset xYDataset58 = null;
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer61 = null;
        org.jfree.chart.plot.XYPlot xYPlot62 = new org.jfree.chart.plot.XYPlot(xYDataset58, valueAxis59, valueAxis60, xYItemRenderer61);
        java.awt.Stroke stroke63 = xYPlot62.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer64 = null;
        int int65 = xYPlot62.getIndexOf(xYItemRenderer64);
        float float66 = xYPlot62.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset67 = null;
        org.jfree.chart.axis.ValueAxis valueAxis68 = null;
        org.jfree.chart.axis.ValueAxis valueAxis69 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer70 = null;
        org.jfree.chart.plot.XYPlot xYPlot71 = new org.jfree.chart.plot.XYPlot(xYDataset67, valueAxis68, valueAxis69, xYItemRenderer70);
        org.jfree.chart.axis.AxisSpace axisSpace72 = null;
        xYPlot71.setFixedRangeAxisSpace(axisSpace72, false);
        org.jfree.chart.axis.ValueAxis valueAxis75 = xYPlot71.getRangeAxis();
        xYPlot71.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation78 = xYPlot71.getRangeAxisLocation((int) (short) -1);
        xYPlot62.setRangeAxisLocation(axisLocation78, false);
        int int81 = xYPlot62.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection82 = xYPlot62.getLegendItems();
        xYPlot39.setFixedLegendItems(legendItemCollection82);
        xYPlot24.setFixedLegendItems(legendItemCollection82);
        xYPlot14.setFixedLegendItems(legendItemCollection82);
        xYPlot4.setFixedLegendItems(legendItemCollection82);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(datasetRenderingOrder32);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(rectangleEdge54);
        org.junit.Assert.assertNull(valueAxis55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(image57);
        org.junit.Assert.assertNotNull(stroke63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 1.0f + "'", float66 == 1.0f);
        org.junit.Assert.assertNull(valueAxis75);
        org.junit.Assert.assertNotNull(axisLocation78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection82);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        java.awt.Paint paint12 = xYPlot4.getOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        xYPlot17.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        xYPlot17.zoomRangeAxes(0.0d, plotRenderingInfo22, point2D23);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder25 = xYPlot17.getDatasetRenderingOrder();
        xYPlot17.setRangeCrosshairValue((double) ' ', false);
        org.jfree.data.xy.XYDataset xYDataset29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot(xYDataset29, valueAxis30, valueAxis31, xYItemRenderer32);
        org.jfree.chart.axis.AxisSpace axisSpace34 = null;
        xYPlot33.setFixedRangeAxisSpace(axisSpace34, false);
        org.jfree.chart.axis.ValueAxis valueAxis37 = xYPlot33.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        int int39 = xYPlot33.getRangeAxisIndex(valueAxis38);
        boolean boolean40 = xYPlot33.isRangeGridlinesVisible();
        boolean boolean41 = xYPlot33.isRangePannable();
        org.jfree.data.xy.XYDataset xYDataset42 = null;
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = null;
        org.jfree.chart.plot.XYPlot xYPlot46 = new org.jfree.chart.plot.XYPlot(xYDataset42, valueAxis43, valueAxis44, xYItemRenderer45);
        org.jfree.chart.axis.AxisSpace axisSpace47 = null;
        xYPlot46.setFixedRangeAxisSpace(axisSpace47, false);
        org.jfree.chart.axis.ValueAxis valueAxis50 = xYPlot46.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        int int52 = xYPlot46.getRangeAxisIndex(valueAxis51);
        boolean boolean53 = xYPlot46.isRangeGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis54 = xYPlot46.getDomainAxis();
        org.jfree.data.xy.XYDataset xYDataset55 = null;
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer58 = null;
        org.jfree.chart.plot.XYPlot xYPlot59 = new org.jfree.chart.plot.XYPlot(xYDataset55, valueAxis56, valueAxis57, xYItemRenderer58);
        java.awt.Stroke stroke60 = xYPlot59.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo63 = null;
        java.awt.geom.Point2D point2D64 = null;
        xYPlot59.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo63, point2D64);
        org.jfree.data.xy.XYDataset xYDataset67 = null;
        xYPlot59.setDataset((int) (short) 0, xYDataset67);
        xYPlot59.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets72 = xYPlot59.getAxisOffset();
        org.jfree.data.xy.XYDataset xYDataset73 = null;
        org.jfree.chart.axis.ValueAxis valueAxis74 = null;
        org.jfree.chart.axis.ValueAxis valueAxis75 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer76 = null;
        org.jfree.chart.plot.XYPlot xYPlot77 = new org.jfree.chart.plot.XYPlot(xYDataset73, valueAxis74, valueAxis75, xYItemRenderer76);
        org.jfree.chart.axis.AxisSpace axisSpace78 = null;
        xYPlot77.setFixedRangeAxisSpace(axisSpace78, false);
        org.jfree.chart.axis.ValueAxis valueAxis81 = xYPlot77.getRangeAxis();
        xYPlot77.clearRangeMarkers();
        java.awt.Stroke stroke83 = xYPlot77.getRangeZeroBaselineStroke();
        xYPlot59.setRangeCrosshairStroke(stroke83);
        xYPlot46.setDomainGridlineStroke(stroke83);
        xYPlot33.setDomainMinorGridlineStroke(stroke83);
        xYPlot17.setRangeMinorGridlineStroke(stroke83);
        xYPlot4.setDomainGridlineStroke(stroke83);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(datasetRenderingOrder25);
        org.junit.Assert.assertNull(valueAxis37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(valueAxis50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(valueAxis54);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNotNull(rectangleInsets72);
        org.junit.Assert.assertNull(valueAxis81);
        org.junit.Assert.assertNotNull(stroke83);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = xYPlot4.getAxisOffset();
        org.jfree.chart.plot.Plot plot15 = null;
        xYPlot4.setParent(plot15);
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = xYPlot4.getRangeAxisEdge((int) (short) 0);
        java.awt.Font font19 = xYPlot4.getNoDataMessageFont();
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace20, false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = xYPlot4.getDrawingSupplier();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(drawingSupplier23);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        int int11 = xYPlot4.getBackgroundImageAlignment();
        int int12 = xYPlot4.getBackgroundImageAlignment();
        java.util.List list13 = xYPlot4.getAnnotations();
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        xYPlot18.setFixedRangeAxisSpace(axisSpace19, false);
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot18.getRangeAxis();
        xYPlot18.clearRangeMarkers();
        java.awt.Stroke stroke24 = xYPlot18.getRangeZeroBaselineStroke();
        java.awt.Image image25 = null;
        xYPlot18.setBackgroundImage(image25);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        xYPlot18.removeChangeListener(plotChangeListener27);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = xYPlot18.getRangeMarkers(layer29);
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        xYPlot35.setFixedRangeAxisSpace(axisSpace36, false);
        org.jfree.chart.axis.ValueAxis valueAxis39 = xYPlot35.getRangeAxis();
        xYPlot35.clearRangeMarkers();
        java.awt.Stroke stroke41 = xYPlot35.getRangeZeroBaselineStroke();
        java.awt.Image image42 = null;
        xYPlot35.setBackgroundImage(image42);
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        xYPlot35.removeChangeListener(plotChangeListener44);
        org.jfree.data.xy.XYDataset xYDataset46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer49 = null;
        org.jfree.chart.plot.XYPlot xYPlot50 = new org.jfree.chart.plot.XYPlot(xYDataset46, valueAxis47, valueAxis48, xYItemRenderer49);
        org.jfree.chart.axis.AxisSpace axisSpace51 = null;
        xYPlot50.setFixedRangeAxisSpace(axisSpace51, false);
        org.jfree.chart.axis.ValueAxis valueAxis54 = xYPlot50.getRangeAxis();
        xYPlot50.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation57 = xYPlot50.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset58 = null;
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer61 = null;
        org.jfree.chart.plot.XYPlot xYPlot62 = new org.jfree.chart.plot.XYPlot(xYDataset58, valueAxis59, valueAxis60, xYItemRenderer61);
        org.jfree.chart.axis.AxisSpace axisSpace63 = null;
        xYPlot62.setFixedRangeAxisSpace(axisSpace63, false);
        org.jfree.chart.axis.ValueAxis valueAxis66 = xYPlot62.getRangeAxis();
        xYPlot62.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer68 = xYPlot62.getRenderer();
        java.awt.Paint paint69 = xYPlot62.getDomainZeroBaselinePaint();
        xYPlot50.setDomainGridlinePaint(paint69);
        xYPlot35.setRangeMinorGridlinePaint(paint69);
        xYPlot18.setDomainTickBandPaint(paint69);
        xYPlot4.setRangeCrosshairPaint(paint69);
        org.jfree.chart.axis.ValueAxis valueAxis75 = xYPlot4.getRangeAxis((int) 'a');
        int int76 = xYPlot4.getDatasetCount();
        org.jfree.chart.plot.Marker marker78 = null;
        org.jfree.chart.util.Layer layer79 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addRangeMarker(1, marker78, layer79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNull(valueAxis54);
        org.junit.Assert.assertNotNull(axisLocation57);
        org.junit.Assert.assertNull(valueAxis66);
        org.junit.Assert.assertNull(xYItemRenderer68);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNull(valueAxis75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis((int) (short) 10, valueAxis13);
        float float15 = xYPlot4.getBackgroundImageAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = xYPlot4.getDomainAxisIndex(valueAxis16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace18);
        int int20 = xYPlot4.getWeight();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        java.awt.Stroke stroke14 = xYPlot13.getRangeCrosshairStroke();
        xYPlot13.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        xYPlot13.zoomRangeAxes(0.0d, plotRenderingInfo18, point2D19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        xYPlot13.panRangeAxes((double) (byte) 1, plotRenderingInfo22, point2D23);
        float float25 = xYPlot13.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot13.getRangeAxisLocation((int) (short) 100);
        xYPlot4.setRangeAxisLocation(axisLocation27, true);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset32 = xYPlot4.getDataset();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder33 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.chart.util.Layer layer34 = null;
        java.util.Collection collection35 = xYPlot4.getRangeMarkers(layer34);
        xYPlot4.mapDatasetToRangeAxis((int) (byte) 10, (int) (short) 0);
        org.jfree.data.xy.XYDataset xYDataset39 = xYPlot4.getDataset();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNull(xYDataset32);
        org.junit.Assert.assertNotNull(seriesRenderingOrder33);
        org.junit.Assert.assertNull(collection35);
        org.junit.Assert.assertNull(xYDataset39);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.RenderingSource renderingSource11 = null;
        xYPlot4.select((double) '#', (double) 1.0f, rectangle2D10, renderingSource11);
        org.jfree.chart.plot.Marker marker13 = null;
        boolean boolean14 = xYPlot4.removeDomainMarker(marker13);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot4.getRangeAxis();
        boolean boolean16 = xYPlot4.canSelectByPoint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = xYPlot4.getAxisOffset();
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.axis.AxisSpace axisSpace23 = null;
        xYPlot22.setFixedRangeAxisSpace(axisSpace23, false);
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot22.getRangeAxis();
        xYPlot22.clearRangeMarkers();
        java.awt.Stroke stroke28 = xYPlot22.getRangeZeroBaselineStroke();
        xYPlot4.setRangeCrosshairStroke(stroke28);
        int int30 = xYPlot4.getBackgroundImageAlignment();
        xYPlot4.setBackgroundImageAlignment(0);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        java.awt.Paint paint23 = xYPlot4.getOutlinePaint();
        xYPlot4.setRangeCrosshairValue((double) (-1L), true);
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot(xYDataset28, valueAxis29, valueAxis30, xYItemRenderer31);
        org.jfree.chart.plot.Marker marker34 = null;
        org.jfree.chart.util.Layer layer35 = null;
        boolean boolean36 = xYPlot32.removeDomainMarker((int) '4', marker34, layer35);
        boolean boolean37 = xYPlot32.isSubplot();
        org.jfree.data.general.DatasetGroup datasetGroup38 = xYPlot32.getDatasetGroup();
        java.awt.Paint paint39 = xYPlot32.getDomainGridlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setQuadrantPaint((int) 'a', paint39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The index value (97) should be in the range 0 to 3.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(datasetGroup38);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        boolean boolean11 = xYPlot4.canSelectByPoint();
        xYPlot4.configureRangeAxes();
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        boolean boolean16 = xYPlot4.removeDomainMarker((int) (short) 1, marker14, layer15);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge((int) (short) 0);
        xYPlot4.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis(valueAxis13);
        java.awt.Paint paint15 = xYPlot4.getRangeCrosshairPaint();
        xYPlot4.clearRangeMarkers();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        boolean boolean11 = xYPlot4.isRangeCrosshairLockedOnData();
        xYPlot4.setDomainCrosshairValue((double) (byte) 10, true);
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        xYPlot19.setFixedRangeAxisSpace(axisSpace20, false);
        org.jfree.chart.axis.ValueAxis valueAxis23 = xYPlot19.getRangeAxis();
        xYPlot19.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = xYPlot19.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = xYPlot19.getAxisOffset();
        xYPlot4.setInsets(rectangleInsets26);
        java.awt.Stroke stroke28 = xYPlot4.getDomainCrosshairStroke();
        org.jfree.chart.axis.AxisSpace axisSpace29 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace29);
        org.jfree.chart.plot.Marker marker32 = null;
        org.jfree.chart.util.Layer layer33 = null;
        boolean boolean35 = xYPlot4.removeDomainMarker((int) (short) 1, marker32, layer33, true);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNull(xYItemRenderer25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot4.getDomainAxis();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.plot.Marker marker28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        boolean boolean30 = xYPlot26.removeDomainMarker((int) '4', marker28, layer29);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot26.setInsets(rectangleInsets31, true);
        xYPlot26.setBackgroundImageAlignment((-1));
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        int int37 = xYPlot26.getRangeAxisIndex(valueAxis36);
        java.awt.Stroke stroke38 = xYPlot26.getDomainZeroBaselineStroke();
        xYPlot4.setRangeMinorGridlineStroke(stroke38);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot4.zoomDomainAxes((double) (-1), 10.0d, plotRenderingInfo19, point2D20);
        java.awt.Paint paint22 = xYPlot4.getRangeCrosshairPaint();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        java.awt.Stroke stroke28 = xYPlot27.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        int int30 = xYPlot27.getIndexOf(xYItemRenderer29);
        float float31 = xYPlot27.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray32 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot27.setDomainAxes(valueAxisArray32);
        xYPlot4.setDomainAxes(valueAxisArray32);
        java.awt.Image image35 = xYPlot4.getBackgroundImage();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNotNull(valueAxisArray32);
        org.junit.Assert.assertNull(image35);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        xYPlot4.mapDatasetToDomainAxis((int) (short) 0, 0);
        xYPlot4.mapDatasetToRangeAxis((int) (byte) 10, (int) (byte) 0);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = xYPlot4.getRenderer((-1));
        java.awt.Paint paint21 = xYPlot4.getDomainZeroBaselinePaint();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(xYItemRenderer20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = xYPlot4.getDataRange(valueAxis13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        xYPlot4.removeChangeListener(plotChangeListener15);
        java.awt.Paint paint17 = xYPlot4.getDomainCrosshairPaint();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(range14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getAxisOffset();
        xYPlot4.setNotify(false);
        xYPlot4.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke16 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis18, true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        xYPlot4.axisChanged(axisChangeEvent21);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot4.getDomainAxis();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot17.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo21, point2D22);
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        xYPlot17.setDataset((int) (short) 0, xYDataset25);
        xYPlot17.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = xYPlot17.getAxisOffset();
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        xYPlot35.setFixedRangeAxisSpace(axisSpace36, false);
        org.jfree.chart.axis.ValueAxis valueAxis39 = xYPlot35.getRangeAxis();
        xYPlot35.clearRangeMarkers();
        java.awt.Stroke stroke41 = xYPlot35.getRangeZeroBaselineStroke();
        xYPlot17.setRangeCrosshairStroke(stroke41);
        xYPlot4.setDomainGridlineStroke(stroke41);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.mapDatasetToDomainAxis((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires 'index' >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNotNull(stroke41);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot4.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getDomainAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        java.awt.Stroke stroke19 = xYPlot18.getRangeCrosshairStroke();
        xYPlot18.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        xYPlot18.zoomRangeAxes(0.0d, plotRenderingInfo23, point2D24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        xYPlot18.panRangeAxes((double) (byte) 1, plotRenderingInfo27, point2D28);
        xYPlot18.setRangeMinorGridlinesVisible(false);
        java.awt.geom.Point2D point2D32 = xYPlot18.getQuadrantOrigin();
        xYPlot4.zoomDomainAxes((double) (short) 100, plotRenderingInfo13, point2D32, false);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setBackgroundImageAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(point2D32);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        xYPlot4.setForegroundAlpha((float) (byte) 10);
        xYPlot4.setDomainCrosshairValue((double) (short) 1);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.clearDomainMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot4.getDomainAxis();
        java.awt.Paint paint8 = xYPlot4.getDomainTickBandPaint();
        boolean boolean9 = xYPlot4.canSelectByRegion();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis(valueAxis13);
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace15, true);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        xYPlot4.setDomainAxis(valueAxis18);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        xYPlot4.setRangeAxis((int) (byte) 0, valueAxis24);
        xYPlot4.setRangeCrosshairValue((double) 1.0f);
        xYPlot4.setRangePannable(true);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        boolean boolean11 = xYPlot4.isRangeCrosshairLockedOnData();
        xYPlot4.setDomainCrosshairValue((double) (byte) 10, true);
        int int15 = xYPlot4.getWeight();
        java.awt.Paint paint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setDomainZeroBaselinePaint(paint16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder10 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.zoomRangeAxes(10.0d, (double) 100, plotRenderingInfo13, point2D14);
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = xYPlot4.removeRangeMarker((-1), marker17, layer18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(seriesRenderingOrder10);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = xYPlot4.getRangeMarkers(layer19);
        java.awt.Stroke stroke21 = xYPlot4.getDomainCrosshairStroke();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        java.awt.Stroke stroke28 = xYPlot27.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        int int30 = xYPlot27.getIndexOf(xYItemRenderer29);
        float float31 = xYPlot27.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot(xYDataset32, valueAxis33, valueAxis34, xYItemRenderer35);
        org.jfree.chart.axis.AxisSpace axisSpace37 = null;
        xYPlot36.setFixedRangeAxisSpace(axisSpace37, false);
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot36.getRangeAxis();
        xYPlot36.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot36.getRangeAxisLocation((int) (short) -1);
        xYPlot27.setRangeAxisLocation(axisLocation43, false);
        java.awt.Paint paint46 = xYPlot27.getOutlinePaint();
        xYPlot27.setRangeCrosshairLockedOnData(false);
        java.util.List list49 = xYPlot27.getAnnotations();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.mapDatasetToDomainAxes((int) 'a', list49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(list49);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot4.setBackgroundAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot4.getRangeAxisLocation();
        xYPlot4.configureDomainAxes();
        xYPlot4.clearDomainMarkers();
        xYPlot4.setDomainZeroBaselineVisible(true);
        xYPlot4.clearDomainMarkers();
        boolean boolean31 = xYPlot4.isRangeZeroBaselineVisible();
        org.jfree.chart.plot.Marker marker32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = xYPlot4.removeRangeMarker(marker32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        xYPlot4.clearRangeAxes();
        java.awt.Paint paint10 = xYPlot4.getDomainGridlinePaint();
        org.jfree.data.xy.XYDataset xYDataset11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = xYPlot4.getRendererForDataset(xYDataset11);
        xYPlot4.configureRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        xYPlot4.setRangeAxis((int) ' ', valueAxis15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(xYItemRenderer12);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        xYPlot4.axisChanged(axisChangeEvent5);
        xYPlot4.clearAnnotations();
        int int8 = xYPlot4.getRendererCount();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        java.awt.Stroke stroke14 = xYPlot13.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        int int16 = xYPlot13.getIndexOf(xYItemRenderer15);
        xYPlot13.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = xYPlot13.getOrientation();
        xYPlot4.setOrientation(plotOrientation19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = xYPlot4.getAxisOffset();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setDomainAxes(valueAxisArray9);
        org.jfree.data.xy.XYDataset xYDataset11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot(xYDataset11, valueAxis12, valueAxis13, xYItemRenderer14);
        org.jfree.chart.axis.AxisSpace axisSpace16 = null;
        xYPlot15.setFixedRangeAxisSpace(axisSpace16, false);
        org.jfree.chart.axis.ValueAxis valueAxis19 = xYPlot15.getRangeAxis();
        xYPlot15.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = xYPlot15.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = xYPlot15.getAxisOffset();
        xYPlot15.setBackgroundAlpha((float) 'a');
        java.awt.Paint paint25 = xYPlot15.getOutlinePaint();
        xYPlot4.setDomainTickBandPaint(paint25);
        org.jfree.data.xy.XYDataset xYDataset27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = null;
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot(xYDataset27, valueAxis28, valueAxis29, xYItemRenderer30);
        java.awt.Stroke stroke32 = xYPlot31.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer33 = null;
        int int34 = xYPlot31.getIndexOf(xYItemRenderer33);
        float float35 = xYPlot31.getBackgroundAlpha();
        java.awt.Image image36 = null;
        xYPlot31.setBackgroundImage(image36);
        double double38 = xYPlot31.getRangeCrosshairValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        xYPlot31.markerChanged(markerChangeEvent39);
        org.jfree.data.xy.XYDataset xYDataset41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer44 = null;
        org.jfree.chart.plot.XYPlot xYPlot45 = new org.jfree.chart.plot.XYPlot(xYDataset41, valueAxis42, valueAxis43, xYItemRenderer44);
        org.jfree.chart.axis.AxisSpace axisSpace46 = null;
        xYPlot45.setFixedRangeAxisSpace(axisSpace46, false);
        org.jfree.chart.axis.ValueAxis valueAxis49 = xYPlot45.getRangeAxis();
        xYPlot45.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge51 = xYPlot45.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis53 = xYPlot45.getRangeAxis((int) (short) 10);
        org.jfree.data.general.DatasetGroup datasetGroup54 = xYPlot45.getDatasetGroup();
        boolean boolean55 = xYPlot45.canSelectByRegion();
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        org.jfree.chart.RenderingSource renderingSource59 = null;
        xYPlot45.select(0.0d, (double) 0.0f, rectangle2D58, renderingSource59);
        org.jfree.chart.axis.AxisSpace axisSpace61 = xYPlot45.getFixedDomainAxisSpace();
        org.jfree.chart.LegendItemCollection legendItemCollection62 = xYPlot45.getLegendItems();
        xYPlot31.setFixedLegendItems(legendItemCollection62);
        xYPlot4.setFixedLegendItems(legendItemCollection62);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNull(valueAxis19);
        org.junit.Assert.assertNull(xYItemRenderer21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(valueAxis49);
        org.junit.Assert.assertNotNull(rectangleEdge51);
        org.junit.Assert.assertNull(valueAxis53);
        org.junit.Assert.assertNull(datasetGroup54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(axisSpace61);
        org.junit.Assert.assertNotNull(legendItemCollection62);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        int int18 = xYPlot4.getIndexOf(xYItemRenderer17);
        xYPlot4.clearRangeMarkers((int) ' ');
        float float21 = xYPlot4.getForegroundAlpha();
        float float22 = xYPlot4.getForegroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        org.jfree.chart.axis.AxisSpace axisSpace28 = null;
        xYPlot27.setFixedRangeAxisSpace(axisSpace28, false);
        org.jfree.chart.axis.ValueAxis valueAxis31 = xYPlot27.getRangeAxis();
        xYPlot27.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation34 = xYPlot27.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot(xYDataset35, valueAxis36, valueAxis37, xYItemRenderer38);
        org.jfree.chart.axis.AxisSpace axisSpace40 = null;
        xYPlot39.setFixedRangeAxisSpace(axisSpace40, false);
        org.jfree.chart.axis.ValueAxis valueAxis43 = xYPlot39.getRangeAxis();
        xYPlot39.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = xYPlot39.getRenderer();
        java.awt.Paint paint46 = xYPlot39.getDomainZeroBaselinePaint();
        xYPlot27.setDomainGridlinePaint(paint46);
        xYPlot27.setRangeMinorGridlinesVisible(true);
        java.awt.Paint paint50 = xYPlot27.getNoDataMessagePaint();
        org.jfree.chart.util.Layer layer52 = null;
        java.util.Collection collection53 = xYPlot27.getDomainMarkers((int) (byte) 100, layer52);
        boolean boolean54 = xYPlot4.equals((java.lang.Object) collection53);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNull(valueAxis31);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNull(valueAxis43);
        org.junit.Assert.assertNull(xYItemRenderer45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNull(collection53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot4.removeChangeListener(plotChangeListener13);
        java.awt.Paint paint15 = xYPlot4.getNoDataMessagePaint();
        xYPlot4.setDomainCrosshairVisible(true);
        xYPlot4.configureDomainAxes();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.rendererChanged(rendererChangeEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot4.getRangeAxis();
        boolean boolean21 = xYPlot4.isRangeGridlinesVisible();
        java.awt.Image image22 = xYPlot4.getBackgroundImage();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        java.awt.Stroke stroke28 = xYPlot27.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        int int30 = xYPlot27.getIndexOf(xYItemRenderer29);
        float float31 = xYPlot27.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot(xYDataset32, valueAxis33, valueAxis34, xYItemRenderer35);
        org.jfree.chart.axis.AxisSpace axisSpace37 = null;
        xYPlot36.setFixedRangeAxisSpace(axisSpace37, false);
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot36.getRangeAxis();
        xYPlot36.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot36.getRangeAxisLocation((int) (short) -1);
        xYPlot27.setRangeAxisLocation(axisLocation43, false);
        int int46 = xYPlot27.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection47 = xYPlot27.getLegendItems();
        xYPlot4.setFixedLegendItems(legendItemCollection47);
        xYPlot4.zoom((double) (byte) 10);
        org.jfree.chart.axis.AxisSpace axisSpace51 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace51, false);
        org.jfree.data.xy.XYDataset xYDataset54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer57 = null;
        org.jfree.chart.plot.XYPlot xYPlot58 = new org.jfree.chart.plot.XYPlot(xYDataset54, valueAxis55, valueAxis56, xYItemRenderer57);
        java.awt.Stroke stroke59 = xYPlot58.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo62 = null;
        java.awt.geom.Point2D point2D63 = null;
        xYPlot58.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo62, point2D63);
        xYPlot58.setDomainCrosshairLockedOnData(false);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray67 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot58.setRenderers(xYItemRendererArray67);
        xYPlot4.setRenderers(xYItemRendererArray67);
        org.jfree.chart.plot.Marker marker71 = null;
        org.jfree.chart.util.Layer layer72 = null;
        boolean boolean73 = xYPlot4.removeDomainMarker((int) (byte) 0, marker71, layer72);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection47);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNotNull(xYItemRendererArray67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets9, true);
        xYPlot4.setBackgroundImageAlignment((-1));
        java.awt.Image image14 = null;
        xYPlot4.setBackgroundImage(image14);
        org.jfree.data.xy.XYDataset xYDataset16 = xYPlot4.getDataset();
        xYPlot4.clearDomainMarkers((int) '4');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(xYDataset16);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets9, true);
        xYPlot4.setBackgroundImageAlignment((-1));
        java.awt.Image image14 = null;
        xYPlot4.setBackgroundImage(image14);
        org.jfree.data.xy.XYDataset xYDataset16 = xYPlot4.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = xYPlot4.getDrawingSupplier();
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot4.getRangeAxis();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(xYDataset16);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(valueAxis18);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot4.zoomRangeAxes((double) 15, (double) 15, plotRenderingInfo21, point2D22);
        java.awt.Paint paint24 = xYPlot4.getRangeTickBandPaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(paint24);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = xYPlot4.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace13);
        xYPlot4.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.Plot plot17 = xYPlot4.getRootPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        plot17.removeChangeListener(plotChangeListener18);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertNotNull(plot17);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        xYPlot4.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        xYPlot4.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = xYPlot4.getOrientation();
        xYPlot4.mapDatasetToDomainAxis((int) (short) 0, (int) (byte) 1);
        java.awt.Paint paint14 = xYPlot4.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot4.zoomDomainAxes((double) (-1), 10.0d, plotRenderingInfo19, point2D20);
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        java.awt.Stroke stroke27 = xYPlot26.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        int int29 = xYPlot26.getIndexOf(xYItemRenderer28);
        float float30 = xYPlot26.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        xYPlot35.setFixedRangeAxisSpace(axisSpace36, false);
        org.jfree.chart.axis.ValueAxis valueAxis39 = xYPlot35.getRangeAxis();
        xYPlot35.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation42 = xYPlot35.getRangeAxisLocation((int) (short) -1);
        xYPlot26.setRangeAxisLocation(axisLocation42, false);
        java.awt.Paint paint45 = xYPlot26.getOutlinePaint();
        xYPlot4.setNoDataMessagePaint(paint45);
        xYPlot4.setWeight((int) '4');
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNotNull(axisLocation42);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets9, true);
        xYPlot4.setBackgroundImageAlignment((-1));
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        int int15 = xYPlot4.getRangeAxisIndex(valueAxis14);
        java.awt.Stroke stroke16 = xYPlot4.getDomainZeroBaselineStroke();
        boolean boolean17 = xYPlot4.isRangeMinorGridlinesVisible();
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = xYPlot4.getDomainMarkers(layer18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(collection19);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getDomainAxis((int) (byte) 100);
        xYPlot4.setDomainCrosshairValue((double) 1L);
        boolean boolean12 = xYPlot4.isOutlineVisible();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        xYPlot17.setFixedRangeAxisSpace(axisSpace18, false);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot17.getRangeAxis();
        xYPlot17.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = xYPlot17.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = xYPlot17.getAxisOffset();
        xYPlot17.setNotify(false);
        xYPlot17.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke29 = xYPlot17.getRangeCrosshairStroke();
        xYPlot4.setRangeGridlineStroke(stroke29);
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        java.awt.Stroke stroke36 = xYPlot35.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        int int38 = xYPlot35.getIndexOf(xYItemRenderer37);
        float float39 = xYPlot35.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer43 = null;
        org.jfree.chart.plot.XYPlot xYPlot44 = new org.jfree.chart.plot.XYPlot(xYDataset40, valueAxis41, valueAxis42, xYItemRenderer43);
        org.jfree.chart.axis.AxisSpace axisSpace45 = null;
        xYPlot44.setFixedRangeAxisSpace(axisSpace45, false);
        org.jfree.chart.axis.ValueAxis valueAxis48 = xYPlot44.getRangeAxis();
        xYPlot44.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation51 = xYPlot44.getRangeAxisLocation((int) (short) -1);
        xYPlot35.setRangeAxisLocation(axisLocation51, false);
        java.awt.Paint paint54 = xYPlot35.getOutlinePaint();
        xYPlot4.setDomainTickBandPaint(paint54);
        xYPlot4.clearSelection();
        boolean boolean57 = xYPlot4.isRangeMinorGridlinesVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        org.jfree.data.xy.XYDataset xYDataset60 = null;
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.axis.ValueAxis valueAxis62 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer63 = null;
        org.jfree.chart.plot.XYPlot xYPlot64 = new org.jfree.chart.plot.XYPlot(xYDataset60, valueAxis61, valueAxis62, xYItemRenderer63);
        java.awt.Stroke stroke65 = xYPlot64.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer66 = null;
        int int67 = xYPlot64.getIndexOf(xYItemRenderer66);
        org.jfree.chart.util.RectangleEdge rectangleEdge69 = xYPlot64.getRangeAxisEdge((int) (byte) 10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer70 = null;
        int int71 = xYPlot64.getIndexOf(xYItemRenderer70);
        xYPlot64.setDomainMinorGridlinesVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis75 = xYPlot64.getRangeAxis((int) (short) 10);
        java.awt.geom.Point2D point2D76 = xYPlot64.getQuadrantOrigin();
        xYPlot4.panRangeAxes((double) (byte) 10, plotRenderingInfo59, point2D76);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertNull(xYItemRenderer23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNull(valueAxis48);
        org.junit.Assert.assertNotNull(axisLocation51);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(valueAxis75);
        org.junit.Assert.assertNotNull(point2D76);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        xYPlot4.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot4.panDomainAxes((double) 100L, plotRenderingInfo15, point2D16);
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = xYPlot4.removeRangeMarker((int) (byte) 10, marker19, layer20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        xYPlot4.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot4.zoomDomainAxes((double) (byte) 1, plotRenderingInfo15, point2D16);
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = xYPlot4.getDomainMarkers(layer18);
        java.awt.Image image20 = null;
        xYPlot4.setBackgroundImage(image20);
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        java.awt.Stroke stroke27 = xYPlot26.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        int int29 = xYPlot26.getIndexOf(xYItemRenderer28);
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = xYPlot26.getRangeAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        xYPlot35.setFixedRangeAxisSpace(axisSpace36, false);
        org.jfree.data.xy.XYDataset xYDataset39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot(xYDataset39, valueAxis40, valueAxis41, xYItemRenderer42);
        java.awt.Stroke stroke44 = xYPlot43.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = null;
        int int46 = xYPlot43.getIndexOf(xYItemRenderer45);
        float float47 = xYPlot43.getBackgroundAlpha();
        java.awt.Stroke stroke48 = xYPlot43.getDomainGridlineStroke();
        xYPlot35.setDomainZeroBaselineStroke(stroke48);
        xYPlot26.setRangeZeroBaselineStroke(stroke48);
        xYPlot4.setDomainMinorGridlineStroke(stroke48);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer53 = xYPlot4.getRenderer((int) (byte) 1);
        java.awt.Image image54 = xYPlot4.getBackgroundImage();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(collection19);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge30);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 1.0f + "'", float47 == 1.0f);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNull(xYItemRenderer53);
        org.junit.Assert.assertNull(image54);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        boolean boolean12 = xYPlot4.isRangePannable();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        xYPlot4.setFixedLegendItems(legendItemCollection13);
        boolean boolean15 = xYPlot4.isDomainPannable();
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        java.awt.Stroke stroke21 = xYPlot20.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot20.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo24, point2D25);
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        xYPlot20.setDataset((int) (short) 0, xYDataset28);
        xYPlot20.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = xYPlot20.getAxisOffset();
        xYPlot4.setAxisOffset(rectangleInsets33);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        xYPlot4.axisChanged(axisChangeEvent7);
        xYPlot4.setDomainPannable(true);
        org.jfree.chart.plot.Marker marker11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xYPlot4.removeRangeMarker(marker11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setDomainAxes(valueAxisArray9);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder11 = xYPlot4.getSeriesRenderingOrder();
        java.awt.Stroke stroke12 = xYPlot4.getDomainCrosshairStroke();
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot4.getFixedRangeAxisSpace();
        xYPlot4.clearRangeMarkers(100);
        java.awt.Paint paint16 = xYPlot4.getDomainMinorGridlinePaint();
        java.awt.geom.Point2D point2D17 = xYPlot4.getQuadrantOrigin();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(seriesRenderingOrder11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(point2D17);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        java.awt.Paint paint11 = xYPlot4.getNoDataMessagePaint();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder12 = xYPlot4.getSeriesRenderingOrder();
        boolean boolean13 = xYPlot4.isNotify();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.drawOutline(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(seriesRenderingOrder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot4.removeChangeListener(plotChangeListener13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = xYPlot4.getRangeMarkers(layer15);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        org.jfree.chart.axis.AxisSpace axisSpace22 = null;
        xYPlot21.setFixedRangeAxisSpace(axisSpace22, false);
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot21.getRangeAxis();
        xYPlot21.clearRangeMarkers();
        java.awt.Stroke stroke27 = xYPlot21.getRangeZeroBaselineStroke();
        java.awt.Image image28 = null;
        xYPlot21.setBackgroundImage(image28);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        xYPlot21.removeChangeListener(plotChangeListener30);
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot(xYDataset32, valueAxis33, valueAxis34, xYItemRenderer35);
        org.jfree.chart.axis.AxisSpace axisSpace37 = null;
        xYPlot36.setFixedRangeAxisSpace(axisSpace37, false);
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot36.getRangeAxis();
        xYPlot36.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot36.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer47 = null;
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot(xYDataset44, valueAxis45, valueAxis46, xYItemRenderer47);
        org.jfree.chart.axis.AxisSpace axisSpace49 = null;
        xYPlot48.setFixedRangeAxisSpace(axisSpace49, false);
        org.jfree.chart.axis.ValueAxis valueAxis52 = xYPlot48.getRangeAxis();
        xYPlot48.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer54 = xYPlot48.getRenderer();
        java.awt.Paint paint55 = xYPlot48.getDomainZeroBaselinePaint();
        xYPlot36.setDomainGridlinePaint(paint55);
        xYPlot21.setRangeMinorGridlinePaint(paint55);
        xYPlot4.setDomainTickBandPaint(paint55);
        org.jfree.chart.util.RectangleEdge rectangleEdge60 = xYPlot4.getDomainAxisEdge((int) (short) 1);
        xYPlot4.setRangeZeroBaselineVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis63 = null;
        xYPlot4.setDomainAxis(valueAxis63);
        org.jfree.chart.axis.AxisSpace axisSpace65 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace65);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertNull(valueAxis52);
        org.junit.Assert.assertNull(xYItemRenderer54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(rectangleEdge60);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        xYPlot4.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = xYPlot4.getOrientation();
        xYPlot4.mapDatasetToDomainAxis((int) (short) 0, (int) (byte) 1);
        xYPlot4.clearAnnotations();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(plotOrientation10);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        xYPlot4.setDomainCrosshairValue((double) 0L, true);
        java.awt.Paint paint20 = xYPlot4.getDomainCrosshairPaint();
        xYPlot4.setRangeGridlinesVisible(true);
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        java.awt.Stroke stroke28 = xYPlot27.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot27.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo31, point2D32);
        org.jfree.data.xy.XYDataset xYDataset35 = null;
        xYPlot27.setDataset((int) (short) 0, xYDataset35);
        xYPlot27.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        java.awt.geom.Point2D point2D43 = null;
        xYPlot27.zoomDomainAxes((double) (-1), 10.0d, plotRenderingInfo42, point2D43);
        boolean boolean45 = xYPlot27.isNotify();
        org.jfree.data.xy.XYDataset xYDataset46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer49 = null;
        org.jfree.chart.plot.XYPlot xYPlot50 = new org.jfree.chart.plot.XYPlot(xYDataset46, valueAxis47, valueAxis48, xYItemRenderer49);
        java.awt.Stroke stroke51 = xYPlot50.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer52 = null;
        int int53 = xYPlot50.getIndexOf(xYItemRenderer52);
        float float54 = xYPlot50.getBackgroundAlpha();
        java.awt.Stroke stroke55 = xYPlot50.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge56 = xYPlot50.getRangeAxisEdge();
        xYPlot50.setRangeZeroBaselineVisible(true);
        org.jfree.data.xy.XYDataset xYDataset59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer62 = null;
        org.jfree.chart.plot.XYPlot xYPlot63 = new org.jfree.chart.plot.XYPlot(xYDataset59, valueAxis60, valueAxis61, xYItemRenderer62);
        org.jfree.chart.axis.AxisSpace axisSpace64 = null;
        xYPlot63.setFixedRangeAxisSpace(axisSpace64, false);
        org.jfree.chart.axis.ValueAxis valueAxis67 = xYPlot63.getRangeAxis();
        xYPlot63.clearRangeMarkers();
        org.jfree.data.xy.XYDataset xYDataset69 = null;
        org.jfree.chart.axis.ValueAxis valueAxis70 = null;
        org.jfree.chart.axis.ValueAxis valueAxis71 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer72 = null;
        org.jfree.chart.plot.XYPlot xYPlot73 = new org.jfree.chart.plot.XYPlot(xYDataset69, valueAxis70, valueAxis71, xYItemRenderer72);
        org.jfree.chart.axis.AxisSpace axisSpace74 = null;
        xYPlot73.setFixedRangeAxisSpace(axisSpace74, false);
        org.jfree.chart.axis.ValueAxis valueAxis77 = xYPlot73.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis78 = null;
        int int79 = xYPlot73.getRangeAxisIndex(valueAxis78);
        boolean boolean80 = xYPlot73.isRangeGridlinesVisible();
        boolean boolean81 = xYPlot73.canSelectByPoint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener82 = null;
        xYPlot73.removeChangeListener(plotChangeListener82);
        java.awt.Paint paint84 = xYPlot73.getNoDataMessagePaint();
        xYPlot63.setOutlinePaint(paint84);
        xYPlot50.setRangeGridlinePaint(paint84);
        xYPlot27.setNoDataMessagePaint(paint84);
        xYPlot4.setDomainGridlinePaint(paint84);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(rectangleEdge56);
        org.junit.Assert.assertNull(valueAxis67);
        org.junit.Assert.assertNull(valueAxis77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(paint84);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        xYPlot4.markerChanged(markerChangeEvent10);
        int int12 = xYPlot4.getDomainAxisCount();
        xYPlot4.setDomainCrosshairVisible(false);
        java.awt.Paint paint15 = xYPlot4.getBackgroundPaint();
        xYPlot4.setWeight(100);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Paint paint9 = xYPlot4.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = xYPlot4.getAxisOffset();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = xYPlot4.getRenderer((int) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot4.removeChangeListener(plotChangeListener13);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder15 = xYPlot4.getDatasetRenderingOrder();
        xYPlot4.setRangeCrosshairVisible(false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(xYItemRenderer12);
        org.junit.Assert.assertNotNull(datasetRenderingOrder15);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot4.getRangeAxisLocation((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = xYPlot4.getAxisOffset();
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = xYPlot4.getDomainAxisEdge();
        java.awt.Image image21 = xYPlot4.getBackgroundImage();
        java.awt.geom.GeneralPath generalPath22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.RenderingSource renderingSource24 = null;
        xYPlot4.select(generalPath22, rectangle2D23, renderingSource24);
        java.awt.Stroke stroke26 = xYPlot4.getDomainMinorGridlineStroke();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        org.jfree.chart.plot.CrosshairState crosshairState31 = null;
        boolean boolean32 = xYPlot4.render(graphics2D27, rectangle2D28, 100, plotRenderingInfo30, crosshairState31);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getOutlinePaint();
        xYPlot4.clearDomainAxes();
        java.awt.Paint paint12 = xYPlot4.getDomainZeroBaselinePaint();
        org.jfree.data.general.DatasetGroup datasetGroup13 = xYPlot4.getDatasetGroup();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        xYPlot4.setDomainAxis((int) (short) 100, valueAxis15, false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(datasetGroup13);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        int int18 = xYPlot4.getIndexOf(xYItemRenderer17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot4.setDomainAxis(0, valueAxis20, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot4.zoomRangeAxes(1.0d, plotRenderingInfo24, point2D25);
        double double27 = xYPlot4.getDomainCrosshairValue();
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot(xYDataset28, valueAxis29, valueAxis30, xYItemRenderer31);
        java.awt.Stroke stroke33 = xYPlot32.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        int int35 = xYPlot32.getIndexOf(xYItemRenderer34);
        float float36 = xYPlot32.getBackgroundAlpha();
        java.awt.Stroke stroke37 = xYPlot32.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = xYPlot32.getRangeAxisEdge();
        boolean boolean39 = xYPlot32.isRangeCrosshairLockedOnData();
        xYPlot32.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.axis.AxisSpace axisSpace42 = null;
        xYPlot32.setFixedDomainAxisSpace(axisSpace42);
        org.jfree.data.xy.XYDataset xYDataset44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer47 = null;
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot(xYDataset44, valueAxis45, valueAxis46, xYItemRenderer47);
        org.jfree.chart.axis.AxisSpace axisSpace49 = null;
        xYPlot48.setFixedRangeAxisSpace(axisSpace49, false);
        org.jfree.chart.axis.ValueAxis valueAxis52 = xYPlot48.getRangeAxis();
        xYPlot48.clearRangeMarkers();
        java.awt.Stroke stroke54 = xYPlot48.getRangeZeroBaselineStroke();
        java.awt.Image image55 = null;
        xYPlot48.setBackgroundImage(image55);
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        xYPlot48.setDomainAxis(0, valueAxis58, true);
        org.jfree.chart.plot.PlotOrientation plotOrientation61 = xYPlot48.getOrientation();
        xYPlot32.setOrientation(plotOrientation61);
        org.jfree.chart.plot.Marker marker63 = null;
        org.jfree.chart.util.Layer layer64 = null;
        boolean boolean65 = xYPlot32.removeDomainMarker(marker63, layer64);
        java.awt.Paint paint66 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_PAINT;
        xYPlot32.setDomainTickBandPaint(paint66);
        xYPlot4.setDomainMinorGridlinePaint(paint66);
        xYPlot4.clearRangeAxes();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(rectangleEdge38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(valueAxis52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(plotOrientation61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(paint66);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getOutlinePaint();
        xYPlot4.clearDomainAxes();
        java.awt.Paint paint12 = xYPlot4.getDomainZeroBaselinePaint();
        boolean boolean13 = xYPlot4.isSubplot();
        java.util.List list14 = xYPlot4.getAnnotations();
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.RenderingSource renderingSource18 = null;
        xYPlot4.select((double) ' ', (double) 100.0f, rectangle2D17, renderingSource18);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = xYPlot4.getRangeAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        java.awt.Stroke stroke22 = xYPlot21.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        int int24 = xYPlot21.getIndexOf(xYItemRenderer23);
        float float25 = xYPlot21.getBackgroundAlpha();
        java.awt.Stroke stroke26 = xYPlot21.getDomainGridlineStroke();
        xYPlot13.setDomainZeroBaselineStroke(stroke26);
        xYPlot4.setRangeZeroBaselineStroke(stroke26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        xYPlot4.zoomDomainAxes((double) ' ', plotRenderingInfo30, point2D31, false);
        org.jfree.chart.util.Layer layer34 = null;
        java.util.Collection collection35 = xYPlot4.getDomainMarkers(layer34);
        xYPlot4.mapDatasetToRangeAxis((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(collection35);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getOutlinePaint();
        xYPlot4.mapDatasetToRangeAxis(100, (int) 'a');
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        int int15 = xYPlot4.getRangeAxisIndex(valueAxis14);
        java.awt.Paint paint16 = xYPlot4.getDomainTickBandPaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(paint16);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        xYPlot16.setFixedRangeAxisSpace(axisSpace17, false);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot16.getRangeAxis();
        xYPlot16.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot16.getRenderer();
        java.awt.Paint paint23 = xYPlot16.getDomainZeroBaselinePaint();
        xYPlot4.setDomainGridlinePaint(paint23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        org.jfree.chart.plot.CrosshairState crosshairState29 = null;
        boolean boolean30 = xYPlot4.render(graphics2D25, rectangle2D26, 0, plotRenderingInfo28, crosshairState29);
        xYPlot4.setRangeCrosshairValue((double) 0L);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot4.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getDomainAxisLocation((int) (byte) 10);
        java.awt.Stroke stroke12 = xYPlot4.getRangeMinorGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        int int19 = xYPlot17.getBackgroundImageAlignment();
        int int20 = xYPlot17.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = xYPlot17.getDatasetGroup();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        xYPlot17.setDataset(10, xYDataset23);
        java.awt.Paint paint25 = xYPlot17.getRangeCrosshairPaint();
        xYPlot4.setNoDataMessagePaint(paint25);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        int int18 = xYPlot4.getIndexOf(xYItemRenderer17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot4.setDomainAxis(0, valueAxis20, true);
        float float23 = xYPlot4.getForegroundAlpha();
        xYPlot4.clearSelection();
        java.util.List list25 = xYPlot4.getAnnotations();
        int int26 = xYPlot4.getDomainAxisCount();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getAxisOffset();
        xYPlot4.setBackgroundAlpha((float) 'a');
        java.awt.Paint paint14 = xYPlot4.getDomainGridlinePaint();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot4.removeChangeListener(plotChangeListener13);
        java.awt.Paint paint15 = xYPlot4.getNoDataMessagePaint();
        xYPlot4.setDomainCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder23 = xYPlot22.getSeriesRenderingOrder();
        xYPlot22.clearDomainMarkers();
        java.awt.Paint paint25 = xYPlot22.getBackgroundPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent26 = null;
        xYPlot22.datasetChanged(datasetChangeEvent26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        xYPlot22.zoomRangeAxes(100.0d, plotRenderingInfo29, point2D30, true);
        org.jfree.data.xy.XYDataset xYDataset33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot(xYDataset33, valueAxis34, valueAxis35, xYItemRenderer36);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent38 = null;
        xYPlot37.axisChanged(axisChangeEvent38);
        xYPlot37.mapDatasetToDomainAxis(10, (int) '#');
        org.jfree.chart.plot.PlotOrientation plotOrientation43 = xYPlot37.getOrientation();
        xYPlot22.setOrientation(plotOrientation43);
        org.jfree.data.xy.XYDataset xYDataset45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer48 = null;
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot(xYDataset45, valueAxis46, valueAxis47, xYItemRenderer48);
        java.awt.Stroke stroke50 = xYPlot49.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer51 = null;
        int int52 = xYPlot49.getIndexOf(xYItemRenderer51);
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        xYPlot49.setRangeAxis((int) 'a', valueAxis54);
        boolean boolean56 = xYPlot49.canSelectByRegion();
        org.jfree.chart.axis.AxisLocation axisLocation58 = xYPlot49.getRangeAxisLocation((int) (byte) -1);
        xYPlot22.setRangeAxisLocation(axisLocation58, false);
        xYPlot4.setDomainAxisLocation(axisLocation58);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(seriesRenderingOrder23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(plotOrientation43);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(axisLocation58);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.clearDomainMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot4.getDomainAxis();
        java.awt.Paint paint8 = xYPlot4.getDomainTickBandPaint();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        java.awt.Stroke stroke14 = xYPlot13.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        int int16 = xYPlot13.getIndexOf(xYItemRenderer15);
        float float17 = xYPlot13.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.axis.AxisSpace axisSpace23 = null;
        xYPlot22.setFixedRangeAxisSpace(axisSpace23, false);
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot22.getRangeAxis();
        xYPlot22.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot22.getRangeAxisLocation((int) (short) -1);
        xYPlot13.setRangeAxisLocation(axisLocation29, false);
        java.awt.Paint paint32 = xYPlot13.getOutlinePaint();
        java.awt.Paint paint33 = xYPlot13.getRangeMinorGridlinePaint();
        xYPlot4.setOutlinePaint(paint33);
        org.jfree.data.general.DatasetGroup datasetGroup35 = xYPlot4.getDatasetGroup();
        xYPlot4.setRangeCrosshairValue((double) (byte) 10, true);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertNotNull(axisLocation29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(datasetGroup35);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        java.lang.String str9 = xYPlot4.getNoDataMessage();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getDomainAxisEdge();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getNoDataMessagePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        xYPlot4.zoomRangeAxes((double) (byte) -1, plotRenderingInfo12, point2D13);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        xYPlot4.setRangeAxis((int) (short) 10, valueAxis16, true);
        int int19 = xYPlot4.getWeight();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot4.removeChangeListener(plotChangeListener13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = xYPlot4.getRangeMarkers(layer15);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        org.jfree.chart.axis.AxisSpace axisSpace22 = null;
        xYPlot21.setFixedRangeAxisSpace(axisSpace22, false);
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot21.getRangeAxis();
        xYPlot21.clearRangeMarkers();
        java.awt.Stroke stroke27 = xYPlot21.getRangeZeroBaselineStroke();
        java.awt.Image image28 = null;
        xYPlot21.setBackgroundImage(image28);
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        xYPlot21.removeChangeListener(plotChangeListener30);
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot(xYDataset32, valueAxis33, valueAxis34, xYItemRenderer35);
        org.jfree.chart.axis.AxisSpace axisSpace37 = null;
        xYPlot36.setFixedRangeAxisSpace(axisSpace37, false);
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot36.getRangeAxis();
        xYPlot36.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot36.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer47 = null;
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot(xYDataset44, valueAxis45, valueAxis46, xYItemRenderer47);
        org.jfree.chart.axis.AxisSpace axisSpace49 = null;
        xYPlot48.setFixedRangeAxisSpace(axisSpace49, false);
        org.jfree.chart.axis.ValueAxis valueAxis52 = xYPlot48.getRangeAxis();
        xYPlot48.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer54 = xYPlot48.getRenderer();
        java.awt.Paint paint55 = xYPlot48.getDomainZeroBaselinePaint();
        xYPlot36.setDomainGridlinePaint(paint55);
        xYPlot21.setRangeMinorGridlinePaint(paint55);
        xYPlot4.setDomainTickBandPaint(paint55);
        java.awt.geom.Point2D point2D59 = xYPlot4.getQuadrantOrigin();
        xYPlot4.zoom((double) 100.0f);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(collection16);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertNull(valueAxis52);
        org.junit.Assert.assertNull(xYItemRenderer54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(point2D59);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets9, true);
        xYPlot4.setBackgroundImageAlignment((-1));
        java.awt.Image image14 = null;
        xYPlot4.setBackgroundImage(image14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        xYPlot4.setDrawingSupplier(drawingSupplier16);
        java.lang.String str18 = xYPlot4.getNoDataMessage();
        xYPlot4.setRangeGridlinesVisible(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot4.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getDomainAxisLocation((int) (byte) 10);
        java.awt.Stroke stroke12 = xYPlot4.getRangeMinorGridlineStroke();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.CrosshairState crosshairState17 = null;
        boolean boolean18 = xYPlot4.render(graphics2D13, rectangle2D14, (int) (byte) -1, plotRenderingInfo16, crosshairState17);
        int int19 = xYPlot4.getDatasetCount();
        java.awt.Paint paint20 = xYPlot4.getDomainMinorGridlinePaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        xYPlot4.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = xYPlot4.getOrientation();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        xYPlot4.addChangeListener(plotChangeListener11);
        xYPlot4.clearSelection();
        boolean boolean14 = xYPlot4.isDomainZoomable();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace6 = xYPlot4.getFixedDomainAxisSpace();
        java.lang.String str7 = xYPlot4.getNoDataMessage();
        java.util.List list8 = xYPlot4.getAnnotations();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getOutlinePaint();
        xYPlot4.mapDatasetToRangeAxis(100, (int) 'a');
        java.awt.Font font14 = xYPlot4.getNoDataMessageFont();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray15 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot4.setRenderers(xYItemRendererArray15);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setDomainAxes(valueAxisArray17);
        xYPlot4.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot4.getDomainAxis();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot(xYDataset24, valueAxis25, valueAxis26, xYItemRenderer27);
        org.jfree.chart.plot.Marker marker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        boolean boolean32 = xYPlot28.removeDomainMarker((int) '4', marker30, layer31);
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot28.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot28.getDomainAxisLocation((int) (byte) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        org.jfree.data.xy.XYDataset xYDataset38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot(xYDataset38, valueAxis39, valueAxis40, xYItemRenderer41);
        java.awt.Stroke stroke43 = xYPlot42.getRangeCrosshairStroke();
        xYPlot42.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        java.awt.geom.Point2D point2D48 = null;
        xYPlot42.zoomRangeAxes(0.0d, plotRenderingInfo47, point2D48);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        java.awt.geom.Point2D point2D52 = null;
        xYPlot42.panRangeAxes((double) (byte) 1, plotRenderingInfo51, point2D52);
        xYPlot42.setRangeMinorGridlinesVisible(false);
        java.awt.geom.Point2D point2D56 = xYPlot42.getQuadrantOrigin();
        xYPlot28.zoomDomainAxes((double) (short) 100, plotRenderingInfo37, point2D56, false);
        xYPlot4.panRangeAxes((double) 100, plotRenderingInfo23, point2D56);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(xYItemRendererArray15);
        org.junit.Assert.assertNotNull(valueAxisArray17);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(point2D56);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getDomainAxis((int) (byte) 100);
        xYPlot4.setDomainCrosshairValue((double) 1L);
        java.awt.Stroke stroke12 = xYPlot4.getRangeMinorGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot17.getIndexOf(xYItemRenderer19);
        float float21 = xYPlot17.getBackgroundAlpha();
        java.awt.Stroke stroke22 = xYPlot17.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = xYPlot17.getRangeAxisEdge();
        java.awt.Paint paint24 = xYPlot17.getNoDataMessagePaint();
        xYPlot4.setDomainTickBandPaint(paint24);
        boolean boolean26 = xYPlot4.isRangeZeroBaselineVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        xYPlot4.removeChangeListener(plotChangeListener27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = xYPlot4.getAxisOffset();
        org.jfree.chart.plot.Marker marker30 = null;
        org.jfree.chart.util.Layer layer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addDomainMarker(marker30, layer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        java.awt.geom.GeneralPath generalPath11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.RenderingSource renderingSource13 = null;
        xYPlot4.select(generalPath11, rectangle2D12, renderingSource13);
        org.jfree.chart.plot.Plot plot15 = xYPlot4.getParent();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        xYPlot4.axisChanged(axisChangeEvent7);
        xYPlot4.setDomainPannable(true);
        java.awt.Stroke stroke11 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.axis.AxisSpace axisSpace12 = xYPlot4.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(axisSpace12);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        xYPlot4.setRangeAxis((int) (byte) 0, valueAxis24);
        xYPlot4.setNotify(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        org.jfree.data.xy.XYDataset xYDataset30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer33 = null;
        org.jfree.chart.plot.XYPlot xYPlot34 = new org.jfree.chart.plot.XYPlot(xYDataset30, valueAxis31, valueAxis32, xYItemRenderer33);
        org.jfree.chart.axis.AxisSpace axisSpace35 = null;
        xYPlot34.setFixedRangeAxisSpace(axisSpace35, false);
        org.jfree.chart.axis.ValueAxis valueAxis38 = xYPlot34.getRangeAxis();
        xYPlot34.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer40 = xYPlot34.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = xYPlot34.getAxisOffset();
        xYPlot34.setBackgroundAlpha((float) 'a');
        java.awt.Paint paint44 = xYPlot34.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot(xYDataset47, valueAxis48, valueAxis49, xYItemRenderer50);
        java.awt.Stroke stroke52 = xYPlot51.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer53 = null;
        int int54 = xYPlot51.getIndexOf(xYItemRenderer53);
        org.jfree.chart.util.RectangleEdge rectangleEdge56 = xYPlot51.getRangeAxisEdge((int) (byte) 10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer57 = null;
        int int58 = xYPlot51.getIndexOf(xYItemRenderer57);
        xYPlot51.setDomainMinorGridlinesVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis62 = xYPlot51.getRangeAxis((int) (short) 10);
        java.awt.geom.Point2D point2D63 = xYPlot51.getQuadrantOrigin();
        xYPlot34.zoomRangeAxes((double) 0.5f, plotRenderingInfo46, point2D63);
        xYPlot4.panDomainAxes((double) (short) 0, plotRenderingInfo29, point2D63);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(valueAxis38);
        org.junit.Assert.assertNull(xYItemRenderer40);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(valueAxis62);
        org.junit.Assert.assertNotNull(point2D63);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot4.getDomainAxisLocation();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        xYPlot4.setDomainCrosshairVisible(true);
        xYPlot4.setDomainMinorGridlinesVisible(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getNoDataMessagePaint();
        org.jfree.chart.axis.AxisSpace axisSpace11 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace11, false);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        xYPlot4.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder17 = xYPlot4.getSeriesRenderingOrder();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(seriesRenderingOrder17);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot4.setBackgroundAlpha(0.0f);
        float float25 = xYPlot4.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = xYPlot4.getInsets();
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot4.getDomainAxis((int) (byte) 1);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNull(valueAxis28);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        java.awt.Stroke stroke14 = xYPlot13.getRangeCrosshairStroke();
        xYPlot13.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        xYPlot13.zoomRangeAxes(0.0d, plotRenderingInfo18, point2D19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        xYPlot13.panRangeAxes((double) (byte) 1, plotRenderingInfo22, point2D23);
        float float25 = xYPlot13.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot13.getRangeAxisLocation((int) (short) 100);
        xYPlot4.setRangeAxisLocation(axisLocation27, true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot4.getRangeAxis();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.data.general.DatasetGroup datasetGroup33 = xYPlot4.getDatasetGroup();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNull(datasetGroup33);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getOutlinePaint();
        xYPlot4.mapDatasetToRangeAxis(100, (int) 'a');
        java.awt.Font font14 = xYPlot4.getNoDataMessageFont();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray15 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot4.setRenderers(xYItemRendererArray15);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        java.awt.Stroke stroke22 = xYPlot21.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        int int24 = xYPlot21.getIndexOf(xYItemRenderer23);
        xYPlot21.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation27 = xYPlot21.getOrientation();
        xYPlot4.setOrientation(plotOrientation27);
        java.awt.Stroke stroke29 = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
        xYPlot4.setDomainGridlineStroke(stroke29);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        org.jfree.data.xy.XYDataset xYDataset33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot(xYDataset33, valueAxis34, valueAxis35, xYItemRenderer36);
        org.jfree.chart.axis.AxisSpace axisSpace38 = null;
        xYPlot37.setFixedRangeAxisSpace(axisSpace38, false);
        org.jfree.chart.axis.ValueAxis valueAxis41 = xYPlot37.getRangeAxis();
        xYPlot37.clearRangeMarkers();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder43 = xYPlot37.getSeriesRenderingOrder();
        xYPlot37.configureRangeAxes();
        boolean boolean45 = xYPlot37.isDomainZoomable();
        java.util.List list46 = xYPlot37.getAnnotations();
        xYPlot4.drawDomainTickBands(graphics2D31, rectangle2D32, list46);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(xYItemRendererArray15);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(plotOrientation27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(valueAxis41);
        org.junit.Assert.assertNotNull(seriesRenderingOrder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        xYPlot4.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot4.zoomDomainAxes((double) (byte) 1, plotRenderingInfo15, point2D16);
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = xYPlot4.getDomainMarkers(layer18);
        xYPlot4.setNotify(true);
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = xYPlot4.getDomainMarkers(layer22);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(collection19);
        org.junit.Assert.assertNull(collection23);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        int int11 = xYPlot4.getBackgroundImageAlignment();
        int int12 = xYPlot4.getBackgroundImageAlignment();
        java.util.List list13 = xYPlot4.getAnnotations();
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        xYPlot18.setFixedRangeAxisSpace(axisSpace19, false);
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot18.getRangeAxis();
        xYPlot18.clearRangeMarkers();
        java.awt.Stroke stroke24 = xYPlot18.getRangeZeroBaselineStroke();
        java.awt.Image image25 = null;
        xYPlot18.setBackgroundImage(image25);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        xYPlot18.removeChangeListener(plotChangeListener27);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = xYPlot18.getRangeMarkers(layer29);
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        xYPlot35.setFixedRangeAxisSpace(axisSpace36, false);
        org.jfree.chart.axis.ValueAxis valueAxis39 = xYPlot35.getRangeAxis();
        xYPlot35.clearRangeMarkers();
        java.awt.Stroke stroke41 = xYPlot35.getRangeZeroBaselineStroke();
        java.awt.Image image42 = null;
        xYPlot35.setBackgroundImage(image42);
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        xYPlot35.removeChangeListener(plotChangeListener44);
        org.jfree.data.xy.XYDataset xYDataset46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer49 = null;
        org.jfree.chart.plot.XYPlot xYPlot50 = new org.jfree.chart.plot.XYPlot(xYDataset46, valueAxis47, valueAxis48, xYItemRenderer49);
        org.jfree.chart.axis.AxisSpace axisSpace51 = null;
        xYPlot50.setFixedRangeAxisSpace(axisSpace51, false);
        org.jfree.chart.axis.ValueAxis valueAxis54 = xYPlot50.getRangeAxis();
        xYPlot50.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation57 = xYPlot50.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset58 = null;
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer61 = null;
        org.jfree.chart.plot.XYPlot xYPlot62 = new org.jfree.chart.plot.XYPlot(xYDataset58, valueAxis59, valueAxis60, xYItemRenderer61);
        org.jfree.chart.axis.AxisSpace axisSpace63 = null;
        xYPlot62.setFixedRangeAxisSpace(axisSpace63, false);
        org.jfree.chart.axis.ValueAxis valueAxis66 = xYPlot62.getRangeAxis();
        xYPlot62.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer68 = xYPlot62.getRenderer();
        java.awt.Paint paint69 = xYPlot62.getDomainZeroBaselinePaint();
        xYPlot50.setDomainGridlinePaint(paint69);
        xYPlot35.setRangeMinorGridlinePaint(paint69);
        xYPlot18.setDomainTickBandPaint(paint69);
        xYPlot4.setRangeCrosshairPaint(paint69);
        org.jfree.chart.axis.ValueAxis valueAxis75 = xYPlot4.getRangeAxis((int) 'a');
        org.jfree.chart.util.Layer layer77 = null;
        java.util.Collection collection78 = xYPlot4.getDomainMarkers((int) (byte) 1, layer77);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier79 = xYPlot4.getDrawingSupplier();
        org.jfree.chart.plot.Marker marker81 = null;
        org.jfree.chart.util.Layer layer82 = null;
        boolean boolean83 = xYPlot4.removeDomainMarker((int) '#', marker81, layer82);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNull(valueAxis54);
        org.junit.Assert.assertNotNull(axisLocation57);
        org.junit.Assert.assertNull(valueAxis66);
        org.junit.Assert.assertNull(xYItemRenderer68);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNull(valueAxis75);
        org.junit.Assert.assertNull(collection78);
        org.junit.Assert.assertNotNull(drawingSupplier79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.clearDomainMarkers();
        java.awt.Paint paint7 = xYPlot4.getBackgroundPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        xYPlot4.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        xYPlot4.zoomRangeAxes(100.0d, plotRenderingInfo11, point2D12, true);
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        xYPlot19.axisChanged(axisChangeEvent20);
        xYPlot19.mapDatasetToDomainAxis(10, (int) '#');
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = xYPlot19.getOrientation();
        xYPlot4.setOrientation(plotOrientation25);
        org.jfree.data.xy.XYDataset xYDataset27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = null;
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot(xYDataset27, valueAxis28, valueAxis29, xYItemRenderer30);
        java.awt.Stroke stroke32 = xYPlot31.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer33 = null;
        int int34 = xYPlot31.getIndexOf(xYItemRenderer33);
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        xYPlot31.setRangeAxis((int) 'a', valueAxis36);
        boolean boolean38 = xYPlot31.canSelectByRegion();
        org.jfree.chart.axis.AxisLocation axisLocation40 = xYPlot31.getRangeAxisLocation((int) (byte) -1);
        xYPlot4.setRangeAxisLocation(axisLocation40, false);
        boolean boolean43 = xYPlot4.isSubplot();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(plotOrientation25);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        xYPlot4.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot4.zoomDomainAxes((double) (byte) 1, plotRenderingInfo15, point2D16);
        xYPlot4.configureRangeAxes();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.clearDomainMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis7 = xYPlot4.getDomainAxis();
        java.awt.Paint paint8 = xYPlot4.getDomainTickBandPaint();
        xYPlot4.setOutlineVisible(true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        xYPlot4.datasetChanged(datasetChangeEvent11);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.util.Layer layer6 = null;
        java.util.Collection collection7 = xYPlot4.getDomainMarkers(layer6);
        java.awt.Stroke stroke8 = xYPlot4.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot4.getDomainAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge11 = xYPlot4.getRangeAxisEdge((int) 'a');
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        java.awt.Stroke stroke17 = xYPlot16.getRangeCrosshairStroke();
        xYPlot16.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot16.zoomRangeAxes(0.0d, plotRenderingInfo21, point2D22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        xYPlot16.panRangeAxes((double) (byte) 1, plotRenderingInfo25, point2D26);
        float float28 = xYPlot16.getBackgroundAlpha();
        xYPlot16.setRangePannable(false);
        xYPlot16.setRangeCrosshairValue((double) (short) 100);
        xYPlot16.setDomainCrosshairLockedOnData(true);
        org.jfree.data.xy.XYDataset xYDataset35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot(xYDataset35, valueAxis36, valueAxis37, xYItemRenderer38);
        org.jfree.chart.axis.AxisSpace axisSpace40 = null;
        xYPlot39.setFixedRangeAxisSpace(axisSpace40, false);
        org.jfree.chart.axis.ValueAxis valueAxis43 = xYPlot39.getRangeAxis();
        xYPlot39.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation46 = xYPlot39.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot(xYDataset47, valueAxis48, valueAxis49, xYItemRenderer50);
        org.jfree.chart.axis.AxisSpace axisSpace52 = null;
        xYPlot51.setFixedRangeAxisSpace(axisSpace52, false);
        org.jfree.chart.axis.ValueAxis valueAxis55 = xYPlot51.getRangeAxis();
        xYPlot51.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer57 = xYPlot51.getRenderer();
        java.awt.Paint paint58 = xYPlot51.getDomainZeroBaselinePaint();
        xYPlot39.setDomainGridlinePaint(paint58);
        xYPlot39.setRangeMinorGridlinesVisible(true);
        java.awt.Paint paint62 = xYPlot39.getNoDataMessagePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection63 = xYPlot39.getLegendItems();
        xYPlot16.setFixedLegendItems(legendItemCollection63);
        xYPlot4.setFixedLegendItems(legendItemCollection63);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(rectangleEdge11);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNull(valueAxis43);
        org.junit.Assert.assertNotNull(axisLocation46);
        org.junit.Assert.assertNull(valueAxis55);
        org.junit.Assert.assertNull(xYItemRenderer57);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(legendItemCollection63);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        int int11 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace12);
        xYPlot4.setRangeMinorGridlinesVisible(false);
        xYPlot4.clearRangeAxes();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis((int) (short) 10, valueAxis13);
        float float15 = xYPlot4.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        org.jfree.chart.plot.CrosshairState crosshairState20 = null;
        boolean boolean21 = xYPlot4.render(graphics2D16, rectangle2D17, (int) (short) 100, plotRenderingInfo19, crosshairState20);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot4.zoomDomainAxes((double) (-1), 10.0d, plotRenderingInfo19, point2D20);
        int int22 = xYPlot4.getDomainAxisCount();
        java.lang.Class<?> wildcardClass23 = xYPlot4.getClass();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot4.setBackgroundAlpha(0.0f);
        xYPlot4.setRangePannable(true);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) (short) -1);
        java.awt.Paint paint12 = xYPlot4.getOutlinePaint();
        java.awt.Paint paint13 = xYPlot4.getDomainMinorGridlinePaint();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder13 = xYPlot12.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        xYPlot19.setFixedRangeAxisSpace(axisSpace20, false);
        org.jfree.chart.axis.ValueAxis valueAxis23 = xYPlot19.getRangeAxis();
        xYPlot19.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot19.getRangeAxisLocation((int) (short) -1);
        xYPlot12.setDomainAxisLocation(0, axisLocation26, false);
        xYPlot12.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot12.setBackgroundAlpha(0.0f);
        boolean boolean33 = xYPlot12.canSelectByRegion();
        xYPlot4.setParent((org.jfree.chart.plot.Plot) xYPlot12);
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        xYPlot12.setDomainAxis((int) ' ', valueAxis36, true);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(seriesRenderingOrder13);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot4.getRangeAxisLocation((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = xYPlot4.getAxisOffset();
        xYPlot4.setDomainZeroBaselineVisible(true);
        float float22 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = xYPlot4.getDomainAxisEdge();
        xYPlot4.configureRangeAxes();
        java.awt.Stroke stroke25 = xYPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = xYPlot4.getLegendItems();
        xYPlot4.clearRangeMarkers(100);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(legendItemCollection26);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = xYPlot4.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace13);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        boolean boolean19 = xYPlot4.removeDomainMarker((int) '4', marker16, layer17, false);
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        java.awt.Stroke stroke25 = xYPlot24.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        int int27 = xYPlot24.getIndexOf(xYItemRenderer26);
        xYPlot24.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation30 = xYPlot24.getOrientation();
        xYPlot4.setOrientation(plotOrientation30);
        java.lang.Class<?> wildcardClass32 = plotOrientation30.getClass();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(plotOrientation30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis(valueAxis13);
        xYPlot4.setDomainCrosshairLockedOnData(true);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        xYPlot4.axisChanged(axisChangeEvent7);
        xYPlot4.setDomainGridlinesVisible(true);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder11 = xYPlot4.getSeriesRenderingOrder();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(seriesRenderingOrder11);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot4.getRangeAxisLocation((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = xYPlot4.getAxisOffset();
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = xYPlot4.getDomainAxisEdge();
        java.awt.Image image21 = xYPlot4.getBackgroundImage();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        java.awt.Stroke stroke27 = xYPlot26.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        int int29 = xYPlot26.getIndexOf(xYItemRenderer28);
        float float30 = xYPlot26.getBackgroundAlpha();
        java.awt.Image image31 = null;
        xYPlot26.setBackgroundImage(image31);
        double double33 = xYPlot26.getRangeCrosshairValue();
        org.jfree.chart.axis.AxisSpace axisSpace34 = null;
        xYPlot26.setFixedDomainAxisSpace(axisSpace34);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        xYPlot26.setDomainAxis(10, valueAxis37, true);
        org.jfree.chart.util.Layer layer41 = null;
        java.util.Collection collection42 = xYPlot26.getRangeMarkers((int) (byte) 100, layer41);
        java.awt.Stroke stroke43 = xYPlot26.getDomainGridlineStroke();
        xYPlot4.setRangeMinorGridlineStroke(stroke43);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNull(collection42);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        java.awt.Stroke stroke16 = xYPlot4.getRangeCrosshairStroke();
        boolean boolean17 = xYPlot4.isRangeZeroBaselineVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = xYPlot4.getRangeAxisEdge();
        xYPlot4.clearDomainMarkers();
        boolean boolean20 = xYPlot4.isDomainPannable();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot4.getRangeAxis();
        boolean boolean21 = xYPlot4.isRangeGridlinesVisible();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        java.awt.Stroke stroke27 = xYPlot26.getRangeCrosshairStroke();
        xYPlot26.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot26.zoomRangeAxes(0.0d, plotRenderingInfo31, point2D32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        java.awt.geom.Point2D point2D36 = null;
        xYPlot26.panRangeAxes((double) (byte) 1, plotRenderingInfo35, point2D36);
        float float38 = xYPlot26.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation40 = xYPlot26.getRangeAxisLocation((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = xYPlot26.getAxisOffset();
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = xYPlot26.getDomainAxisEdge();
        java.awt.Image image43 = xYPlot26.getBackgroundImage();
        java.awt.geom.GeneralPath generalPath44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        org.jfree.chart.RenderingSource renderingSource46 = null;
        xYPlot26.select(generalPath44, rectangle2D45, renderingSource46);
        java.awt.Stroke stroke48 = xYPlot26.getDomainMinorGridlineStroke();
        xYPlot4.setDomainMinorGridlineStroke(stroke48);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 1.0f + "'", float38 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation40);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(rectangleEdge42);
        org.junit.Assert.assertNull(image43);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        xYPlot4.axisChanged(axisChangeEvent7);
        xYPlot4.setDomainPannable(true);
        xYPlot4.mapDatasetToRangeAxis(0, 100);
        org.jfree.chart.plot.Marker marker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(15, marker15, layer16, false);
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder25 = xYPlot24.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = null;
        org.jfree.chart.plot.XYPlot xYPlot31 = new org.jfree.chart.plot.XYPlot(xYDataset27, valueAxis28, valueAxis29, xYItemRenderer30);
        org.jfree.chart.axis.AxisSpace axisSpace32 = null;
        xYPlot31.setFixedRangeAxisSpace(axisSpace32, false);
        org.jfree.chart.axis.ValueAxis valueAxis35 = xYPlot31.getRangeAxis();
        xYPlot31.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation38 = xYPlot31.getRangeAxisLocation((int) (short) -1);
        xYPlot24.setDomainAxisLocation(0, axisLocation38, false);
        xYPlot24.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot24.setBackgroundAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation45 = xYPlot24.getRangeAxisLocation();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = null;
        xYPlot24.notifyListeners(plotChangeEvent46);
        org.jfree.chart.axis.AxisLocation axisLocation48 = xYPlot24.getDomainAxisLocation();
        xYPlot4.setRangeAxisLocation(10, axisLocation48);
        java.awt.Paint paint50 = xYPlot4.getDomainMinorGridlinePaint();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(seriesRenderingOrder25);
        org.junit.Assert.assertNull(valueAxis35);
        org.junit.Assert.assertNotNull(axisLocation38);
        org.junit.Assert.assertNotNull(axisLocation45);
        org.junit.Assert.assertNotNull(axisLocation48);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getOutlinePaint();
        xYPlot4.mapDatasetToRangeAxis(100, (int) 'a');
        java.awt.Font font14 = xYPlot4.getNoDataMessageFont();
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray15 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot4.setRenderers(xYItemRendererArray15);
        org.jfree.chart.axis.ValueAxis[] valueAxisArray17 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setDomainAxes(valueAxisArray17);
        xYPlot4.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        xYPlot4.setDomainAxis(valueAxis21);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(xYItemRendererArray15);
        org.junit.Assert.assertNotNull(valueAxisArray17);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        xYPlot4.axisChanged(axisChangeEvent5);
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        java.awt.Stroke stroke12 = xYPlot11.getRangeCrosshairStroke();
        xYPlot11.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis16 = xYPlot11.getDomainAxis((int) (byte) 100);
        xYPlot11.setDomainCrosshairValue((double) 1L);
        boolean boolean19 = xYPlot11.isOutlineVisible();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = null;
        xYPlot24.setFixedRangeAxisSpace(axisSpace25, false);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        xYPlot24.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = xYPlot24.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = xYPlot24.getAxisOffset();
        xYPlot24.setNotify(false);
        xYPlot24.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke36 = xYPlot24.getRangeCrosshairStroke();
        xYPlot11.setRangeGridlineStroke(stroke36);
        xYPlot4.setDomainZeroBaselineStroke(stroke36);
        boolean boolean39 = xYPlot4.isDomainMinorGridlinesVisible();
        xYPlot4.clearAnnotations();
        java.awt.Stroke stroke41 = xYPlot4.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(valueAxis16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNull(xYItemRenderer30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stroke41);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        java.awt.Stroke stroke13 = xYPlot12.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        int int15 = xYPlot12.getIndexOf(xYItemRenderer14);
        float float16 = xYPlot12.getBackgroundAlpha();
        java.awt.Stroke stroke17 = xYPlot12.getDomainGridlineStroke();
        xYPlot4.setDomainZeroBaselineStroke(stroke17);
        org.jfree.chart.annotations.XYAnnotation xYAnnotation19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addAnnotation(xYAnnotation19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        float float11 = xYPlot4.getBackgroundImageAlpha();
        org.jfree.chart.plot.Marker marker12 = null;
        boolean boolean13 = xYPlot4.removeDomainMarker(marker12);
        java.awt.Paint paint14 = xYPlot4.getBackgroundPaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        int int23 = xYPlot4.getSeriesCount();
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot(xYDataset24, valueAxis25, valueAxis26, xYItemRenderer27);
        java.awt.Stroke stroke29 = xYPlot28.getRangeCrosshairStroke();
        xYPlot28.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        xYPlot28.zoomRangeAxes(0.0d, plotRenderingInfo33, point2D34);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder36 = xYPlot28.getDatasetRenderingOrder();
        xYPlot4.setDatasetRenderingOrder(datasetRenderingOrder36);
        java.awt.Stroke stroke38 = xYPlot4.getDomainMinorGridlineStroke();
        xYPlot4.setRangeGridlinesVisible(false);
        int int41 = xYPlot4.getBackgroundImageAlignment();
        xYPlot4.setRangeCrosshairVisible(false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(datasetRenderingOrder36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 15 + "'", int41 == 15);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot4.setBackgroundAlpha(0.0f);
        java.awt.Paint paint25 = xYPlot4.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace26, false);
        int int29 = xYPlot4.getDomainAxisCount();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation30 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addAnnotation(xYAnnotation30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis(valueAxis13);
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace15, true);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        xYPlot4.setRenderer(xYItemRenderer18);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        java.awt.Paint paint23 = xYPlot4.getOutlinePaint();
        java.awt.Paint paint24 = xYPlot4.getRangeMinorGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.data.Range range26 = xYPlot4.getDataRange(valueAxis25);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(range26);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder10 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.zoomRangeAxes(10.0d, (double) 100, plotRenderingInfo13, point2D14);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        java.awt.Stroke stroke21 = xYPlot20.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot20.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo24, point2D25);
        xYPlot20.setDomainCrosshairLockedOnData(false);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray29 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot20.setRenderers(xYItemRendererArray29);
        xYPlot4.setRenderers(xYItemRendererArray29);
        org.jfree.chart.axis.ValueAxis valueAxis32 = xYPlot4.getDomainAxis();
        org.jfree.data.xy.XYDataset xYDataset33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot(xYDataset33, valueAxis34, valueAxis35, xYItemRenderer36);
        org.jfree.chart.plot.Marker marker39 = null;
        org.jfree.chart.util.Layer layer40 = null;
        boolean boolean41 = xYPlot37.removeDomainMarker((int) '4', marker39, layer40);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot37.setInsets(rectangleInsets42, true);
        xYPlot37.setBackgroundImageAlignment((-1));
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        int int48 = xYPlot37.getRangeAxisIndex(valueAxis47);
        java.awt.Stroke stroke49 = xYPlot37.getDomainZeroBaselineStroke();
        xYPlot4.setDomainZeroBaselineStroke(stroke49);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(seriesRenderingOrder10);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(xYItemRendererArray29);
        org.junit.Assert.assertNull(valueAxis32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        java.awt.Image image12 = xYPlot4.getBackgroundImage();
        boolean boolean13 = xYPlot4.isDomainCrosshairVisible();
        xYPlot4.setRangeZeroBaselineVisible(false);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        java.awt.Stroke stroke21 = xYPlot20.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot20.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo24, point2D25);
        xYPlot20.setDomainCrosshairLockedOnData(false);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray29 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot20.setRenderers(xYItemRendererArray29);
        xYPlot4.setRenderers(xYItemRendererArray29);
        org.jfree.chart.plot.Marker marker32 = null;
        org.jfree.chart.util.Layer layer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = xYPlot4.removeRangeMarker(marker32, layer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(xYItemRendererArray29);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot4.getRangeAxis();
        boolean boolean21 = xYPlot4.isRangeGridlinesVisible();
        java.awt.Image image22 = xYPlot4.getBackgroundImage();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        java.awt.Stroke stroke28 = xYPlot27.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        int int30 = xYPlot27.getIndexOf(xYItemRenderer29);
        float float31 = xYPlot27.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot(xYDataset32, valueAxis33, valueAxis34, xYItemRenderer35);
        org.jfree.chart.axis.AxisSpace axisSpace37 = null;
        xYPlot36.setFixedRangeAxisSpace(axisSpace37, false);
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot36.getRangeAxis();
        xYPlot36.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot36.getRangeAxisLocation((int) (short) -1);
        xYPlot27.setRangeAxisLocation(axisLocation43, false);
        int int46 = xYPlot27.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection47 = xYPlot27.getLegendItems();
        xYPlot4.setFixedLegendItems(legendItemCollection47);
        java.awt.geom.Point2D point2D49 = xYPlot4.getQuadrantOrigin();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection47);
        org.junit.Assert.assertNotNull(point2D49);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        double double11 = xYPlot4.getRangeCrosshairValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        xYPlot4.markerChanged(markerChangeEvent12);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot4.getRangeAxis((-1));
        float float16 = xYPlot4.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        boolean boolean11 = xYPlot4.canSelectByRegion();
        xYPlot4.setDomainCrosshairValue(100.0d);
        org.jfree.chart.plot.Plot plot14 = xYPlot4.getRootPlot();
        org.jfree.chart.axis.AxisSpace axisSpace15 = xYPlot4.getFixedRangeAxisSpace();
        boolean boolean16 = xYPlot4.isDomainMinorGridlinesVisible();
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        org.jfree.chart.axis.AxisSpace axisSpace22 = null;
        xYPlot21.setFixedRangeAxisSpace(axisSpace22, false);
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot21.getRangeAxis();
        xYPlot21.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge27 = xYPlot21.getRangeAxisEdge();
        java.awt.Paint paint28 = xYPlot21.getRangeZeroBaselinePaint();
        xYPlot4.setDomainZeroBaselinePaint(paint28);
        java.awt.Paint paint30 = xYPlot4.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(axisSpace15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertNotNull(rectangleEdge27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        boolean boolean12 = xYPlot4.isRangePannable();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = null;
        xYPlot4.setFixedLegendItems(legendItemCollection13);
        boolean boolean15 = xYPlot4.isDomainPannable();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        java.awt.Stroke stroke23 = xYPlot22.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        xYPlot22.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo26, point2D27);
        org.jfree.data.xy.XYDataset xYDataset30 = null;
        xYPlot22.setDataset((int) (short) 0, xYDataset30);
        xYPlot22.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        int int36 = xYPlot22.getIndexOf(xYItemRenderer35);
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        xYPlot22.setDomainAxis(0, valueAxis38, true);
        float float41 = xYPlot22.getForegroundAlpha();
        xYPlot22.clearSelection();
        java.util.List list43 = xYPlot22.getAnnotations();
        xYPlot4.drawRangeTickBands(graphics2D16, rectangle2D17, list43);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.RenderingSource renderingSource11 = null;
        xYPlot4.select((double) '#', (double) 1.0f, rectangle2D10, renderingSource11);
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = xYPlot4.getDomainAxisEdge();
        xYPlot4.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge13);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getAxisOffset();
        xYPlot4.setNotify(false);
        java.awt.Paint paint14 = xYPlot4.getDomainCrosshairPaint();
        int int15 = xYPlot4.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot4.getRangeAxis((int) (byte) -1);
        xYPlot4.setDomainCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        java.awt.Stroke stroke25 = xYPlot24.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        xYPlot24.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo28, point2D29);
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        xYPlot24.setDataset((int) (short) 0, xYDataset32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = xYPlot24.getAxisOffset();
        int int35 = xYPlot24.getBackgroundImageAlignment();
        xYPlot24.clearDomainAxes();
        int int37 = xYPlot24.getDatasetCount();
        float float38 = xYPlot24.getBackgroundImageAlpha();
        java.awt.Font font39 = xYPlot24.getNoDataMessageFont();
        xYPlot4.setNoDataMessageFont(font39);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.5f + "'", float38 == 0.5f);
        org.junit.Assert.assertNotNull(font39);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        xYPlot4.setRangeAxis((int) (short) 10, valueAxis13);
        float float15 = xYPlot4.getBackgroundImageAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = xYPlot4.getDomainAxisIndex(valueAxis16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace18);
        boolean boolean20 = xYPlot4.isDomainMinorGridlinesVisible();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getOutlineStroke();
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xYPlot4.removeRangeMarker((int) (byte) 0, marker12, layer13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = xYPlot4.getRangeMarkers(layer19);
        boolean boolean21 = xYPlot4.isDomainZoomable();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        java.awt.Stroke stroke27 = xYPlot26.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        int int29 = xYPlot26.getIndexOf(xYItemRenderer28);
        float float30 = xYPlot26.getBackgroundAlpha();
        java.awt.Stroke stroke31 = xYPlot26.getDomainGridlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        xYPlot26.zoomDomainAxes(0.0d, plotRenderingInfo33, point2D34);
        xYPlot26.setForegroundAlpha((float) (-1));
        org.jfree.chart.axis.AxisSpace axisSpace38 = xYPlot26.getFixedRangeAxisSpace();
        org.jfree.data.xy.XYDataset xYDataset39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot(xYDataset39, valueAxis40, valueAxis41, xYItemRenderer42);
        java.awt.Stroke stroke44 = xYPlot43.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = null;
        int int46 = xYPlot43.getIndexOf(xYItemRenderer45);
        org.jfree.chart.util.RectangleEdge rectangleEdge48 = xYPlot43.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint49 = xYPlot43.getOutlinePaint();
        xYPlot43.mapDatasetToRangeAxis(100, (int) 'a');
        org.jfree.data.xy.XYDataset xYDataset53 = null;
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer56 = null;
        org.jfree.chart.plot.XYPlot xYPlot57 = new org.jfree.chart.plot.XYPlot(xYDataset53, valueAxis54, valueAxis55, xYItemRenderer56);
        java.awt.Stroke stroke58 = xYPlot57.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer59 = null;
        int int60 = xYPlot57.getIndexOf(xYItemRenderer59);
        org.jfree.chart.axis.ValueAxis valueAxis62 = null;
        xYPlot57.setRangeAxis((int) 'a', valueAxis62);
        boolean boolean64 = xYPlot57.canSelectByRegion();
        xYPlot57.clearDomainAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier66 = xYPlot57.getDrawingSupplier();
        xYPlot43.setDrawingSupplier(drawingSupplier66);
        xYPlot26.setDrawingSupplier(drawingSupplier66, true);
        xYPlot4.setDrawingSupplier(drawingSupplier66, false);
        boolean boolean72 = xYPlot4.isDomainGridlinesVisible();
        double double73 = xYPlot4.getRangeCrosshairValue();
        org.jfree.chart.plot.PlotOrientation plotOrientation74 = xYPlot4.getOrientation();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(axisSpace38);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(drawingSupplier66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(plotOrientation74);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        xYPlot4.removeChangeListener(plotChangeListener13);
        org.jfree.chart.util.Layer layer15 = null;
        java.util.Collection collection16 = xYPlot4.getRangeMarkers(layer15);
        xYPlot4.setDomainCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setDomainAxis((-1), valueAxis20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(collection16);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        xYPlot14.setFixedRangeAxisSpace(axisSpace15, false);
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot14.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        int int20 = xYPlot14.getRangeAxisIndex(valueAxis19);
        boolean boolean21 = xYPlot14.isRangeGridlinesVisible();
        boolean boolean22 = xYPlot14.canSelectByPoint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        xYPlot14.removeChangeListener(plotChangeListener23);
        java.awt.Paint paint25 = xYPlot14.getNoDataMessagePaint();
        xYPlot4.setOutlinePaint(paint25);
        xYPlot4.setNotify(false);
        xYPlot4.setDomainZeroBaselineVisible(true);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder11 = xYPlot4.getSeriesRenderingOrder();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(seriesRenderingOrder11);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        xYPlot4.clearRangeAxes();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setDomainAxis((int) (byte) -1, valueAxis11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.clearDomainMarkers();
        java.awt.Paint paint7 = xYPlot4.getBackgroundPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        xYPlot4.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        xYPlot4.zoomRangeAxes(100.0d, plotRenderingInfo11, point2D12, true);
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        xYPlot19.axisChanged(axisChangeEvent20);
        xYPlot19.mapDatasetToDomainAxis(10, (int) '#');
        org.jfree.chart.plot.PlotOrientation plotOrientation25 = xYPlot19.getOrientation();
        xYPlot4.setOrientation(plotOrientation25);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        xYPlot4.setDomainAxis(valueAxis27);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(plotOrientation25);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        int int11 = xYPlot4.getBackgroundImageAlignment();
        xYPlot4.setNotify(true);
        int int14 = xYPlot4.getSeriesCount();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        int int23 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot(xYDataset24, valueAxis25, valueAxis26, xYItemRenderer27);
        java.awt.Stroke stroke29 = xYPlot28.getRangeCrosshairStroke();
        xYPlot28.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        xYPlot28.zoomRangeAxes(0.0d, plotRenderingInfo33, point2D34);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        xYPlot28.panRangeAxes((double) (byte) 1, plotRenderingInfo37, point2D38);
        xYPlot28.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker43 = null;
        org.jfree.chart.util.Layer layer44 = null;
        boolean boolean45 = xYPlot28.removeDomainMarker((int) (byte) 0, marker43, layer44);
        java.awt.Paint paint46 = xYPlot28.getBackgroundPaint();
        xYPlot4.setRangeCrosshairPaint(paint46);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer48 = null;
        xYPlot4.setRenderer(xYItemRenderer48);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis12 = xYPlot4.getRangeAxis((int) (short) 10);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot17.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo21, point2D22);
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        xYPlot17.setDataset((int) (short) 0, xYDataset25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = xYPlot17.getAxisOffset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        xYPlot17.axisChanged(axisChangeEvent28);
        java.awt.Stroke stroke30 = xYPlot17.getDomainCrosshairStroke();
        xYPlot4.setOutlineStroke(stroke30);
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer33 = xYPlot4.getRendererForDataset(xYDataset32);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(valueAxis12);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(xYItemRenderer33);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot4.getRangeAxis();
        boolean boolean21 = xYPlot4.isRangeGridlinesVisible();
        java.awt.Image image22 = xYPlot4.getBackgroundImage();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        java.awt.Stroke stroke28 = xYPlot27.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        int int30 = xYPlot27.getIndexOf(xYItemRenderer29);
        float float31 = xYPlot27.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot(xYDataset32, valueAxis33, valueAxis34, xYItemRenderer35);
        org.jfree.chart.axis.AxisSpace axisSpace37 = null;
        xYPlot36.setFixedRangeAxisSpace(axisSpace37, false);
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot36.getRangeAxis();
        xYPlot36.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot36.getRangeAxisLocation((int) (short) -1);
        xYPlot27.setRangeAxisLocation(axisLocation43, false);
        int int46 = xYPlot27.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection47 = xYPlot27.getLegendItems();
        xYPlot4.setFixedLegendItems(legendItemCollection47);
        java.awt.geom.GeneralPath generalPath49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        org.jfree.chart.RenderingSource renderingSource51 = null;
        xYPlot4.select(generalPath49, rectangle2D50, renderingSource51);
        org.jfree.chart.axis.ValueAxis valueAxis53 = null;
        org.jfree.data.Range range54 = xYPlot4.getDataRange(valueAxis53);
        org.jfree.data.xy.XYDataset xYDataset56 = null;
        xYPlot4.setDataset((int) 'a', xYDataset56);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection47);
        org.junit.Assert.assertNull(range54);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = xYPlot4.getRangeAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        java.awt.Stroke stroke22 = xYPlot21.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        int int24 = xYPlot21.getIndexOf(xYItemRenderer23);
        float float25 = xYPlot21.getBackgroundAlpha();
        java.awt.Stroke stroke26 = xYPlot21.getDomainGridlineStroke();
        xYPlot13.setDomainZeroBaselineStroke(stroke26);
        xYPlot4.setRangeZeroBaselineStroke(stroke26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        xYPlot4.zoomDomainAxes((double) ' ', plotRenderingInfo30, point2D31, false);
        org.jfree.chart.plot.Marker marker35 = null;
        org.jfree.chart.util.Layer layer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = xYPlot4.removeRangeMarker((int) (short) 100, marker35, layer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        xYPlot4.setRangeMinorGridlinesVisible(false);
        java.awt.Paint paint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setDomainZeroBaselinePaint(paint18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot4.getRendererForDataset(xYDataset21);
        boolean boolean23 = xYPlot4.canSelectByPoint();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.data.xy.XYDataset xYDataset26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        org.jfree.chart.plot.XYPlot xYPlot30 = new org.jfree.chart.plot.XYPlot(xYDataset26, valueAxis27, valueAxis28, xYItemRenderer29);
        org.jfree.chart.axis.AxisSpace axisSpace31 = null;
        xYPlot30.setFixedRangeAxisSpace(axisSpace31, false);
        org.jfree.data.xy.XYDataset xYDataset34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        org.jfree.chart.plot.XYPlot xYPlot38 = new org.jfree.chart.plot.XYPlot(xYDataset34, valueAxis35, valueAxis36, xYItemRenderer37);
        java.awt.Stroke stroke39 = xYPlot38.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer40 = null;
        int int41 = xYPlot38.getIndexOf(xYItemRenderer40);
        float float42 = xYPlot38.getBackgroundAlpha();
        java.awt.Stroke stroke43 = xYPlot38.getDomainGridlineStroke();
        xYPlot30.setDomainZeroBaselineStroke(stroke43);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = xYPlot30.getRenderer();
        xYPlot30.setRangeCrosshairVisible(false);
        java.util.List list48 = xYPlot30.getAnnotations();
        xYPlot4.drawDomainTickBands(graphics2D24, rectangle2D25, list48);
        org.jfree.chart.LegendItemCollection legendItemCollection50 = xYPlot4.getFixedLegendItems();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNull(xYItemRenderer45);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNull(legendItemCollection50);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        int int20 = xYPlot4.getRendererCount();
        org.jfree.chart.axis.AxisLocation axisLocation21 = xYPlot4.getDomainAxisLocation();
        boolean boolean22 = xYPlot4.isDomainZoomable();
        boolean boolean23 = xYPlot4.isOutlineVisible();
        java.awt.Paint paint24 = xYPlot4.getRangeZeroBaselinePaint();
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot(xYDataset25, valueAxis26, valueAxis27, xYItemRenderer28);
        xYPlot29.clearRangeMarkers(15);
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot(xYDataset32, valueAxis33, valueAxis34, xYItemRenderer35);
        org.jfree.chart.axis.AxisSpace axisSpace37 = null;
        xYPlot36.setFixedRangeAxisSpace(axisSpace37, false);
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot36.getRangeAxis();
        xYPlot36.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = xYPlot36.getRenderer();
        java.awt.Paint paint43 = xYPlot36.getDomainZeroBaselinePaint();
        xYPlot29.setRangeGridlinePaint(paint43);
        xYPlot4.setDomainGridlinePaint(paint43);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer46 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = xYPlot4.getInsets();
        org.jfree.chart.axis.AxisLocation axisLocation49 = xYPlot4.getDomainAxisLocation((int) ' ');
        java.awt.Stroke stroke50 = xYPlot4.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNull(xYItemRenderer42);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNull(xYItemRenderer46);
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertNotNull(axisLocation49);
        org.junit.Assert.assertNotNull(stroke50);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = xYPlot4.getFixedLegendItems();
        xYPlot4.setDomainZeroBaselineVisible(false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(legendItemCollection11);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        xYPlot4.zoomDomainAxes(0.0d, plotRenderingInfo11, point2D12);
        xYPlot4.setForegroundAlpha((float) (-1));
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        int int17 = xYPlot4.indexOf(xYDataset16);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        java.awt.Stroke stroke23 = xYPlot22.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        xYPlot22.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo26, point2D27);
        org.jfree.data.xy.XYDataset xYDataset30 = null;
        xYPlot22.setDataset((int) (short) 0, xYDataset30);
        xYPlot22.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = xYPlot22.getAxisOffset();
        xYPlot22.clearRangeMarkers();
        org.jfree.data.xy.XYDataset xYDataset37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer40 = null;
        org.jfree.chart.plot.XYPlot xYPlot41 = new org.jfree.chart.plot.XYPlot(xYDataset37, valueAxis38, valueAxis39, xYItemRenderer40);
        xYPlot41.clearRangeMarkers(15);
        int int44 = xYPlot41.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        java.awt.geom.Point2D point2D48 = null;
        xYPlot41.zoomDomainAxes((double) 1.0f, (double) 15, plotRenderingInfo47, point2D48);
        org.jfree.chart.axis.AxisLocation axisLocation50 = xYPlot41.getRangeAxisLocation();
        xYPlot22.setRangeAxisLocation(axisLocation50, false);
        xYPlot4.setDomainAxisLocation(axisLocation50, true);
        java.lang.String str55 = xYPlot4.getNoDataMessage();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(axisLocation50);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        boolean boolean11 = xYPlot4.canSelectByRegion();
        xYPlot4.setDomainCrosshairValue(100.0d);
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        xYPlot18.setFixedRangeAxisSpace(axisSpace19, false);
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot18.getRangeAxis();
        xYPlot18.clearRangeMarkers();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder24 = xYPlot18.getSeriesRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        xYPlot18.zoomRangeAxes(10.0d, (double) 100, plotRenderingInfo27, point2D28);
        java.awt.Stroke stroke30 = xYPlot18.getRangeGridlineStroke();
        xYPlot4.setRangeMinorGridlineStroke(stroke30);
        boolean boolean32 = xYPlot4.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNotNull(seriesRenderingOrder24);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        xYPlot4.mapDatasetToDomainAxis((int) (short) 0, 0);
        xYPlot4.mapDatasetToRangeAxis((int) (byte) 10, (int) (byte) 0);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = xYPlot4.getRenderer((-1));
        java.awt.Paint paint21 = xYPlot4.getRangeCrosshairPaint();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(xYItemRenderer20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.setNoDataMessage("hi!");
        int int11 = xYPlot4.getWeight();
        java.awt.Paint paint12 = xYPlot4.getDomainCrosshairPaint();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        xYPlot4.drawAnnotations(graphics2D13, rectangle2D14, plotRenderingInfo15);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        xYPlot16.setFixedRangeAxisSpace(axisSpace17, false);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot16.getRangeAxis();
        xYPlot16.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot16.getRenderer();
        java.awt.Paint paint23 = xYPlot16.getDomainZeroBaselinePaint();
        xYPlot4.setDomainGridlinePaint(paint23);
        xYPlot4.setRangeMinorGridlinesVisible(true);
        xYPlot4.setDomainCrosshairVisible(true);
        boolean boolean29 = xYPlot4.isDomainZeroBaselineVisible();
        java.awt.Stroke stroke30 = xYPlot4.getRangeGridlineStroke();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot4.getDataRange(valueAxis11);
        xYPlot4.configureRangeAxes();
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        java.awt.Stroke stroke21 = xYPlot20.getRangeCrosshairStroke();
        xYPlot20.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis25 = xYPlot20.getDomainAxis((int) (byte) 100);
        xYPlot20.setDomainCrosshairValue((double) 1L);
        java.awt.Stroke stroke28 = xYPlot20.getRangeMinorGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot(xYDataset29, valueAxis30, valueAxis31, xYItemRenderer32);
        java.awt.Stroke stroke34 = xYPlot33.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        int int36 = xYPlot33.getIndexOf(xYItemRenderer35);
        float float37 = xYPlot33.getBackgroundAlpha();
        java.awt.Stroke stroke38 = xYPlot33.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = xYPlot33.getRangeAxisEdge();
        java.awt.Paint paint40 = xYPlot33.getNoDataMessagePaint();
        xYPlot20.setDomainTickBandPaint(paint40);
        xYPlot4.setDomainTickBandPaint(paint40);
        org.jfree.chart.plot.Marker marker44 = null;
        org.jfree.chart.util.Layer layer45 = null;
        boolean boolean46 = xYPlot4.removeDomainMarker((int) (byte) -1, marker44, layer45);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(rectangleEdge39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        xYPlot4.setRangeAxis((int) 'a', valueAxis9);
        int int11 = xYPlot4.getBackgroundImageAlignment();
        int int12 = xYPlot4.getBackgroundImageAlignment();
        java.util.List list13 = xYPlot4.getAnnotations();
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        xYPlot18.setFixedRangeAxisSpace(axisSpace19, false);
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot18.getRangeAxis();
        xYPlot18.clearRangeMarkers();
        java.awt.Stroke stroke24 = xYPlot18.getRangeZeroBaselineStroke();
        java.awt.Image image25 = null;
        xYPlot18.setBackgroundImage(image25);
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        xYPlot18.removeChangeListener(plotChangeListener27);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = xYPlot18.getRangeMarkers(layer29);
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        xYPlot35.setFixedRangeAxisSpace(axisSpace36, false);
        org.jfree.chart.axis.ValueAxis valueAxis39 = xYPlot35.getRangeAxis();
        xYPlot35.clearRangeMarkers();
        java.awt.Stroke stroke41 = xYPlot35.getRangeZeroBaselineStroke();
        java.awt.Image image42 = null;
        xYPlot35.setBackgroundImage(image42);
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        xYPlot35.removeChangeListener(plotChangeListener44);
        org.jfree.data.xy.XYDataset xYDataset46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer49 = null;
        org.jfree.chart.plot.XYPlot xYPlot50 = new org.jfree.chart.plot.XYPlot(xYDataset46, valueAxis47, valueAxis48, xYItemRenderer49);
        org.jfree.chart.axis.AxisSpace axisSpace51 = null;
        xYPlot50.setFixedRangeAxisSpace(axisSpace51, false);
        org.jfree.chart.axis.ValueAxis valueAxis54 = xYPlot50.getRangeAxis();
        xYPlot50.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation57 = xYPlot50.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset58 = null;
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer61 = null;
        org.jfree.chart.plot.XYPlot xYPlot62 = new org.jfree.chart.plot.XYPlot(xYDataset58, valueAxis59, valueAxis60, xYItemRenderer61);
        org.jfree.chart.axis.AxisSpace axisSpace63 = null;
        xYPlot62.setFixedRangeAxisSpace(axisSpace63, false);
        org.jfree.chart.axis.ValueAxis valueAxis66 = xYPlot62.getRangeAxis();
        xYPlot62.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer68 = xYPlot62.getRenderer();
        java.awt.Paint paint69 = xYPlot62.getDomainZeroBaselinePaint();
        xYPlot50.setDomainGridlinePaint(paint69);
        xYPlot35.setRangeMinorGridlinePaint(paint69);
        xYPlot18.setDomainTickBandPaint(paint69);
        xYPlot4.setRangeCrosshairPaint(paint69);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer75 = null;
        xYPlot4.setRenderer(0, xYItemRenderer75, false);
        org.jfree.chart.axis.ValueAxis valueAxis79 = null;
        xYPlot4.setDomainAxis(11, valueAxis79, true);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNull(valueAxis54);
        org.junit.Assert.assertNotNull(axisLocation57);
        org.junit.Assert.assertNull(valueAxis66);
        org.junit.Assert.assertNull(xYItemRenderer68);
        org.junit.Assert.assertNotNull(paint69);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder18 = xYPlot17.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = null;
        xYPlot24.setFixedRangeAxisSpace(axisSpace25, false);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        xYPlot24.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot24.getRangeAxisLocation((int) (short) -1);
        xYPlot17.setDomainAxisLocation(0, axisLocation31, false);
        int int34 = xYPlot17.getWeight();
        java.awt.Paint paint35 = xYPlot17.getDomainZeroBaselinePaint();
        xYPlot4.setDomainMinorGridlinePaint(paint35);
        int int37 = xYPlot4.getDatasetCount();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(seriesRenderingOrder18);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getAxisOffset();
        xYPlot4.setNotify(false);
        xYPlot4.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke16 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        java.awt.Stroke stroke23 = xYPlot22.getRangeCrosshairStroke();
        xYPlot22.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        xYPlot22.zoomRangeAxes(0.0d, plotRenderingInfo27, point2D28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot22.panRangeAxes((double) (byte) 1, plotRenderingInfo31, point2D32);
        float float34 = xYPlot22.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation36 = xYPlot22.getRangeAxisLocation((int) (short) 100);
        xYPlot4.setRangeAxisLocation((int) 'a', axisLocation36);
        org.jfree.data.xy.XYDataset xYDataset38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot(xYDataset38, valueAxis39, valueAxis40, xYItemRenderer41);
        xYPlot42.clearRangeMarkers(15);
        org.jfree.data.xy.XYDataset xYDataset45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer48 = null;
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot(xYDataset45, valueAxis46, valueAxis47, xYItemRenderer48);
        org.jfree.chart.axis.AxisSpace axisSpace50 = null;
        xYPlot49.setFixedRangeAxisSpace(axisSpace50, false);
        org.jfree.chart.axis.ValueAxis valueAxis53 = xYPlot49.getRangeAxis();
        xYPlot49.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer55 = xYPlot49.getRenderer();
        java.awt.Paint paint56 = xYPlot49.getDomainZeroBaselinePaint();
        xYPlot42.setRangeGridlinePaint(paint56);
        xYPlot4.setDomainCrosshairPaint(paint56);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer59 = xYPlot4.getRenderer();
        org.jfree.chart.event.PlotChangeListener plotChangeListener60 = null;
        xYPlot4.removeChangeListener(plotChangeListener60);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation36);
        org.junit.Assert.assertNull(valueAxis53);
        org.junit.Assert.assertNull(xYItemRenderer55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNull(xYItemRenderer59);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        xYPlot4.mapDatasetToDomainAxis((int) (short) 0, 0);
        xYPlot4.mapDatasetToRangeAxis((int) (byte) 10, (int) (byte) 0);
        xYPlot4.setDomainCrosshairLockedOnData(false);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        xYPlot4.setDomainAxis(valueAxis21);
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        java.awt.Stroke stroke28 = xYPlot27.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer29 = null;
        int int30 = xYPlot27.getIndexOf(xYItemRenderer29);
        xYPlot27.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation33 = xYPlot27.getOrientation();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        xYPlot27.addChangeListener(plotChangeListener34);
        org.jfree.data.xy.XYDataset xYDataset36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer39 = null;
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot(xYDataset36, valueAxis37, valueAxis38, xYItemRenderer39);
        org.jfree.chart.axis.AxisSpace axisSpace41 = null;
        xYPlot40.setFixedRangeAxisSpace(axisSpace41, false);
        org.jfree.chart.axis.ValueAxis valueAxis44 = xYPlot40.getRangeAxis();
        xYPlot40.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation47 = xYPlot40.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer51 = null;
        org.jfree.chart.plot.XYPlot xYPlot52 = new org.jfree.chart.plot.XYPlot(xYDataset48, valueAxis49, valueAxis50, xYItemRenderer51);
        org.jfree.chart.axis.AxisSpace axisSpace53 = null;
        xYPlot52.setFixedRangeAxisSpace(axisSpace53, false);
        org.jfree.chart.axis.ValueAxis valueAxis56 = xYPlot52.getRangeAxis();
        xYPlot52.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer58 = xYPlot52.getRenderer();
        java.awt.Paint paint59 = xYPlot52.getDomainZeroBaselinePaint();
        xYPlot40.setDomainGridlinePaint(paint59);
        xYPlot40.setRangeMinorGridlinesVisible(true);
        java.awt.Paint paint63 = xYPlot40.getNoDataMessagePaint();
        xYPlot27.setDomainTickBandPaint(paint63);
        xYPlot4.setNoDataMessagePaint(paint63);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(plotOrientation33);
        org.junit.Assert.assertNull(valueAxis44);
        org.junit.Assert.assertNotNull(axisLocation47);
        org.junit.Assert.assertNull(valueAxis56);
        org.junit.Assert.assertNull(xYItemRenderer58);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(paint63);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets9, true);
        xYPlot4.setBackgroundImageAlignment((-1));
        java.awt.Image image14 = null;
        xYPlot4.setBackgroundImage(image14);
        org.jfree.data.xy.XYDataset xYDataset16 = xYPlot4.getDataset();
        org.jfree.data.xy.XYDataset xYDataset17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        org.jfree.chart.plot.XYPlot xYPlot21 = new org.jfree.chart.plot.XYPlot(xYDataset17, valueAxis18, valueAxis19, xYItemRenderer20);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder22 = xYPlot21.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot(xYDataset24, valueAxis25, valueAxis26, xYItemRenderer27);
        org.jfree.chart.axis.AxisSpace axisSpace29 = null;
        xYPlot28.setFixedRangeAxisSpace(axisSpace29, false);
        org.jfree.chart.axis.ValueAxis valueAxis32 = xYPlot28.getRangeAxis();
        xYPlot28.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation35 = xYPlot28.getRangeAxisLocation((int) (short) -1);
        xYPlot21.setDomainAxisLocation(0, axisLocation35, false);
        java.awt.Font font38 = xYPlot21.getNoDataMessageFont();
        org.jfree.chart.plot.Marker marker40 = null;
        org.jfree.chart.util.Layer layer41 = null;
        boolean boolean43 = xYPlot21.removeDomainMarker((int) ' ', marker40, layer41, false);
        java.awt.Stroke stroke44 = xYPlot21.getDomainMinorGridlineStroke();
        xYPlot4.setRangeCrosshairStroke(stroke44);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(xYDataset16);
        org.junit.Assert.assertNotNull(seriesRenderingOrder22);
        org.junit.Assert.assertNull(valueAxis32);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getOutlinePaint();
        xYPlot4.mapDatasetToRangeAxis(100, (int) 'a');
        int int14 = xYPlot4.getRangeAxisCount();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        xYPlot4.setRangeZeroBaselineVisible(true);
        int int13 = xYPlot4.getSeriesCount();
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace14);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        int int23 = xYPlot4.getSeriesCount();
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot(xYDataset24, valueAxis25, valueAxis26, xYItemRenderer27);
        java.awt.Stroke stroke29 = xYPlot28.getRangeCrosshairStroke();
        xYPlot28.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        xYPlot28.zoomRangeAxes(0.0d, plotRenderingInfo33, point2D34);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder36 = xYPlot28.getDatasetRenderingOrder();
        xYPlot4.setDatasetRenderingOrder(datasetRenderingOrder36);
        java.awt.Stroke stroke38 = xYPlot4.getDomainMinorGridlineStroke();
        int int39 = xYPlot4.getSeriesCount();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(datasetRenderingOrder36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        xYPlot4.markerChanged(markerChangeEvent10);
        int int12 = xYPlot4.getDomainAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(15, valueAxis14, true);
        xYPlot4.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = xYPlot4.getDrawingSupplier();
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot(xYDataset21, valueAxis22, valueAxis23, xYItemRenderer24);
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        xYPlot25.setFixedRangeAxisSpace(axisSpace26, false);
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot25.getRangeAxis();
        xYPlot25.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation32 = xYPlot25.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation((int) '#', axisLocation32);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNotNull(axisLocation32);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets9, true);
        xYPlot4.setBackgroundImageAlignment((-1));
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        int int15 = xYPlot4.getRangeAxisIndex(valueAxis14);
        java.awt.Stroke stroke16 = xYPlot4.getDomainZeroBaselineStroke();
        boolean boolean17 = xYPlot4.isRangeMinorGridlinesVisible();
        java.awt.Paint paint19 = xYPlot4.getQuadrantPaint((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        org.jfree.chart.plot.Plot plot23 = xYPlot4.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection24 = xYPlot4.getLegendItems();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(plot23);
        org.junit.Assert.assertNotNull(legendItemCollection24);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot4.getDataRange(valueAxis11);
        boolean boolean13 = xYPlot4.isDomainPannable();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        xYPlot4.removeChangeListener(plotChangeListener14);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        xYPlot4.clearRangeMarkers(15);
        org.jfree.chart.plot.Plot plot7 = xYPlot4.getRootPlot();
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot4.getRangeAxisLocation((int) (short) 0);
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.RenderingSource renderingSource13 = null;
        xYPlot4.select((double) (-1), (double) 97.0f, rectangle2D12, renderingSource13);
        double double15 = xYPlot4.getRangeCrosshairValue();
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        xYPlot4.setDomainPannable(true);
        int int18 = xYPlot4.getSeriesCount();
        xYPlot4.setDomainCrosshairVisible(false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = null;
        xYPlot24.setFixedRangeAxisSpace(axisSpace25, false);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        xYPlot24.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = xYPlot24.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = xYPlot24.getAxisOffset();
        xYPlot24.setNotify(false);
        xYPlot24.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke36 = xYPlot24.getRangeCrosshairStroke();
        xYPlot4.setRangeGridlineStroke(stroke36);
        boolean boolean38 = xYPlot4.isDomainCrosshairLockedOnData();
        java.awt.Paint paint39 = xYPlot4.getDomainTickBandPaint();
        java.awt.Paint paint40 = xYPlot4.getDomainMinorGridlinePaint();
        org.jfree.chart.plot.Marker marker42 = null;
        org.jfree.chart.util.Layer layer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = xYPlot4.removeRangeMarker((int) (byte) 100, marker42, layer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNull(xYItemRenderer30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(paint39);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        int int6 = xYPlot4.indexOf(xYDataset5);
        boolean boolean7 = xYPlot4.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot17.getIndexOf(xYItemRenderer19);
        float float21 = xYPlot17.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        xYPlot26.setFixedRangeAxisSpace(axisSpace27, false);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot26.getRangeAxis();
        xYPlot26.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot26.getRangeAxisLocation((int) (short) -1);
        xYPlot17.setRangeAxisLocation(axisLocation33, false);
        xYPlot4.setDomainAxisLocation((int) (byte) 10, axisLocation33);
        xYPlot4.setDomainCrosshairValue((double) 0);
        xYPlot4.clearDomainAxes();
        xYPlot4.clearRangeAxes();
        xYPlot4.mapDatasetToDomainAxis((int) (short) 1, 11);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(axisLocation33);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot4.setBackgroundAlpha(0.0f);
        java.awt.Stroke stroke25 = xYPlot4.getDomainMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot4.getDomainAxis();
        int int27 = xYPlot4.getRangeAxisCount();
        java.awt.Paint paint28 = xYPlot4.getDomainTickBandPaint();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(paint28);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot4.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getDomainAxisLocation((int) (byte) 10);
        java.awt.Stroke stroke12 = xYPlot4.getRangeMinorGridlineStroke();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        org.jfree.chart.plot.CrosshairState crosshairState17 = null;
        boolean boolean18 = xYPlot4.render(graphics2D13, rectangle2D14, (int) (byte) -1, plotRenderingInfo16, crosshairState17);
        java.awt.Paint paint19 = xYPlot4.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        java.awt.Stroke stroke14 = xYPlot13.getRangeCrosshairStroke();
        xYPlot13.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        xYPlot13.zoomRangeAxes(0.0d, plotRenderingInfo18, point2D19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        xYPlot13.panRangeAxes((double) (byte) 1, plotRenderingInfo22, point2D23);
        float float25 = xYPlot13.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot13.getRangeAxisLocation((int) (short) 100);
        xYPlot4.setRangeAxisLocation(axisLocation27, true);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.data.Range range32 = xYPlot4.getDataRange(valueAxis31);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        xYPlot4.setRangeAxis(valueAxis33);
        java.lang.String str35 = xYPlot4.getPlotType();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNull(range32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "XY Plot" + "'", str35, "XY Plot");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        int int10 = xYPlot4.getRangeAxisIndex(valueAxis9);
        boolean boolean11 = xYPlot4.isRangeGridlinesVisible();
        boolean boolean12 = xYPlot4.canSelectByPoint();
        xYPlot4.mapDatasetToDomainAxis((int) (short) 0, 0);
        xYPlot4.mapDatasetToRangeAxis((int) (byte) 10, (int) (byte) 0);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = xYPlot4.getRenderer((-1));
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = xYPlot4.getDomainMarkers(0, layer22);
        org.jfree.chart.plot.Marker marker24 = null;
        org.jfree.chart.util.Layer layer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addRangeMarker(marker24, layer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(xYItemRenderer20);
        org.junit.Assert.assertNull(collection23);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        boolean boolean21 = xYPlot4.removeDomainMarker((int) (byte) 0, marker19, layer20);
        java.awt.Paint paint22 = xYPlot4.getBackgroundPaint();
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.RenderingSource renderingSource26 = null;
        xYPlot4.select((double) (short) 10, (double) (short) 10, rectangle2D25, renderingSource26);
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = xYPlot4.getRangeMarkers((int) (short) 10, layer29);
        boolean boolean31 = xYPlot4.canSelectByPoint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getDomainAxis((int) (byte) 100);
        xYPlot4.setDomainCrosshairValue((double) 1L);
        java.awt.Stroke stroke12 = xYPlot4.getRangeMinorGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot17.getIndexOf(xYItemRenderer19);
        float float21 = xYPlot17.getBackgroundAlpha();
        java.awt.Stroke stroke22 = xYPlot17.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = xYPlot17.getRangeAxisEdge();
        java.awt.Paint paint24 = xYPlot17.getNoDataMessagePaint();
        xYPlot4.setDomainTickBandPaint(paint24);
        xYPlot4.clearDomainMarkers((-1));
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot(xYDataset28, valueAxis29, valueAxis30, xYItemRenderer31);
        org.jfree.chart.plot.Marker marker34 = null;
        org.jfree.chart.util.Layer layer35 = null;
        boolean boolean36 = xYPlot32.removeDomainMarker((int) '4', marker34, layer35);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot32.setInsets(rectangleInsets37, true);
        xYPlot32.setBackgroundImageAlignment((-1));
        java.awt.Image image42 = null;
        xYPlot32.setBackgroundImage(image42);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = null;
        xYPlot32.setDrawingSupplier(drawingSupplier44);
        java.lang.String str46 = xYPlot32.getNoDataMessage();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray47 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot32.setDomainAxes(valueAxisArray47);
        xYPlot4.setDomainAxes(valueAxisArray47);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(valueAxisArray47);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getDomainAxis((int) (byte) 100);
        xYPlot4.setDomainCrosshairValue((double) 1L);
        java.awt.Stroke stroke12 = xYPlot4.getRangeMinorGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot17.getIndexOf(xYItemRenderer19);
        float float21 = xYPlot17.getBackgroundAlpha();
        java.awt.Stroke stroke22 = xYPlot17.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = xYPlot17.getRangeAxisEdge();
        java.awt.Paint paint24 = xYPlot17.getNoDataMessagePaint();
        xYPlot4.setDomainTickBandPaint(paint24);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis[] valueAxisArray27 = new org.jfree.chart.axis.ValueAxis[] { valueAxis26 };
        xYPlot4.setDomainAxes(valueAxisArray27);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = xYPlot4.getDomainAxisEdge();
        boolean boolean30 = xYPlot4.isDomainZeroBaselineVisible();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(valueAxisArray27);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        double double10 = xYPlot4.getRangeCrosshairValue();
        org.jfree.data.xy.XYDataset xYDataset11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        org.jfree.chart.plot.XYPlot xYPlot15 = new org.jfree.chart.plot.XYPlot(xYDataset11, valueAxis12, valueAxis13, xYItemRenderer14);
        java.awt.Stroke stroke16 = xYPlot15.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot15.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo19, point2D20);
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        xYPlot15.setDataset((int) (short) 0, xYDataset23);
        xYPlot15.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        int int29 = xYPlot15.getIndexOf(xYItemRenderer28);
        java.awt.Stroke stroke30 = xYPlot15.getDomainMinorGridlineStroke();
        xYPlot4.setRangeGridlineStroke(stroke30);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = xYPlot4.getRenderer();
        org.jfree.chart.plot.Plot plot33 = xYPlot4.getRootPlot();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(xYItemRenderer32);
        org.junit.Assert.assertNotNull(plot33);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = xYPlot4.getDrawingSupplier();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(drawingSupplier7);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        int int23 = xYPlot4.getBackgroundImageAlignment();
        boolean boolean24 = xYPlot4.isRangeZoomable();
        xYPlot4.zoom(100.0d);
        java.awt.Paint paint27 = xYPlot4.getDomainGridlinePaint();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        xYPlot4.setDomainAxis((int) (byte) 10, valueAxis29);
        java.awt.Paint paint31 = xYPlot4.getOutlinePaint();
        xYPlot4.setForegroundAlpha((float) 0);
        org.jfree.data.xy.XYDataset xYDataset34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        org.jfree.chart.plot.XYPlot xYPlot38 = new org.jfree.chart.plot.XYPlot(xYDataset34, valueAxis35, valueAxis36, xYItemRenderer37);
        org.jfree.chart.axis.AxisSpace axisSpace39 = null;
        xYPlot38.setFixedRangeAxisSpace(axisSpace39, false);
        org.jfree.chart.axis.ValueAxis valueAxis42 = xYPlot38.getRangeAxis();
        xYPlot38.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer44 = xYPlot38.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = xYPlot38.getAxisOffset();
        xYPlot38.setNotify(false);
        xYPlot38.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke50 = xYPlot38.getRangeCrosshairStroke();
        java.awt.Image image51 = null;
        xYPlot38.setBackgroundImage(image51);
        java.awt.Paint paint53 = xYPlot38.getRangeZeroBaselinePaint();
        xYPlot4.setRangeCrosshairPaint(paint53);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(valueAxis42);
        org.junit.Assert.assertNull(xYItemRenderer44);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(paint53);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets9, true);
        xYPlot4.setBackgroundImageAlignment((-1));
        java.awt.Image image14 = null;
        xYPlot4.setBackgroundImage(image14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        xYPlot4.setDrawingSupplier(drawingSupplier16);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        java.awt.Stroke stroke23 = xYPlot22.getRangeCrosshairStroke();
        xYPlot22.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        xYPlot22.zoomRangeAxes(0.0d, plotRenderingInfo27, point2D28);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder30 = xYPlot22.getDatasetRenderingOrder();
        xYPlot22.setRangeCrosshairValue((double) ' ', false);
        org.jfree.data.xy.XYDataset xYDataset34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        org.jfree.chart.plot.XYPlot xYPlot38 = new org.jfree.chart.plot.XYPlot(xYDataset34, valueAxis35, valueAxis36, xYItemRenderer37);
        org.jfree.chart.axis.AxisSpace axisSpace39 = null;
        xYPlot38.setFixedRangeAxisSpace(axisSpace39, false);
        org.jfree.chart.axis.ValueAxis valueAxis42 = xYPlot38.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        int int44 = xYPlot38.getRangeAxisIndex(valueAxis43);
        boolean boolean45 = xYPlot38.isRangeGridlinesVisible();
        boolean boolean46 = xYPlot38.isRangePannable();
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot(xYDataset47, valueAxis48, valueAxis49, xYItemRenderer50);
        org.jfree.chart.axis.AxisSpace axisSpace52 = null;
        xYPlot51.setFixedRangeAxisSpace(axisSpace52, false);
        org.jfree.chart.axis.ValueAxis valueAxis55 = xYPlot51.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        int int57 = xYPlot51.getRangeAxisIndex(valueAxis56);
        boolean boolean58 = xYPlot51.isRangeGridlinesVisible();
        org.jfree.chart.axis.ValueAxis valueAxis59 = xYPlot51.getDomainAxis();
        org.jfree.data.xy.XYDataset xYDataset60 = null;
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.axis.ValueAxis valueAxis62 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer63 = null;
        org.jfree.chart.plot.XYPlot xYPlot64 = new org.jfree.chart.plot.XYPlot(xYDataset60, valueAxis61, valueAxis62, xYItemRenderer63);
        java.awt.Stroke stroke65 = xYPlot64.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo68 = null;
        java.awt.geom.Point2D point2D69 = null;
        xYPlot64.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo68, point2D69);
        org.jfree.data.xy.XYDataset xYDataset72 = null;
        xYPlot64.setDataset((int) (short) 0, xYDataset72);
        xYPlot64.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets77 = xYPlot64.getAxisOffset();
        org.jfree.data.xy.XYDataset xYDataset78 = null;
        org.jfree.chart.axis.ValueAxis valueAxis79 = null;
        org.jfree.chart.axis.ValueAxis valueAxis80 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer81 = null;
        org.jfree.chart.plot.XYPlot xYPlot82 = new org.jfree.chart.plot.XYPlot(xYDataset78, valueAxis79, valueAxis80, xYItemRenderer81);
        org.jfree.chart.axis.AxisSpace axisSpace83 = null;
        xYPlot82.setFixedRangeAxisSpace(axisSpace83, false);
        org.jfree.chart.axis.ValueAxis valueAxis86 = xYPlot82.getRangeAxis();
        xYPlot82.clearRangeMarkers();
        java.awt.Stroke stroke88 = xYPlot82.getRangeZeroBaselineStroke();
        xYPlot64.setRangeCrosshairStroke(stroke88);
        xYPlot51.setDomainGridlineStroke(stroke88);
        xYPlot38.setDomainMinorGridlineStroke(stroke88);
        xYPlot22.setRangeMinorGridlineStroke(stroke88);
        xYPlot4.setDomainZeroBaselineStroke(stroke88);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(datasetRenderingOrder30);
        org.junit.Assert.assertNull(valueAxis42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(valueAxis55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(valueAxis59);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(rectangleInsets77);
        org.junit.Assert.assertNull(valueAxis86);
        org.junit.Assert.assertNotNull(stroke88);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        xYPlot4.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot4.zoomDomainAxes((double) (byte) 1, plotRenderingInfo15, point2D16);
        int int18 = xYPlot4.getBackgroundImageAlignment();
        java.awt.Paint paint19 = xYPlot4.getDomainZeroBaselinePaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        int int21 = xYPlot4.getIndexOf(xYItemRenderer20);
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        xYPlot26.setFixedRangeAxisSpace(axisSpace27, false);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot26.getRangeAxis();
        xYPlot26.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot26.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        org.jfree.chart.plot.XYPlot xYPlot38 = new org.jfree.chart.plot.XYPlot(xYDataset34, valueAxis35, valueAxis36, xYItemRenderer37);
        org.jfree.chart.axis.AxisSpace axisSpace39 = null;
        xYPlot38.setFixedRangeAxisSpace(axisSpace39, false);
        org.jfree.chart.axis.ValueAxis valueAxis42 = xYPlot38.getRangeAxis();
        xYPlot38.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer44 = xYPlot38.getRenderer();
        java.awt.Paint paint45 = xYPlot38.getDomainZeroBaselinePaint();
        xYPlot26.setDomainGridlinePaint(paint45);
        xYPlot26.clearRangeMarkers();
        xYPlot26.setNotify(true);
        xYPlot26.mapDatasetToRangeAxis(0, (int) (byte) -1);
        java.awt.Paint paint53 = xYPlot26.getRangeGridlinePaint();
        xYPlot4.setRangeCrosshairPaint(paint53);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(valueAxis42);
        org.junit.Assert.assertNull(xYItemRenderer44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint53);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        boolean boolean14 = xYPlot4.isRangeGridlinesVisible();
        xYPlot4.clearAnnotations();
        xYPlot4.setWeight(10);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        xYPlot4.setForegroundAlpha((float) (byte) 10);
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot(xYDataset25, valueAxis26, valueAxis27, xYItemRenderer28);
        java.awt.Stroke stroke30 = xYPlot29.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        xYPlot29.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo33, point2D34);
        org.jfree.data.xy.XYDataset xYDataset37 = null;
        xYPlot29.setDataset((int) (short) 0, xYDataset37);
        xYPlot29.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker42 = null;
        boolean boolean43 = xYPlot29.removeDomainMarker(marker42);
        org.jfree.chart.util.RectangleEdge rectangleEdge44 = xYPlot29.getRangeAxisEdge();
        int int45 = xYPlot29.getRendererCount();
        org.jfree.chart.axis.AxisLocation axisLocation46 = xYPlot29.getDomainAxisLocation();
        org.jfree.chart.LegendItemCollection legendItemCollection47 = xYPlot29.getFixedLegendItems();
        org.jfree.data.xy.XYDataset xYDataset48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer51 = null;
        org.jfree.chart.plot.XYPlot xYPlot52 = new org.jfree.chart.plot.XYPlot(xYDataset48, valueAxis49, valueAxis50, xYItemRenderer51);
        java.awt.Stroke stroke53 = xYPlot52.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo56 = null;
        java.awt.geom.Point2D point2D57 = null;
        xYPlot52.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo56, point2D57);
        org.jfree.data.xy.XYDataset xYDataset60 = null;
        xYPlot52.setDataset((int) (short) 0, xYDataset60);
        xYPlot52.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker65 = null;
        boolean boolean66 = xYPlot52.removeDomainMarker(marker65);
        org.jfree.chart.util.RectangleEdge rectangleEdge67 = xYPlot52.getRangeAxisEdge();
        int int68 = xYPlot52.getRendererCount();
        org.jfree.chart.axis.AxisLocation axisLocation69 = xYPlot52.getDomainAxisLocation();
        boolean boolean70 = xYPlot52.isDomainZoomable();
        xYPlot52.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier73 = xYPlot52.getDrawingSupplier();
        xYPlot29.setDrawingSupplier(drawingSupplier73);
        xYPlot4.setDrawingSupplier(drawingSupplier73);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rectangleEdge44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(axisLocation46);
        org.junit.Assert.assertNull(legendItemCollection47);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(rectangleEdge67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(axisLocation69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(drawingSupplier73);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        xYPlot4.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation10 = xYPlot4.getOrientation();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getInsets();
        java.awt.Image image12 = null;
        xYPlot4.setBackgroundImage(image12);
        boolean boolean14 = xYPlot4.isRangePannable();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(plotOrientation10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getDomainAxis((int) (byte) 100);
        xYPlot4.setDomainCrosshairValue((double) 1L);
        boolean boolean12 = xYPlot4.isOutlineVisible();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        xYPlot17.setFixedRangeAxisSpace(axisSpace18, false);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot17.getRangeAxis();
        xYPlot17.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = xYPlot17.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = xYPlot17.getAxisOffset();
        xYPlot17.setNotify(false);
        xYPlot17.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke29 = xYPlot17.getRangeCrosshairStroke();
        xYPlot4.setRangeGridlineStroke(stroke29);
        org.jfree.data.xy.XYDataset xYDataset32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer35 = null;
        org.jfree.chart.plot.XYPlot xYPlot36 = new org.jfree.chart.plot.XYPlot(xYDataset32, valueAxis33, valueAxis34, xYItemRenderer35);
        org.jfree.chart.axis.AxisSpace axisSpace37 = null;
        xYPlot36.setFixedRangeAxisSpace(axisSpace37, false);
        org.jfree.chart.axis.ValueAxis valueAxis40 = xYPlot36.getRangeAxis();
        xYPlot36.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation43 = xYPlot36.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset44 = null;
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer47 = null;
        org.jfree.chart.plot.XYPlot xYPlot48 = new org.jfree.chart.plot.XYPlot(xYDataset44, valueAxis45, valueAxis46, xYItemRenderer47);
        org.jfree.chart.axis.AxisSpace axisSpace49 = null;
        xYPlot48.setFixedRangeAxisSpace(axisSpace49, false);
        org.jfree.chart.axis.ValueAxis valueAxis52 = xYPlot48.getRangeAxis();
        xYPlot48.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer54 = xYPlot48.getRenderer();
        java.awt.Paint paint55 = xYPlot48.getDomainZeroBaselinePaint();
        xYPlot36.setDomainGridlinePaint(paint55);
        xYPlot4.setQuadrantPaint((int) (byte) 0, paint55);
        org.jfree.chart.plot.Marker marker59 = null;
        org.jfree.chart.util.Layer layer60 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addRangeMarker(11, marker59, layer60, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertNull(xYItemRenderer23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertNull(valueAxis52);
        org.junit.Assert.assertNull(xYItemRenderer54);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = xYPlot4.getAxisOffset();
        org.jfree.chart.plot.Plot plot15 = null;
        xYPlot4.setParent(plot15);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        java.awt.Stroke stroke23 = xYPlot22.getRangeCrosshairStroke();
        xYPlot22.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        xYPlot22.zoomRangeAxes(0.0d, plotRenderingInfo27, point2D28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        xYPlot22.panRangeAxes((double) (byte) 1, plotRenderingInfo31, point2D32);
        float float34 = xYPlot22.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation36 = xYPlot22.getRangeAxisLocation((int) (short) 100);
        xYPlot4.setRangeAxisLocation(10, axisLocation36);
        java.awt.Font font38 = xYPlot4.getNoDataMessageFont();
        xYPlot4.setWeight((int) (byte) 0);
        org.jfree.chart.axis.AxisSpace axisSpace41 = xYPlot4.getFixedDomainAxisSpace();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer43 = xYPlot4.getRenderer((int) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        xYPlot4.setDomainAxis((int) (short) 100, valueAxis45, true);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation36);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNull(axisSpace41);
        org.junit.Assert.assertNull(xYItemRenderer43);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot4.setBackgroundAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation25 = xYPlot4.getRangeAxisLocation();
        xYPlot4.setDomainPannable(true);
        xYPlot4.setRangeGridlinesVisible(false);
        int int30 = xYPlot4.getWeight();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        java.awt.Image image12 = xYPlot4.getBackgroundImage();
        boolean boolean13 = xYPlot4.isDomainCrosshairVisible();
        xYPlot4.setRangeZeroBaselineVisible(false);
        org.jfree.data.xy.XYDataset xYDataset16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        org.jfree.chart.plot.XYPlot xYPlot20 = new org.jfree.chart.plot.XYPlot(xYDataset16, valueAxis17, valueAxis18, xYItemRenderer19);
        java.awt.Stroke stroke21 = xYPlot20.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot20.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo24, point2D25);
        xYPlot20.setDomainCrosshairLockedOnData(false);
        org.jfree.chart.renderer.xy.XYItemRenderer[] xYItemRendererArray29 = new org.jfree.chart.renderer.xy.XYItemRenderer[] {};
        xYPlot20.setRenderers(xYItemRendererArray29);
        xYPlot4.setRenderers(xYItemRendererArray29);
        java.awt.Stroke stroke32 = xYPlot4.getDomainGridlineStroke();
        java.awt.Stroke stroke33 = xYPlot4.getRangeGridlineStroke();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(xYItemRendererArray29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        xYPlot4.zoomDomainAxes(0.0d, plotRenderingInfo11, point2D12);
        org.jfree.chart.util.Layer layer14 = null;
        java.util.Collection collection15 = xYPlot4.getRangeMarkers(layer14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = xYPlot4.getDomainAxisIndex(valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        xYPlot4.setRangeAxis(100, valueAxis19);
        boolean boolean21 = xYPlot4.isDomainCrosshairLockedOnData();
        org.jfree.chart.axis.AxisLocation axisLocation22 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setDomainAxisLocation(axisLocation22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(collection15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        java.awt.Stroke stroke12 = xYPlot11.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        int int14 = xYPlot11.getIndexOf(xYItemRenderer13);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        xYPlot11.setRangeAxis((int) 'a', valueAxis16);
        boolean boolean18 = xYPlot11.canSelectByRegion();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot11.getRangeAxisLocation((int) (byte) -1);
        xYPlot4.setDomainAxisLocation(axisLocation20);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(axisLocation20);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        xYPlot4.setWeight((int) '4');
        int int13 = xYPlot4.getDatasetCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot4.getRangeAxisForDataset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index -1 out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        int int18 = xYPlot4.getIndexOf(xYItemRenderer17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot4.setDomainAxis(0, valueAxis20, true);
        org.jfree.chart.axis.AxisSpace axisSpace23 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace23);
        double double25 = xYPlot4.getDomainCrosshairValue();
        java.awt.Paint paint26 = xYPlot4.getOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot(xYDataset28, valueAxis29, valueAxis30, xYItemRenderer31);
        java.awt.Stroke stroke33 = xYPlot32.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        java.awt.geom.Point2D point2D37 = null;
        xYPlot32.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo36, point2D37);
        org.jfree.data.xy.XYDataset xYDataset40 = null;
        xYPlot32.setDataset((int) (short) 0, xYDataset40);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = xYPlot32.getAxisOffset();
        org.jfree.chart.plot.Plot plot43 = null;
        xYPlot32.setParent(plot43);
        xYPlot32.mapDatasetToDomainAxis((int) (short) 100, (int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation48 = xYPlot32.getDomainAxisLocation();
        xYPlot4.setDomainAxisLocation((int) (byte) 0, axisLocation48);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertNotNull(axisLocation48);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge((int) (short) 0);
        xYPlot4.setDomainGridlinesVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot4.zoomRangeAxes((double) (-1.0f), plotRenderingInfo14, point2D15);
        int int17 = xYPlot4.getRangeAxisCount();
        org.jfree.chart.util.RectangleEdge rectangleEdge18 = xYPlot4.getDomainAxisEdge();
        int int19 = xYPlot4.getWeight();
        xYPlot4.clearDomainAxes();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(rectangleEdge18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot4.getRendererForDataset(xYDataset21);
        org.jfree.chart.plot.Marker marker24 = null;
        org.jfree.chart.util.Layer layer25 = null;
        boolean boolean27 = xYPlot4.removeDomainMarker((int) (byte) 0, marker24, layer25, true);
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot(xYDataset28, valueAxis29, valueAxis30, xYItemRenderer31);
        java.awt.Stroke stroke33 = xYPlot32.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        int int35 = xYPlot32.getIndexOf(xYItemRenderer34);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = xYPlot32.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint38 = xYPlot32.getOutlinePaint();
        xYPlot4.setDomainCrosshairPaint(paint38);
        xYPlot4.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis43 = xYPlot4.getRangeAxis(1);
        java.awt.Stroke stroke44 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Stroke stroke45 = xYPlot4.getRangeGridlineStroke();
        java.awt.Paint paint46 = xYPlot4.getDomainTickBandPaint();
        boolean boolean47 = xYPlot4.isDomainCrosshairLockedOnData();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(valueAxis43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = xYPlot4.getAxisOffset();
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder20 = xYPlot19.getSeriesRenderingOrder();
        xYPlot19.clearDomainMarkers();
        java.awt.Paint paint22 = xYPlot19.getBackgroundPaint();
        xYPlot4.setDomainMinorGridlinePaint(paint22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        xYPlot4.zoomDomainAxes((double) 0.0f, plotRenderingInfo25, point2D26, true);
        java.awt.Paint paint29 = xYPlot4.getRangeTickBandPaint();
        java.awt.Paint paint30 = xYPlot4.getDomainMinorGridlinePaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(seriesRenderingOrder20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        boolean boolean21 = xYPlot4.removeDomainMarker((int) (byte) 0, marker19, layer20);
        org.jfree.chart.plot.PlotOrientation plotOrientation22 = xYPlot4.getOrientation();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        org.jfree.chart.axis.AxisSpace axisSpace28 = null;
        xYPlot27.setFixedRangeAxisSpace(axisSpace28, false);
        org.jfree.chart.axis.ValueAxis valueAxis31 = xYPlot27.getRangeAxis();
        xYPlot27.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer39 = null;
        org.jfree.chart.plot.XYPlot xYPlot40 = new org.jfree.chart.plot.XYPlot(xYDataset36, valueAxis37, valueAxis38, xYItemRenderer39);
        java.awt.Stroke stroke41 = xYPlot40.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        int int43 = xYPlot40.getIndexOf(xYItemRenderer42);
        float float44 = xYPlot40.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer48 = null;
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot(xYDataset45, valueAxis46, valueAxis47, xYItemRenderer48);
        org.jfree.chart.axis.AxisSpace axisSpace50 = null;
        xYPlot49.setFixedRangeAxisSpace(axisSpace50, false);
        org.jfree.chart.axis.ValueAxis valueAxis53 = xYPlot49.getRangeAxis();
        xYPlot49.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation56 = xYPlot49.getRangeAxisLocation((int) (short) -1);
        xYPlot40.setRangeAxisLocation(axisLocation56, false);
        xYPlot27.setDomainAxisLocation((int) (byte) 10, axisLocation56);
        xYPlot27.setDomainCrosshairValue((double) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo63 = null;
        java.awt.geom.Point2D point2D64 = null;
        xYPlot27.panRangeAxes((double) (-1), plotRenderingInfo63, point2D64);
        org.jfree.chart.util.RectangleEdge rectangleEdge67 = xYPlot27.getDomainAxisEdge((int) 'a');
        java.awt.Stroke stroke68 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot27.setRangeGridlineStroke(stroke68);
        xYPlot4.setRangeCrosshairStroke(stroke68);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(plotOrientation22);
        org.junit.Assert.assertNull(valueAxis31);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNull(valueAxis53);
        org.junit.Assert.assertNotNull(axisLocation56);
        org.junit.Assert.assertNotNull(rectangleEdge67);
        org.junit.Assert.assertNotNull(stroke68);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        int int7 = xYPlot4.getSeriesCount();
        org.jfree.data.general.DatasetGroup datasetGroup8 = xYPlot4.getDatasetGroup();
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(rectangleEdge9);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot4.getRangeAxis();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = null;
        xYPlot4.setRenderer((int) (byte) 0, xYItemRenderer22);
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        xYPlot4.setDataset(xYDataset24);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(valueAxis20);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        xYPlot4.clearRangeMarkers();
        java.awt.Paint paint24 = xYPlot4.getRangeTickBandPaint();
        boolean boolean25 = xYPlot4.isRangeMinorGridlinesVisible();
        java.awt.Stroke stroke26 = xYPlot4.getDomainMinorGridlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        xYPlot4.axisChanged(axisChangeEvent27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        java.awt.Stroke stroke36 = xYPlot35.getRangeCrosshairStroke();
        xYPlot35.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        java.awt.geom.Point2D point2D41 = null;
        xYPlot35.zoomRangeAxes(0.0d, plotRenderingInfo40, point2D41);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        java.awt.geom.Point2D point2D45 = null;
        xYPlot35.panRangeAxes((double) (byte) 1, plotRenderingInfo44, point2D45);
        xYPlot35.setRangeMinorGridlinesVisible(false);
        java.awt.geom.Point2D point2D49 = xYPlot35.getQuadrantOrigin();
        xYPlot4.zoomRangeAxes((double) 0L, plotRenderingInfo30, point2D49);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(point2D49);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        xYPlot4.setDomainCrosshairLockedOnData(false);
        xYPlot4.setDomainZeroBaselineVisible(false);
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        java.awt.Stroke stroke20 = xYPlot19.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        xYPlot19.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo23, point2D24);
        org.jfree.data.xy.XYDataset xYDataset27 = null;
        xYPlot19.setDataset((int) (short) 0, xYDataset27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = xYPlot19.getAxisOffset();
        org.jfree.chart.plot.Plot plot30 = null;
        xYPlot19.setParent(plot30);
        org.jfree.data.xy.XYDataset xYDataset33 = null;
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer36 = null;
        org.jfree.chart.plot.XYPlot xYPlot37 = new org.jfree.chart.plot.XYPlot(xYDataset33, valueAxis34, valueAxis35, xYItemRenderer36);
        java.awt.Stroke stroke38 = xYPlot37.getRangeCrosshairStroke();
        xYPlot37.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        java.awt.geom.Point2D point2D43 = null;
        xYPlot37.zoomRangeAxes(0.0d, plotRenderingInfo42, point2D43);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        java.awt.geom.Point2D point2D47 = null;
        xYPlot37.panRangeAxes((double) (byte) 1, plotRenderingInfo46, point2D47);
        float float49 = xYPlot37.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation51 = xYPlot37.getRangeAxisLocation((int) (short) 100);
        xYPlot19.setRangeAxisLocation(10, axisLocation51);
        java.awt.Stroke stroke53 = xYPlot19.getRangeCrosshairStroke();
        xYPlot4.setDomainMinorGridlineStroke(stroke53);
        int int55 = xYPlot4.getDomainAxisCount();
        org.jfree.data.xy.XYDataset xYDataset56 = null;
        xYPlot4.setDataset(xYDataset56);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation51);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        xYPlot16.setFixedRangeAxisSpace(axisSpace17, false);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot16.getRangeAxis();
        xYPlot16.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot16.getRenderer();
        java.awt.Paint paint23 = xYPlot16.getDomainZeroBaselinePaint();
        xYPlot4.setDomainGridlinePaint(paint23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        xYPlot4.drawBackgroundImage(graphics2D25, rectangle2D26);
        java.awt.Stroke stroke28 = xYPlot4.getDomainMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot4.getRangeAxis((int) '#');
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(valueAxis30);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot17.getIndexOf(xYItemRenderer19);
        float float21 = xYPlot17.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        xYPlot26.setFixedRangeAxisSpace(axisSpace27, false);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot26.getRangeAxis();
        xYPlot26.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot26.getRangeAxisLocation((int) (short) -1);
        xYPlot17.setRangeAxisLocation(axisLocation33, false);
        xYPlot4.setDomainAxisLocation((int) (byte) 10, axisLocation33);
        xYPlot4.setDomainCrosshairValue((double) 0);
        xYPlot4.clearRangeMarkers();
        java.awt.Paint paint40 = xYPlot4.getRangeTickBandPaint();
        org.jfree.chart.util.Layer layer42 = null;
        java.util.Collection collection43 = xYPlot4.getDomainMarkers((int) (byte) 10, layer42);
        org.jfree.chart.util.RectangleEdge rectangleEdge45 = xYPlot4.getRangeAxisEdge((-1));
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNull(collection43);
        org.junit.Assert.assertNotNull(rectangleEdge45);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        xYPlot4.markerChanged(markerChangeEvent10);
        int int12 = xYPlot4.getDomainAxisCount();
        xYPlot4.setDomainCrosshairVisible(false);
        java.awt.Paint paint15 = xYPlot4.getBackgroundPaint();
        org.jfree.chart.axis.AxisSpace axisSpace16 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace16, true);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        xYPlot4.setRangeZeroBaselineVisible(true);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        xYPlot17.setFixedRangeAxisSpace(axisSpace18, false);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot17.getRangeAxis();
        xYPlot17.clearRangeMarkers();
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        org.jfree.chart.axis.AxisSpace axisSpace28 = null;
        xYPlot27.setFixedRangeAxisSpace(axisSpace28, false);
        org.jfree.chart.axis.ValueAxis valueAxis31 = xYPlot27.getRangeAxis();
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        int int33 = xYPlot27.getRangeAxisIndex(valueAxis32);
        boolean boolean34 = xYPlot27.isRangeGridlinesVisible();
        boolean boolean35 = xYPlot27.canSelectByPoint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        xYPlot27.removeChangeListener(plotChangeListener36);
        java.awt.Paint paint38 = xYPlot27.getNoDataMessagePaint();
        xYPlot17.setOutlinePaint(paint38);
        xYPlot4.setRangeGridlinePaint(paint38);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = xYPlot4.getInsets();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent42 = null;
        xYPlot4.datasetChanged(datasetChangeEvent42);
        xYPlot4.clearRangeMarkers();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertNull(valueAxis31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(rectangleInsets41);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder10 = xYPlot4.getSeriesRenderingOrder();
        xYPlot4.configureRangeAxes();
        xYPlot4.clearDomainMarkers();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(seriesRenderingOrder10);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot4.zoomDomainAxes((double) (-1), 10.0d, plotRenderingInfo19, point2D20);
        java.awt.Stroke stroke22 = xYPlot4.getOutlineStroke();
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot(xYDataset24, valueAxis25, valueAxis26, xYItemRenderer27);
        java.awt.Stroke stroke29 = xYPlot28.getRangeCrosshairStroke();
        xYPlot28.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        xYPlot28.zoomRangeAxes(0.0d, plotRenderingInfo33, point2D34);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        xYPlot28.panRangeAxes((double) (byte) 1, plotRenderingInfo37, point2D38);
        xYPlot28.setRangeMinorGridlinesVisible(false);
        boolean boolean42 = xYPlot28.isRangeMinorGridlinesVisible();
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        org.jfree.data.xy.XYDataset xYDataset45 = null;
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer48 = null;
        org.jfree.chart.plot.XYPlot xYPlot49 = new org.jfree.chart.plot.XYPlot(xYDataset45, valueAxis46, valueAxis47, xYItemRenderer48);
        java.awt.Stroke stroke50 = xYPlot49.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer51 = null;
        int int52 = xYPlot49.getIndexOf(xYItemRenderer51);
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        xYPlot49.setRangeAxis((int) 'a', valueAxis54);
        int int56 = xYPlot49.getBackgroundImageAlignment();
        int int57 = xYPlot49.getBackgroundImageAlignment();
        java.util.List list58 = xYPlot49.getAnnotations();
        xYPlot28.drawDomainTickBands(graphics2D43, rectangle2D44, list58);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.mapDatasetToRangeAxes((int) ' ', list58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 15 + "'", int56 == 15);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 15 + "'", int57 == 15);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        xYPlot16.setFixedRangeAxisSpace(axisSpace17, false);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot16.getRangeAxis();
        xYPlot16.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot16.getRenderer();
        java.awt.Paint paint23 = xYPlot16.getDomainZeroBaselinePaint();
        xYPlot4.setDomainGridlinePaint(paint23);
        xYPlot4.setRangeMinorGridlinesVisible(true);
        java.awt.Paint paint27 = xYPlot4.getNoDataMessagePaint();
        java.awt.Stroke stroke28 = xYPlot4.getOutlineStroke();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        xYPlot4.setRangeAxis(0, valueAxis12);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        xYPlot4.setRenderer(xYItemRenderer14);
        java.util.List list16 = xYPlot4.getAnnotations();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xYPlot4.removeAnnotation(xYAnnotation17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.setNoDataMessage("hi!");
        int int11 = xYPlot4.getWeight();
        org.jfree.chart.plot.Plot plot12 = xYPlot4.getParent();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getDomainAxis((int) (byte) 100);
        xYPlot4.setDomainCrosshairValue((double) 1L);
        java.awt.Paint paint12 = xYPlot4.getOutlinePaint();
        boolean boolean13 = xYPlot4.isDomainCrosshairVisible();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder13 = xYPlot12.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        xYPlot19.setFixedRangeAxisSpace(axisSpace20, false);
        org.jfree.chart.axis.ValueAxis valueAxis23 = xYPlot19.getRangeAxis();
        xYPlot19.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation26 = xYPlot19.getRangeAxisLocation((int) (short) -1);
        xYPlot12.setDomainAxisLocation(0, axisLocation26, false);
        xYPlot12.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot12.setBackgroundAlpha(0.0f);
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot12.getRangeAxisLocation();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        xYPlot12.notifyListeners(plotChangeEvent34);
        org.jfree.chart.axis.AxisLocation axisLocation36 = xYPlot12.getDomainAxisLocation();
        xYPlot4.setDomainAxisLocation(axisLocation36, true);
        org.junit.Assert.assertNotNull(seriesRenderingOrder13);
        org.junit.Assert.assertNull(valueAxis23);
        org.junit.Assert.assertNotNull(axisLocation26);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(axisLocation36);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = xYPlot4.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace13);
        xYPlot4.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.Plot plot17 = xYPlot4.getRootPlot();
        xYPlot4.setRangeCrosshairValue((double) (-1));
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertNotNull(plot17);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot4.getDomainAxisLocation();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Stroke stroke11 = xYPlot4.getRangeZeroBaselineStroke();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.chart.axis.ValueAxis valueAxis13 = xYPlot4.getDomainAxis(10);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder14 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = xYPlot4.getRendererForDataset(xYDataset15);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(valueAxis13);
        org.junit.Assert.assertNotNull(seriesRenderingOrder14);
        org.junit.Assert.assertNull(xYItemRenderer16);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Paint paint9 = xYPlot4.getDomainGridlinePaint();
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        boolean boolean18 = xYPlot14.removeDomainMarker((int) '4', marker16, layer17);
        xYPlot14.clearRangeAxes();
        java.awt.Paint paint20 = xYPlot14.getDomainGridlinePaint();
        xYPlot4.setDomainZeroBaselinePaint(paint20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        int int23 = xYPlot4.getRangeAxisIndex(valueAxis22);
        xYPlot4.setDomainCrosshairValue((double) (short) 1);
        org.jfree.chart.plot.Marker marker27 = null;
        org.jfree.chart.util.Layer layer28 = null;
        boolean boolean30 = xYPlot4.removeDomainMarker((-1), marker27, layer28, false);
        xYPlot4.configureRangeAxes();
        java.awt.Font font32 = xYPlot4.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        xYPlot16.setFixedRangeAxisSpace(axisSpace17, false);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot16.getRangeAxis();
        xYPlot16.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot16.getRenderer();
        java.awt.Paint paint23 = xYPlot16.getDomainZeroBaselinePaint();
        xYPlot4.setDomainGridlinePaint(paint23);
        xYPlot4.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        xYPlot4.setRangeAxis((int) ' ', valueAxis28);
        xYPlot4.setRangeCrosshairValue((double) (byte) 10, false);
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        org.jfree.chart.RenderingSource renderingSource36 = null;
        xYPlot4.select((double) 97.0f, (double) 1L, rectangle2D35, renderingSource36);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        xYPlot4.setDomainCrosshairValue((double) 0L, true);
        xYPlot4.setRangeCrosshairLockedOnData(true);
        int int22 = xYPlot4.getSeriesCount();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = xYPlot4.getRenderer((-1));
        xYPlot4.clearRangeMarkers((int) (short) -1);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(xYItemRenderer24);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        xYPlot4.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot4.zoomDomainAxes((double) (byte) 1, plotRenderingInfo15, point2D16);
        int int18 = xYPlot4.getBackgroundImageAlignment();
        java.awt.Paint paint19 = xYPlot4.getDomainZeroBaselinePaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        int int21 = xYPlot4.getIndexOf(xYItemRenderer20);
        java.util.List list22 = xYPlot4.getAnnotations();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = xYPlot4.getAxisOffset();
        int int15 = xYPlot4.getBackgroundImageAlignment();
        xYPlot4.clearDomainAxes();
        int int17 = xYPlot4.getDatasetCount();
        float float18 = xYPlot4.getBackgroundImageAlpha();
        java.awt.Font font19 = xYPlot4.getNoDataMessageFont();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        int int21 = xYPlot4.getDomainAxisIndex(valueAxis20);
        java.awt.Paint paint22 = xYPlot4.getDomainCrosshairPaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.data.Range range12 = xYPlot4.getDataRange(valueAxis11);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot17.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo21, point2D22);
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        xYPlot17.setDataset((int) (short) 0, xYDataset25);
        xYPlot17.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = xYPlot17.getAxisOffset();
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        xYPlot35.setFixedRangeAxisSpace(axisSpace36, false);
        org.jfree.chart.axis.ValueAxis valueAxis39 = xYPlot35.getRangeAxis();
        xYPlot35.clearRangeMarkers();
        java.awt.Stroke stroke41 = xYPlot35.getRangeZeroBaselineStroke();
        xYPlot17.setRangeCrosshairStroke(stroke41);
        java.awt.Stroke stroke43 = xYPlot17.getOutlineStroke();
        xYPlot4.setDomainMinorGridlineStroke(stroke43);
        org.jfree.data.xy.XYDataset xYDataset46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer49 = null;
        org.jfree.chart.plot.XYPlot xYPlot50 = new org.jfree.chart.plot.XYPlot(xYDataset46, valueAxis47, valueAxis48, xYItemRenderer49);
        java.awt.Stroke stroke51 = xYPlot50.getRangeCrosshairStroke();
        xYPlot50.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = null;
        java.awt.geom.Point2D point2D56 = null;
        xYPlot50.zoomRangeAxes(0.0d, plotRenderingInfo55, point2D56);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        java.awt.geom.Point2D point2D60 = null;
        xYPlot50.panRangeAxes((double) (byte) 1, plotRenderingInfo59, point2D60);
        xYPlot50.setRangeMinorGridlinesVisible(false);
        boolean boolean64 = xYPlot50.isRangeMinorGridlinesVisible();
        java.awt.Graphics2D graphics2D65 = null;
        java.awt.geom.Rectangle2D rectangle2D66 = null;
        org.jfree.data.xy.XYDataset xYDataset67 = null;
        org.jfree.chart.axis.ValueAxis valueAxis68 = null;
        org.jfree.chart.axis.ValueAxis valueAxis69 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer70 = null;
        org.jfree.chart.plot.XYPlot xYPlot71 = new org.jfree.chart.plot.XYPlot(xYDataset67, valueAxis68, valueAxis69, xYItemRenderer70);
        java.awt.Stroke stroke72 = xYPlot71.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer73 = null;
        int int74 = xYPlot71.getIndexOf(xYItemRenderer73);
        org.jfree.chart.axis.ValueAxis valueAxis76 = null;
        xYPlot71.setRangeAxis((int) 'a', valueAxis76);
        int int78 = xYPlot71.getBackgroundImageAlignment();
        int int79 = xYPlot71.getBackgroundImageAlignment();
        java.util.List list80 = xYPlot71.getAnnotations();
        xYPlot50.drawDomainTickBands(graphics2D65, rectangle2D66, list80);
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.mapDatasetToDomainAxes((int) ' ', list80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNull(range12);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNull(valueAxis39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(stroke72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 15 + "'", int78 == 15);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 15 + "'", int79 == 15);
        org.junit.Assert.assertNotNull(list80);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot4.getRendererForDataset(xYDataset21);
        org.jfree.chart.plot.Marker marker24 = null;
        org.jfree.chart.util.Layer layer25 = null;
        boolean boolean27 = xYPlot4.removeDomainMarker((int) (byte) 0, marker24, layer25, true);
        org.jfree.data.xy.XYDataset xYDataset28 = null;
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        org.jfree.chart.plot.XYPlot xYPlot32 = new org.jfree.chart.plot.XYPlot(xYDataset28, valueAxis29, valueAxis30, xYItemRenderer31);
        java.awt.Stroke stroke33 = xYPlot32.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        int int35 = xYPlot32.getIndexOf(xYItemRenderer34);
        org.jfree.chart.util.RectangleEdge rectangleEdge37 = xYPlot32.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint38 = xYPlot32.getOutlinePaint();
        xYPlot4.setDomainCrosshairPaint(paint38);
        xYPlot4.setRangeCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis43 = xYPlot4.getRangeAxis(1);
        java.awt.Stroke stroke44 = xYPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        xYPlot4.markerChanged(markerChangeEvent45);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(valueAxis43);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        xYPlot4.setDomainCrosshairValue((double) 0L, true);
        java.awt.Paint paint20 = xYPlot4.getDomainCrosshairPaint();
        xYPlot4.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot17.getIndexOf(xYItemRenderer19);
        float float21 = xYPlot17.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        xYPlot26.setFixedRangeAxisSpace(axisSpace27, false);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot26.getRangeAxis();
        xYPlot26.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot26.getRangeAxisLocation((int) (short) -1);
        xYPlot17.setRangeAxisLocation(axisLocation33, false);
        xYPlot4.setDomainAxisLocation((int) (byte) 10, axisLocation33);
        xYPlot4.setDomainCrosshairValue((double) 0);
        xYPlot4.clearRangeMarkers();
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        xYPlot4.drawBackgroundImage(graphics2D40, rectangle2D41);
        org.jfree.data.xy.XYDataset xYDataset44 = xYPlot4.getDataset((int) (byte) 100);
        java.lang.Object obj45 = xYPlot4.clone();
        xYPlot4.setRangeCrosshairVisible(true);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNull(xYDataset44);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        int int17 = xYPlot4.getDomainAxisCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation18 = xYPlot4.getOrientation();
        java.lang.String str19 = xYPlot4.getPlotType();
        org.jfree.chart.plot.Plot plot20 = xYPlot4.getParent();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(plotOrientation18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "XY Plot" + "'", str19, "XY Plot");
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = xYPlot4.getDomainAxis((int) (byte) 100);
        xYPlot4.setDomainCrosshairValue((double) 1L);
        boolean boolean12 = xYPlot4.isOutlineVisible();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        xYPlot17.setFixedRangeAxisSpace(axisSpace18, false);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot17.getRangeAxis();
        xYPlot17.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = xYPlot17.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = xYPlot17.getAxisOffset();
        xYPlot17.setNotify(false);
        xYPlot17.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke29 = xYPlot17.getRangeCrosshairStroke();
        xYPlot4.setRangeGridlineStroke(stroke29);
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        java.awt.Stroke stroke36 = xYPlot35.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        int int38 = xYPlot35.getIndexOf(xYItemRenderer37);
        float float39 = xYPlot35.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer43 = null;
        org.jfree.chart.plot.XYPlot xYPlot44 = new org.jfree.chart.plot.XYPlot(xYDataset40, valueAxis41, valueAxis42, xYItemRenderer43);
        org.jfree.chart.axis.AxisSpace axisSpace45 = null;
        xYPlot44.setFixedRangeAxisSpace(axisSpace45, false);
        org.jfree.chart.axis.ValueAxis valueAxis48 = xYPlot44.getRangeAxis();
        xYPlot44.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation51 = xYPlot44.getRangeAxisLocation((int) (short) -1);
        xYPlot35.setRangeAxisLocation(axisLocation51, false);
        java.awt.Paint paint54 = xYPlot35.getOutlinePaint();
        xYPlot4.setDomainTickBandPaint(paint54);
        org.jfree.chart.axis.AxisSpace axisSpace56 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace56, true);
        org.jfree.chart.plot.PlotOrientation plotOrientation59 = xYPlot4.getOrientation();
        xYPlot4.setDomainCrosshairValue((-1.0d));
        org.jfree.chart.plot.Marker marker62 = null;
        org.jfree.chart.util.Layer layer63 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addRangeMarker(marker62, layer63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(valueAxis9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertNull(xYItemRenderer23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNull(valueAxis48);
        org.junit.Assert.assertNotNull(axisLocation51);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(plotOrientation59);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        xYPlot4.addChangeListener(plotChangeListener11);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        xYPlot4.setBackgroundAlpha(0.0f);
        java.awt.Paint paint25 = xYPlot4.getRangeCrosshairPaint();
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace26, false);
        int int29 = xYPlot4.getDomainAxisCount();
        java.awt.Paint paint30 = xYPlot4.getRangeMinorGridlinePaint();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        boolean boolean21 = xYPlot4.isRangeCrosshairLockedOnData();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        java.awt.Stroke stroke27 = xYPlot26.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        int int29 = xYPlot26.getIndexOf(xYItemRenderer28);
        float float30 = xYPlot26.getBackgroundAlpha();
        java.awt.Image image31 = null;
        xYPlot26.setBackgroundImage(image31);
        org.jfree.chart.axis.ValueAxis valueAxis33 = xYPlot26.getRangeAxis();
        org.jfree.chart.axis.AxisLocation axisLocation34 = xYPlot26.getRangeAxisLocation();
        java.awt.Paint paint35 = xYPlot26.getRangeTickBandPaint();
        java.awt.Paint paint36 = xYPlot26.getOutlinePaint();
        xYPlot4.setBackgroundPaint(paint36);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNull(valueAxis33);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        xYPlot4.setDomainCrosshairLockedOnData(false);
        java.awt.Paint paint13 = xYPlot4.getDomainCrosshairPaint();
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace14, false);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = xYPlot4.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace13);
        org.jfree.chart.plot.Marker marker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        boolean boolean19 = xYPlot4.removeDomainMarker((int) '4', marker16, layer17, false);
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        java.awt.Stroke stroke25 = xYPlot24.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        int int27 = xYPlot24.getIndexOf(xYItemRenderer26);
        xYPlot24.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PlotOrientation plotOrientation30 = xYPlot24.getOrientation();
        xYPlot4.setOrientation(plotOrientation30);
        org.jfree.chart.axis.AxisSpace axisSpace32 = xYPlot4.getFixedDomainAxisSpace();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(plotOrientation30);
        org.junit.Assert.assertNull(axisSpace32);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        double double11 = xYPlot4.getRangeCrosshairValue();
        boolean boolean12 = xYPlot4.isSubplot();
        int int13 = xYPlot4.getWeight();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        xYPlot4.setBackgroundImageAlignment((int) (byte) 10);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        xYPlot4.datasetChanged(datasetChangeEvent23);
        boolean boolean25 = xYPlot4.isDomainCrosshairVisible();
        boolean boolean26 = xYPlot4.isDomainMinorGridlinesVisible();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace6 = xYPlot4.getFixedDomainAxisSpace();
        xYPlot4.setRangeGridlinesVisible(false);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(axisSpace6);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot17.getIndexOf(xYItemRenderer19);
        float float21 = xYPlot17.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        xYPlot26.setFixedRangeAxisSpace(axisSpace27, false);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot26.getRangeAxis();
        xYPlot26.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot26.getRangeAxisLocation((int) (short) -1);
        xYPlot17.setRangeAxisLocation(axisLocation33, false);
        xYPlot4.setDomainAxisLocation((int) (byte) 10, axisLocation33);
        xYPlot4.setDomainCrosshairValue((double) 0);
        int int39 = xYPlot4.getRendererCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation40 = xYPlot4.getOrientation();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        xYPlot4.notifyListeners(plotChangeEvent41);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(plotOrientation40);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        int int11 = xYPlot4.getIndexOf(xYItemRenderer10);
        xYPlot4.setDomainMinorGridlinesVisible(true);
        boolean boolean14 = xYPlot4.isRangeMinorGridlinesVisible();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        xYPlot4.clearRangeMarkers((int) ' ');
        xYPlot4.setForegroundAlpha((float) (short) 0);
        xYPlot4.clearAnnotations();
        xYPlot4.setRangeMinorGridlinesVisible(true);
        org.junit.Assert.assertNull(valueAxis8);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        xYPlot16.setFixedRangeAxisSpace(axisSpace17, false);
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot16.getRangeAxis();
        xYPlot16.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer22 = xYPlot16.getRenderer();
        java.awt.Paint paint23 = xYPlot16.getDomainZeroBaselinePaint();
        xYPlot4.setDomainGridlinePaint(paint23);
        xYPlot4.setRangeMinorGridlinesVisible(true);
        xYPlot4.setDomainCrosshairVisible(true);
        java.awt.Paint paint29 = xYPlot4.getRangeCrosshairPaint();
        java.awt.Stroke stroke30 = xYPlot4.getOutlineStroke();
        org.jfree.chart.plot.Marker marker32 = null;
        org.jfree.chart.util.Layer layer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = xYPlot4.removeRangeMarker((int) (short) 10, marker32, layer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertNull(xYItemRenderer22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        double double11 = xYPlot4.getRangeCrosshairValue();
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace14);
        xYPlot4.setDomainPannable(true);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        xYPlot22.clearRangeMarkers(15);
        int int25 = xYPlot22.getDomainAxisCount();
        java.awt.Paint paint27 = xYPlot22.getQuadrantPaint((int) (byte) 1);
        xYPlot22.setDomainCrosshairValue((double) 1, false);
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        org.jfree.chart.axis.AxisSpace axisSpace36 = null;
        xYPlot35.setFixedRangeAxisSpace(axisSpace36, false);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer39 = xYPlot35.getRenderer();
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        xYPlot35.drawAnnotations(graphics2D40, rectangle2D41, plotRenderingInfo42);
        java.awt.Paint paint44 = xYPlot35.getRangeCrosshairPaint();
        xYPlot22.setDomainTickBandPaint(paint44);
        xYPlot4.setNoDataMessagePaint(paint44);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNull(xYItemRenderer39);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        java.awt.Paint paint12 = xYPlot4.getOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        xYPlot17.clearRangeMarkers(15);
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = null;
        xYPlot24.setFixedRangeAxisSpace(axisSpace25, false);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        xYPlot24.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = xYPlot24.getRenderer();
        java.awt.Paint paint31 = xYPlot24.getDomainZeroBaselinePaint();
        xYPlot17.setRangeGridlinePaint(paint31);
        xYPlot4.setRangeCrosshairPaint(paint31);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNull(xYItemRenderer30);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getAxisOffset();
        xYPlot4.setNotify(false);
        java.awt.Paint paint14 = xYPlot4.getDomainCrosshairPaint();
        int int15 = xYPlot4.getRangeAxisCount();
        xYPlot4.setNotify(true);
        java.awt.Stroke stroke18 = xYPlot4.getRangeCrosshairStroke();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        org.jfree.data.xy.XYDataset xYDataset20 = null;
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = null;
        org.jfree.chart.plot.XYPlot xYPlot24 = new org.jfree.chart.plot.XYPlot(xYDataset20, valueAxis21, valueAxis22, xYItemRenderer23);
        org.jfree.chart.axis.AxisSpace axisSpace25 = null;
        xYPlot24.setFixedRangeAxisSpace(axisSpace25, false);
        org.jfree.chart.axis.ValueAxis valueAxis28 = xYPlot24.getRangeAxis();
        xYPlot24.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer30 = xYPlot24.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = xYPlot24.getAxisOffset();
        xYPlot24.setNotify(false);
        xYPlot24.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke36 = xYPlot24.getRangeCrosshairStroke();
        xYPlot4.setRangeGridlineStroke(stroke36);
        boolean boolean38 = xYPlot4.isDomainCrosshairLockedOnData();
        java.awt.Stroke stroke39 = xYPlot4.getRangeCrosshairStroke();
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.drawBackground(graphics2D40, rectangle2D41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertNull(xYItemRenderer30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(stroke39);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = xYPlot4.getRangeMarkers(layer19);
        boolean boolean21 = xYPlot4.isDomainZoomable();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        java.awt.Stroke stroke27 = xYPlot26.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        int int29 = xYPlot26.getIndexOf(xYItemRenderer28);
        float float30 = xYPlot26.getBackgroundAlpha();
        java.awt.Stroke stroke31 = xYPlot26.getDomainGridlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        xYPlot26.zoomDomainAxes(0.0d, plotRenderingInfo33, point2D34);
        xYPlot26.setForegroundAlpha((float) (-1));
        org.jfree.chart.axis.AxisSpace axisSpace38 = xYPlot26.getFixedRangeAxisSpace();
        org.jfree.data.xy.XYDataset xYDataset39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot(xYDataset39, valueAxis40, valueAxis41, xYItemRenderer42);
        java.awt.Stroke stroke44 = xYPlot43.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = null;
        int int46 = xYPlot43.getIndexOf(xYItemRenderer45);
        org.jfree.chart.util.RectangleEdge rectangleEdge48 = xYPlot43.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint49 = xYPlot43.getOutlinePaint();
        xYPlot43.mapDatasetToRangeAxis(100, (int) 'a');
        org.jfree.data.xy.XYDataset xYDataset53 = null;
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer56 = null;
        org.jfree.chart.plot.XYPlot xYPlot57 = new org.jfree.chart.plot.XYPlot(xYDataset53, valueAxis54, valueAxis55, xYItemRenderer56);
        java.awt.Stroke stroke58 = xYPlot57.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer59 = null;
        int int60 = xYPlot57.getIndexOf(xYItemRenderer59);
        org.jfree.chart.axis.ValueAxis valueAxis62 = null;
        xYPlot57.setRangeAxis((int) 'a', valueAxis62);
        boolean boolean64 = xYPlot57.canSelectByRegion();
        xYPlot57.clearDomainAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier66 = xYPlot57.getDrawingSupplier();
        xYPlot43.setDrawingSupplier(drawingSupplier66);
        xYPlot26.setDrawingSupplier(drawingSupplier66, true);
        xYPlot4.setDrawingSupplier(drawingSupplier66, false);
        boolean boolean72 = xYPlot4.isDomainGridlinesVisible();
        double double73 = xYPlot4.getRangeCrosshairValue();
        org.jfree.chart.plot.Marker marker75 = null;
        org.jfree.chart.util.Layer layer76 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.addRangeMarker(0, marker75, layer76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(axisSpace38);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(drawingSupplier66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.RenderingSource renderingSource11 = null;
        xYPlot4.select((double) '#', (double) 1.0f, rectangle2D10, renderingSource11);
        org.jfree.chart.plot.Marker marker13 = null;
        boolean boolean14 = xYPlot4.removeDomainMarker(marker13);
        java.awt.Stroke stroke15 = xYPlot4.getRangeGridlineStroke();
        java.awt.Image image16 = null;
        xYPlot4.setBackgroundImage(image16);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setDomainAxes(valueAxisArray9);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        xYPlot4.setRenderer((int) '#', xYItemRenderer12);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(valueAxisArray9);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot17.getIndexOf(xYItemRenderer19);
        float float21 = xYPlot17.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        xYPlot26.setFixedRangeAxisSpace(axisSpace27, false);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot26.getRangeAxis();
        xYPlot26.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot26.getRangeAxisLocation((int) (short) -1);
        xYPlot17.setRangeAxisLocation(axisLocation33, false);
        xYPlot4.setDomainAxisLocation((int) (byte) 10, axisLocation33);
        xYPlot4.setDomainCrosshairValue((double) 0);
        xYPlot4.clearDomainAxes();
        xYPlot4.clearRangeAxes();
        xYPlot4.setRangeZeroBaselineVisible(false);
        boolean boolean43 = xYPlot4.isSubplot();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.chart.plot.Plot plot21 = xYPlot4.getParent();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        int int23 = xYPlot4.indexOf(xYDataset22);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.data.Range range25 = xYPlot4.getDataRange(valueAxis24);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(range25);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot4.getRangeAxisLocation((int) (short) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = xYPlot4.getAxisOffset();
        org.jfree.chart.plot.Plot plot20 = xYPlot4.getParent();
        xYPlot4.mapDatasetToRangeAxis((int) 'a', 15);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        xYPlot4.zoomDomainAxes((double) (-1), 10.0d, plotRenderingInfo19, point2D20);
        java.awt.Stroke stroke22 = xYPlot4.getOutlineStroke();
        xYPlot4.clearAnnotations();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker17 = null;
        boolean boolean18 = xYPlot4.removeDomainMarker(marker17);
        org.jfree.chart.util.RectangleEdge rectangleEdge19 = xYPlot4.getRangeAxisEdge();
        int int20 = xYPlot4.getRendererCount();
        org.jfree.chart.axis.AxisLocation axisLocation21 = xYPlot4.getDomainAxisLocation();
        boolean boolean22 = xYPlot4.isDomainZoomable();
        xYPlot4.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = xYPlot4.getDrawingSupplier();
        xYPlot4.configureRangeAxes();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleEdge19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(axisLocation21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(drawingSupplier25);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        java.awt.Paint paint11 = xYPlot4.getDomainZeroBaselinePaint();
        xYPlot4.setDomainCrosshairValue((double) 0.5f);
        xYPlot4.clearRangeAxes();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        xYPlot4.clearRangeMarkers(15);
        int int7 = xYPlot4.getDomainAxisCount();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        java.awt.geom.Point2D point2D11 = null;
        xYPlot4.zoomDomainAxes((double) 1.0f, (double) 15, plotRenderingInfo10, point2D11);
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = xYPlot4.getDataRange(valueAxis13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        boolean boolean11 = xYPlot4.isRangeCrosshairLockedOnData();
        xYPlot4.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        xYPlot4.removeChangeListener(plotChangeListener14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        xYPlot4.setRangeAxis(valueAxis16);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets9, true);
        xYPlot4.setBackgroundImageAlignment((-1));
        java.awt.Image image14 = null;
        xYPlot4.setBackgroundImage(image14);
        org.jfree.data.xy.XYDataset xYDataset16 = xYPlot4.getDataset();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        xYPlot4.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(xYDataset16);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        xYPlot4.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        boolean boolean21 = xYPlot4.removeDomainMarker((int) (byte) 0, marker19, layer20);
        org.jfree.chart.plot.PlotOrientation plotOrientation22 = xYPlot4.getOrientation();
        xYPlot4.setWeight((int) (byte) 1);
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot(xYDataset25, valueAxis26, valueAxis27, xYItemRenderer28);
        java.awt.Stroke stroke30 = xYPlot29.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        int int32 = xYPlot29.getIndexOf(xYItemRenderer31);
        float float33 = xYPlot29.getBackgroundAlpha();
        java.awt.Image image34 = null;
        xYPlot29.setBackgroundImage(image34);
        float float36 = xYPlot29.getBackgroundImageAlpha();
        java.awt.Stroke stroke37 = xYPlot29.getRangeGridlineStroke();
        xYPlot4.setRangeGridlineStroke(stroke37);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(plotOrientation22);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace6 = xYPlot4.getFixedDomainAxisSpace();
        java.lang.String str7 = xYPlot4.getNoDataMessage();
        java.awt.Stroke stroke8 = xYPlot4.getDomainZeroBaselineStroke();
        boolean boolean9 = xYPlot4.isOutlineVisible();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace6 = xYPlot4.getFixedDomainAxisSpace();
        boolean boolean7 = xYPlot4.isNotify();
        boolean boolean8 = xYPlot4.isRangeMinorGridlinesVisible();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(axisSpace6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        xYPlot4.setInsets(rectangleInsets9, true);
        xYPlot4.setBackgroundImageAlignment((-1));
        java.awt.Image image14 = null;
        xYPlot4.setBackgroundImage(image14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        xYPlot4.setDrawingSupplier(drawingSupplier16);
        java.awt.Paint paint18 = xYPlot4.getNoDataMessagePaint();
        org.jfree.chart.axis.ValueAxis valueAxis20 = xYPlot4.getDomainAxis(100);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        int int22 = xYPlot4.getRangeAxisIndex(valueAxis21);
        org.jfree.data.xy.XYDataset xYDataset23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer26 = null;
        org.jfree.chart.plot.XYPlot xYPlot27 = new org.jfree.chart.plot.XYPlot(xYDataset23, valueAxis24, valueAxis25, xYItemRenderer26);
        java.awt.Stroke stroke28 = xYPlot27.getRangeCrosshairStroke();
        xYPlot27.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        xYPlot27.zoomRangeAxes(0.0d, plotRenderingInfo32, point2D33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        java.awt.geom.Point2D point2D37 = null;
        xYPlot27.panRangeAxes((double) (byte) 1, plotRenderingInfo36, point2D37);
        xYPlot27.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.plot.Marker marker42 = null;
        org.jfree.chart.util.Layer layer43 = null;
        boolean boolean44 = xYPlot27.removeDomainMarker((int) (byte) 0, marker42, layer43);
        java.awt.Paint paint45 = xYPlot27.getBackgroundPaint();
        java.awt.geom.Rectangle2D rectangle2D48 = null;
        org.jfree.chart.RenderingSource renderingSource49 = null;
        xYPlot27.select((double) (short) 10, (double) (short) 10, rectangle2D48, renderingSource49);
        org.jfree.chart.util.Layer layer52 = null;
        java.util.Collection collection53 = xYPlot27.getRangeMarkers((int) (short) 10, layer52);
        xYPlot4.setParent((org.jfree.chart.plot.Plot) xYPlot27);
        org.jfree.chart.plot.Marker marker55 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot27.addDomainMarker(marker55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(valueAxis20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNull(collection53);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder21 = xYPlot4.getDatasetRenderingOrder();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(datasetRenderingOrder21);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        xYPlot4.clearRangeMarkers(15);
        int int7 = xYPlot4.getDomainAxisCount();
        java.awt.Paint paint9 = xYPlot4.getQuadrantPaint((int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        xYPlot4.setDomainAxis(valueAxis10);
        xYPlot4.clearRangeAxes();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(paint9);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        org.jfree.chart.axis.AxisLocation axisLocation9 = xYPlot4.getDomainAxisLocation();
        org.jfree.chart.axis.AxisLocation axisLocation11 = xYPlot4.getDomainAxisLocation((int) (byte) 10);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        org.jfree.chart.plot.XYPlot xYPlot16 = new org.jfree.chart.plot.XYPlot(xYDataset12, valueAxis13, valueAxis14, xYItemRenderer15);
        java.awt.Stroke stroke17 = xYPlot16.getRangeCrosshairStroke();
        xYPlot16.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        xYPlot16.zoomRangeAxes(0.0d, plotRenderingInfo21, point2D22);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder24 = xYPlot16.getDatasetRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        int int26 = xYPlot16.indexOf(xYDataset25);
        xYPlot16.setNotify(true);
        java.awt.Stroke stroke29 = xYPlot16.getOutlineStroke();
        xYPlot4.setDomainMinorGridlineStroke(stroke29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation11);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(datasetRenderingOrder24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        java.awt.Stroke stroke13 = xYPlot12.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        int int15 = xYPlot12.getIndexOf(xYItemRenderer14);
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = xYPlot12.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint18 = xYPlot12.getOutlinePaint();
        xYPlot12.mapDatasetToRangeAxis(100, (int) 'a');
        java.awt.Font font22 = xYPlot12.getNoDataMessageFont();
        xYPlot4.setNoDataMessageFont(font22);
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer27 = null;
        org.jfree.chart.plot.XYPlot xYPlot28 = new org.jfree.chart.plot.XYPlot(xYDataset24, valueAxis25, valueAxis26, xYItemRenderer27);
        java.awt.Stroke stroke29 = xYPlot28.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        xYPlot28.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo32, point2D33);
        org.jfree.data.xy.XYDataset xYDataset36 = null;
        xYPlot28.setDataset((int) (short) 0, xYDataset36);
        xYPlot28.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker41 = null;
        boolean boolean42 = xYPlot28.removeDomainMarker(marker41);
        org.jfree.chart.util.RectangleEdge rectangleEdge43 = xYPlot28.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis44 = xYPlot28.getRangeAxis();
        boolean boolean45 = xYPlot28.isRangeGridlinesVisible();
        java.awt.Image image46 = xYPlot28.getBackgroundImage();
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot(xYDataset47, valueAxis48, valueAxis49, xYItemRenderer50);
        java.awt.Stroke stroke52 = xYPlot51.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer53 = null;
        int int54 = xYPlot51.getIndexOf(xYItemRenderer53);
        float float55 = xYPlot51.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset56 = null;
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer59 = null;
        org.jfree.chart.plot.XYPlot xYPlot60 = new org.jfree.chart.plot.XYPlot(xYDataset56, valueAxis57, valueAxis58, xYItemRenderer59);
        org.jfree.chart.axis.AxisSpace axisSpace61 = null;
        xYPlot60.setFixedRangeAxisSpace(axisSpace61, false);
        org.jfree.chart.axis.ValueAxis valueAxis64 = xYPlot60.getRangeAxis();
        xYPlot60.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation67 = xYPlot60.getRangeAxisLocation((int) (short) -1);
        xYPlot51.setRangeAxisLocation(axisLocation67, false);
        int int70 = xYPlot51.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection71 = xYPlot51.getLegendItems();
        xYPlot28.setFixedLegendItems(legendItemCollection71);
        xYPlot4.setFixedLegendItems(legendItemCollection71);
        org.jfree.chart.util.RectangleEdge rectangleEdge74 = xYPlot4.getDomainAxisEdge();
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(rectangleEdge43);
        org.junit.Assert.assertNull(valueAxis44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(image46);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 1.0f + "'", float55 == 1.0f);
        org.junit.Assert.assertNull(valueAxis64);
        org.junit.Assert.assertNotNull(axisLocation67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection71);
        org.junit.Assert.assertNotNull(rectangleEdge74);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        xYPlot4.setRangeMinorGridlinesVisible(false);
        java.awt.geom.Point2D point2D18 = xYPlot4.getQuadrantOrigin();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot(xYDataset21, valueAxis22, valueAxis23, xYItemRenderer24);
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        xYPlot25.setFixedRangeAxisSpace(axisSpace26, false);
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot25.getRangeAxis();
        xYPlot25.clearRangeMarkers();
        java.awt.Stroke stroke31 = xYPlot25.getRangeZeroBaselineStroke();
        java.awt.Image image32 = null;
        xYPlot25.setBackgroundImage(image32);
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        xYPlot25.removeChangeListener(plotChangeListener34);
        org.jfree.chart.util.Layer layer36 = null;
        java.util.Collection collection37 = xYPlot25.getRangeMarkers(layer36);
        org.jfree.data.xy.XYDataset xYDataset38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot(xYDataset38, valueAxis39, valueAxis40, xYItemRenderer41);
        org.jfree.chart.axis.AxisSpace axisSpace43 = null;
        xYPlot42.setFixedRangeAxisSpace(axisSpace43, false);
        org.jfree.chart.axis.ValueAxis valueAxis46 = xYPlot42.getRangeAxis();
        xYPlot42.clearRangeMarkers();
        java.awt.Stroke stroke48 = xYPlot42.getRangeZeroBaselineStroke();
        java.awt.Image image49 = null;
        xYPlot42.setBackgroundImage(image49);
        org.jfree.chart.event.PlotChangeListener plotChangeListener51 = null;
        xYPlot42.removeChangeListener(plotChangeListener51);
        org.jfree.data.xy.XYDataset xYDataset53 = null;
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer56 = null;
        org.jfree.chart.plot.XYPlot xYPlot57 = new org.jfree.chart.plot.XYPlot(xYDataset53, valueAxis54, valueAxis55, xYItemRenderer56);
        org.jfree.chart.axis.AxisSpace axisSpace58 = null;
        xYPlot57.setFixedRangeAxisSpace(axisSpace58, false);
        org.jfree.chart.axis.ValueAxis valueAxis61 = xYPlot57.getRangeAxis();
        xYPlot57.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation64 = xYPlot57.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset65 = null;
        org.jfree.chart.axis.ValueAxis valueAxis66 = null;
        org.jfree.chart.axis.ValueAxis valueAxis67 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer68 = null;
        org.jfree.chart.plot.XYPlot xYPlot69 = new org.jfree.chart.plot.XYPlot(xYDataset65, valueAxis66, valueAxis67, xYItemRenderer68);
        org.jfree.chart.axis.AxisSpace axisSpace70 = null;
        xYPlot69.setFixedRangeAxisSpace(axisSpace70, false);
        org.jfree.chart.axis.ValueAxis valueAxis73 = xYPlot69.getRangeAxis();
        xYPlot69.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer75 = xYPlot69.getRenderer();
        java.awt.Paint paint76 = xYPlot69.getDomainZeroBaselinePaint();
        xYPlot57.setDomainGridlinePaint(paint76);
        xYPlot42.setRangeMinorGridlinePaint(paint76);
        xYPlot25.setDomainTickBandPaint(paint76);
        java.awt.geom.Point2D point2D80 = xYPlot25.getQuadrantOrigin();
        xYPlot4.zoomRangeAxes((double) 97.0f, plotRenderingInfo20, point2D80);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(point2D18);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(collection37);
        org.junit.Assert.assertNull(valueAxis46);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNull(valueAxis61);
        org.junit.Assert.assertNotNull(axisLocation64);
        org.junit.Assert.assertNull(valueAxis73);
        org.junit.Assert.assertNull(xYItemRenderer75);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNotNull(point2D80);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = xYPlot4.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace13);
        org.jfree.data.xy.XYDataset xYDataset15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer18 = null;
        org.jfree.chart.plot.XYPlot xYPlot19 = new org.jfree.chart.plot.XYPlot(xYDataset15, valueAxis16, valueAxis17, xYItemRenderer18);
        java.awt.Stroke stroke20 = xYPlot19.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        java.awt.geom.Point2D point2D24 = null;
        xYPlot19.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo23, point2D24);
        org.jfree.data.xy.XYDataset xYDataset27 = null;
        xYPlot19.setDataset((int) (short) 0, xYDataset27);
        xYPlot19.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.plot.Marker marker32 = null;
        boolean boolean33 = xYPlot19.removeDomainMarker(marker32);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = xYPlot19.getRangeAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis35 = xYPlot19.getRangeAxis();
        boolean boolean36 = xYPlot19.isRangeGridlinesVisible();
        java.awt.Image image37 = xYPlot19.getBackgroundImage();
        org.jfree.data.xy.XYDataset xYDataset38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer41 = null;
        org.jfree.chart.plot.XYPlot xYPlot42 = new org.jfree.chart.plot.XYPlot(xYDataset38, valueAxis39, valueAxis40, xYItemRenderer41);
        java.awt.Stroke stroke43 = xYPlot42.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer44 = null;
        int int45 = xYPlot42.getIndexOf(xYItemRenderer44);
        float float46 = xYPlot42.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer50 = null;
        org.jfree.chart.plot.XYPlot xYPlot51 = new org.jfree.chart.plot.XYPlot(xYDataset47, valueAxis48, valueAxis49, xYItemRenderer50);
        org.jfree.chart.axis.AxisSpace axisSpace52 = null;
        xYPlot51.setFixedRangeAxisSpace(axisSpace52, false);
        org.jfree.chart.axis.ValueAxis valueAxis55 = xYPlot51.getRangeAxis();
        xYPlot51.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation58 = xYPlot51.getRangeAxisLocation((int) (short) -1);
        xYPlot42.setRangeAxisLocation(axisLocation58, false);
        int int61 = xYPlot42.getSeriesCount();
        org.jfree.chart.LegendItemCollection legendItemCollection62 = xYPlot42.getLegendItems();
        xYPlot19.setFixedLegendItems(legendItemCollection62);
        xYPlot4.setFixedLegendItems(legendItemCollection62);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier65 = xYPlot4.getDrawingSupplier();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(rectangleEdge34);
        org.junit.Assert.assertNull(valueAxis35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(image37);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertNull(valueAxis55);
        org.junit.Assert.assertNotNull(axisLocation58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection62);
        org.junit.Assert.assertNotNull(drawingSupplier65);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        boolean boolean11 = xYPlot4.isRangeCrosshairLockedOnData();
        xYPlot4.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer15 = null;
        xYPlot4.setRenderer((int) (byte) 1, xYItemRenderer15, true);
        org.jfree.data.xy.XYDataset xYDataset18 = null;
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer21 = null;
        org.jfree.chart.plot.XYPlot xYPlot22 = new org.jfree.chart.plot.XYPlot(xYDataset18, valueAxis19, valueAxis20, xYItemRenderer21);
        org.jfree.chart.axis.AxisSpace axisSpace23 = null;
        xYPlot22.setFixedRangeAxisSpace(axisSpace23, false);
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot22.getRangeAxis();
        xYPlot22.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer34 = null;
        org.jfree.chart.plot.XYPlot xYPlot35 = new org.jfree.chart.plot.XYPlot(xYDataset31, valueAxis32, valueAxis33, xYItemRenderer34);
        java.awt.Stroke stroke36 = xYPlot35.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer37 = null;
        int int38 = xYPlot35.getIndexOf(xYItemRenderer37);
        float float39 = xYPlot35.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.axis.ValueAxis valueAxis42 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer43 = null;
        org.jfree.chart.plot.XYPlot xYPlot44 = new org.jfree.chart.plot.XYPlot(xYDataset40, valueAxis41, valueAxis42, xYItemRenderer43);
        org.jfree.chart.axis.AxisSpace axisSpace45 = null;
        xYPlot44.setFixedRangeAxisSpace(axisSpace45, false);
        org.jfree.chart.axis.ValueAxis valueAxis48 = xYPlot44.getRangeAxis();
        xYPlot44.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation51 = xYPlot44.getRangeAxisLocation((int) (short) -1);
        xYPlot35.setRangeAxisLocation(axisLocation51, false);
        xYPlot22.setDomainAxisLocation((int) (byte) 10, axisLocation51);
        xYPlot22.setDomainCrosshairValue((double) 0);
        xYPlot22.clearDomainAxes();
        xYPlot22.clearRangeAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier59 = xYPlot22.getDrawingSupplier();
        xYPlot4.setDrawingSupplier(drawingSupplier59);
        boolean boolean61 = xYPlot4.isDomainCrosshairVisible();
        java.awt.Stroke stroke62 = xYPlot4.getDomainZeroBaselineStroke();
        java.awt.Paint paint63 = xYPlot4.getOutlinePaint();
        org.jfree.chart.annotations.XYAnnotation xYAnnotation64 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = xYPlot4.removeAnnotation(xYAnnotation64, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNull(valueAxis48);
        org.junit.Assert.assertNotNull(axisLocation51);
        org.junit.Assert.assertNotNull(drawingSupplier59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertNotNull(paint63);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes((double) 0L, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) -1, plotRenderingInfo13, point2D14);
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = xYPlot4.getOrientation();
        org.jfree.chart.axis.AxisLocation axisLocation17 = xYPlot4.getDomainAxisLocation();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(plotOrientation16);
        org.junit.Assert.assertNotNull(axisLocation17);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        java.awt.Stroke stroke14 = xYPlot13.getRangeCrosshairStroke();
        xYPlot13.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        xYPlot13.zoomRangeAxes(0.0d, plotRenderingInfo18, point2D19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        xYPlot13.panRangeAxes((double) (byte) 1, plotRenderingInfo22, point2D23);
        float float25 = xYPlot13.getBackgroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation27 = xYPlot13.getRangeAxisLocation((int) (short) 100);
        xYPlot4.setRangeAxisLocation(axisLocation27, true);
        xYPlot4.setRangeCrosshairValue((double) (short) 100);
        org.jfree.chart.plot.Plot plot32 = xYPlot4.getRootPlot();
        org.jfree.data.xy.XYDataset xYDataset33 = null;
        int int34 = xYPlot4.indexOf(xYDataset33);
        xYPlot4.setNotify(true);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation27);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        int int6 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        xYPlot4.axisChanged(axisChangeEvent7);
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        xYPlot4.removeChangeListener(plotChangeListener9);
        xYPlot4.clearRangeAxes();
        double double12 = xYPlot4.getRangeCrosshairValue();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        xYPlot4.zoomDomainAxes((double) 1L, plotRenderingInfo14, point2D15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        xYPlot4.drawAnnotations(graphics2D17, rectangle2D18, plotRenderingInfo19);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        java.awt.Font font21 = xYPlot4.getNoDataMessageFont();
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        boolean boolean26 = xYPlot4.removeDomainMarker((int) ' ', marker23, layer24, false);
        xYPlot4.setRangeCrosshairVisible(true);
        java.awt.Paint paint29 = xYPlot4.getRangeTickBandPaint();
        org.jfree.chart.axis.AxisLocation axisLocation31 = xYPlot4.getDomainAxisLocation(100);
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        java.awt.Paint paint11 = xYPlot4.getRangeTickBandPaint();
        xYPlot4.setRangeGridlinesVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot4.zoomDomainAxes((double) (byte) 1, plotRenderingInfo15, point2D16);
        int int18 = xYPlot4.getBackgroundImageAlignment();
        java.awt.Paint paint19 = xYPlot4.getDomainZeroBaselinePaint();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        int int21 = xYPlot4.getIndexOf(xYItemRenderer20);
        xYPlot4.clearRangeMarkers((int) 'a');
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getAxisOffset();
        xYPlot4.setNotify(false);
        xYPlot4.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke16 = xYPlot4.getRangeCrosshairStroke();
        boolean boolean17 = xYPlot4.isDomainMinorGridlinesVisible();
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = xYPlot4.getRangeMarkers(0, layer19);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(collection20);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        int int17 = xYPlot4.getDomainAxisCount();
        org.jfree.chart.plot.PlotOrientation plotOrientation18 = xYPlot4.getOrientation();
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        boolean boolean23 = xYPlot4.removeDomainMarker(10, marker20, layer21, false);
        java.util.List list24 = xYPlot4.getAnnotations();
        xYPlot4.setDomainPannable(true);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(plotOrientation18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        xYPlot4.clearDomainMarkers();
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        xYPlot4.panDomainAxes((double) 100L, plotRenderingInfo15, point2D16);
        xYPlot4.setRangePannable(true);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setRangeMinorGridlinesVisible(false);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        xYPlot4.drawBackgroundImage(graphics2D8, rectangle2D9);
        xYPlot4.setRangeCrosshairValue((double) 1.0f, false);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        int int18 = xYPlot4.getIndexOf(xYItemRenderer17);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        xYPlot4.setDomainAxis(0, valueAxis20, true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        java.awt.geom.Point2D point2D25 = null;
        xYPlot4.zoomRangeAxes(1.0d, plotRenderingInfo24, point2D25);
        double double27 = xYPlot4.getDomainCrosshairValue();
        xYPlot4.setDomainCrosshairValue((double) (short) 1, true);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Image image9 = null;
        xYPlot4.setBackgroundImage(image9);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        xYPlot4.setRangeAxis(0, valueAxis12);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        xYPlot4.setRenderer(xYItemRenderer14);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        int int17 = xYPlot4.getRangeAxisIndex(valueAxis16);
        boolean boolean18 = xYPlot4.isDomainMinorGridlinesVisible();
        java.awt.geom.Point2D point2D19 = xYPlot4.getQuadrantOrigin();
        org.jfree.chart.axis.AxisSpace axisSpace20 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace20, false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(point2D19);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder5 = xYPlot4.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset7 = null;
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = null;
        org.jfree.chart.plot.XYPlot xYPlot11 = new org.jfree.chart.plot.XYPlot(xYDataset7, valueAxis8, valueAxis9, xYItemRenderer10);
        org.jfree.chart.axis.AxisSpace axisSpace12 = null;
        xYPlot11.setFixedRangeAxisSpace(axisSpace12, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = xYPlot11.getRangeAxis();
        xYPlot11.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation18 = xYPlot11.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setDomainAxisLocation(0, axisLocation18, false);
        int int21 = xYPlot4.getWeight();
        org.jfree.chart.util.Layer layer23 = null;
        java.util.Collection collection24 = xYPlot4.getDomainMarkers((int) (short) 1, layer23);
        org.jfree.chart.axis.ValueAxis valueAxis26 = xYPlot4.getRangeAxis((int) '#');
        org.jfree.chart.axis.AxisSpace axisSpace27 = xYPlot4.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(seriesRenderingOrder5);
        org.junit.Assert.assertNull(valueAxis15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(collection24);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertNull(axisSpace27);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        xYPlot4.clearRangeMarkers(15);
        int int7 = xYPlot4.getDomainAxisCount();
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        java.awt.Stroke stroke13 = xYPlot12.getRangeCrosshairStroke();
        xYPlot12.setRangeMinorGridlinesVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot12.getDomainAxis((int) (byte) 100);
        xYPlot12.setDomainCrosshairValue((double) 1L);
        boolean boolean20 = xYPlot12.isOutlineVisible();
        org.jfree.data.xy.XYDataset xYDataset21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = null;
        org.jfree.chart.plot.XYPlot xYPlot25 = new org.jfree.chart.plot.XYPlot(xYDataset21, valueAxis22, valueAxis23, xYItemRenderer24);
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        xYPlot25.setFixedRangeAxisSpace(axisSpace26, false);
        org.jfree.chart.axis.ValueAxis valueAxis29 = xYPlot25.getRangeAxis();
        xYPlot25.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = xYPlot25.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = xYPlot25.getAxisOffset();
        xYPlot25.setNotify(false);
        xYPlot25.setRangeGridlinesVisible(false);
        java.awt.Stroke stroke37 = xYPlot25.getRangeCrosshairStroke();
        xYPlot12.setRangeGridlineStroke(stroke37);
        xYPlot4.setDomainZeroBaselineStroke(stroke37);
        java.awt.Paint paint40 = xYPlot4.getRangeMinorGridlinePaint();
        java.awt.Paint paint42 = xYPlot4.getQuadrantPaint((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertNull(xYItemRenderer31);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(paint42);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        xYPlot4.panRangeAxes((double) (byte) 1, plotRenderingInfo13, point2D14);
        float float16 = xYPlot4.getBackgroundAlpha();
        xYPlot4.setRangePannable(false);
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = xYPlot4.getRangeMarkers(layer19);
        boolean boolean21 = xYPlot4.isDomainZoomable();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        java.awt.Stroke stroke27 = xYPlot26.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        int int29 = xYPlot26.getIndexOf(xYItemRenderer28);
        float float30 = xYPlot26.getBackgroundAlpha();
        java.awt.Stroke stroke31 = xYPlot26.getDomainGridlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        xYPlot26.zoomDomainAxes(0.0d, plotRenderingInfo33, point2D34);
        xYPlot26.setForegroundAlpha((float) (-1));
        org.jfree.chart.axis.AxisSpace axisSpace38 = xYPlot26.getFixedRangeAxisSpace();
        org.jfree.data.xy.XYDataset xYDataset39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer42 = null;
        org.jfree.chart.plot.XYPlot xYPlot43 = new org.jfree.chart.plot.XYPlot(xYDataset39, valueAxis40, valueAxis41, xYItemRenderer42);
        java.awt.Stroke stroke44 = xYPlot43.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = null;
        int int46 = xYPlot43.getIndexOf(xYItemRenderer45);
        org.jfree.chart.util.RectangleEdge rectangleEdge48 = xYPlot43.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint49 = xYPlot43.getOutlinePaint();
        xYPlot43.mapDatasetToRangeAxis(100, (int) 'a');
        org.jfree.data.xy.XYDataset xYDataset53 = null;
        org.jfree.chart.axis.ValueAxis valueAxis54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer56 = null;
        org.jfree.chart.plot.XYPlot xYPlot57 = new org.jfree.chart.plot.XYPlot(xYDataset53, valueAxis54, valueAxis55, xYItemRenderer56);
        java.awt.Stroke stroke58 = xYPlot57.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer59 = null;
        int int60 = xYPlot57.getIndexOf(xYItemRenderer59);
        org.jfree.chart.axis.ValueAxis valueAxis62 = null;
        xYPlot57.setRangeAxis((int) 'a', valueAxis62);
        boolean boolean64 = xYPlot57.canSelectByRegion();
        xYPlot57.clearDomainAxes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier66 = xYPlot57.getDrawingSupplier();
        xYPlot43.setDrawingSupplier(drawingSupplier66);
        xYPlot26.setDrawingSupplier(drawingSupplier66, true);
        xYPlot4.setDrawingSupplier(drawingSupplier66, false);
        boolean boolean72 = xYPlot4.isDomainGridlinesVisible();
        double double73 = xYPlot4.getRangeCrosshairValue();
        org.jfree.chart.event.PlotChangeListener plotChangeListener74 = null;
        xYPlot4.addChangeListener(plotChangeListener74);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(axisSpace38);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(drawingSupplier66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Paint paint9 = xYPlot4.getDomainGridlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = xYPlot4.getAxisOffset();
        boolean boolean11 = xYPlot4.isDomainGridlinesVisible();
        float float12 = xYPlot4.getBackgroundImageAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.data.Range range14 = xYPlot4.getDataRange(valueAxis13);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNull(range14);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray9 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot4.setDomainAxes(valueAxisArray9);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder11 = xYPlot4.getSeriesRenderingOrder();
        java.awt.Stroke stroke12 = xYPlot4.getDomainCrosshairStroke();
        org.jfree.chart.axis.AxisSpace axisSpace13 = xYPlot4.getFixedRangeAxisSpace();
        xYPlot4.clearRangeMarkers(100);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        xYPlot4.setRangeAxis((int) (byte) 0, valueAxis17, false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(valueAxisArray9);
        org.junit.Assert.assertNotNull(seriesRenderingOrder11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(axisSpace13);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = xYPlot4.getAxisOffset();
        xYPlot4.setNotify(false);
        java.awt.Paint paint14 = xYPlot4.getDomainCrosshairPaint();
        int int15 = xYPlot4.getRangeAxisCount();
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot4.getRangeAxis((int) '4');
        int int18 = xYPlot4.getDomainAxisCount();
        xYPlot4.setBackgroundImageAlignment(1);
        xYPlot4.setOutlineVisible(true);
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = xYPlot4.removeRangeMarker(marker23, layer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer12 = null;
        org.jfree.chart.plot.XYPlot xYPlot13 = new org.jfree.chart.plot.XYPlot(xYDataset9, valueAxis10, valueAxis11, xYItemRenderer12);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot13.setFixedRangeAxisSpace(axisSpace14, false);
        org.jfree.chart.axis.ValueAxis valueAxis17 = xYPlot13.getRangeAxis();
        xYPlot13.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation20 = xYPlot13.getRangeAxisLocation((int) (short) -1);
        xYPlot4.setRangeAxisLocation(axisLocation20, false);
        xYPlot4.setBackgroundAlpha((float) (short) 100);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        xYPlot4.setDrawingSupplier(drawingSupplier25);
        boolean boolean27 = xYPlot4.isDomainZoomable();
        java.awt.Stroke stroke28 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.setDomainGridlineStroke(stroke28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        java.awt.Paint paint11 = xYPlot4.getNoDataMessagePaint();
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        xYPlot17.setFixedRangeAxisSpace(axisSpace18, false);
        org.jfree.chart.axis.ValueAxis valueAxis21 = xYPlot17.getRangeAxis();
        xYPlot17.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer23 = xYPlot17.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = xYPlot17.getAxisOffset();
        xYPlot17.setBackgroundAlpha((float) 'a');
        boolean boolean27 = xYPlot17.isNotify();
        org.jfree.chart.axis.AxisLocation axisLocation29 = xYPlot17.getDomainAxisLocation((int) '#');
        xYPlot4.setRangeAxisLocation(100, axisLocation29, false);
        xYPlot4.setRangeCrosshairValue((double) (-1), true);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertNull(xYItemRenderer23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(axisLocation29);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer10 = xYPlot4.getRenderer();
        xYPlot4.clearDomainMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.data.Range range13 = xYPlot4.getDataRange(valueAxis12);
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        org.jfree.chart.axis.AxisSpace axisSpace19 = null;
        xYPlot18.setFixedRangeAxisSpace(axisSpace19, false);
        org.jfree.chart.axis.ValueAxis valueAxis22 = xYPlot18.getRangeAxis();
        xYPlot18.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer24 = xYPlot18.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = xYPlot18.getAxisOffset();
        xYPlot18.setNotify(false);
        java.lang.String str28 = xYPlot18.getPlotType();
        org.jfree.data.xy.XYDataset xYDataset29 = null;
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer32 = null;
        org.jfree.chart.plot.XYPlot xYPlot33 = new org.jfree.chart.plot.XYPlot(xYDataset29, valueAxis30, valueAxis31, xYItemRenderer32);
        org.jfree.chart.axis.AxisSpace axisSpace34 = null;
        xYPlot33.setFixedRangeAxisSpace(axisSpace34, false);
        org.jfree.chart.axis.ValueAxis valueAxis37 = xYPlot33.getRangeAxis();
        xYPlot33.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer39 = xYPlot33.getRenderer();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = xYPlot33.getAxisOffset();
        xYPlot33.setBackgroundAlpha((float) 'a');
        java.awt.Paint paint43 = xYPlot33.getOutlinePaint();
        xYPlot18.setRangeMinorGridlinePaint(paint43);
        xYPlot4.setDomainGridlinePaint(paint43);
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNull(xYItemRenderer10);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNull(valueAxis22);
        org.junit.Assert.assertNull(xYItemRenderer24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "XY Plot" + "'", str28, "XY Plot");
        org.junit.Assert.assertNull(valueAxis37);
        org.junit.Assert.assertNull(xYItemRenderer39);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.clearRangeMarkers();
        java.awt.Stroke stroke10 = xYPlot4.getRangeZeroBaselineStroke();
        java.awt.Image image11 = null;
        xYPlot4.setBackgroundImage(image11);
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        xYPlot4.setDomainAxis(0, valueAxis14, true);
        xYPlot4.setDomainCrosshairValue((double) 0L, true);
        xYPlot4.setRangeCrosshairLockedOnData(true);
        java.awt.Stroke stroke22 = xYPlot4.getRangeZeroBaselineStroke();
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = xYPlot4.removeDomainMarker((int) '4', marker6, layer7);
        java.awt.Paint paint10 = xYPlot4.getQuadrantPaint((int) (short) 1);
        int int11 = xYPlot4.getBackgroundImageAlignment();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = xYPlot4.getInsets();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        java.awt.geom.Point2D point2D9 = null;
        xYPlot4.zoomDomainAxes(10.0d, (double) 10, plotRenderingInfo8, point2D9);
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        xYPlot4.setDataset((int) (short) 0, xYDataset12);
        xYPlot4.mapDatasetToDomainAxis((int) ' ', (int) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = xYPlot4.getAxisOffset();
        xYPlot4.clearRangeMarkers();
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = xYPlot4.getOrientation();
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        boolean boolean22 = xYPlot4.removeDomainMarker(marker20, layer21);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(plotOrientation19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        xYPlot4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        java.awt.geom.Point2D point2D10 = null;
        xYPlot4.zoomRangeAxes(0.0d, plotRenderingInfo9, point2D10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder12 = xYPlot4.getDatasetRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace13 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace13);
        xYPlot4.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.Plot plot17 = xYPlot4.getRootPlot();
        xYPlot4.clearRangeAxes();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.util.List list21 = null;
        xYPlot4.drawDomainTickBands(graphics2D19, rectangle2D20, list21);
        org.jfree.chart.axis.AxisLocation axisLocation23 = xYPlot4.getDomainAxisLocation();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(datasetRenderingOrder12);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(axisLocation23);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.data.xy.XYDataset xYDataset8 = null;
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer11 = null;
        org.jfree.chart.plot.XYPlot xYPlot12 = new org.jfree.chart.plot.XYPlot(xYDataset8, valueAxis9, valueAxis10, xYItemRenderer11);
        java.awt.Stroke stroke13 = xYPlot12.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer14 = null;
        int int15 = xYPlot12.getIndexOf(xYItemRenderer14);
        float float16 = xYPlot12.getBackgroundAlpha();
        java.awt.Stroke stroke17 = xYPlot12.getDomainGridlineStroke();
        xYPlot4.setDomainZeroBaselineStroke(stroke17);
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = xYPlot4.getRenderer();
        xYPlot4.setRangeCrosshairVisible(false);
        org.jfree.chart.plot.PlotOrientation plotOrientation22 = xYPlot4.getOrientation();
        org.jfree.chart.plot.Marker marker23 = null;
        boolean boolean24 = xYPlot4.removeDomainMarker(marker23);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(xYItemRenderer19);
        org.junit.Assert.assertNotNull(plotOrientation22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        xYPlot4.setRangeCrosshairVisible(true);
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer13 = null;
        org.jfree.chart.plot.XYPlot xYPlot14 = new org.jfree.chart.plot.XYPlot(xYDataset10, valueAxis11, valueAxis12, xYItemRenderer13);
        org.jfree.chart.axis.AxisSpace axisSpace15 = null;
        xYPlot14.setFixedRangeAxisSpace(axisSpace15, false);
        org.jfree.chart.axis.ValueAxis valueAxis18 = xYPlot14.getRangeAxis();
        xYPlot14.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.chart.LegendItemCollection legendItemCollection22 = null;
        xYPlot14.setFixedLegendItems(legendItemCollection22);
        boolean boolean24 = xYPlot4.equals((java.lang.Object) xYPlot14);
        org.jfree.data.xy.XYDataset xYDataset25 = null;
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer28 = null;
        org.jfree.chart.plot.XYPlot xYPlot29 = new org.jfree.chart.plot.XYPlot(xYDataset25, valueAxis26, valueAxis27, xYItemRenderer28);
        java.awt.Stroke stroke30 = xYPlot29.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer31 = null;
        int int32 = xYPlot29.getIndexOf(xYItemRenderer31);
        float float33 = xYPlot29.getBackgroundAlpha();
        java.awt.Stroke stroke34 = xYPlot29.getDomainGridlineStroke();
        org.jfree.data.xy.XYDataset xYDataset35 = null;
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer38 = null;
        org.jfree.chart.plot.XYPlot xYPlot39 = new org.jfree.chart.plot.XYPlot(xYDataset35, valueAxis36, valueAxis37, xYItemRenderer38);
        org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder40 = xYPlot39.getSeriesRenderingOrder();
        org.jfree.data.xy.XYDataset xYDataset42 = null;
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer45 = null;
        org.jfree.chart.plot.XYPlot xYPlot46 = new org.jfree.chart.plot.XYPlot(xYDataset42, valueAxis43, valueAxis44, xYItemRenderer45);
        org.jfree.chart.axis.AxisSpace axisSpace47 = null;
        xYPlot46.setFixedRangeAxisSpace(axisSpace47, false);
        org.jfree.chart.axis.ValueAxis valueAxis50 = xYPlot46.getRangeAxis();
        xYPlot46.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation53 = xYPlot46.getRangeAxisLocation((int) (short) -1);
        xYPlot39.setDomainAxisLocation(0, axisLocation53, false);
        xYPlot29.setRangeAxisLocation(axisLocation53, false);
        xYPlot4.setRangeAxisLocation(axisLocation53);
        org.jfree.data.xy.XYDataset xYDataset59 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer60 = xYPlot4.getRendererForDataset(xYDataset59);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(valueAxis18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(seriesRenderingOrder40);
        org.junit.Assert.assertNull(valueAxis50);
        org.junit.Assert.assertNotNull(axisLocation53);
        org.junit.Assert.assertNull(xYItemRenderer60);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        org.jfree.chart.axis.AxisSpace axisSpace5 = null;
        xYPlot4.setFixedRangeAxisSpace(axisSpace5, false);
        org.jfree.chart.axis.ValueAxis valueAxis8 = xYPlot4.getRangeAxis();
        xYPlot4.mapDatasetToDomainAxis((int) (byte) 1, (int) (byte) 0);
        org.jfree.data.xy.XYDataset xYDataset13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer16 = null;
        org.jfree.chart.plot.XYPlot xYPlot17 = new org.jfree.chart.plot.XYPlot(xYDataset13, valueAxis14, valueAxis15, xYItemRenderer16);
        java.awt.Stroke stroke18 = xYPlot17.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer19 = null;
        int int20 = xYPlot17.getIndexOf(xYItemRenderer19);
        float float21 = xYPlot17.getBackgroundAlpha();
        org.jfree.data.xy.XYDataset xYDataset22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer25 = null;
        org.jfree.chart.plot.XYPlot xYPlot26 = new org.jfree.chart.plot.XYPlot(xYDataset22, valueAxis23, valueAxis24, xYItemRenderer25);
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        xYPlot26.setFixedRangeAxisSpace(axisSpace27, false);
        org.jfree.chart.axis.ValueAxis valueAxis30 = xYPlot26.getRangeAxis();
        xYPlot26.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation33 = xYPlot26.getRangeAxisLocation((int) (short) -1);
        xYPlot17.setRangeAxisLocation(axisLocation33, false);
        xYPlot4.setDomainAxisLocation((int) (byte) 10, axisLocation33);
        xYPlot4.setDomainCrosshairValue((double) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        java.awt.geom.Point2D point2D41 = null;
        xYPlot4.panRangeAxes((double) (-1), plotRenderingInfo40, point2D41);
        org.jfree.chart.util.RectangleEdge rectangleEdge44 = xYPlot4.getDomainAxisEdge((int) 'a');
        java.awt.Stroke stroke45 = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
        xYPlot4.setRangeGridlineStroke(stroke45);
        java.lang.String str47 = xYPlot4.getPlotType();
        org.jfree.data.xy.XYDataset xYDataset49 = null;
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer52 = null;
        org.jfree.chart.plot.XYPlot xYPlot53 = new org.jfree.chart.plot.XYPlot(xYDataset49, valueAxis50, valueAxis51, xYItemRenderer52);
        org.jfree.chart.axis.AxisSpace axisSpace54 = null;
        xYPlot53.setFixedRangeAxisSpace(axisSpace54, false);
        org.jfree.chart.axis.ValueAxis valueAxis57 = xYPlot53.getRangeAxis();
        xYPlot53.clearRangeMarkers();
        org.jfree.chart.axis.AxisLocation axisLocation60 = xYPlot53.getRangeAxisLocation((int) (short) -1);
        org.jfree.data.xy.XYDataset xYDataset61 = null;
        org.jfree.chart.axis.ValueAxis valueAxis62 = null;
        org.jfree.chart.axis.ValueAxis valueAxis63 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer64 = null;
        org.jfree.chart.plot.XYPlot xYPlot65 = new org.jfree.chart.plot.XYPlot(xYDataset61, valueAxis62, valueAxis63, xYItemRenderer64);
        org.jfree.chart.axis.AxisSpace axisSpace66 = null;
        xYPlot65.setFixedRangeAxisSpace(axisSpace66, false);
        org.jfree.chart.axis.ValueAxis valueAxis69 = xYPlot65.getRangeAxis();
        xYPlot65.clearRangeMarkers();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer71 = xYPlot65.getRenderer();
        java.awt.Paint paint72 = xYPlot65.getDomainZeroBaselinePaint();
        xYPlot53.setDomainGridlinePaint(paint72);
        xYPlot53.setRangeMinorGridlinesVisible(true);
        xYPlot53.setDomainCrosshairVisible(true);
        java.awt.Paint paint78 = xYPlot53.getRangeCrosshairPaint();
        org.jfree.chart.plot.Plot plot79 = xYPlot53.getParent();
        java.util.List list80 = xYPlot53.getAnnotations();
        // The following exception was thrown during execution in test generation
        try {
            xYPlot4.mapDatasetToRangeAxes((int) (short) 0, list80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(valueAxis8);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(axisLocation33);
        org.junit.Assert.assertNotNull(rectangleEdge44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "XY Plot" + "'", str47, "XY Plot");
        org.junit.Assert.assertNull(valueAxis57);
        org.junit.Assert.assertNotNull(axisLocation60);
        org.junit.Assert.assertNull(valueAxis69);
        org.junit.Assert.assertNull(xYItemRenderer71);
        org.junit.Assert.assertNotNull(paint72);
        org.junit.Assert.assertNotNull(paint78);
        org.junit.Assert.assertNull(plot79);
        org.junit.Assert.assertNotNull(list80);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        float float8 = xYPlot4.getBackgroundAlpha();
        java.awt.Stroke stroke9 = xYPlot4.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge10 = xYPlot4.getRangeAxisEdge();
        boolean boolean11 = xYPlot4.isRangeCrosshairLockedOnData();
        xYPlot4.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.axis.AxisSpace axisSpace14 = null;
        xYPlot4.setFixedDomainAxisSpace(axisSpace14);
        boolean boolean16 = xYPlot4.isNotify();
        xYPlot4.setRangeZeroBaselineVisible(true);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleEdge10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jfree.data.xy.XYDataset xYDataset0 = null;
        org.jfree.chart.axis.ValueAxis valueAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer3 = null;
        org.jfree.chart.plot.XYPlot xYPlot4 = new org.jfree.chart.plot.XYPlot(xYDataset0, valueAxis1, valueAxis2, xYItemRenderer3);
        java.awt.Stroke stroke5 = xYPlot4.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer6 = null;
        int int7 = xYPlot4.getIndexOf(xYItemRenderer6);
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = xYPlot4.getRangeAxisEdge((int) (byte) 10);
        java.awt.Paint paint10 = xYPlot4.getOutlinePaint();
        xYPlot4.mapDatasetToRangeAxis(100, (int) 'a');
        org.jfree.data.xy.XYDataset xYDataset14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer17 = null;
        org.jfree.chart.plot.XYPlot xYPlot18 = new org.jfree.chart.plot.XYPlot(xYDataset14, valueAxis15, valueAxis16, xYItemRenderer17);
        java.awt.Stroke stroke19 = xYPlot18.getRangeCrosshairStroke();
        org.jfree.chart.renderer.xy.XYItemRenderer xYItemRenderer20 = null;
        int int21 = xYPlot18.getIndexOf(xYItemRenderer20);
        float float22 = xYPlot18.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray23 = new org.jfree.chart.axis.ValueAxis[] {};
        xYPlot18.setDomainAxes(valueAxisArray23);
        xYPlot4.setDomainAxes(valueAxisArray23);
        org.jfree.data.xy.XYDataset xYDataset26 = xYPlot4.getDataset();
        org.jfree.chart.plot.Marker marker28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        boolean boolean31 = xYPlot4.removeDomainMarker(15, marker28, layer29, false);
        org.jfree.chart.plot.Plot plot32 = xYPlot4.getRootPlot();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(rectangleEdge9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(valueAxisArray23);
        org.junit.Assert.assertNull(xYDataset26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(plot32);
    }
}


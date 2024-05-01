package org.apache.commons.math3.optimization.general;

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
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        levenbergMarquardtOptimizer0.setUp();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray1 = levenbergMarquardtOptimizer0.getTarget();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix2 = levenbergMarquardtOptimizer0.computeWeightedJacobian(doubleArray1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        double[][] doubleArray2 = levenbergMarquardtOptimizer0.weightedResidualJacobian;
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = levenbergMarquardtOptimizer0.getTarget();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        levenbergMarquardtOptimizer0.updateJacobian();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        double[][] doubleArray2 = levenbergMarquardtOptimizer0.weightedResidualJacobian;
        double[] doubleArray5 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix7 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray5, false);
        org.apache.commons.math3.optimization.Target target8 = new org.apache.commons.math3.optimization.Target(doubleArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = levenbergMarquardtOptimizer0.computeCost(doubleArray5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cost = (-0.8414709848078965d);
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.weightedResidualJacobian;
        double[] doubleArray8 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix10 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray8, false);
        levenbergMarquardtOptimizer3.weightedResiduals = doubleArray8;
        levenbergMarquardtOptimizer0.point = doubleArray8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        levenbergMarquardtOptimizer0.updateJacobian();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cost = (-0.8414709848078965d);
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer3 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double4 = levenbergMarquardtOptimizer3.getRMS();
        double[][] doubleArray5 = levenbergMarquardtOptimizer3.weightedResidualJacobian;
        double[] doubleArray8 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix10 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray8, false);
        levenbergMarquardtOptimizer3.weightedResiduals = doubleArray8;
        levenbergMarquardtOptimizer0.point = doubleArray8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = levenbergMarquardtOptimizer0.getTarget();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        double[][] doubleArray2 = levenbergMarquardtOptimizer0.weightedResidualJacobian;
        double[] doubleArray5 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix7 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray5, false);
        levenbergMarquardtOptimizer0.weightedResiduals = doubleArray5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        double[][] doubleArray2 = levenbergMarquardtOptimizer0.weightedResidualJacobian;
        double[] doubleArray5 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix7 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray5, false);
        levenbergMarquardtOptimizer0.weightedResiduals = doubleArray5;
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        double[] doubleArray15 = new double[] { 4.9E-324d, 0.12200797867911328d, (short) 100, 5.298292365610485d, 0.0d };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = levenbergMarquardtOptimizer0.computeResiduals(doubleArray15);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math3.linear.RealVector realVector7 = arrayRealVector5.mapSubtract((-0.0d));
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        double[][] doubleArray10 = levenbergMarquardtOptimizer8.weightedResidualJacobian;
        double[] doubleArray13 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix15 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray13, false);
        levenbergMarquardtOptimizer8.weightedResiduals = doubleArray13;
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math3.linear.ArrayRealVector(arrayRealVector5, doubleArray13);
        int int18 = arrayRealVector17.getMaxIndex();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arrayRealVector5 and realVector7", arrayRealVector5.equals(realVector7) ? arrayRealVector5.hashCode() == realVector7.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math3.linear.RealVector realVector7 = arrayRealVector5.mapSubtract((-0.0d));
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        double[][] doubleArray10 = levenbergMarquardtOptimizer8.weightedResidualJacobian;
        double[] doubleArray13 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix15 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray13, false);
        levenbergMarquardtOptimizer8.weightedResiduals = doubleArray13;
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math3.linear.ArrayRealVector(arrayRealVector5, doubleArray13);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math3.linear.RealVector realVector27 = arrayRealVector25.append((double) 100L);
        org.apache.commons.math3.linear.RealVector realVector28 = arrayRealVector5.combineToSelf(0.8813735870195429d, 100.0d, (org.apache.commons.math3.linear.RealVector) arrayRealVector25);
        double double29 = realVector28.getMinValue();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realVector7 and arrayRealVector25", realVector7.equals(arrayRealVector25) ? realVector7.hashCode() == arrayRealVector25.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cost = (-0.8414709848078965d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = levenbergMarquardtOptimizer0.getStartPoint();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math3.linear.RealVector realVector7 = arrayRealVector5.mapSubtract((-0.0d));
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        double[][] doubleArray10 = levenbergMarquardtOptimizer8.weightedResidualJacobian;
        double[] doubleArray13 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix15 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray13, false);
        levenbergMarquardtOptimizer8.weightedResiduals = doubleArray13;
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math3.linear.ArrayRealVector(arrayRealVector5, doubleArray13);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math3.linear.RealVector realVector27 = arrayRealVector25.append((double) 100L);
        org.apache.commons.math3.linear.RealVector realVector28 = arrayRealVector5.combineToSelf(0.8813735870195429d, 100.0d, (org.apache.commons.math3.linear.RealVector) arrayRealVector25);
        org.apache.commons.math3.linear.RealVector realVector30 = arrayRealVector5.mapMultiply((double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realVector7 and arrayRealVector25", realVector7.equals(arrayRealVector25) ? realVector7.hashCode() == arrayRealVector25.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.cost = (-0.8414709848078965d);
        org.apache.commons.math3.linear.Array2DRowRealMatrix array2DRowRealMatrix3 = new org.apache.commons.math3.linear.Array2DRowRealMatrix();
        double[][] doubleArray4 = array2DRowRealMatrix3.getData();
        levenbergMarquardtOptimizer0.weightedResidualJacobian = doubleArray4;
        double[] doubleArray8 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix10 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray8, false);
        double[] doubleArray13 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix15 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray13, false);
        double[] doubleArray16 = diagonalMatrix10.operate(doubleArray13);
        double[] doubleArray17 = diagonalMatrix10.getDataRef();
        org.apache.commons.math3.analysis.polynomials.PolynomialFunction polynomialFunction18 = new org.apache.commons.math3.analysis.polynomials.PolynomialFunction(doubleArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = levenbergMarquardtOptimizer0.computeSigma(doubleArray17, 0.0d);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        double[][] doubleArray2 = levenbergMarquardtOptimizer0.weightedResidualJacobian;
        double[] doubleArray5 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix7 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray5, false);
        levenbergMarquardtOptimizer0.weightedResiduals = doubleArray5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        levenbergMarquardtOptimizer0.updateJacobian();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math3.linear.RealVector realVector7 = arrayRealVector5.mapSubtract((-0.0d));
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        double[][] doubleArray10 = levenbergMarquardtOptimizer8.weightedResidualJacobian;
        double[] doubleArray13 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix15 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray13, false);
        levenbergMarquardtOptimizer8.weightedResiduals = doubleArray13;
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math3.linear.ArrayRealVector(arrayRealVector5, doubleArray13);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math3.linear.RealVector realVector27 = arrayRealVector25.append((double) 100L);
        org.apache.commons.math3.linear.RealVector realVector28 = arrayRealVector5.combineToSelf(0.8813735870195429d, 100.0d, (org.apache.commons.math3.linear.RealVector) arrayRealVector25);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math3.linear.ArrayRealVector(arrayRealVector5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realVector7 and arrayRealVector25", realVector7.equals(arrayRealVector25) ? realVector7.hashCode() == arrayRealVector25.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer((double) (byte) 0, (double) (byte) 0, (double) 0, 6.283185307179586d, (double) (byte) 0);
        levenbergMarquardtOptimizer5.cols = 1;
        double[] doubleArray10 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix12 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray10, false);
        double[] doubleArray15 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix17 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray15, false);
        double[] doubleArray18 = diagonalMatrix12.operate(doubleArray15);
        double[] doubleArray19 = diagonalMatrix12.getDataRef();
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix21 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray19, false);
        double[] doubleArray24 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix26 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray24, false);
        int int27 = diagonalMatrix26.getColumnDimension();
        double[] doubleArray30 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix32 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray30, false);
        double[] doubleArray35 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix37 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray35, false);
        double[] doubleArray38 = diagonalMatrix32.operate(doubleArray35);
        double[] doubleArray39 = diagonalMatrix32.getDataRef();
        double[] doubleArray40 = diagonalMatrix26.preMultiply(doubleArray39);
        double[] doubleArray41 = diagonalMatrix21.preMultiply(doubleArray39);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.linear.RealMatrix realMatrix43 = levenbergMarquardtOptimizer5.computeWeightedJacobian(doubleArray39);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math3.linear.RealVector realVector7 = arrayRealVector5.mapSubtract((-0.0d));
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double9 = levenbergMarquardtOptimizer8.getRMS();
        double[][] doubleArray10 = levenbergMarquardtOptimizer8.weightedResidualJacobian;
        double[] doubleArray13 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix15 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray13, false);
        levenbergMarquardtOptimizer8.weightedResiduals = doubleArray13;
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math3.linear.ArrayRealVector(arrayRealVector5, doubleArray13);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math3.linear.RealVector realVector27 = arrayRealVector25.append((double) 100L);
        org.apache.commons.math3.linear.RealVector realVector28 = arrayRealVector5.combineToSelf(0.8813735870195429d, 100.0d, (org.apache.commons.math3.linear.RealVector) arrayRealVector25);
        java.lang.Double[] doubleArray33 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray33);
        java.lang.Double[] doubleArray39 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray39);
        org.apache.commons.math3.linear.RealMatrix realMatrix41 = arrayRealVector34.outerProduct((org.apache.commons.math3.linear.RealVector) arrayRealVector40);
        int int42 = arrayRealVector34.getMaxIndex();
        java.lang.Double[] doubleArray47 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray47);
        java.lang.Double[] doubleArray53 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray53);
        org.apache.commons.math3.linear.RealMatrix realMatrix55 = arrayRealVector48.outerProduct((org.apache.commons.math3.linear.RealVector) arrayRealVector54);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector56 = arrayRealVector34.ebeMultiply((org.apache.commons.math3.linear.RealVector) arrayRealVector48);
        org.apache.commons.math3.linear.RealVector realVector57 = arrayRealVector5.ebeDivide((org.apache.commons.math3.linear.RealVector) arrayRealVector56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on realVector7 and arrayRealVector25", realVector7.equals(arrayRealVector25) ? realVector7.hashCode() == arrayRealVector25.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray4);
        java.lang.Double[] doubleArray10 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray10);
        org.apache.commons.math3.linear.RealMatrix realMatrix12 = arrayRealVector5.outerProduct((org.apache.commons.math3.linear.RealVector) arrayRealVector11);
        java.lang.Double[] doubleArray17 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math3.linear.RealVector realVector19 = realMatrix12.operate((org.apache.commons.math3.linear.RealVector) arrayRealVector18);
        org.apache.commons.math3.linear.RealVector realVector21 = arrayRealVector18.mapSubtract(0.12200797867911328d);
        int int22 = arrayRealVector18.getDimension();
        java.lang.Double[] doubleArray27 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray27);
        java.lang.Double[] doubleArray33 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray33);
        org.apache.commons.math3.linear.RealMatrix realMatrix35 = arrayRealVector28.outerProduct((org.apache.commons.math3.linear.RealVector) arrayRealVector34);
        org.apache.commons.math3.linear.RealVector realVector36 = arrayRealVector18.add((org.apache.commons.math3.linear.RealVector) arrayRealVector28);
        java.lang.Double[] doubleArray41 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray41);
        java.lang.Double[] doubleArray47 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray47);
        org.apache.commons.math3.linear.RealMatrix realMatrix49 = arrayRealVector42.outerProduct((org.apache.commons.math3.linear.RealVector) arrayRealVector48);
        int int50 = arrayRealVector42.getMaxIndex();
        java.lang.Double[] doubleArray55 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray55);
        java.lang.Double[] doubleArray61 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector62 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray61);
        org.apache.commons.math3.linear.RealMatrix realMatrix63 = arrayRealVector56.outerProduct((org.apache.commons.math3.linear.RealVector) arrayRealVector62);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector64 = arrayRealVector42.ebeMultiply((org.apache.commons.math3.linear.RealVector) arrayRealVector56);
        org.apache.commons.math3.linear.RealVector realVector65 = arrayRealVector28.add((org.apache.commons.math3.linear.RealVector) arrayRealVector42);
        double double66 = arrayRealVector28.getMaxValue();
        java.lang.Double[] doubleArray71 = new java.lang.Double[] { 4.9E-324d, (-0.0d), 5.298292365610485d, 7.750470905699148d };
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector72 = new org.apache.commons.math3.linear.ArrayRealVector(doubleArray71);
        org.apache.commons.math3.linear.RealVector realVector74 = arrayRealVector72.mapSubtract((-0.0d));
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer75 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double76 = levenbergMarquardtOptimizer75.getRMS();
        double[][] doubleArray77 = levenbergMarquardtOptimizer75.weightedResidualJacobian;
        double[] doubleArray80 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix82 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray80, false);
        levenbergMarquardtOptimizer75.weightedResiduals = doubleArray80;
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector84 = new org.apache.commons.math3.linear.ArrayRealVector(arrayRealVector72, doubleArray80);
        double double85 = arrayRealVector28.getLInfDistance((org.apache.commons.math3.linear.RealVector) arrayRealVector72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arrayRealVector5 and realVector74", arrayRealVector5.equals(realVector74) ? arrayRealVector5.hashCode() == realVector74.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        double[][] doubleArray2 = levenbergMarquardtOptimizer0.weightedResidualJacobian;
        double[] doubleArray5 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix7 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray5, false);
        int int8 = diagonalMatrix7.getColumnDimension();
        double[] doubleArray11 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix13 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray11, false);
        int int14 = diagonalMatrix13.getColumnDimension();
        boolean boolean16 = diagonalMatrix13.equals((java.lang.Object) 32);
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix17 = diagonalMatrix7.add(diagonalMatrix13);
        double[] doubleArray20 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix22 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray20, false);
        int int23 = diagonalMatrix22.getColumnDimension();
        org.apache.commons.math3.linear.RealMatrix realMatrix24 = diagonalMatrix7.preMultiply((org.apache.commons.math3.linear.RealMatrix) diagonalMatrix22);
        double[] doubleArray25 = diagonalMatrix7.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double26 = levenbergMarquardtOptimizer0.computeCost(doubleArray25);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double[] doubleArray1 = levenbergMarquardtOptimizer0.objective;
        double[] doubleArray4 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.linear.DiagonalMatrix diagonalMatrix6 = new org.apache.commons.math3.linear.DiagonalMatrix(doubleArray4, false);
        org.apache.commons.math3.optimization.Target target7 = new org.apache.commons.math3.optimization.Target(doubleArray4);
        org.apache.commons.math3.linear.RealVector realVector8 = org.apache.commons.math3.linear.MatrixUtils.createRealVector(doubleArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = levenbergMarquardtOptimizer0.computeSigma(doubleArray4, (double) (short) 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        double[][] doubleArray2 = levenbergMarquardtOptimizer0.weightedResidualJacobian;
        int int3 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointVectorValuePair> pointVectorValuePairConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointVectorValuePair pointVectorValuePair5 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        double[] doubleArray2 = levenbergMarquardtOptimizer0.weightedResiduals;
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer();
        double[] doubleArray1 = levenbergMarquardtOptimizer0.objective;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = levenbergMarquardtOptimizer0.getTarget();
    }
}


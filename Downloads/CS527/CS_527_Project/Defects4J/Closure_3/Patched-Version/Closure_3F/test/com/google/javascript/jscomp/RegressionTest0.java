package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.IR.paramList();
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.process(node2, node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.IR.paramList();
        boolean boolean6 = node4.hasChild(node5);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        node4.setDirectives((java.util.Set<java.lang.String>) strSet10);
        boolean boolean13 = node4.isThis();
        boolean boolean14 = node4.isNew();
        boolean boolean15 = node4.isName();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((int) (byte) 10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.IR.paramList();
        boolean boolean19 = node17.hasChild(node18);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        node17.setDirectives((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = node17.isThis();
        boolean boolean28 = com.google.javascript.jscomp.ControlFlowAnalysis.isBreakTarget(node17, "hi!");
        node17.setOptionalArg(true);
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node4, node17);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node17);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }
}


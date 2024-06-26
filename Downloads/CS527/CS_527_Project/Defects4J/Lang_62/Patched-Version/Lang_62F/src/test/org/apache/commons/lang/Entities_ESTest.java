/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 09 03:59:41 GMT 2024
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.Entities;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      StringWriter stringWriter0 = new StringWriter(553);
      entities0.unescape((Writer) stringWriter0, "&=-mm");
      assertEquals("&=-mm", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Entities entities0 = new Entities();
      String string0 = entities0.XML.unescape("&tbnQXv^");
      assertEquals("&tbnQXv^", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Entities entities0 = new Entities();
      StringWriter stringWriter0 = new StringWriter();
      entities0.escape((Writer) stringWriter0, "fxHzY])YJ0MfPEE 5");
      assertEquals("fxHzY])YJ0MfPEE 5", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("", (-445));
      entities_BinaryEntityMap0.add("", (-2635));
      // Undeclared exception!
      try { 
        entities_BinaryEntityMap0.add("/1xNzR", (-2635));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.ensureCapacity(753);
      entities_BinaryEntityMap0.size = 656;
      entities_BinaryEntityMap0.add("", 137);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("$:go]Q`Gsrw/A|X", (-3430));
      entities_BinaryEntityMap0.add((String) null, 2203);
      entities_BinaryEntityMap0.add((String) null, 1597);
      entities_BinaryEntityMap0.add((String) null, 16);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap(396);
      entities_ArrayEntityMap0.size = (-1);
      int int0 = entities_ArrayEntityMap0.value((String) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap(3);
      entities_ArrayEntityMap0.add((String) null, 110);
      String string0 = entities_ArrayEntityMap0.name(761);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap(110);
      entities_ArrayEntityMap0.size = 110;
      entities_ArrayEntityMap0.add("8!0p2]OKK+A", 110);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      String[] stringArray0 = new String[1];
      entities_BinaryEntityMap0.names = stringArray0;
      entities_BinaryEntityMap0.add("95", (-367));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
      String string0 = entities_LookupEntityMap0.name(151);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Entities.PrimitiveEntityMap entities_PrimitiveEntityMap0 = new Entities.PrimitiveEntityMap();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      String string0 = entities_HashEntityMap0.name((-3593));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("8838", 151);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(1102);
      String string0 = entities_BinaryEntityMap0.name(2);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      entities0.addEntity("org.apache.commons.lang.IntHashMap", 2213);
      int int0 = entities0.entityValue("org.apache.commons.lang.IntHashMap");
      assertEquals(2213, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
      entities_LookupEntityMap0.name(1600);
      entities_LookupEntityMap0.name(1600);
      entities_LookupEntityMap0.name(121);
      Entities entities0 = Entities.XML;
      StringWriter stringWriter0 = new StringWriter(121);
      String string0 = entities0.entityName(923);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
      Entities entities0 = Entities.XML;
      entities0.XML.map = (Entities.EntityMap) entities_LookupEntityMap0;
      Entities.TreeEntityMap entities_TreeEntityMap0 = new Entities.TreeEntityMap();
      entities0.XML.map = (Entities.EntityMap) entities_TreeEntityMap0;
      entities_TreeEntityMap0.add("", 923);
      String string0 = entities0.entityName(923);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      // Undeclared exception!
      try { 
        entities0.unescape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Entities entities0 = new Entities();
      // Undeclared exception!
      try { 
        entities0.unescape((Writer) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Entities.fillWithHtml40Entities((Entities) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Entities entities0 = new Entities();
      // Undeclared exception!
      try { 
        entities0.escape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      // Undeclared exception!
      try { 
        entities0.HTML40.escape((Writer) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      int int0 = entities0.entityValue("spades");
      assertEquals(9824, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Entities entities0 = Entities.XML;
      // Undeclared exception!
      try { 
        entities0.HTML32.entityName((-826));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -826
         //
         verifyException("org.apache.commons.lang.Entities$LookupEntityMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Entities entities0 = Entities.XML;
      // Undeclared exception!
      try { 
        entities0.addEntities((String[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      String[][] stringArray0 = new String[6][8];
      String[] stringArray1 = new String[0];
      stringArray0[0] = stringArray1;
      // Undeclared exception!
      try { 
        entities0.HTML40.addEntities(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Entities entities0 = Entities.XML;
      String[][] stringArray0 = new String[0][4];
      entities0.addEntities(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      String[][] stringArray0 = new String[6][4];
      // Undeclared exception!
      try { 
        entities0.addEntities(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Entities entities0 = Entities.XML;
      StringWriter stringWriter0 = new StringWriter(1134);
      entities0.unescape((Writer) stringWriter0, "226");
      assertEquals("226", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Entities entities0 = new Entities();
      StringWriter stringWriter0 = new StringWriter(2);
      entities0.unescape((Writer) stringWriter0, "eq&z8H  Hl~aiL3>j0a");
      assertEquals("eq&z8H  Hl~aiL3>j0a", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      String string0 = entities0.unescape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Entities entities0 = new Entities();
      String string0 = entities0.XML.unescape("eq&z8H  Hl~aiL3>j0a");
      assertEquals("eq&z8H  Hl~aiL3>j0a", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      StringWriter stringWriter0 = new StringWriter(0);
      entities0.escape((Writer) stringWriter0, "\"");
      assertEquals("&quot;", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      String string0 = entities0.HTML32.escape("RlZW>O");
      assertEquals("RlZW&gt;O", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      String string0 = entities0.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("", (-445));
      entities_BinaryEntityMap0.add("", (-2635));
      int[] intArray0 = new int[2];
      intArray0[1] = 605;
      entities_BinaryEntityMap0.values = intArray0;
      entities_BinaryEntityMap0.add("*a>:N(dM", 605);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(249);
      entities_BinaryEntityMap0.add("niS(P,U", Integer.MAX_VALUE);
      int[] intArray0 = new int[1];
      intArray0[0] = 688;
      entities_BinaryEntityMap0.values = intArray0;
      String string0 = entities_BinaryEntityMap0.name(688);
      assertEquals("niS(P,U", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("", (-445));
      entities_BinaryEntityMap0.add("*a>:N(dM", 126);
      String string0 = entities_BinaryEntityMap0.name(126);
      assertEquals("*a>:N(dM", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(249);
      entities_BinaryEntityMap0.add("niS(P,U", Integer.MAX_VALUE);
      int int0 = entities_BinaryEntityMap0.value("niS(P,U");
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(249);
      entities_BinaryEntityMap0.add("niS(P,U", Integer.MAX_VALUE);
      int int0 = entities_BinaryEntityMap0.value("MN+0^C3#V6%BMe&");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap(38);
      entities_ArrayEntityMap0.size = (-964);
      entities_ArrayEntityMap0.size = 250;
      // Undeclared exception!
      try { 
        entities_ArrayEntityMap0.name((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 38
         //
         verifyException("org.apache.commons.lang.Entities$ArrayEntityMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      int int0 = entities_HashEntityMap0.value((String) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
      entities_LookupEntityMap0.add("", 605);
      int int0 = entities_LookupEntityMap0.value("");
      assertEquals(605, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Entities.LookupEntityMap entities_LookupEntityMap0 = new Entities.LookupEntityMap();
      entities_LookupEntityMap0.name(1600);
      entities_LookupEntityMap0.name(1600);
      entities_LookupEntityMap0.name(121);
      Entities entities0 = Entities.XML;
      StringWriter stringWriter0 = new StringWriter(121);
      Entities.fillWithHtml40Entities(entities0);
      entities0.XML.escape((Writer) stringWriter0, "07");
      entities0.XML.map = (Entities.EntityMap) entities_LookupEntityMap0;
      Entities.TreeEntityMap entities_TreeEntityMap0 = new Entities.TreeEntityMap();
      String string0 = entities0.entityName(923);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      entities_HashEntityMap0.add("E;;", (-3593));
      int int0 = entities_HashEntityMap0.value("E;;");
      assertEquals((-3593), int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
      entities_ArrayEntityMap0.add(" ~L:X?GK}`", 115);
      String string0 = entities_ArrayEntityMap0.name(115);
      assertEquals(" ~L:X?GK}`", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      Entities.fillWithHtml40Entities(entities0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      int int0 = entities0.entityValue("FD#");
      assertEquals((-1), int0);
  }
}

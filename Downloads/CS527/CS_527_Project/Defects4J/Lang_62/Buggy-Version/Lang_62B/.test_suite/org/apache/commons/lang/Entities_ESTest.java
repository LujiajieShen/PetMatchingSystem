/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 10 01:00:11 GMT 2024
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      StringWriter stringWriter0 = new StringWriter();
      entities0.unescape((Writer) stringWriter0, "b&amp;:60 -4*:+z4;y");
      assertEquals("b&:60 -4*:+z4;y", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(581);
      String string0 = entities_BinaryEntityMap0.name(581);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("Iglegal Load: ", 0);
      int int0 = entities_BinaryEntityMap0.value("Iglegal Load: ");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Entities entities0 = Entities.XML;
      Entities.fillWithHtml40Entities(entities0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Entities entities0 = Entities.XML;
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      String string0 = entities0.escape("^Yp)bEm&0o{>>~d");
      assertEquals("^Yp)bEm&Alpha;0o{&Gamma;&Gamma;~d", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Entities entities0 = new Entities();
      StringWriter stringWriter0 = new StringWriter();
      entities0.unescape((Writer) stringWriter0, "h&%e=a>k2;[&)o");
      assertEquals("h&%e=a>k2;[&)o", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Entities entities0 = Entities.XML;
      Entities.HashEntityMap entities_HashEntityMap0 = new Entities.HashEntityMap();
      entities0.map = (Entities.EntityMap) entities_HashEntityMap0;
      Entities.fillWithHtml40Entities(entities0);
      String string0 = entities0.unescape("^Yp)bEm&amp;0o{&gt;&gt;~d");
      assertEquals("^Yp)bEm&0o{>>~d", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Entities entities0 = Entities.XML;
      Entities.TreeEntityMap entities_TreeEntityMap0 = new Entities.TreeEntityMap();
      String string0 = entities0.unescape("b&60 -rW*:+z4;y");
      assertEquals("b&60 -rW*:+z4;y", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Entities entities0 = new Entities();
      String string0 = entities0.entityName(2365);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Entities.ArrayEntityMap entities_ArrayEntityMap0 = new Entities.ArrayEntityMap();
      Entities entities0 = Entities.HTML40;
      entities0.HTML40.map = (Entities.EntityMap) entities_ArrayEntityMap0;
      Entities.fillWithHtml40Entities(entities0);
      StringWriter stringWriter0 = new StringWriter(142);
      entities0.escape((Writer) stringWriter0, "D2D'W>F");
      assertEquals("D2D'W&gt;F", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(146);
      entities_BinaryEntityMap0.add("&I?CNF", 207);
      int int0 = entities_BinaryEntityMap0.value("vV$S7=:?5/whq<$");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("Sfr `O!]MT", 3275);
      entities_BinaryEntityMap0.add("Sfr `O!]MT", (-507));
      entities_BinaryEntityMap0.add("k5 Kh^?zJze7)of-o", 3275);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("Sfr `O!]MT", (-507));
      entities_BinaryEntityMap0.add("k5 Kh^?zJze7)of-o", 3275);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap();
      entities_BinaryEntityMap0.add("Sfr `O!]MT", 3275);
      // Undeclared exception!
      try { 
        entities_BinaryEntityMap0.add("k5 Kh^?zJze7)of-o", 3275);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Entities.BinaryEntityMap entities_BinaryEntityMap0 = new Entities.BinaryEntityMap(3275);
      entities_BinaryEntityMap0.add("SIfr `O!]M#T", 3275);
      String string0 = entities_BinaryEntityMap0.name(3275);
      assertEquals("SIfr `O!]M#T", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      String string0 = entities0.escape("b&:60 -4*:+z4;y");
      assertEquals("b&amp;:60 -4*:+z4;y", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Entities entities0 = Entities.HTML40;
      String string0 = entities0.unescape("k5 Kh^?zJze7)of-o");
      assertEquals("k5 Kh^?zJze7)of-o", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Entities entities0 = Entities.XML;
      String string0 = entities0.unescape("h&%e=a>k2;[&)o");
      assertEquals("h&%e=a>k2;[&)o", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Entities entities0 = Entities.HTML32;
      String string0 = entities0.unescape("&:60z -4>%y:+z4&;j");
      assertEquals("&:60z -4>%y:+z4&;j", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Entities entities0 = Entities.HTML32;
      entities0.unescape((Writer) stringWriter0, "org.apache.commons.lang.IntHashMap");
      assertEquals("org.apache.commons.lang.IntHashMap", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Entities entities0 = new Entities();
      entities0.unescape((Writer) stringWriter0, "le'<Y^>-E&;w");
      assertEquals("le'<Y^>-E&;w", stringWriter0.toString());
  }
}

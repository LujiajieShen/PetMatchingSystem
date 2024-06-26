/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 22:01:11 GMT 2024
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVLexer;
import org.apache.commons.csv.ExtendedBufferedReader;
import org.apache.commons.csv.Quote;
import org.apache.commons.csv.Token;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CSVLexer_ESTest extends CSVLexer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, (ExtendedBufferedReader) null);
      // Undeclared exception!
      try { 
        cSVLexer0.nextToken((Token) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.CSVLexer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ALL");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVLexer cSVLexer0 = null;
      try {
        cSVLexer0 = new CSVLexer((CSVFormat) null, extendedBufferedReader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.Lexer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      StringReader stringReader0 = new StringReader("\"5ohW\"%Y%%^5[XkDwK");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      Token token0 = new Token();
      try { 
        cSVLexer0.nextToken(token0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // (line 0) invalid char between encapsulated token and delimiter
         //
         verifyException("org.apache.commons.csv.CSVLexer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Character character0 = Character.valueOf('e');
      Quote quote0 = Quote.ALL;
      String[] stringArray0 = new String[9];
      CSVFormat cSVFormat0 = new CSVFormat('~', character0, quote0, character0, character0, false, false, "dZxHy9>o%XE5Qm`", "dZxHy9>o%XE5Qm`", stringArray0);
      StringReader stringReader0 = new StringReader(") EOF reached before encapsulated token finished");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      Token token0 = new Token();
      Token token1 = cSVLexer0.nextToken(token0);
      assertSame(token1, token0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      StringReader stringReader0 = new StringReader(",-Jj");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      Token token0 = new Token();
      Token token1 = cSVLexer0.nextToken(token0);
      assertSame(token1, token0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      StringReader stringReader0 = new StringReader(") invalid char between encapsulated token and delimiter");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      cSVLexer0.readEscape();
      Token token0 = new Token();
      Token token1 = cSVLexer0.nextToken(token0);
      assertSame(token1, token0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Character character0 = Character.valueOf('`');
      Quote quote0 = Quote.NONE;
      String[] stringArray0 = new String[3];
      CSVFormat cSVFormat0 = new CSVFormat('`', character0, quote0, character0, character0, true, true, "?N]jp#=*`G8J&`", "?N]jp#=*`G8J&`", stringArray0);
      StringReader stringReader0 = new StringReader("?N]jp#=*`G8J&`");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      Token token0 = new Token();
      char[] charArray0 = new char[8];
      stringReader0.read(charArray0);
      Token token1 = cSVLexer0.nextToken(token0);
      assertSame(token0, token1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("V\n");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      Token token0 = new Token();
      Token token1 = cSVLexer0.nextToken(token0);
      Token token2 = cSVLexer0.nextToken(token1);
      assertSame(token2, token0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      StringReader stringReader0 = new StringReader("y)1'n=L^X.;v|,l");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      Token token0 = new Token();
      Token token1 = cSVLexer0.nextToken(token0);
      Token token2 = cSVLexer0.nextToken(token1);
      assertSame(token0, token2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\n");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      Token token0 = new Token();
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      Token token1 = cSVLexer0.nextToken(token0);
      assertSame(token1, token0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("V\n");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      extendedBufferedReader0.read();
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      Token token0 = new Token();
      Token token1 = cSVLexer0.nextToken(token0);
      assertSame(token0, token1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      StringReader stringReader0 = new StringReader(") invalid char between encapsulated token and delimiter");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      Token token0 = new Token();
      Token token1 = cSVLexer0.nextToken(token0);
      Token token2 = cSVLexer0.nextToken(token0);
      assertSame(token2, token1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      Token token0 = new Token();
      StringReader stringReader0 = new StringReader("\"U'r0wj");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
      try { 
        cSVLexer0.nextToken(token0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // (startline 0) EOF reached before encapsulated token finished
         //
         verifyException("org.apache.commons.csv.CSVLexer", e);
      }
  }
}

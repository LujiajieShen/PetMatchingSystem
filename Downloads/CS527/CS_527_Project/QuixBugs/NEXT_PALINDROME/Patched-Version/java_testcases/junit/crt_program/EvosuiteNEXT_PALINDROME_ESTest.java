/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 04 21:37:54 GMT 2024
 */

package correct_java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import correct_java_programs.NEXT_PALINDROME;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NEXT_PALINDROME_ESTest extends NEXT_PALINDROME_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[4] = 834;
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[0, 0, 0, 0, 835, 0, 0, 0, 0]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[9];
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[0, 0, 0, 0, 1, 0, 0, 0, 0]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        NEXT_PALINDROME.next_palindrome((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("correct_java_programs.NEXT_PALINDROME", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NEXT_PALINDROME.next_palindrome(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // List length = -1
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[1];
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[1]", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[2];
      NEXT_PALINDROME.next_palindrome(intArray0);
      NEXT_PALINDROME.next_palindrome(intArray0);
      NEXT_PALINDROME.next_palindrome(intArray0);
      NEXT_PALINDROME.next_palindrome(intArray0);
      NEXT_PALINDROME.next_palindrome(intArray0);
      NEXT_PALINDROME.next_palindrome(intArray0);
      NEXT_PALINDROME.next_palindrome(intArray0);
      NEXT_PALINDROME.next_palindrome(intArray0);
      NEXT_PALINDROME.next_palindrome(intArray0);
      assertArrayEquals(new int[] {9, 9}, intArray0);
      
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[1, 0, 1]", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NEXT_PALINDROME nEXT_PALINDROME0 = new NEXT_PALINDROME();
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 04 21:24:03 GMT 2024
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java_programs.FIND_FIRST_IN_SORTED;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FIND_FIRST_IN_SORTED_ESTest extends FIND_FIRST_IN_SORTED_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      int int0 = FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[3];
      // Undeclared exception!
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        FIND_FIRST_IN_SORTED.find_first_in_sorted((int[]) null, 1651);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, 397);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[1] = (-787);
      int int0 = FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, 0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FIND_FIRST_IN_SORTED fIND_FIRST_IN_SORTED0 = new FIND_FIRST_IN_SORTED();
  }
}

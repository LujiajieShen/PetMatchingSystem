/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 04 21:48:53 GMT 2024
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.Node;
import java_programs.REVERSE_LINKED_LIST;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class REVERSE_LINKED_LIST_ESTest extends REVERSE_LINKED_LIST_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Node node0 = new Node("k~kv|*yP");
      Node node1 = new Node("k~kv|*yP", node0);
      Node node2 = REVERSE_LINKED_LIST.reverse_linked_list(node1);
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      REVERSE_LINKED_LIST rEVERSE_LINKED_LIST0 = new REVERSE_LINKED_LIST();
  }
}

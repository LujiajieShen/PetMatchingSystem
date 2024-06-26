/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 10 00:07:41 GMT 2024
 */

package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StdKeySerializer_ESTest extends StdKeySerializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StdKeySerializer stdKeySerializer0 = new StdKeySerializer();
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      Class<String> class0 = String.class;
      ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
      JsonNode jsonNode0 = stdKeySerializer0.getSchema((SerializerProvider) null, (Type) arrayType0);
      assertFalse(jsonNode0.isBigDecimal());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StdKeySerializer stdKeySerializer0 = new StdKeySerializer();
      // Undeclared exception!
      try { 
        stdKeySerializer0.acceptJsonFormatVisitor((JsonFormatVisitorWrapper) null, (JavaType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StdKeySerializer stdKeySerializer0 = new StdKeySerializer();
      Class<JsonGenerator.Feature> class0 = JsonGenerator.Feature.class;
      AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
      EnumResolver<JsonGenerator.Feature> enumResolver0 = EnumResolver.constructFor(class0, annotationIntrospector0);
      Class<JsonGenerator.Feature> class1 = enumResolver0.getEnumClass();
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        stdKeySerializer0.serialize(class1, (JsonGenerator) null, defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StdKeySerializer stdKeySerializer0 = new StdKeySerializer();
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        stdKeySerializer0.serialize("A%R", (JsonGenerator) null, defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StdKeySerializer stdKeySerializer0 = new StdKeySerializer();
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        stdKeySerializer0.serialize(mockDate0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.SerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StdKeySerializer stdKeySerializer0 = new StdKeySerializer();
      Object object0 = new Object();
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        stdKeySerializer0.serialize(object0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", e);
      }
  }
}

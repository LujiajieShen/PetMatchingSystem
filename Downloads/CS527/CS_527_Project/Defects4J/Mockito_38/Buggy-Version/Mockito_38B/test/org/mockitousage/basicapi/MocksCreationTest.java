/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockitousage.basicapi;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockitousage.IMethods;
import org.mockitoutil.TestBase;

public class MocksCreationTest extends TestBase {

    private class HasPrivateConstructor {};
    
    @Test
    public void shouldCreateMockWhenConstructorIsPrivate() {
        assertNotNull(Mockito.mock(HasPrivateConstructor.class));
    }
    
    @Test
    public void shouldCombineMockNameAndSmartNulls() {
        //given
        IMethods mock = mock(IMethods.class, withSettings()
            .defaultAnswer(RETURNS_SMART_NULLS)
            .name("great mockie"));    
        
        //when
        IMethods smartNull = mock.iMethodsReturningMethod();
        String name = mock.toString();
        
        //then
        assertContains("great mockie", name);
        //and
        try {
            smartNull.simpleMethod();
            fail();
        } catch(SmartNullPointerException e) {}
    }
    
    @Test
    public void shouldCombineMockNameAndExtraInterfaces() {}
// Defects4J: flaky method
//     @Test
//     public void shouldCombineMockNameAndExtraInterfaces() {
//         //given
//         IMethods mock = mock(IMethods.class, withSettings()
//                 .extraInterfaces(List.class)
//                 .name("great mockie"));
//         
//         //when
//         String name = mock.toString();
//         
//         //then
//         assertContains("great mockie", name);
//         //and
//         assertThat(mock, is(List.class));
//     }
    
    @Test
    public void shouldSpecifyMockNameViaSettings() {
        //given
        IMethods mock = mock(IMethods.class, withSettings().name("great mockie"));

        //when
        String name = mock.toString();
        
        //then
        assertContains("great mockie", name);
    }
}
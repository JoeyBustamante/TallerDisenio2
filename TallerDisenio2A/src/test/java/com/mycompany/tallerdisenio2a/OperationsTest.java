/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tallerdisenio2a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joeybustamante
 */
public class OperationsTest {
    
    
    
    @Test 
    public void noNull(){
        String formulaN = Operations.MakeFormula();
        assertNotNull(formulaN);
        
    }
    
    
    public void testSuma(){
        assertEquals("98+18-62=54",Operations.Solve("98+18"));
    }
        
        
        
    

    @Test
    public void testSomeMethod() {
    }
    
}

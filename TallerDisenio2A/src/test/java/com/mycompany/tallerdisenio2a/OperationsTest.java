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
    
    @Test
    public void testSuma(){
        assertEquals("98+18=116",Operations.Solve("98+18"),"Prueba de suma ");
    }
    
    
    
    @Test 
    public void pruebaExcepcionDivisionPor0() {
        assertThrows(ArithmeticException.class, () -> Operations.Solve("5/0"));
    }
        
    
}

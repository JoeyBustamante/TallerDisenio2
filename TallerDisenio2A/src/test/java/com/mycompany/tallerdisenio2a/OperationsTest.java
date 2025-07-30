/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tallerdisenio2a;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joeybustamante
 */
   
@DisplayName("Tests for the Operations class")
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
    public void testExcepcionDivisionPor0() {
        assertThrows(ArithmeticException.class, () -> Operations.Solve("5/0"));
    }
  

    @Test
    void testMakeFormulaNoVacio() {
        String formula = Operations.MakeFormula();
        assertFalse(formula.isEmpty());
    }

    @Test
    void testContieneLosOperadores() {
        String formula = Operations.MakeFormula();
        assertTrue(formula.contains("+") || formula.contains("-") || formula.contains("*") || formula.contains("/"));
    }

    @Test
    void testMultiplicacion() {
        assertEquals("2+3*4=14", Operations.Solve("2+3*4")); // Verifica precedencia
    }

    @Test
    void testResultadoIncorrecto() {
        assertNotEquals("2+2=5", Operations.Solve("2+2"));
    }

    @DisplayName("Prueba de jerarquía de operaciones")
    public void testOperatorHierarchy(){
        assertEquals("10*10+20+30=150", Operations.Solve("100*100+2+3"));
    }

    
    
    
        
    
}

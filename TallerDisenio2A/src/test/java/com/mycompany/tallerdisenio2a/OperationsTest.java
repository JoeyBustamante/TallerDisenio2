/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tallerdisenio2a;

import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Debe generar una fórmula no nula")
    public void noNull() {
        String formulaN = Operations.MakeFormula();
        assertNotNull(formulaN);
    }

    @Test
    @DisplayName("Prueba de suma: 98+18=116")
    public void testSuma() {
        assertEquals("98+18=116", Operations.Solve("98+18"), "Prueba de suma");
    }

    @Test
    @DisplayName("Debe lanzar excepción por división entre cero")
    public void testExcepcionDivisionPor0() {
        assertThrows(ArithmeticException.class, () -> Operations.Solve("5/0"));
    }

    @Test
    @DisplayName("La fórmula generada no debe estar vacía")
    void testMakeFormulaNoVacio() {
        String formula = Operations.MakeFormula();
        assertFalse(formula.isEmpty());
    }

    @Test
    @DisplayName("La fórmula generada contiene al menos un operador")
    void testContieneLosOperadores() {
        String formula = Operations.MakeFormula();
        assertTrue( formula.contains("+") ||  formula.contains("-") ||formula.contains("*") ||   formula.contains("/"));
    }

    @Test
    @DisplayName("No debe dar un resultado incorrecto: 22+22 ≠ 555")
    void testResultadoIncorrecto() {
        assertNotEquals("22+22=555", Operations.Solve("22+22"));
    }

    @Test
    @DisplayName("Prueba de jerarquía de operaciones: 11*11+21+31=173")
    public void testGerarquia() {
        assertEquals("11*11+21+31=173", Operations.Solve("111*11+21+31"));
    }
}

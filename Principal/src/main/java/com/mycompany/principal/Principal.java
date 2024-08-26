/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println(calculadora.calcular(2, 3));
        System.out.println(calculadora.calcular(1, 2));
        System.out.println(calculadora.calcular(5, 5));
    }
}

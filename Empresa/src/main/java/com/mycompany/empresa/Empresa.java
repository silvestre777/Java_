/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

/**
 *
 * @author aluno.den
 */
public class Empresa {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("1", Sexo.MASCULINO, EstadoCivil.CASADO, "20/09/1999", "Snorlax", "71988", "dwqdqw@dwqdqwdq", 
                new Endereco("Rua A", "7", "casa", "41811", "Salvador", UnidadeFederativa.BAHIA));
        PrestacaoServico prestacaoDeServico = new PrestacaoServico("20/09/1990", "Indeterminado", "7111", "Mercado", "Silvao LTDA", "71", "DWQWQQ@DWQWQQ", 
                new Endereco("Rua B", "8", "casa", "41411", "Salvador", UnidadeFederativa.BAHIA));
        
        
        System.out.println(cliente);
        System.out.println(prestacaoDeServico);
    }
}

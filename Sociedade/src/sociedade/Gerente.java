/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sociedade;

/**
 *
 * @author aluno.den
 */
public class Gerente extends CargoDeConfianca {

    public Gerente(Bonificacao boneficacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataDeNascimento) {
        super(boneficacao, nome, cpf, rg, endereco, setor, sexo, salario, dataDeNascimento);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal =  super.salario * Bonificacao.GERENTE.getValor() ;
        salarioFinal += super.salario;
        return salarioFinal;
    }
    
}

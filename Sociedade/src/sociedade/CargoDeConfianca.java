/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sociedade;

/**
 *
 * @author aluno.den
 */
public abstract class CargoDeConfianca extends Funcionario {
    
    private Bonificacao boneficacao;

    public CargoDeConfianca(Bonificacao boneficacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataDeNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataDeNascimento);
        this.boneficacao = boneficacao;
    }

    public Bonificacao getBoneficacao() {
        return boneficacao;
    }

    public void setBoneficacao(Bonificacao boneficacao) {
        this.boneficacao = boneficacao;
    }


    
}

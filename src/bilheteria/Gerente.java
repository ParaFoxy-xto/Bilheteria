package bilheteria;

public class Gerente extends Funcionario {
    private final String senha;

    public Gerente(String senha, float salario, String nome, String cpf) {
        super(salario, nome, cpf);
        this.senha = senha;
    }
    
    boolean senhaEstaCorreta(String senha) {
        return this.senha.equals(senha);
    }
    
}

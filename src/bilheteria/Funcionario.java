package bilheteria;

public class Funcionario extends Pessoa {
    protected float salario;

    public Funcionario(float salario, String nome, String cpf) {
        super(nome, cpf);
        this.salario = salario;
    }
    
    public float getSalario() {
        return salario;
    }
    
}

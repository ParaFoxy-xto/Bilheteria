package bilheteria;

public class Cliente extends Pessoa {
    private Data aniversario;
    private boolean ehEstudante;
    
    public Cliente(Data aniversario, boolean ehEstudante, String nome, String cpf) {
        super(nome, cpf);
        this.aniversario = aniversario;
        this.ehEstudante = ehEstudante;
    }

    public Data getAniversario() {
        return aniversario;
    }

    public boolean isEhEstudante() {
        return ehEstudante;
    }
    
}

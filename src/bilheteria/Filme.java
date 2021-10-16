package bilheteria;

public class Filme {
    private String nome;
    private Horario duracao;
    private String genero;

    public Filme(String nome, Horario duracao, String genero) {
        this.nome = nome;
        this.duracao = duracao;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public Horario getDuracao() {
        return duracao;
    }

    public String getGenero() {
        return genero;
    }
    
}

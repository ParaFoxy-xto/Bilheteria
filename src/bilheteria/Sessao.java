package bilheteria;


public class Sessao {
    private Filme filme;
    private Horario horarioInicio;
    private Horario horarioFim;
    private Sala sala;

    public Sessao(Filme filme, Horario horarioInicio) {
        this.filme = filme;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioInicio.soma(filme.getDuracao());
    }

    public Filme getFilme() {
        return filme;
    }

    public Horario getHorarioInicio() {
        return horarioInicio;
    }

    public Horario getHorarioFim() {
        return horarioFim;
    }
    public boolean ehValida(){
        Horario ABERTURA = new Horario(8,00);
        Horario FECHAMENTO = new Horario(22,00);
        
        if (horarioInicio.menorQue(ABERTURA)||
            horarioInicio.maiorQue(FECHAMENTO)){
            return false;
        }
        else if (horarioFim.menorQue(ABERTURA)||
                 horarioFim.maiorQue(FECHAMENTO)){
            return false;
        }
        else {
            return true;
        }
    }
}

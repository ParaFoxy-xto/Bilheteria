package bilheteria;

import java.util.ArrayList;

public class Dia {
    private ArrayList<Sessao> sessoes;
    private Data data;

    public Dia(Data data) {
        this.sessoes = new ArrayList();
        this.data = data;
    }
    public ArrayList<Sessao> getSessoes() {
        return sessoes;
    }
    public Data getData() {
        return data;
    }
    public void addSessao(Sessao sessao) {
        sessoes.add(sessao);
    }
    
}

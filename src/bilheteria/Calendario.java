package bilheteria;

import java.util.ArrayList;

public class Calendario {
    private ArrayList<Dia> dias;

    public Calendario() {
        dias = new ArrayList();
    }
    
    public void addDia(Dia dia) {
        dias.add(dia);
    }
}

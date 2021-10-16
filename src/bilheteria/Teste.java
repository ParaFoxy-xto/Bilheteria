/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilheteria;

/**
 *
 * @author edson
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Data data = new Data(23, 07, 2002);
        Gerente gerente = new Gerente("123456", 200.5f, "Edson", "023");
        Horario horario1 = new Horario(1,40);
        Horario horario2 = new Horario(9,00);
        Filme filme1 = new Filme("it", horario1, "terror");
        Filme filme2 = new Filme("tubarao", horario1, "horror");
        Sessao sessao1 = new Sessao(filme1, horario2);
        Sessao sessao2 = new Sessao(filme2, horario2);
        Dia dia = new Dia(new Data(23,07,2021));
        
        dia.getSessoes().add(sessao1);
        System.out.println(dia.getSessoes().get(0).getFilme().getNome());
        
        dia.getSessoes().add(sessao2);
        System.out.println(dia.getSessoes().get(1).getFilme().getNome());
        
        System.out.println(gerente.senhaCorreta("123456"));
        System.out.println(horario2.soma(horario1));
        
        System.out.println(Data.getDataAtual());
    }
}

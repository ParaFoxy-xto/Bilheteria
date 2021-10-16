package bilheteria;

public class Data {
    private static Data dataAtual = calcularDataAtual();
    private int dia;
    private int mes;
    private int ano;

    public static Data getDataAtual() {
        return dataAtual;
    }
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    @Override
    public String toString(){
        return String.format("%02d/", dia)+String.format("%02d/", mes)+ano;
    }
    public boolean ehValida(){
        int DIAS_NO_MES = 31;
        int MESES_NO_ANO = 12;
        int ANO_ATUAL = 2021;
               
        if (dia < 1 || dia > DIAS_NO_MES) {
            return false;
        }
        if (mes < 1 || mes > MESES_NO_ANO) {
            return false;
        }
        if (ano < ANO_ATUAL) {
            return false;
        }
        return true;
        
    }
    static private Data calcularDataAtual(){
        String dataComputador = java.time.LocalDate.now().toString();
        String diaAtual = dataComputador.substring(8);
        String mesAtual = dataComputador.substring(5,7);
        String anoAtual = dataComputador.substring(0,4);
        
        return new Data(Integer.parseInt(diaAtual),
                        Integer.parseInt(mesAtual),
                        Integer.parseInt(anoAtual));
    }
}

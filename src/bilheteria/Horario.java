package bilheteria;

public class Horario {
    private int horas;
    private int minutos;

    public Horario(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }
    
    @Override
    public String toString () {
        return String.format("%d", horas)+":"+String.format("%02d", minutos);
    }

    public Horario soma(Horario outro) {
        int HORAS_NO_DIA = 24;
        int somaMinutos = this.minutos + outro.minutos; 
        int somaHoras = this.horas + outro.horas + somaMinutos/60;
        
        if (somaHoras >= HORAS_NO_DIA) 
            somaHoras -= HORAS_NO_DIA;
        
        return new Horario(somaHoras, somaMinutos % 60);
    }
    
    public boolean menorQue(Horario outro) {
        if (this.horas < outro.horas) {
            return true;
        }
        else if (this.horas > outro.horas) {
            return false;
        }
        else {
            if (this.minutos < outro.minutos){
                return true;
            }
            else{ 
               return false;
            }
        }
    }
    public boolean maiorQue(Horario outro) {
        if (this.horas > outro.horas) {
            return true;
        }
        else if (this.horas < outro.horas) {
            return false;
        }
        else {
            if (this.minutos > outro.minutos){
                return true;
            }
            else{ 
               return false;
            }
        }
    }
    public boolean ehValido() {
        if (horas < 0 || horas > 23)
            return false;
        else if (minutos < 0 || minutos > 59) 
            return false;
        else
            return true;
           
    }
}

package br.com.kyrios.poo.exercicio.capitulo3;
public class DataTest {
    public static void main(String [] args){
        
        Date data = new Date(12, 9, 2015);
        
        data.displayDate();
        
        data.setDia(data.getDia()+1);
        data.setMes(data.getMes()+1);
        data.setAno(data.getAno()+1);
        System.out.println();
        data.displayDate();
    }
}

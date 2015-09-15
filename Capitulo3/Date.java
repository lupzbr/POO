package br.com.kyrios.poo.exercicio.capitulo3;
public class Date {
    private int dia;
    private int mes;
    private int ano;
    
    public Date(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia(){
        return this.dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno (){
        return this.ano;
    }
    
    public void setAno (int ano){
        this.ano = ano;
    }
    
    public void displayDate(){
        System.out.printf("%d / %d / %d", mes, dia, ano);
    }
    
}

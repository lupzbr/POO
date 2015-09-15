package br.com.kyrios.poo.exercicio.capitulo3;
/* Exercicio numero 11 */
public class GradeBook {    
    private String courseName;
    private String instrutorNome;
    public GradeBook(String name, String nome){
        this.courseName = name;
        this.instrutorNome = nome;
    }
    public void setCourseName(String name){
        this.courseName = name;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public void setInstrutorNome(String nome){
        this.instrutorNome = nome;
    }
    public String getInstrutorNome(){
        return this.instrutorNome;
    }
    public void displayMassage(){
        System.out.printf("Welcome to the GradeBook for \n %s \n This course is "
                + "presented by: %s", this.courseName, this.instrutorNome);
    }
}

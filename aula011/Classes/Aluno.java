package aula011.Classes;

import aula011.Interfaces.InterfaceAluno;

public class Aluno extends Pessoa implements InterfaceAluno {

    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {

        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade de " + this.getNome() + " paga com sucesso!");
    }   

    @Override
    public void cancelarMatricula() {
        String cargo = this.getSexo().equalsIgnoreCase("F") ? "da aluna" : "do aluno";
        System.out.println("Matrícula " + cargo + " " + this.getNome() + " cancelada.");
    }

    @Override
    public String DadosParaString() {
        return super.toString() + "\nMatrícula: " + this.getMatricula() + "\nCurso: " + this.getCurso();
    }

    @Override
    public String toString() {
        String titulo = this.getSexo().equalsIgnoreCase("F") ? "Aluna" : "Aluno";
        return "================== " + titulo + " ====================\n" +
        this.DadosParaString() +
        "\n=============================================";   
    }

}

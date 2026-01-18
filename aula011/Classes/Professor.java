package aula011.Classes;

import aula011.Interfaces.IntefaceProfessor;

public class Professor extends Pessoa implements IntefaceProfessor {

    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public void receberAumento(float aumento) {
        this.salario += aumento;
        String cargo = this.getSexo().equalsIgnoreCase("F") ? "da professora" : "do professor";
        System.out.println("Salário " + cargo + " " + this.getNome() + " aumentado para " + this.getSalario() + " reais.");
    }

    @Override
    public String toString() {
        String titulo = this.getSexo().equalsIgnoreCase("F") ? "Professora" : "Professor";
        return "================= " + titulo + " =================\n" +
        super.toString() + "\nEspecialidade: " +
        this.getEspecialidade() + "\nSalário: " + this.getSalario() +
        "\n=============================================";   
    }

}

package aula011.Classes;

import aula011.Interfaces.InterfaceTecnico;

public class Tecnico extends Aluno implements InterfaceTecnico {

    private String registroProfissional;

    public Tecnico(String nome, int idade, String sexo, int matricula, String curso, String registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public void praticar() {
        String cargo = this.getSexo().equalsIgnoreCase("F") ? "A técnica" : "O técnico";
        System.out.println(cargo + " " + this.getNome() + " está praticando sua profissão.");
    }
    
    @Override
    public String toString() {
        String titulo = this.getSexo().equalsIgnoreCase("F") ? "Técnica" : "Técnico";
        return "================== " + titulo + " ==================\n" +
                super.DadosParaString() + "\nRegistro Profissional: " +
                this.getRegistroProfissional() +
                "\n==============================================";
    }

}

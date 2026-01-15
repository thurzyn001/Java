package projetopessoas;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String matricula, String curso) {
        super(nome, idade, sexo);

        this.setMatricula(matricula);
        this.setCurso(curso);
    }

    public void cancelarMatricula() {
        System.out.println("Matrícula será cancelada.");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}

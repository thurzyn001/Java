package aula011;

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
        System.out.println("O técnico " + this.getNome() + " está praticando sua profissão.");
    }
    
    @Override
    public String toString() {
        return "================= Técnico ==================\n" +
                super.DadosParaString() + "\nRegistro Profissional: " +
                this.getRegistroProfissional() +
                "\n=============================================";
    }

}

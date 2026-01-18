package aula011;

public abstract class Pessoa implements InterfacePessoa {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {

        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    @Override
    public void fazerAniversario() {
        this.idade++;
        System.out.println("Feliz aniversário " + this.getNome() + "! Agora você tem " + this.getIdade() + " anos.");
    }   

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo();
    }

}

package ultraemojicombat;

public class Lutador implements InterfaceLutador {

    // Atributos:

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos Públicos:

    // Construtor

    public Lutador (String no, String na, int id, float al, float pe, int vi, int de, int em){

        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        
        if (peso < 52.2) {
            this.categoria = "Inválido";
            System.out.println("Peso inválido. Abaixo do peso mínimo para a categoria Peso Pena.");
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
            System.out.println("Peso inválido. Acima do peso máximo para a categoria Peso Pesado.");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    // Métodos Personalizados:

    @Override
    public void apresentar() {
        System.out.println("==============================================");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("==============================================");
    }

    @Override
    public void status() {
        System.out.println("==============================================");
        System.out.println("O lutador " + this.getNome());
        System.out.println("É da categoria de Peso " + getCategoria());
        System.out.println("E possui " + this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
        System.out.println("==============================================");
    }

    @Override
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

}

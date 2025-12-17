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

    // Método Construtor

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

    // Métodos Getters e Setters

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

    private void setCategoria() {
        
        if (peso < 52.2 || peso > 120.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
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

    // Métodos Especiais:

    @Override
    public void apresentar() {
        System.out.println("============================= APRESENTANDO ==============================");
        System.out.println("O Lutador " + this.getNome());
        System.out.println("Diretamente " + this.getNacionalidade());
        System.out.println("Tem " + this.getIdade() + " Anos" + " e " + this.getAltura() + " Metros de altura");
        System.out.println("Pesando " + this.getPeso() + " Kgs");
        System.out.println("Lutará na categoria de Peso " + this.getCategoria());

        String vitoria = (this.getVitorias() == 1) ? "vitória" : "vitórias";
        String derrota = (this.getDerrotas() == 1) ? "derrota" : "derrotas";
        String empate  = (this.getEmpates()  == 1) ? "empate"  : "empates";

        System.out.println("Possuindo um total de " + this.getVitorias() + " " + vitoria + 
        ", " + this.getDerrotas()+ " " + derrota + " e " + this.getEmpates()+ " " + empate);

        if (categoria == "Inválido" && peso < 52.2){
            System.out.println("Este Lutador não pode lutar pois não atingiu o peso mínimo para a categoria de Peso Leve de 52.2 Kgs.");
        } else if (categoria == "Inválido" && peso > 120.2) {
            System.out.println("Este lutador não pode lutar pois ultrapssou o peso Máximo para a categoria de Peso Pesado de 120.2 Kgs");
        }
        System.out.println("=========================================================================");
    }

    @Override
    public void status() {
    System.out.println("=============================== STATUS ================================");
    System.out.println("O lutador " + this.getNome());
    System.out.println("É da categoria de Peso " + this.getCategoria() +
        " com " + this.getPeso() + " Kgs");

    String vitoria = (this.getVitorias() == 1) ? "vitória" : "vitórias";
    String derrota = (this.getDerrotas() == 1) ? "derrota" : "derrotas";
    String empate  = (this.getEmpates()  == 1) ? "empate"  : "empates";

    System.out.println(
        "E possui " + this.getVitorias() + " " + vitoria + ", " +
        this.getDerrotas() + " " + derrota + " e " +
        this.getEmpates() + " " + empate);
    System.out.println("====================================================================");
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

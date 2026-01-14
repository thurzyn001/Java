package projetolivro;

public class Livro implements Publicacao {

    //Atributos

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Método construtor

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPaginas(totalPaginas);
        this.setPaginaAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    // Métodos getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos Personalizados

    @Override
    public void detalhes() {
        System.out.println("======================= Livro ============================" + "\n" +
        "Livro: " + this.getTitulo() + "\n" +
        "Autor: " + this.getAutor() + "\n" +
        "Total de Páginas: " + this.getTotalPaginas() + "\n" +
        "Página Atual: " + this.getPaginaAtual() + "\n" +
        "Aberto: " + (this.getAberto() ? "Sim" : "Não") + "\n" +
        "Leitor: " + this.getLeitor().getNome() + "\n" +
        "Idade do Leitor: " + this.getLeitor().getIdade() + "\n" +
        "Sexo do Leitor: " + this.getLeitor().getSexo() + "\n" +
        "==========================================================");
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {

        setPaginaAtual(p);

        if (this.getPaginaAtual() > this.getTotalPaginas()) {
            this.setPaginaAtual(0);
            System.out.println("Página não encontrada");
        } else if (this.getPaginaAtual() < 0) {
            this.setPaginaAtual(0);
            System.out.println("Página não encontrada");
        }

    }

    @Override
    public void avancarPagina() {
        this.setPaginaAtual(this.getPaginaAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        this.setPaginaAtual(this.getPaginaAtual() - 1);
    }
}

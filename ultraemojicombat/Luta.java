package ultraemojicombat;

public class Luta implements InterfaceLuta {

    // Atributos

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos

    // Método Construtor

    public Luta(int rounds){

        this.setRounds(rounds);

    }

    // Métodos Getters e Setters
        
    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public int getRounds(){
        return this.rounds;    
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public boolean getAprovada(){
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
    
    // Métodos Especiais

    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {

        System.out.println("");
        System.out.println("=========================================== LUTA ============================================");

        System.out.println("");

        if (!l1.getCategoria().equals("Inválido") &&
            !l2.getCategoria().equals("Inválido") &&
            l1.getCategoria().equals(l2.getCategoria()) &&
            l1 != l2) {

            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);

            System.out.println(
                "Luta marcada entre " +
                l1.getNome() +
                " e " +
                l2.getNome() +
                "."
            );

        } else {

            this.setAprovada(false);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }

    }

    @Override
    public void luta() {

        if (getDesafiado() == getDesafiante()) {

            System.out.println("Luta não aprovada: o desafiado e o desafiante são o mesmo lutador.");
            System.out.println(getDesafiado().getNome() + " vs " + getDesafiante().getNome());

        } else if (getDesafiado().getCategoria().equals("Inválido")) {

            System.out.println("Luta não aprovada: o lutador " + getDesafiado().getNome() + 
            "  Está atualmente com " + getDesafiado().getPeso() + "Kgs" + " e " + "não pode lutar,");

            if (getDesafiado().getCategoria().equals("Inválido") && getDesafiado().getPeso() < 52.2){

                System.out.println("pois não atingiu o peso mínimo para a categoria de Peso Leve de 52.2 Kgs.");

            } else if (getDesafiado().getCategoria().equals("Inválido") && getDesafiado().getPeso() > 120.2) {

                System.out.println("pois ultrapssou o peso máximo para a categoria de Peso Pesado de 120.2 Kgs");
            }

        } else if (getDesafiante().getCategoria().equals("Inválido")) {

            System.out.println("Luta não aprovada: o lutador " + getDesafiante().getNome() + 
            "  Está atualmente com " + getDesafiante().getPeso() + "Kgs" + " e " + "não pode lutar,");

            if (getDesafiante().getCategoria().equals("Inválido") && getDesafiante().getPeso() < 52.2){

                System.out.println("pois não atingiu o peso mínimo para a categoria de Peso Leve de 52.2 Kgs.");

            } else if (getDesafiante().getCategoria().equals("Inválido") && getDesafiante().getPeso() > 120.2) {

                System.out.println("pois ultrapssou o peso máximo para a categoria de Peso Pesado de 120.2 Kgs");
            }

        } else if (!getDesafiado().getCategoria().equals(getDesafiante().getCategoria())) {

            System.out.println("Luta não aprovada: lutadores de categorias diferentes.");
            System.out.println(getDesafiado().getNome() + " - " + getDesafiado().getCategoria() +
            " vs " + getDesafiante().getNome() + " - " + getDesafiante().getCategoria());
            

        } else {

            getDesafiado().apresentar();
            getDesafiante().apresentar();
        }

        System.out.println("");
        System.out.println("=============================================================================================");

    }

}

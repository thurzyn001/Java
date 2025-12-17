package ultraemojicombat;

public class Luta implements InterfaceLuta {

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

    System.out.println("================================= LUTA ==================================");

        if (
            !l1.getCategoria().equals("Inválido") &&
            !l2.getCategoria().equals("Inválido") &&
            l1.getCategoria().equals(l2.getCategoria()) &&
            l1 != l2
        ) {

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

        } 
        else if (getDesafiado().getCategoria().equals("Inválido")) {

            System.out.println("O lutador " + getDesafiado().getNome() +" não pode lutar pois está na Categoria Inválido.");

        } 
        else if (getDesafiante().getCategoria().equals("Inválido")) {

            System.out.println(
                "O lutador " + getDesafiante().getNome() + " não pode lutar pois está na Categoria Inválido.");

        } 
        else if (!getDesafiado().getCategoria()
                    .equals(getDesafiante().getCategoria())) {

            System.out.println("Luta não aprovada: lutadores de categorias diferentes.");
            System.out.println(getDesafiado().getNome() + " - " + getDesafiado().getCategoria() +
            " vs " + getDesafiante().getNome() + " - " + getDesafiante().getCategoria());
            

        } 
        else {

            getDesafiado().apresentar();
            getDesafiante().apresentar();
        }

        System.out.println("=========================================================================");

    }


}



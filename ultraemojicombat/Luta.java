package ultraemojicombat;

public class Luta implements InterfaceLuta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos

    // Método Construtor

    public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada){

        this.setDesafiado(desafiado);
        this.setDesafiante(desafiante);
        this.setRounds(rounds);
        this.setAprovada(aprovada);

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

        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){

            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);

        } else {

            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);

        }

    }

    @Override
    public void lutar(){



    }

}

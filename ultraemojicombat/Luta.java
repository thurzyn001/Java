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

            System.out.println("Luta marcada entre " + l1.getNome() + " e " + l2.getNome());

        } else {

            this.setAprovada(false);
            this.setDesafiado(l1);
            this.setDesafiante(l2);

            if (getDesafiado() == getDesafiante()) {

                System.out.println("Luta não aprovada: o desafiado e o desafiante são o mesmo lutador.");
                System.out.println(getDesafiado().getNome() + " vs " + getDesafiante().getNome());

            } else if (getDesafiado().getCategoria().equals("Inválido")) {

                System.out.println("Luta não aprovada: o lutador " + getDesafiado().getNome() + 
                " Está atualmente com " + getDesafiado().getPeso() + " Kgs" + " e não pode lutar,");

                if (getDesafiado().getPeso() < 52.2){

                    System.out.println("pois não atingiu o peso mínimo para a categoria de Peso Leve de 52.2 Kgs.");

                } else if (getDesafiado().getPeso() > 120.2) {

                    System.out.println("pois ultrapssou o peso máximo para a categoria de Peso Pesado de 120.2 Kgs");

                }

            } else if (getDesafiante().getCategoria().equals("Inválido")) {

                System.out.println("Luta não aprovada: o lutador " + getDesafiante().getNome() + 
                " Está atualmente com " + getDesafiante().getPeso() + " Kgs" + " e não pode lutar,");

                if (getDesafiante().getPeso() < 52.2){

                    System.out.println("pois não atingiu o peso mínimo para a categoria de Peso Leve de 52.2 Kgs.");

                } else if (getDesafiante().getPeso() > 120.2) {

                    System.out.println("pois ultrapssou o peso máximo para a categoria de Peso Pesado de 120.2 Kgs");

                }

            } else if (!getDesafiado().getCategoria().equals(getDesafiante().getCategoria())) {

                System.out.println("Luta não aprovada: lutadores de categorias diferentes.");
                System.out.println(getDesafiado().getNome() + " - " + getDesafiado().getCategoria() +
                " vs " + getDesafiante().getNome() + " - " + getDesafiante().getCategoria());

            }

        }

    }


    @Override
    public void luta() {

        if (this.getAprovada()) {

            getDesafiado().apresentar();
            getDesafiante().apresentar();

            System.out.println("");

            int vencedor = (int) (Math.random() * 3);

            switch (vencedor) {
                
            case 0:
                
                System.out.println("A luta terminou em empate");
                getDesafiado().empatarLuta();
                getDesafiante().empatarLuta();
                break;

            case 1:

                String vitoria1 = (getDesafiado().getVitorias() == 1) ? "vitória" : "vitórias";
                String derrota1 = (getDesafiado().getDerrotas() == 1) ? "derrota" : "derrotas";
                String empate1  = (getDesafiado().getEmpates()  == 1) ? "empate"  : "empates";

                getDesafiado().ganharLuta();
                getDesafiante().perderLuta();

                System.out.println(getDesafiado().getNome() + " venceu a luta! Possuindo agora " +
                    getDesafiado().getVitorias() + " " + vitoria1 + ", " +
                    getDesafiado().getDerrotas() + " " + derrota1 + " e " +
                    getDesafiado().getEmpates() + " " + empate1 + "!");

                break;

            case 2:

                String vitoria2 = (getDesafiante().getVitorias() == 1) ? "vitória" : "vitórias";
                String derrota2 = (getDesafiante().getDerrotas() == 1) ? "derrota" : "derrotas";
                String empate2  = (getDesafiante().getEmpates()  == 1) ? "empate"  : "empates";

                getDesafiante().ganharLuta();
                getDesafiado().perderLuta();

                System.out.println(getDesafiante().getNome() + " venceu a luta! Possuindo agora " +
                    getDesafiante().getVitorias() + " " + vitoria2 + ", " +
                    getDesafiante().getDerrotas() + " " + derrota2 + " e " +
                    getDesafiante().getEmpates() + " " + empate2 + "!");


                break;
            }

        }

        System.out.println("");
        System.out.println("=============================================================================================");

    }

}

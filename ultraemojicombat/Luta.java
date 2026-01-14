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

            try {
                System.out.println("");
                System.out.println("A LUTA COMEÇA EM \n3...");
                Thread.sleep(1000);
                System.out.println("2...");
                Thread.sleep(1000);
                System.out.println("1...");
                Thread.sleep(1000);
                System.out.println("");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


            int hpDesafiado = 100;
            int hpDesafiante = 100;
            int rounds = this.getRounds();
            boolean nocaute = false;

            for (int i = 1; i <= rounds; i++) {
                if (nocaute) break;

                System.out.println("---------- ROUND " + i + " ----------");

                int poderDesafiado = 5 + (int) (Math.random() * 10) + (getDesafiado().getVitorias() / 2);
                int poderDesafiante = 5 + (int) (Math.random() * 10) + (getDesafiante().getVitorias() / 2);

                System.out.println(getDesafiado().getNome() + " atacou com poder de " + poderDesafiado);
                System.out.println(getDesafiante().getNome() + " atacou com poder de " + poderDesafiante);
                System.out.println("");

                if (poderDesafiado > poderDesafiante) {
                    System.out.println(getDesafiado().getNome() + " venceu o round!");
                    int dano = poderDesafiado - poderDesafiante > 0 ? poderDesafiado - poderDesafiante : 1;
                    hpDesafiante -= dano;
                    System.out.println(getDesafiante().getNome() + " sofreu " + dano + " de dano!");
                } else if (poderDesafiante > poderDesafiado) {
                    System.out.println(getDesafiante().getNome() + " venceu o round!");
                    int dano = poderDesafiante - poderDesafiado > 0 ? poderDesafiante - poderDesafiado : 1;
                    hpDesafiado -= dano;
                    System.out.println(getDesafiado().getNome() + " sofreu " + dano + " de dano!");
                } else {
                    System.out.println("Round empatado, ninguém se feriu.");
                }

                hpDesafiado = Math.max(0, hpDesafiado);
                hpDesafiante = Math.max(0, hpDesafiante);

                System.out.println("Placar de HP: " + getDesafiado().getNome() + " [" + hpDesafiado + " HP] vs " + getDesafiante().getNome() + " [" + hpDesafiante + " HP]");
                System.out.println("---------------------------");
                System.out.println("");

                if (hpDesafiado <= 0) {
                    System.out.println(getDesafiado().getNome() + " não pode mais lutar! NOCAUTE!");
                    System.out.println("O vencedor é " + getDesafiante().getNome() + "!");
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                    nocaute = true;
                } else if (hpDesafiante <= 0) {
                    System.out.println(getDesafiante().getNome() + " não pode mais lutar! NOCAUTE!");
                    System.out.println("O vencedor é " + getDesafiado().getNome() + "!");
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    nocaute = true;
                }
                
                if (i < rounds) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

            if (!nocaute) {
                System.out.println("Fim dos rounds! A decisão será por pontos (HP restante).");
                if (hpDesafiado > hpDesafiante) {
                    System.out.println("O vencedor por pontos é " + getDesafiado().getNome() + "!");
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                } else if (hpDesafiante > hpDesafiado) {
                    System.out.println("O vencedor por pontos é " + getDesafiante().getNome() + "!");
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                } else {
                    System.out.println("A luta terminou em EMPATE por pontos!");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                }
            }
        } 

        System.out.println("");
        System.out.println("=============================================================================================");
    }

}

package aula06;

public class ControleRemoto implements Controlador {

    // Atributos

    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais

    // Construtor

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // Métodos Getters e Setters

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    // Métodos Personalizados

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("----- MENU -----");
            System.out.println("Ligado: " + (this.getLigado() ? "Sim" : "Não"));
            System.out.println("Tocando: " + (this.getTocando() ? "Sim" : "Não"));
            if (this.getVolume() == 0) {
                System.out.println("Volume: Mudo");
            } else {
                System.out.println("Volume: " + this.getVolume());
                for (int i = 0; i <= this.getVolume(); i += 10) {
                    System.out.print("|");
                }
                System.out.println();
            }
            System.out.println("----------------");
        } else {
            System.out.println("O aparelho está desligado. Não é possível abrir o menu.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() && this.getVolume() < 100) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Não é possível aumentar o volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Não é possível diminuir o volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(5);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não é possível dar play, verifique se está ligado e se não está tocando.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não é possível pausar, verifique se está ligado e se já está pausado.");
        }
    }

}

package aula02;

public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    float carga;
    boolean tampada;

    void status() {
        System.out.println("Carregando Status...\n");
        System.out.println("Modelo: " + this.modelo + "\n");
        System.out.println("Cor: " + this.cor + "\n");
        System.out.println("Ponta: " + this.ponta + "\n");
        System.out.println("Carga: " + this.carga + "%\n");
        System.out.println("Tampada: " + (this.tampada ? "Sim" : "Não") + "\n");
    }

    void rabiscar() {
        System.out.println("Tentando rabiscar...\n");

        if (!this.tampada) {
            System.out.println("*Rabisco*\n");
            this.carga -=0.5f;
        } else {
            System.out.println("Ta tampada, Burro!\n");
        }
        
    }

    void tampar() {
        System.out.println("tentando tampar a caneta...\n");
        
        if (this.tampada) {
            System.out.println("A caneta já está tampada.\n");
        } else {
            System.out.println("Tampando a caneta...\n");
            this.tampada = true;
            System.out.println("Caneta tampada com sucesso.\n");
        }
    }

    void destampar() {
        System.out.println("Tentando destampar a caneta...\n");

        if (!this.tampada) {
            System.out.println("A caneta já está destampada.\n");
        } else {    
            System.out.println("Destampando a caneta...\n");
            this.tampada = false;
            System.out.println("Caneta destampada com sucesso.\n");
        }
    }

}

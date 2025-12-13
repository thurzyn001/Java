package aula05;

public class Caneta {
    
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    private float carga;

    // Este é o método construtor
    public Caneta(String m, float p, String c, Boolean t, float l){
        
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampada = t;
        this.carga = l;
    }

    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public boolean isTampada() {
        return this.tampada;
    }

    public void setTampada(boolean t) {
        this.tampada = t;
    }

    public float getCarga() {
        return this.carga;
    }

    public void setCarga(float l) {
        this.carga = l;
    }       

    public void status() {
        System.out.println("Carregando Status...\n");
        System.out.println("Modelo: " + this.getModelo() + "\n");
        System.out.println("Ponta: " + this.getPonta() + "\n");
        System.out.println("Cor: " + this.cor + "\n");
        System.out.println("Tampada: " + (this.tampada ? "Sim" : "Não") + "\n");
        System.out.println("Carga: " + this.carga + "%\n");
    }
}
 
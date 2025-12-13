package aula04;

public class aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic Cristal", 0.5f, "Azul", true , 80f);
        c1.status();
        Caneta c2 = new Caneta("Faber Castel", 0.7f, "Vermelha", false, 60f );
        c2.status();
    }
}

package aula07;

public class aula07 {

    public static void main(String[] args) {

        Lutador L[] = new Lutador[6];

        L[0] = new Lutador("Pretty Boy 😎", "Francês", 31, 1.75f, 68.9f, 11, 3, 1);

        L[1] = new Lutador("Putscript 😠", "Brasileiro", 29, 1.68f, 57.8f, 14, 2, 3);

        L[2] = new Lutador("Snapshadow 😬", "Norte-Americano", 35, 1.65f, 80.9f, 12, 2, 1);

        L[3] = new Lutador("Dead Code 💀", "Australiano", 28, 1.93f, 81.6f, 13, 0, 2);

        L[4] = new Lutador("Ufocobol 👽", "Brasileiro", 37, 1.70f, 119.3f, 5, 4, 3);

        L[5] = new Lutador("Nerdaard 🤓", "Norte-Americano", 30, 1.81f, 105.7f, 12, 2, 4);

        for (int i = 0; i < L.length; i++) {
            L[i].apresentar();
        }
    }
}

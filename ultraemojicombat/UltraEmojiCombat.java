package ultraemojicombat;

public class UltraEmojiCombat {

    public static void main(String[] args) {

        Lutador L[] = new Lutador[6];

        L[0] = new Lutador("Pretty Boy 😎", "da França", 31, 1.75f, 68.9f, 11, 3, 1);

        L[1] = new Lutador("Putscript 😠", "do Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

        L[2] = new Lutador("Snapshadow 😬", "dos Estados-Unidos", 35, 1.65f, 80.9f, 12, 2, 1);

        L[3] = new Lutador("Dead Code 💀", "da Austrália", 28, 1.93f, 81.6f, 13, 0, 2);

        L[4] = new Lutador("Ufocobol 👽", "do Brasil", 37, 1.70f, 119.3f, 5, 4, 3);

        L[5] = new Lutador("Nerdaard 🤓", "dos Etados-Unidos", 30, 1.81f, 105.7f, 12, 2, 4);

        //for (int i = 0; i < L.length; i++) {
        //    L[i].status();
        //}

        Luta UEC = new Luta(6);

        UEC.marcarLuta(L[0], L[1]);
        UEC.luta();

        UEC.marcarLuta(L[2], L[4]);
        UEC.luta();

        UEC.marcarLuta(L[0], L[0]);
        UEC.luta();

        L[4].setPeso(122.0f);

        UEC.marcarLuta(L[4], L[5]);
        UEC.luta();

    }
}

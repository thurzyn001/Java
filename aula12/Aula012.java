package aula12;

public class Aula012 {

    public static void main(String[] args) {

        Animal[] animais = new Animal[6];
        
        animais[0] = new Cachorro(12.5f, 5, 4, "Marrom", "Batata");
        animais[1] = new Canguru(25.0f, 3, 4, "Cinza", "Kangaskan");
        animais[2] = new Cobra(1.5f, 2, 0, "Verde", "Nagni");
        animais[3] = new Goldfish(0.8f, 1, 0, "Dourado", "Peixoto");
        animais[4] = new Arara(0.9f, 2, 4, "Azul", "Blue");
        animais[5] = new Jabuti(15.0f, 4, 4, "Verde", "Casquinho");
        
        System.out.println();

        for (Animal animal : animais) {
            System.out.println(animal.toString() + "\n");
            animal.locomover();
            System.out.println();
            animal.alimentar();
            System.out.println();
            animal.emitirSom();
            System.out.println();

            if (animal instanceof Cachorro) {
                ((Cachorro) animal).abanarRabo();
                System.out.println();
            } else if (animal instanceof Canguru) {
                ((Canguru) animal).usarBolsa();
                System.out.println();
            } else if (animal instanceof Goldfish) {
                ((Goldfish) animal).soltarBolha();
                System.out.println();
            } else if (animal instanceof Arara) {
                ((Arara) animal).fazerNinho();
                System.out.println();

            }

        }

    }

}

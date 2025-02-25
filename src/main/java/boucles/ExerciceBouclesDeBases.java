package boucles;

public class ExerciceBouclesDeBases {
    public static void main(String[] args) {
        // 1. Afficher les nombres de 1 à 10
        System.out.println("1. Afficher les nombres de 1 à 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print("mika ");
        }

        //Affichez les éléments pairs de 2 à 100
        System.out.println("2. Affichez les éléments pairs de 2 à 100");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i );
        }

    }

}

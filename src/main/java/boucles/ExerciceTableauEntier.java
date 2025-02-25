package boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        //Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
        int[] tableauEntiers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //  Affichez le premier élément du tableau
        System.out.println("Le premier élément du tableau est : " + tableauEntiers[0]);

        //  Affichez la longueur du tableau
        System.out.println("La longueur du tableau est : " + tableauEntiers.length);

        // Afficher le dernier élément du tableau
        System.out.println("Le dernier élément du tableau est : " + tableauEntiers[tableauEntiers.length - 1]);

        // Modifiez la valeur de la case d'indice 4 et donnez lui la valeur 8
        tableauEntiers[4] = 8;
        System.out.println("La valeur de la case d'indice 4 est maintenant : " + tableauEntiers[4]);

        


    }
}

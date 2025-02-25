package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        // ✅ Utilisation du constructeur à 4 paramètres
        AdressePostale adresse1 = new AdressePostale(12, "Rue des Lilas", 75001, "Paris");
        AdressePostale adresse2 = new AdressePostale(45, "Avenue Victor Hugo", 69003, "Lyon");

        // ✅ Affichage
        System.out.println("Adresse 1 : " + adresse1);
        System.out.println("Adresse 2 : " + adresse2);
    }
}

package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        // ✅ Utilisation du constructeur avec nom et prénom uniquement
        Personne personne1 = new Personne("Dupont", "Jean");

        // ✅ Affichage du nom et prénom avec le nom en majuscules
        System.out.print("Nom complet avec le nom en majuscules : ");
        personne1.afficherNomPrenom();

        // ✅ Modification de l'adresse avec une méthode dédiée
        AdressePostale nouvelleAdresse = new AdressePostale(10, "Rue de la Paix", 75002, "Paris");
        personne1.modifierAdresse(nouvelleAdresse);

        // ✅ Affichage des attributs mis à jour
        System.out.println("Nouvelle adresse : " + personne1.getAdresse());

        // ✅ Modification du nom et du prénom
        personne1.modifierNom("Lemoine");
        personne1.modifierPrenom("Pierre");

        // ✅ Vérification des modifications
        System.out.println("Nouveau nom : " + personne1.getNom());
        System.out.println("Nouveau prénom : " + personne1.getPrenom());

        // ✅ Affichage final de toutes les informations
        System.out.println("Détails complets de la personne : " + personne1);
    }
}

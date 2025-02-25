package entites;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adresse;

    // ✅ Constructeur avec nom et prénom
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // ✅ Constructeur avec nom, prénom et adresse
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    // ✅ Méthode pour afficher nom et prénom (nom en majuscules)
    public void afficherNomPrenom() {
        System.out.println(prenom + " " + nom.toUpperCase());
    }

    // ✅ Méthode pour modifier le nom
    public void modifierNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // ✅ Méthode pour modifier le prénom
    public void modifierPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    // ✅ Méthode pour modifier l'adresse
    public void modifierAdresse(AdressePostale nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
    }

    // ✅ Méthode pour retourner le nom
    public String getNom() {
        return nom;
    }

    // ✅ Méthode pour retourner le prénom
    public String getPrenom() {
        return prenom;
    }

    // ✅ Méthode pour retourner l'adresse
    public AdressePostale getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        String adresseStr = (adresse != null) ? adresse.toString() : "Aucune adresse renseignée";
        return prenom + " " + nom + ", Adresse : " + adresseStr;
    }
}

package entites;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adresse;

    // Constructeur avec nom et prénom
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    //  Constructeur avec nom, prénom et adresse
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }


    public void afficherNomPrenom() {
        System.out.println(prenom + " " + nom.toUpperCase());
    }


    public void modifierNom(String nouveauNom) {
        this.nom = nouveauNom;
    }


    public void modifierPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }


    public void modifierAdresse(AdressePostale nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
    }


    public String getNom() {
        return nom;
    }

    //  Méthode pour retourner le prénom
    public String getPrenom() {
        return prenom;
    }


    public AdressePostale getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        String adresseStr = (adresse != null) ? adresse.toString() : "Aucune adresse renseignée";
        return prenom + " " + nom + ", Adresse : " + adresseStr;
    }
}

package fr.epsi.banque.entites;

public class Credit extends Operation {
    public Credit(String dateOperation, double montant) {
        super(dateOperation, montant);
    }

    @Override
    public String afficherType() {
        return "Crédit";
    }
}

package fr.epsi.banque.entites;

public class Debit extends Operation {
    public Debit(String dateOperation, double montant) {
        super(dateOperation, montant);
    }

    @Override
    public String afficherType() {
        return "Débit";
    }
}

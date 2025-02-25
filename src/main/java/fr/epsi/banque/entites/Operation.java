package fr.epsi.banque.entites;

public abstract class Operation {
    private String dateOperation;
    private double montant;


    public Operation(String dateOperation, double montant) {
        this.dateOperation = dateOperation;
        this.montant = montant;
    }


    public String getDateOperation() {
        return dateOperation;
    }

    public double getMontant() {
        return montant;
    }


    public abstract String afficherType();

    @Override
    public String toString() {
        return "Date : " + dateOperation + " | Montant : " + montant + " | Type : " + afficherType();
    }
}

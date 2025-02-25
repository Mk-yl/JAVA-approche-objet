package fr.epsi.banque.entites;

public class CompteCourant extends Compte {
    private double decouvert;


    public CompteCourant(int numeroCompte, double solde, double decouvert) {
        super(numeroCompte, solde);
        this.decouvert = decouvert;
    }


    public double getDecouvert() {
        return decouvert;
    }


    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }


    @Override
    public String toString() {
        return super.toString() + " | Découvert autorisé : " + decouvert + "€";
    }
}

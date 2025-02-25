package fr.epsi.banque.entites;

public class Compte {
    private int numeroCompte;
    private double solde;

    public Compte(int numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte N°" + numeroCompte + " | Solde : " + solde + "€";
    }
}

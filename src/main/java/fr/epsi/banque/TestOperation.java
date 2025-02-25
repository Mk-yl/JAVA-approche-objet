package fr.epsi.banque;

import fr.epsi.banque.entites.Credit;
import fr.epsi.banque.entites.Debit;
import fr.epsi.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] operations = new Operation[4];


        operations[0] = new Credit("25/02/2025", 200.0);
        operations[1] = new Debit("26/02/2025", 50.0);
        operations[2] = new Credit("27/02/2025", 150.0);
        operations[3] = new Debit("28/02/2025", 100.0);


        double soldeFinal = 0.0;
        for (Operation op : operations) {
            System.out.println(op);  // Utilise la méthode toString() redéfinie

            if (op instanceof Credit) {
                soldeFinal += op.getMontant();
            } else if (op instanceof Debit) {
                soldeFinal -= op.getMontant();
            }
        }


        System.out.println("Solde final : " + soldeFinal + "€");
    }
}
